package ms4;

/* loaded from: classes8.dex */
public final class h extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final js4.n f412561d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412562e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412563f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412564g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412565h;

    /* renamed from: i, reason: collision with root package name */
    public ks4.g f412566i;

    /* renamed from: m, reason: collision with root package name */
    public int f412567m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f412568n;

    /* renamed from: o, reason: collision with root package name */
    public int f412569o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f412570p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f412571q;

    public h(js4.n mParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mParams, "mParams");
        this.f412561d = mParams;
        this.f412562e = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412563f = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412564g = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412565h = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412569o = -1;
    }

    public final void N6(int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f412569o);
        java.lang.String str2 = this.f412570p;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSceneSessionID");
            throw null;
        }
        objArr[1] = str2;
        java.lang.String str3 = this.f412571q;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSessionid");
            throw null;
        }
        objArr[2] = str3;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str;
        g0Var.d(22129, objArr);
    }

    public final void O6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(this.f412569o);
        java.lang.String str = this.f412570p;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSceneSessionID");
            throw null;
        }
        objArr[1] = str;
        java.lang.String str2 = this.f412571q;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSessionid");
            throw null;
        }
        objArr[2] = str2;
        objArr[3] = java.lang.Integer.valueOf(i17);
        g0Var.d(21651, objArr);
    }

    public final void P6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RechargeProductsDialogViewModel", "resetCacheValue:");
        os4.a.a(this.f412562e, null);
        os4.a.a(this.f412564g, null);
    }
}
