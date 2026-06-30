package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class o3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f274425a;

    public static void b(boolean z17) {
        f274425a = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerAsync", "sIsDuringSyncBarrierTimeSpan = %s", java.lang.Boolean.valueOf(f274425a));
    }

    public static boolean c() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19998x4315be09()) == 1;
    }

    public boolean d(java.lang.Runnable runnable) {
        return e(runnable, android.os.SystemClock.uptimeMillis());
    }

    public final boolean e(java.lang.Runnable runnable, long j17) {
        if (!c() || !f274425a) {
            return mo50295x41bd0e60(runnable, j17);
        }
        android.os.Message mo50292x733c63a2 = mo50292x733c63a2(-16711936, runnable);
        mo50292x733c63a2.setAsynchronous(true);
        return mo50310xc5d0e9df(mo50292x733c63a2, j17);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what == -16711936) {
            java.lang.Object obj = message.obj;
            if (obj instanceof java.lang.Runnable) {
                ((java.lang.Runnable) obj).run();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3, qu5.a
    /* renamed from: post */
    public boolean mo50293x3498a0(java.lang.Runnable runnable) {
        return d(runnable);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3, qu5.a
    /* renamed from: postAtFrontOfQueue */
    public boolean mo50294x9395cba4(java.lang.Runnable runnable) {
        return e(runnable, 0L);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3, qu5.a
    /* renamed from: postDelayed */
    public boolean mo50297x7c4d7ca2(java.lang.Runnable runnable, long j17) {
        if (j17 < 0) {
            j17 = 0;
        }
        return e(runnable, android.os.SystemClock.uptimeMillis() + j17);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3, qu5.a
    /* renamed from: removeCallbacks */
    public void mo50300x3fa464aa(java.lang.Runnable runnable) {
        mo50304x856b99f0(-16711936, runnable);
        super.mo50300x3fa464aa(runnable);
    }
}
