package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.DestructorThread */
/* loaded from: classes16.dex */
public class C27685x37c99383 {

    /* renamed from: sThread */
    private static final java.lang.Thread f60605x58b2985d;

    /* renamed from: sDestructorStack */
    private static final com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.DestructorStack f60603x3b5d51c = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.DestructorStack();

    /* renamed from: sReferenceQueue */
    private static final java.lang.ref.ReferenceQueue f60604xafd347d9 = new java.lang.ref.ReferenceQueue();

    /* renamed from: sDestructorList */
    private static final com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.DestructorList f60602xd6d0fb8a = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.DestructorList();

    /* renamed from: com.tencent.wechat.zidl2.DestructorThread$Destructor */
    /* loaded from: classes16.dex */
    public static abstract class Destructor extends java.lang.ref.PhantomReference<java.lang.Object> {

        /* renamed from: next */
        private com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor f60606x338af3;

        /* renamed from: previous */
        private com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor f60607xb413baf7;

        /* renamed from: destruct */
        public abstract void mo22023x3da07396();

        public Destructor(java.lang.Object obj) {
            super(obj, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60604xafd347d9);
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60603x3b5d51c.m119471x34af1a(this);
        }

        private Destructor() {
            super(null, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60604xafd347d9);
        }
    }

    /* renamed from: com.tencent.wechat.zidl2.DestructorThread$DestructorList */
    /* loaded from: classes16.dex */
    public static class DestructorList {

        /* renamed from: mHead */
        private final com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor f60608x62243ed;

        public DestructorList() {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Terminus terminus = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Terminus();
            this.f60608x62243ed = terminus;
            ((com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor) terminus).f60606x338af3 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Terminus();
            ((com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor) terminus).f60606x338af3.f60607xb413baf7 = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: drop */
        public static void m119469x2f2eef(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor) {
            destructor.f60606x338af3.f60607xb413baf7 = destructor.f60607xb413baf7;
            destructor.f60607xb413baf7.f60606x338af3 = destructor.f60606x338af3;
        }

        /* renamed from: enqueue */
        public void m119470xa0f98e08(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor) {
            destructor.f60606x338af3 = this.f60608x62243ed.f60606x338af3;
            this.f60608x62243ed.f60606x338af3 = destructor;
            destructor.f60606x338af3.f60607xb413baf7 = destructor;
            destructor.f60607xb413baf7 = this.f60608x62243ed;
        }
    }

    /* renamed from: com.tencent.wechat.zidl2.DestructorThread$DestructorStack */
    /* loaded from: classes16.dex */
    public static class DestructorStack {

        /* renamed from: mHead */
        private final java.util.concurrent.atomic.AtomicReference<com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor> f60609x62243ed;

        private DestructorStack() {
            this.f60609x62243ed = new java.util.concurrent.atomic.AtomicReference<>();
        }

        /* renamed from: push */
        public void m119471x34af1a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor) {
            boolean z17;
            do {
                com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor2 = this.f60609x62243ed.get();
                destructor.f60606x338af3 = destructor2;
                java.util.concurrent.atomic.AtomicReference<com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor> atomicReference = this.f60609x62243ed;
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
        public void m119472x3507870f() {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor andSet = this.f60609x62243ed.getAndSet(null);
            while (andSet != null) {
                com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor = andSet.f60606x338af3;
                com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60602xd6d0fb8a.m119470xa0f98e08(andSet);
                andSet = destructor;
            }
        }
    }

    /* renamed from: com.tencent.wechat.zidl2.DestructorThread$Terminus */
    /* loaded from: classes16.dex */
    public static class Terminus extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private Terminus() {
            super();
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            throw new java.lang.IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        java.lang.Thread thread = new java.lang.Thread("Zidl Java DestructorThread") { // from class: com.tencent.wechat.zidl2.DestructorThread.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor destructor = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60604xafd347d9.remove();
                        destructor.mo22023x3da07396();
                        if (destructor.f60607xb413baf7 == null) {
                            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.f60603x3b5d51c.m119472x3507870f();
                        }
                        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.DestructorList.m119469x2f2eef(destructor);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        };
        f60605x58b2985d = thread;
        thread.start();
    }
}
