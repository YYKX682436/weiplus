package com.p166x1da19ac6.jni;

/* renamed from: com.facebook.jni.DestructorThread */
/* loaded from: classes16.dex */
public class C1543x37c99383 {

    /* renamed from: sThread */
    private static final java.lang.Thread f5070x58b2985d;

    /* renamed from: sDestructorStack */
    private static final com.p166x1da19ac6.jni.C1543x37c99383.DestructorStack f5068x3b5d51c = new com.p166x1da19ac6.jni.C1543x37c99383.DestructorStack();

    /* renamed from: sReferenceQueue */
    private static final java.lang.ref.ReferenceQueue f5069xafd347d9 = new java.lang.ref.ReferenceQueue();

    /* renamed from: sDestructorList */
    private static final com.p166x1da19ac6.jni.C1543x37c99383.DestructorList f5067xd6d0fb8a = new com.p166x1da19ac6.jni.C1543x37c99383.DestructorList();

    /* renamed from: com.facebook.jni.DestructorThread$Destructor */
    /* loaded from: classes16.dex */
    public static abstract class Destructor extends java.lang.ref.PhantomReference<java.lang.Object> {

        /* renamed from: next */
        private com.p166x1da19ac6.jni.C1543x37c99383.Destructor f5071x338af3;

        /* renamed from: previous */
        private com.p166x1da19ac6.jni.C1543x37c99383.Destructor f5072xb413baf7;

        /* renamed from: destruct */
        public abstract void mo16719x3da07396();

        public Destructor(java.lang.Object obj) {
            super(obj, com.p166x1da19ac6.jni.C1543x37c99383.f5069xafd347d9);
            com.p166x1da19ac6.jni.C1543x37c99383.f5068x3b5d51c.m16723x34af1a(this);
        }

        private Destructor() {
            super(null, com.p166x1da19ac6.jni.C1543x37c99383.f5069xafd347d9);
        }
    }

    /* renamed from: com.facebook.jni.DestructorThread$DestructorList */
    /* loaded from: classes16.dex */
    public static class DestructorList {

        /* renamed from: mHead */
        private final com.p166x1da19ac6.jni.C1543x37c99383.Destructor f5073x62243ed;

        public DestructorList() {
            com.p166x1da19ac6.jni.C1543x37c99383.Terminus terminus = new com.p166x1da19ac6.jni.C1543x37c99383.Terminus();
            this.f5073x62243ed = terminus;
            ((com.p166x1da19ac6.jni.C1543x37c99383.Destructor) terminus).f5071x338af3 = new com.p166x1da19ac6.jni.C1543x37c99383.Terminus();
            ((com.p166x1da19ac6.jni.C1543x37c99383.Destructor) terminus).f5071x338af3.f5072xb413baf7 = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: drop */
        public static void m16721x2f2eef(com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor) {
            destructor.f5071x338af3.f5072xb413baf7 = destructor.f5072xb413baf7;
            destructor.f5072xb413baf7.f5071x338af3 = destructor.f5071x338af3;
        }

        /* renamed from: enqueue */
        public void m16722xa0f98e08(com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor) {
            destructor.f5071x338af3 = this.f5073x62243ed.f5071x338af3;
            this.f5073x62243ed.f5071x338af3 = destructor;
            destructor.f5071x338af3.f5072xb413baf7 = destructor;
            destructor.f5072xb413baf7 = this.f5073x62243ed;
        }
    }

    /* renamed from: com.facebook.jni.DestructorThread$DestructorStack */
    /* loaded from: classes16.dex */
    public static class DestructorStack {

        /* renamed from: mHead */
        private final java.util.concurrent.atomic.AtomicReference<com.p166x1da19ac6.jni.C1543x37c99383.Destructor> f5074x62243ed;

        private DestructorStack() {
            this.f5074x62243ed = new java.util.concurrent.atomic.AtomicReference<>();
        }

        /* renamed from: push */
        public void m16723x34af1a(com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor) {
            boolean z17;
            do {
                com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor2 = this.f5074x62243ed.get();
                destructor.f5071x338af3 = destructor2;
                java.util.concurrent.atomic.AtomicReference<com.p166x1da19ac6.jni.C1543x37c99383.Destructor> atomicReference = this.f5074x62243ed;
                while (true) {
                    if (atomicReference.compareAndSet(destructor2, destructor)) {
                        z17 = true;
                        break;
                    } else if (atomicReference.get() != destructor2) {
                        z17 = false;
                        break;
                    }
                }
            } while (!z17);
        }

        /* renamed from: transferAllToList */
        public void m16724x3507870f() {
            com.p166x1da19ac6.jni.C1543x37c99383.Destructor andSet = this.f5074x62243ed.getAndSet(null);
            while (andSet != null) {
                com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor = andSet.f5071x338af3;
                com.p166x1da19ac6.jni.C1543x37c99383.f5067xd6d0fb8a.m16722xa0f98e08(andSet);
                andSet = destructor;
            }
        }
    }

    /* renamed from: com.facebook.jni.DestructorThread$Terminus */
    /* loaded from: classes16.dex */
    public static class Terminus extends com.p166x1da19ac6.jni.C1543x37c99383.Destructor {
        private Terminus() {
            super();
        }

        @Override // com.p166x1da19ac6.jni.C1543x37c99383.Destructor
        /* renamed from: destruct */
        public void mo16719x3da07396() {
            throw new java.lang.IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        java.lang.Thread thread = new java.lang.Thread("HybridData DestructorThread") { // from class: com.facebook.jni.DestructorThread.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.p166x1da19ac6.jni.C1543x37c99383.Destructor destructor = (com.p166x1da19ac6.jni.C1543x37c99383.Destructor) com.p166x1da19ac6.jni.C1543x37c99383.f5069xafd347d9.remove();
                        destructor.mo16719x3da07396();
                        if (destructor.f5072xb413baf7 == null) {
                            com.p166x1da19ac6.jni.C1543x37c99383.f5068x3b5d51c.m16724x3507870f();
                        }
                        com.p166x1da19ac6.jni.C1543x37c99383.DestructorList.m16721x2f2eef(destructor);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        };
        f5070x58b2985d = thread;
        thread.start();
    }
}
