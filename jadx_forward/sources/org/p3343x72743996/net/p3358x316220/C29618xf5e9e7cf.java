package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.JavaUrlRequestUtils */
/* loaded from: classes6.dex */
public final class C29618xf5e9e7cf {

    /* renamed from: org.chromium.net.impl.JavaUrlRequestUtils$CheckedRunnable */
    /* loaded from: classes6.dex */
    public interface CheckedRunnable {
        void run();
    }

    /* renamed from: org.chromium.net.impl.JavaUrlRequestUtils$DirectPreventingExecutor */
    /* loaded from: classes16.dex */
    public static final class DirectPreventingExecutor implements java.util.concurrent.Executor {

        /* renamed from: mDelegate */
        private final java.util.concurrent.Executor f74771x55d38512;

        /* renamed from: org.chromium.net.impl.JavaUrlRequestUtils$DirectPreventingExecutor$InlineCheckingRunnable */
        /* loaded from: classes16.dex */
        public static final class InlineCheckingRunnable implements java.lang.Runnable {

            /* renamed from: mCallingThread */
            private java.lang.Thread f74772xb23af881;

            /* renamed from: mCommand */
            private final java.lang.Runnable f74773xd6be921e;

            /* renamed from: mExecutedInline */
            private org.p3343x72743996.net.C29522xbce39852 f74774x8b5168d5;

            @Override // java.lang.Runnable
            public void run() {
                if (java.lang.Thread.currentThread() == this.f74772xb23af881) {
                    this.f74774x8b5168d5 = new org.p3343x72743996.net.C29522xbce39852();
                } else {
                    this.f74773xd6be921e.run();
                }
            }

            private InlineCheckingRunnable(java.lang.Runnable runnable, java.lang.Thread thread) {
                this.f74773xd6be921e = runnable;
                this.f74772xb23af881 = thread;
            }
        }

        public DirectPreventingExecutor(java.util.concurrent.Executor executor) {
            this.f74771x55d38512 = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.DirectPreventingExecutor.InlineCheckingRunnable inlineCheckingRunnable = new org.p3343x72743996.net.p3358x316220.C29618xf5e9e7cf.DirectPreventingExecutor.InlineCheckingRunnable(runnable, java.lang.Thread.currentThread());
            this.f74771x55d38512.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.f74774x8b5168d5 != null) {
                throw inlineCheckingRunnable.f74774x8b5168d5;
            }
            inlineCheckingRunnable.f74772xb23af881 = null;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.JavaUrlRequestUtils$State */
    /* loaded from: classes6.dex */
    public @interface State {

        /* renamed from: AWAITING_FOLLOW_REDIRECT */
        public static final int f74775xec97c537 = 3;

        /* renamed from: AWAITING_READ */
        public static final int f74776x85ffe329 = 4;

        /* renamed from: CANCELLED */
        public static final int f74777xc2803931 = 8;

        /* renamed from: COMPLETE */
        public static final int f74778xaeb2139 = 7;

        /* renamed from: ERROR */
        public static final int f74779x3f2d9e8 = 6;

        /* renamed from: NOT_STARTED */
        public static final int f74780xad133ed5 = 0;

        /* renamed from: READING */
        public static final int f74781x6b315a6c = 5;

        /* renamed from: REDIRECT_RECEIVED */
        public static final int f74782x85e53ae4 = 2;

        /* renamed from: STARTED */
        public static final int f74783xb9b6cc61 = 1;
    }
}
