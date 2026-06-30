package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final dp1.x f174891a;

    /* renamed from: b, reason: collision with root package name */
    public final mp1.h f174892b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 f174893c;

    /* renamed from: d, reason: collision with root package name */
    public int f174894d;

    /* renamed from: e, reason: collision with root package name */
    public int f174895e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f174896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f174898h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f174899i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f174900j;

    /* renamed from: k, reason: collision with root package name */
    public long f174901k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f174902l;

    public u0(dp1.x xVar, mp1.h hVar) {
        this.f174891a = xVar;
        this.f174892b = hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78(xVar.mo50327x19263085(), null);
        this.f174893c = c12930x168b4c78;
        c12930x168b4c78.m54203xdecb4a59(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.r0(this));
        boolean z17 = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) > i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        this.f174897g = z17;
        d();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        this.f174896f = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f174895e;
        layoutParams.rightMargin = this.f174894d;
        this.f174893c.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(this.f174896f.rightMargin), java.lang.Integer.valueOf(this.f174896f.bottomMargin));
    }

    public final int a() {
        dp1.x xVar = this.f174891a;
        return xVar.b() >= 0 ? xVar.b() : qp1.c0.f447244t;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78;
        if (this.f174899i && (c12930x168b4c78 = this.f174893c) != null) {
            c12930x168b4c78.setVisibility(8);
            this.f174899i = false;
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "start FloatIndicatorController");
        b();
        this.f174901k = -1L;
        int i17 = 0;
        this.f174898h = false;
        this.f174899i = false;
        this.f174900j = false;
        dp1.x xVar = this.f174891a;
        if (xVar.t()) {
            xVar.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.s0(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78 = this.f174893c;
            if (c12930x168b4c78 != null) {
                c12930x168b4c78.setVisibility(8);
                android.view.ViewGroup a17 = xVar.a();
                try {
                    if (this.f174893c.getParent() != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatIndicatorController", "attachFloatIndicatorView, already attached");
                        return;
                    }
                    int childCount = a17.getChildCount();
                    while (true) {
                        if (i17 >= a17.getChildCount()) {
                            break;
                        }
                        if (a17.getChildAt(i17) instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) {
                            childCount = i17 + 1;
                            break;
                        }
                        i17++;
                    }
                    a17.addView(this.f174893c, childCount);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatIndicatorController", e17, "attachFloatIndicatorView exception:%s", e17);
                }
            }
        }
    }

    public final void d() {
        int i17;
        android.app.Activity mo50327x19263085 = this.f174891a.mo50327x19263085();
        int i18 = qp1.c0.f447225a;
        try {
            i17 = com.p314xaae8f345.mm.ui.bl.c(mo50327x19263085);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e17);
            i17 = 0;
        }
        qp1.c0.f447244t = i17;
        if (this.f174897g) {
            int i19 = qp1.c0.f447242r;
            this.f174895e = -i19;
            this.f174894d = a() - i19;
        } else {
            int i27 = qp1.c0.f447242r;
            this.f174894d = -i27;
            this.f174895e = a() - i27;
        }
    }
}
