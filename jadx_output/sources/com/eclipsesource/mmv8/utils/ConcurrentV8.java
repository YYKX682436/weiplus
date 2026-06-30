package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public final class ConcurrentV8 {

    /* renamed from: v8, reason: collision with root package name */
    private com.eclipsesource.mmv8.V8 f43998v8;

    public ConcurrentV8() {
        this.f43998v8 = null;
        com.eclipsesource.mmv8.V8 createV8Runtime = com.eclipsesource.mmv8.V8.createV8Runtime();
        this.f43998v8 = createV8Runtime;
        createV8Runtime.getLocker().release();
    }

    public com.eclipsesource.mmv8.V8 getV8() {
        return this.f43998v8;
    }

    public void release() {
        com.eclipsesource.mmv8.V8 v86 = this.f43998v8;
        if (v86 == null || v86.isReleased()) {
            return;
        }
        run(new com.eclipsesource.mmv8.utils.V8Runnable() { // from class: com.eclipsesource.mmv8.utils.ConcurrentV8.1
            @Override // com.eclipsesource.mmv8.utils.V8Runnable
            public void run(com.eclipsesource.mmv8.V8 v87) {
                if (v87 == null || v87.isReleased()) {
                    return;
                }
                v87.release();
            }
        });
    }

    public synchronized void run(com.eclipsesource.mmv8.utils.V8Runnable v8Runnable) {
        try {
            this.f43998v8.getLocker().acquire();
            v8Runnable.run(this.f43998v8);
        } finally {
            com.eclipsesource.mmv8.V8 v86 = this.f43998v8;
            if (v86 != null && v86.getLocker() != null && this.f43998v8.getLocker().hasLock()) {
                this.f43998v8.getLocker().release();
            }
        }
    }
}
