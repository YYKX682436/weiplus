package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public class MemoryManager {
    private com.eclipsesource.mmv8.utils.MemoryManager.MemoryManagerReferenceHandler memoryManagerReferenceHandler;

    /* renamed from: v8, reason: collision with root package name */
    private com.eclipsesource.mmv8.V8 f43999v8;
    private java.util.ArrayList<com.eclipsesource.mmv8.V8Value> references = new java.util.ArrayList<>();
    private boolean releasing = false;
    private boolean released = false;

    /* loaded from: classes7.dex */
    public class MemoryManagerReferenceHandler implements com.eclipsesource.mmv8.ReferenceHandler {
        private MemoryManagerReferenceHandler() {
        }

        @Override // com.eclipsesource.mmv8.ReferenceHandler
        public void v8HandleCreated(com.eclipsesource.mmv8.V8Value v8Value) {
            com.eclipsesource.mmv8.utils.MemoryManager.this.references.add(v8Value);
        }

        @Override // com.eclipsesource.mmv8.ReferenceHandler
        public void v8HandleDisposed(com.eclipsesource.mmv8.V8Value v8Value) {
            if (com.eclipsesource.mmv8.utils.MemoryManager.this.releasing) {
                return;
            }
            java.util.Iterator it = com.eclipsesource.mmv8.utils.MemoryManager.this.references.iterator();
            while (it.hasNext()) {
                if (it.next() == v8Value) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public MemoryManager(com.eclipsesource.mmv8.V8 v86) {
        this.f43999v8 = v86;
        com.eclipsesource.mmv8.utils.MemoryManager.MemoryManagerReferenceHandler memoryManagerReferenceHandler = new com.eclipsesource.mmv8.utils.MemoryManager.MemoryManagerReferenceHandler();
        this.memoryManagerReferenceHandler = memoryManagerReferenceHandler;
        v86.addReferenceHandler(memoryManagerReferenceHandler);
    }

    private void checkReleased() {
        if (this.released) {
            throw new java.lang.IllegalStateException("Memory manager released");
        }
    }

    public int getObjectReferenceCount() {
        checkReleased();
        return this.references.size();
    }

    public boolean isReleased() {
        return this.released;
    }

    public void persist(com.eclipsesource.mmv8.V8Value v8Value) {
        this.f43999v8.getLocker().checkThread();
        checkReleased();
        this.references.remove(v8Value);
    }

    public void release() {
        this.f43999v8.getLocker().checkThread();
        if (this.released) {
            return;
        }
        this.releasing = true;
        try {
            java.util.Iterator<com.eclipsesource.mmv8.V8Value> it = this.references.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.f43999v8.removeReferenceHandler(this.memoryManagerReferenceHandler);
            this.references.clear();
            this.releasing = false;
            this.released = true;
        } catch (java.lang.Throwable th6) {
            this.releasing = false;
            throw th6;
        }
    }
}
