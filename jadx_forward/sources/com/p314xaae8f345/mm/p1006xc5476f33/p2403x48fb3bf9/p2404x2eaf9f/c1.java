package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 f263301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f263304i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f263305m;

    public c1(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var, java.lang.String str2, java.lang.String str3, int i18, int i19) {
        this.f263299d = str;
        this.f263300e = i17;
        this.f263301f = h1Var;
        this.f263302g = str2;
        this.f263303h = str3;
        this.f263304i = i18;
        this.f263305m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2 = this.f263299d;
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + str2);
            uri = null;
        }
        if (uri == null || (str = uri.getHost()) == null) {
            str = "";
        }
        java.lang.String str3 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f263300e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var = this.f263301f;
        g0Var.d(22086, 4, valueOf, str3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, str2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, this.f263302g), 1, this.f263303h, java.lang.Integer.valueOf(this.f263304i), java.lang.Integer.valueOf(this.f263305m));
    }
}
