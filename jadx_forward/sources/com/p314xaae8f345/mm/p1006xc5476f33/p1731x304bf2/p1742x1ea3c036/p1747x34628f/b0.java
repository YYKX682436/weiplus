package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class b0 extends uw4.n {

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.Object f221403y1 = new java.lang.Object();
    public final vz4.x P;
    public boolean Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.util.Map T;
    public java.lang.String U;
    public boolean V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc f221404l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f221405p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f221406p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f221407x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.Runnable f221408x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f221409y0;

    public b0(android.content.Context context) {
        super(context);
        this.Q = false;
        this.V = false;
        this.W = false;
        this.f221405p0 = false;
        this.f221407x0 = false;
        this.f221409y0 = false;
        this.f221406p1 = false;
        this.f221408x1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.v(this);
        mo120153xd15cf999().A(1);
        this.P = new vz4.x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "create, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // uw4.n
    public void M0() {
        super.M0();
        m170656x86b160dd().f488169o.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.c0(this));
    }

    public void O0(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, blockImg: %b", java.lang.Boolean.valueOf(this.W));
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.f221404l1;
        if (c10723x8ab106bc.F == 0) {
            c10723x8ab106bc.F = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, url: %s, time: %d", str, java.lang.Long.valueOf(this.f221404l1.F));
        }
        if (sx4.d0.b(this.U).f495119e == 0) {
            sx4.d0.b(this.U).f495119e = java.lang.System.currentTimeMillis();
        }
        synchronized (f221403y1) {
            mo120153xd15cf999().q(this.W);
        }
        this.V = true;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc2 = this.f221404l1;
        if (c10723x8ab106bc2.C != 0) {
            return;
        }
        c10723x8ab106bc2.C = java.lang.System.currentTimeMillis();
    }

    public void P0(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f221405p0 = true;
        if (this.f221407x0) {
            postDelayed(this.f221408x1, 3000L);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.f221404l1;
        if (c10723x8ab106bc.E == 0) {
            c10723x8ab106bc.E = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onPageStarted, url: %s, time: %d", str, java.lang.Long.valueOf(this.f221404l1.E));
        }
        if (sx4.d0.b(this.U).f495118d == 0) {
            sx4.d0.b(this.U).f495118d = java.lang.System.currentTimeMillis();
        }
    }

    @Override // uw4.n, pf.b
    public void a0(pf.a aVar) {
        super.a0(aVar);
        N0(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.w(this));
    }

    @Override // uw4.n, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        this.P.g(this.f221409y0);
        super.mo52095x5cd39ffa();
    }

    @Override // uw4.n, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: getTitle */
    public java.lang.String mo64579x7531c8a2() {
        return this.R;
    }

    /* renamed from: getWePkgPlugin */
    public vz4.x m64580x8eda3bb() {
        return this.P;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (this.f221404l1 == null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(str);
            this.f221404l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        if (!this.Q) {
            this.P.e(str, true, true);
            this.Q = true;
        }
        super.mo64581x9b341568(str, str2, str3, str4, str5);
    }

    @Override // uw4.n, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time : %d, hashCode: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        if (this.f221404l1 == null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(this.U);
            this.f221404l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        boolean z17 = this.Q;
        vz4.x xVar = this.P;
        if (!z17) {
            xVar.e(str, true, false);
            this.Q = true;
        }
        if (!xVar.f523289d) {
            xVar.f523302q = null;
        }
        java.lang.String str2 = xVar.f523302q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                jj0.a.a().b(5, java.net.URLEncoder.encode(str), "0", 0L);
            } catch (java.lang.Exception unused) {
            }
            super.mo32265x141096a9(str);
        } else {
            try {
                jj0.a.a().b(5, java.net.URLEncoder.encode(str), "1", 0L);
            } catch (java.lang.Exception unused2) {
            }
            super.mo64581x9b341568(str, str2, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onAttachedToWindow, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        this.f221407x0 = true;
        if (this.f221405p0) {
            postDelayed(this.f221408x1, 3000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onDetachedFromWindow, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        removeCallbacks(this.f221408x1);
    }

    /* renamed from: setBlockNetworkImage */
    public void m64582x406fccb8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage, blockImg: %b", java.lang.Boolean.valueOf(z17));
        this.W = z17;
        if (this.V) {
            synchronized (f221403y1) {
                mo120153xd15cf999().q(z17);
            }
        }
    }

    /* renamed from: setRawUrl */
    public void m64583x20631b29(java.lang.String str) {
        this.U = str;
    }

    /* renamed from: setShouldCleanPkgWhenDestroy */
    public void m64584x10a231a8(boolean z17) {
        this.f221409y0 = z17;
    }

    @Override // uw4.n, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time: %d， HEADER", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (this.f221404l1 == null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(this.U);
            this.f221404l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        boolean z17 = this.Q;
        vz4.x xVar = this.P;
        if (!z17) {
            xVar.e(str, true, false);
            this.Q = true;
        }
        if (!xVar.f523289d) {
            xVar.f523302q = null;
        }
        java.lang.String str2 = xVar.f523302q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            jj0.a.a().b(5, java.net.URLEncoder.encode(str), "0", 0L);
            super.mo32266x141096a9(str, map);
        } else {
            jj0.a.a().b(5, java.net.URLEncoder.encode(str), "1", 0L);
            super.mo64581x9b341568(str, str2, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        }
    }
}
