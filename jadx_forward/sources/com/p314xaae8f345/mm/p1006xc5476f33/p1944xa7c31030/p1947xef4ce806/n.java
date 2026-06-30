package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n f234636d = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.n();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0 a17 = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0.f134659o.a(android.os.Process.myPid());
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40960xab2f7f06()) {
            int i17 = a17.f134667n;
            int i18 = a17.f134666m;
            if ((i18 == 0 || i18 == Integer.MAX_VALUE) && (i17 == 0 || i17 == Integer.MAX_VALUE)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForegroundOomAdjWatchDog", "foreground oom_adj/oom_score_adj error: " + i18 + ", " + i17);
            ri.i0 i0Var = ri.k0.f477453a;
            org.json.JSONObject a18 = ri.l0.a(kz5.c1.k(new jz5.l("oom_adj", java.lang.Integer.valueOf(i18)), new jz5.l("oom_score_adj", java.lang.Integer.valueOf(i17))));
            i0Var.a(new ri.j0(7, null, 0, 0, 0L, 0L, 0L, 0, null, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, a18 != null ? ri.l0.b(a18) : null, 0, 0, null, null, 0, 0, -67108866, 1, null));
        }
    }
}
