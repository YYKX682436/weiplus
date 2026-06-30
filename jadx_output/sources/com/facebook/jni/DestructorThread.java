package com.facebook.jni;

/* loaded from: classes16.dex */
public class DestructorThread {
    private static final java.lang.Thread sThread;
    private static final com.facebook.jni.DestructorThread.DestructorStack sDestructorStack = new com.facebook.jni.DestructorThread.DestructorStack();
    private static final java.lang.ref.ReferenceQueue sReferenceQueue = new java.lang.ref.ReferenceQueue();
    private static final com.facebook.jni.DestructorThread.DestructorList sDestructorList = new com.facebook.jni.DestructorThread.DestructorList();

    /* loaded from: classes16.dex */
    public static abstract class Destructor extends java.lang.ref.PhantomReference<java.lang.Object> {
        private com.facebook.jni.DestructorThread.Destructor next;
        private com.facebook.jni.DestructorThread.Destructor previous;

        public abstract void destruct();

        public Destructor(java.lang.Object obj) {
            super(obj, com.facebook.jni.DestructorThread.sReferenceQueue);
            com.facebook.jni.DestructorThread.sDestructorStack.push(this);
        }

        private Destructor() {
            super(null, com.facebook.jni.DestructorThread.sReferenceQueue);
        }
    }

    /* loaded from: classes16.dex */
    public static class DestructorList {
        private final com.facebook.jni.DestructorThread.Destructor mHead;

        public DestructorList() {
            com.facebook.jni.DestructorThread.Terminus terminus = new com.facebook.jni.DestructorThread.Terminus();
            this.mHead = terminus;
            ((com.facebook.jni.DestructorThread.Destructor) terminus).next = new com.facebook.jni.DestructorThread.Terminus();
            ((com.facebook.jni.DestructorThread.Destructor) terminus).next.previous = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void drop(com.facebook.jni.DestructorThread.Destructor destructor) {
            destructor.next.previous = destructor.previous;
            destructor.previous.next = destructor.next;
        }

        public void enqueue(com.facebook.jni.DestructorThread.Destructor destructor) {
            destructor.next = this.mHead.next;
            this.mHead.next = destructor;
            destructor.next.previous = destructor;
            destructor.previous = this.mHead;
        }
    }

    /* loaded from: classes16.dex */
    public static class DestructorStack {
        private final java.util.concurrent.atomic.AtomicReference<com.facebook.jni.DestructorThread.Destructor> mHead;

        private DestructorStack() {
            this.mHead = new java.util.concurrent.atomic.AtomicReference<>();
        }

        public void push(com.facebook.jni.DestructorThread.Destructor destructor) {
            boolean z17;
            do {
                com.facebook.jni.DestructorThread.Destructor destructor2 = this.mHead.get();
                destructor.next = destructor2;
                java.util.concurrent.atomic.AtomicReference<com.facebook.jni.DestructorThread.Destructor> atomicReference = this.mHead;
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

        public void transferAllToList() {
            com.facebook.jni.DestructorThread.Destructor andSet = this.mHead.getAndSet(null);
            while (andSet != null) {
                com.facebook.jni.DestructorThread.Destructor destructor = andSet.next;
                com.facebook.jni.DestructorThread.sDestructorList.enqueue(andSet);
                andSet = destructor;
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class Terminus extends com.facebook.jni.DestructorThread.Destructor {
        private Terminus() {
            super();
        }

        @Override // com.facebook.jni.DestructorThread.Destructor
        public void destruct() {
            throw new java.lang.IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        java.lang.Thread thread = new java.lang.Thread("HybridData DestructorThread") { // from class: com.facebook.jni.DestructorThread.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.facebook.jni.DestructorThread.Destructor destructor = (com.facebook.jni.DestructorThread.Destructor) com.facebook.jni.DestructorThread.sReferenceQueue.remove();
                        destructor.destruct();
                        if (destructor.previous == null) {
                            com.facebook.jni.DestructorThread.sDestructorStack.transferAllToList();
                        }
                        com.facebook.jni.DestructorThread.DestructorList.drop(destructor);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        };
        sThread = thread;
        thread.start();
    }
}
