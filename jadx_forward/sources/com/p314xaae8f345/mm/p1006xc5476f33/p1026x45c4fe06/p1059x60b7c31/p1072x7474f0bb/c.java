package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1072x7474f0bb;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f161567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161568h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f161569i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f161570m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f161571n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f161572o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f161573p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f161574q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f161575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161576s;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, boolean z17, boolean z18, int i17, boolean z19, int i18, boolean z27, boolean z28, java.lang.String str4) {
        this.f161564d = lVar;
        this.f161565e = str;
        this.f161566f = str2;
        this.f161567g = d17;
        this.f161568h = str3;
        this.f161569i = z17;
        this.f161570m = z18;
        this.f161571n = i17;
        this.f161572o = z19;
        this.f161573p = i18;
        this.f161574q = z27;
        this.f161575r = z28;
        this.f161576s = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context f229340d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161564d;
        if (lVar == null || (f229340d = lVar.getF229340d()) == null) {
            return;
        }
        java.lang.String str = this.f161568h;
        boolean z17 = this.f161569i;
        boolean z18 = this.f161570m;
        int i17 = this.f161571n;
        boolean z19 = this.f161572o;
        int i18 = this.f161573p;
        boolean z27 = this.f161574q;
        boolean z28 = this.f161575r;
        java.lang.String str2 = this.f161576s;
        boolean equals = this.f161565e.equals("portrait");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "createHalfScreenWebView");
        i95.m c17 = i95.n0.c(zg0.u2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String str3 = this.f161566f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) zg0.u2.K2((zg0.u2) c17, f229340d, str3, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1((float) this.f161567g, 0.0f, str, z17, z18, i17, false, z19, i18, false, false, 0, false, z27, z28, str2, equals, 0, false, 0, false, false, false, 8265282, null), 4, null)).show();
    }
}
