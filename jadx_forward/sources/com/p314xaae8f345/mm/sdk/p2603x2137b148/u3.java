package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class u3 {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274547d;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f274548a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274549b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f274550c;

    public u3(android.os.HandlerThread handlerThread) {
        this.f274550c = null;
        this.f274548a = handlerThread;
        this.f274550c = handlerThread.getName();
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 b() {
        if (f274547d == null) {
            f274547d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        return f274547d;
    }

    public static boolean e() {
        return java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId();
    }

    public static void h(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().mo50293x3498a0(runnable);
    }

    public static void i(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        b().mo50297x7c4d7ca2(runnable, j17);
    }

    public static void l(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().mo50300x3fa464aa(runnable);
    }

    public static void m(int i17) {
        try {
            android.os.Process.setThreadPriority(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d ok", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d fail, %s", java.lang.Integer.valueOf(i17), e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public android.os.Looper a() {
        return this.f274548a.getLooper();
    }

    public int c() {
        android.os.HandlerThread handlerThread = this.f274548a;
        if (handlerThread == null) {
            return -1;
        }
        return handlerThread.getThreadId();
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d() {
        if (this.f274549b == null) {
            this.f274549b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f274548a.getLooper());
        }
        return this.f274549b;
    }

    public int f(java.lang.Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        d().mo50294x9395cba4(runnable);
        return 0;
    }

    public int g(com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 s3Var) {
        if (s3Var == null) {
            return -1;
        }
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a()).mo50294x9395cba4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.r3(this, s3Var)) ? 0 : -2;
    }

    public int j(java.lang.Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        d().mo50293x3498a0(runnable);
        return 0;
    }

    public int k(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return -1;
        }
        d().mo50297x7c4d7ca2(runnable, j17);
        return 0;
    }

    public void n() {
        android.os.HandlerThread handlerThread = this.f274548a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHandlerThread", "setHighPriority failed thread is dead");
            return;
        }
        int threadId = this.f274548a.getThreadId();
        try {
            if (-8 == android.os.Process.getThreadPriority(threadId)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "setHighPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, -8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "thread:%d setHighPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "thread:%d setHighPriority failed", java.lang.Integer.valueOf(threadId));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public void o() {
        android.os.HandlerThread handlerThread = this.f274548a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHandlerThread", "setLowPriority failed thread is dead");
            return;
        }
        int threadId = this.f274548a.getThreadId();
        try {
            if (android.os.Process.getThreadPriority(threadId) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "setLowPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "thread:%d setLowPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "thread:%d setLowPriority failed", java.lang.Integer.valueOf(threadId));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }

    public void p() {
        android.os.HandlerThread handlerThread = this.f274548a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHandlerThread", "setLowestPriority failed thread is dead");
            return;
        }
        int threadId = this.f274548a.getThreadId();
        try {
            if (19 == android.os.Process.getThreadPriority(threadId)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "setLowestPriority No Need.");
            } else {
                android.os.Process.setThreadPriority(threadId, 19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority to %d", java.lang.Integer.valueOf(threadId), java.lang.Integer.valueOf(android.os.Process.getThreadPriority(threadId)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority failed", java.lang.Integer.valueOf(threadId));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMHandlerThread", e17, "", new java.lang.Object[0]);
        }
    }
}
