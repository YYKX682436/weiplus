package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar */
/* loaded from: classes8.dex */
public class C19230x247e287e extends com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb {
    public static int P = -1;
    public android.widget.ImageView E;
    public android.widget.ImageView F;
    public android.widget.RelativeLayout G;
    public android.widget.ImageView H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f263244J;
    public bw4.i K;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 L;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 M;
    public boolean N;

    public C19230x247e287e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean A() {
        bw4.i iVar = this.K;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int mo48226x8a3f46d8 = ((kw4.j) iVar).f394712a.f263601e.mo48226x8a3f46d8();
        int mo61527x6d590e18 = ((kw4.j) this.K).f394712a.f263601e.mo61527x6d590e18();
        if (mo48226x8a3f46d8 < 0 || mo61527x6d590e18 < 0) {
            return false;
        }
        int width = this.I.getWidth();
        if (width <= 0) {
            return true;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.H.getLayoutParams();
        if (mo61527x6d590e18 != 0) {
            width = (int) (width * (1.0f - (mo48226x8a3f46d8 / mo61527x6d590e18)));
        }
        if (width <= 0) {
            width = 0;
        }
        layoutParams.rightMargin = width + P;
        this.H.setLayoutParams(layoutParams);
        return mo48226x8a3f46d8 < mo61527x6d590e18 || mo61527x6d590e18 == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    public void c(int i17) {
        a((int) java.lang.Math.ceil((((kw4.j) this.K).f394712a.f263601e.mo64621x25784152() * 1.0d) / 1000.0d));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getBarPointWidth */
    public int mo69279x5853ad3() {
        return this.f244008h.getWidth();
    }

    /* renamed from: getExitFullscreenIv */
    public android.widget.ImageView m74125x270039fc() {
        return this.f263244J;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bdb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        this.E = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.ggy);
        this.F = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.p5c);
        this.H = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxk);
        this.I = (android.widget.FrameLayout) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxn);
        this.G = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f263244J = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.djo);
        if (P < 0) {
            P = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1v);
        }
    }

    /* renamed from: setEnterFullScreenBtnClickListener */
    public void m74126xf3d6d791(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    /* renamed from: setExitFullScreenBtnClickListener */
    public void m74127xfbc5601b(android.view.View.OnClickListener onClickListener) {
        this.f263244J.setOnClickListener(onClickListener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        this.f263243z = z17;
        y();
    }

    /* renamed from: setMuteBtnOnClickListener */
    public void m74128x2fdf2dbc(android.view.View.OnClickListener onClickListener) {
        this.F.setOnClickListener(onClickListener);
    }

    /* renamed from: setStatePorter */
    public void m74129xb1e0831d(bw4.i iVar) {
        this.K = iVar;
    }

    public final void w() {
        android.view.ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
        if (this.N) {
            layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1t);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1r);
        }
        this.G.setLayoutParams(layoutParams);
        if (this.N) {
            this.E.setImageResource(com.p314xaae8f345.mm.R.raw.f79962xb01e82e0);
            this.E.setVisibility(8);
            this.f263244J.setVisibility(0);
        } else {
            this.f263244J.setVisibility(8);
            this.E.setVisibility(0);
            this.E.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6b);
        }
        y();
        float dimensionPixelSize = this.N ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1u) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1s);
        this.f244010m.setTextSize(0, dimensionPixelSize);
        this.f244011n.setTextSize(0, dimensionPixelSize);
    }

    public void x() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.L;
        if (b4Var != null) {
            b4Var.d();
            this.L.c(2000L, 2000L);
        }
    }

    public final void y() {
        if (this.N) {
            if (this.f263243z) {
                this.f244009i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6_);
                return;
            } else {
                this.f244009i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6d);
                return;
            }
        }
        if (this.f263243z) {
            this.f244009i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6_);
        } else {
            this.f244009i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6d);
        }
    }

    public void z(boolean z17) {
        if (getVisibility() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (z17) {
            this.f244009i.setVisibility(8);
        } else {
            this.f244009i.setVisibility(0);
        }
        if (this.L == null) {
            this.L = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new bw4.g(this), false);
        }
        this.L.d();
        this.L.c(2000L, 2000L);
    }

    public C19230x247e287e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
