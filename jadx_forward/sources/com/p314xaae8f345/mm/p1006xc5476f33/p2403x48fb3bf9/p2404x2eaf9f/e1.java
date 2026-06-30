package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.x0 f263325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 f263326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.y0 f263327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f263330i;

    public e1(com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var, java.lang.String str, int i17, int i18) {
        this.f263325d = x0Var;
        this.f263326e = h1Var;
        this.f263327f = y0Var;
        this.f263328g = str;
        this.f263329h = i17;
        this.f263330i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path;
        com.p314xaae8f345.p3210x3857dc.x0 x0Var = this.f263325d;
        if (!x0Var.mo120514xa25f36b5()) {
            android.net.Uri mo120512xb5887639 = x0Var.mo120512xb5887639();
            boolean z17 = false;
            if (mo120512xb5887639 != null && (path = mo120512xb5887639.getPath()) != null && r26.i0.n(path, ".ico", false)) {
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        java.lang.String host = x0Var.mo120512xb5887639().getHost();
        if (host == null) {
            host = "";
        }
        java.lang.String str = host;
        android.net.Uri mo120512xb58876392 = x0Var.mo120512xb5887639();
        java.lang.String uri = mo120512xb58876392 != null ? mo120512xb58876392.toString() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var = this.f263326e;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, uri);
        com.p314xaae8f345.p3210x3857dc.y0 y0Var = this.f263327f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22086, 2, java.lang.Integer.valueOf(y0Var != null ? y0Var.f302156c : -1), str, a17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, y0Var != null ? y0Var.f302157d : null), java.lang.Integer.valueOf(x0Var.mo120514xa25f36b5() ? 1 : 0), this.f263328g, java.lang.Integer.valueOf(this.f263329h), java.lang.Integer.valueOf(this.f263330i));
    }
}
