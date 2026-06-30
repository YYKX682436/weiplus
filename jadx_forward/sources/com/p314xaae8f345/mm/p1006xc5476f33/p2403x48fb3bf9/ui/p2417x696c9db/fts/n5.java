package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class n5 {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5 f266074e;

    /* renamed from: a, reason: collision with root package name */
    public q35.d f266075a;

    /* renamed from: b, reason: collision with root package name */
    public long f266076b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f266077c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266078d = false;

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m5 m5Var) {
        if (this.f266078d && this.f266075a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchShakeCheckingManager", "startCheck , isInitShake.");
            return;
        }
        this.f266078d = true;
        q35.d dVar = new q35.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f266075a = dVar;
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.l5(this, m5Var));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f266076b = android.os.SystemClock.elapsedRealtime();
    }
}
