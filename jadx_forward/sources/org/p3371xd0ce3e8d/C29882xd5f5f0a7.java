package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.ThreadUtils */
/* loaded from: classes15.dex */
public class C29882xd5f5f0a7 {

    /* renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class C1CaughtException {

        /* renamed from: e, reason: collision with root package name */
        java.lang.Exception f429481e;
    }

    /* renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class C1Result {

        /* renamed from: value */
        public V f76028x6ac9171;
    }

    /* renamed from: org.webrtc.ThreadUtils$BlockingOperation */
    /* loaded from: classes15.dex */
    public interface BlockingOperation {
        void run();
    }

    /* renamed from: org.webrtc.ThreadUtils$ThreadChecker */
    /* loaded from: classes14.dex */
    public static class ThreadChecker {

        /* renamed from: thread */
        private java.lang.Thread f76035xcbe10e0a = java.lang.Thread.currentThread();

        /* renamed from: checkIsOnValidThread */
        public void m156480x23129e95() {
            if (this.f76035xcbe10e0a == null) {
                this.f76035xcbe10e0a = java.lang.Thread.currentThread();
            }
            if (java.lang.Thread.currentThread() != this.f76035xcbe10e0a) {
                throw new java.lang.IllegalStateException("Wrong thread");
            }
        }

        /* renamed from: detachThread */
        public void m156481xddb6d77d() {
            this.f76035xcbe10e0a = null;
        }
    }

    /* renamed from: awaitUninterruptibly */
    public static void m156471x3f10571a(final java.util.concurrent.CountDownLatch countDownLatch) {
        m156475x61e3f71b(new org.p3371xd0ce3e8d.C29882xd5f5f0a7.BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.p3371xd0ce3e8d.C29882xd5f5f0a7.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    /* renamed from: checkIsOnMainThread */
    public static void m156473x7c0fa5d4() {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            throw new java.lang.IllegalStateException("Not on main thread!");
        }
    }

    /* renamed from: concatStackTraces */
    public static java.lang.StackTraceElement[] m156474xd4969cc2(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.StackTraceElement[] stackTraceElementArr2) {
        java.lang.StackTraceElement[] stackTraceElementArr3 = new java.lang.StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        java.lang.System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        java.lang.System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    /* renamed from: executeUninterruptibly */
    public static void m156475x61e3f71b(org.p3371xd0ce3e8d.C29882xd5f5f0a7.BlockingOperation blockingOperation) {
        boolean z17 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (java.lang.InterruptedException unused) {
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* renamed from: invokeAtFrontUninterruptibly */
    public static <V> V m156476x29214152(android.os.Handler handler, final java.util.concurrent.Callable<V> callable) {
        if (handler.getLooper().getThread() == java.lang.Thread.currentThread()) {
            try {
                return callable.call();
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        final org.p3371xd0ce3e8d.C29882xd5f5f0a7.C1Result c1Result = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.C1Result();
        final org.p3371xd0ce3e8d.C29882xd5f5f0a7.C1CaughtException c1CaughtException = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.C1CaughtException();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        handler.post(new java.lang.Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.p3371xd0ce3e8d.C29882xd5f5f0a7.C1Result.this.f76028x6ac9171 = callable.call();
                } catch (java.lang.Exception e18) {
                    c1CaughtException.f429481e = e18;
                }
                countDownLatch.countDown();
            }
        });
        m156471x3f10571a(countDownLatch);
        if (c1CaughtException.f429481e == null) {
            return c1Result.f76028x6ac9171;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(c1CaughtException.f429481e);
        runtimeException.setStackTrace(m156474xd4969cc2(c1CaughtException.f429481e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    /* renamed from: joinUninterruptibly */
    public static boolean m156479x7fa650c6(java.lang.Thread thread, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z17 = false;
        long j18 = j17;
        while (j18 > 0) {
            try {
                thread.join(j18);
                break;
            } catch (java.lang.InterruptedException unused) {
                j18 = j17 - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    /* renamed from: awaitUninterruptibly */
    public static boolean m156472x3f10571a(java.util.concurrent.CountDownLatch countDownLatch, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z17 = false;
        long j18 = j17;
        boolean z18 = false;
        while (true) {
            try {
                z17 = countDownLatch.await(j18, java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            } catch (java.lang.InterruptedException unused) {
                j18 = j17 - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j18 <= 0) {
                    z18 = true;
                    break;
                }
                z18 = true;
            }
        }
        if (z18) {
            java.lang.Thread.currentThread().interrupt();
        }
        return z17;
    }

    /* renamed from: joinUninterruptibly */
    public static void m156478x7fa650c6(final java.lang.Thread thread) {
        m156475x61e3f71b(new org.p3371xd0ce3e8d.C29882xd5f5f0a7.BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.p3371xd0ce3e8d.C29882xd5f5f0a7.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    /* renamed from: invokeAtFrontUninterruptibly */
    public static void m156477x29214152(android.os.Handler handler, final java.lang.Runnable runnable) {
        m156476x29214152(handler, new java.util.concurrent.Callable<java.lang.Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
