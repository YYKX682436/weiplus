package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 f263312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f263314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263315i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f263316m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f263317n;

    public d1(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var, java.lang.String str2, boolean z17, java.lang.String str3, int i18, int i19) {
        this.f263310d = str;
        this.f263311e = i17;
        this.f263312f = h1Var;
        this.f263313g = str2;
        this.f263314h = z17;
        this.f263315i = str3;
        this.f263316m = i18;
        this.f263317n = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2 = this.f263310d;
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + str2);
            uri = null;
        }
        if (uri == null || (str = uri.getHost()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var = this.f263312f;
        g0Var.d(22086, 1, java.lang.Integer.valueOf(this.f263311e), str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, str2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, this.f263313g), java.lang.Integer.valueOf(this.f263314h ? 1 : 0), this.f263315i, java.lang.Integer.valueOf(this.f263316m), java.lang.Integer.valueOf(this.f263317n));
    }
}
