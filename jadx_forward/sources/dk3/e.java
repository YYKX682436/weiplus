package dk3;

/* loaded from: classes8.dex */
public final class e implements dk3.f {

    /* renamed from: a, reason: collision with root package name */
    public final jk3.e f315982a;

    /* renamed from: b, reason: collision with root package name */
    public final ak3.c f315983b;

    /* renamed from: c, reason: collision with root package name */
    public final kk3.g f315984c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 f315985d;

    /* renamed from: e, reason: collision with root package name */
    public int f315986e;

    /* renamed from: f, reason: collision with root package name */
    public int f315987f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f315988g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f315989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f315990i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f315991j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f315992k;

    /* renamed from: l, reason: collision with root package name */
    public long f315993l;

    /* renamed from: m, reason: collision with root package name */
    public float f315994m;

    /* renamed from: n, reason: collision with root package name */
    public float f315995n;

    /* renamed from: o, reason: collision with root package name */
    public long f315996o;

    public e(jk3.e pageHelper, ak3.c pageAdapter, kk3.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageHelper, "pageHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        this.f315982a = pageHelper;
        this.f315983b = pageAdapter;
        this.f315984c = gVar;
        this.f315993l = -1L;
        this.f315996o = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2(pageAdapter.mo2157x19263085(), null, 0, 6, null);
        this.f315985d = c16600x72af54f2;
        c16600x72af54f2.m67120xdecb4a59(new dk3.a(this));
        boolean z17 = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) > i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        this.f315989h = z17;
        d();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        this.f315988g = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f315987f;
        layoutParams.rightMargin = this.f315986e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f22 = this.f315985d;
        if (c16600x72af54f22 != null) {
            c16600x72af54f22.setLayoutParams(layoutParams);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        android.widget.FrameLayout.LayoutParams layoutParams2 = this.f315988g;
        objArr[0] = layoutParams2 != null ? java.lang.Integer.valueOf(layoutParams2.rightMargin) : null;
        android.widget.FrameLayout.LayoutParams layoutParams3 = this.f315988g;
        objArr[1] = layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.bottomMargin) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", objArr);
    }

    public final int a() {
        ak3.c cVar = this.f315983b;
        return cVar.b() >= 0 ? cVar.b() : com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232026j;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2;
        if (this.f315991j && (c16600x72af54f2 = this.f315985d) != null) {
            if (c16600x72af54f2 != null) {
                c16600x72af54f2.setVisibility(8);
            }
            this.f315991j = false;
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "start FloatIndicatorController");
        b();
        this.f315993l = -1L;
        this.f315990i = false;
        this.f315991j = false;
        this.f315992k = false;
        ak3.c cVar = this.f315983b;
        if (cVar.g()) {
            cVar.h(new dk3.c(this));
            pm0.v.X(new dk3.d(this));
        }
    }

    public final void d() {
        int i17;
        android.app.Activity mo2157x19263085 = this.f315983b.mo2157x19263085();
        if (mo2157x19263085 != null) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232017a;
            try {
                i17 = com.p314xaae8f345.mm.ui.bl.c(mo2157x19263085);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e17);
                i17 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232026j = i17;
        }
        if (this.f315989h) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232022f;
            this.f315987f = -i19;
            this.f315986e = a() - i19;
        } else {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232022f;
            this.f315986e = -i27;
            this.f315987f = a() - i27;
        }
    }
}
