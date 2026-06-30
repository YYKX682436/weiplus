package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar */
/* loaded from: classes15.dex */
public class C12274xd0769b70 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf implements oe1.f1 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f165178p1 = 0;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.widget.LinearLayout E;
    public android.widget.ImageView F;
    public android.widget.FrameLayout G;
    public android.widget.ImageView H;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f165179J;
    public android.widget.TextView K;
    public android.widget.LinearLayout L;
    public android.widget.LinearLayout M;
    public oe1.n1 N;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 P;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f165180l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f165181p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f165182x0;

    /* renamed from: y0, reason: collision with root package name */
    public oe1.j1 f165183y0;

    public C12274xd0769b70(android.content.Context context) {
        super(context);
        this.f165182x0 = true;
        this.f165180l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, oe1.f1
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f165169p;
        int i19 = this.f165168o;
        oe1.j1 j1Var = this.f165183y0;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i18, i19);
        }
    }

    @Override // oe1.f1
    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.P;
        if (b4Var != null) {
            b4Var.d();
            this.P.c(7000L, 7000L);
        }
    }

    @Override // oe1.f1
    public boolean c() {
        return this.R;
    }

    @Override // oe1.f1
    public void d() {
        if (this.W && this.f165181p0) {
            this.I.setVisibility(8);
        }
    }

    @Override // oe1.f1
    public boolean e() {
        return this.G != null && getVisibility() == 0 && this.G.getVisibility() == 0;
    }

    @Override // oe1.f1
    /* renamed from: enterFullScreen */
    public void mo51419x31f09cd3() {
        this.R = true;
        u();
    }

    @Override // oe1.f1
    public void f() {
        if (this.W && this.f165181p0) {
            this.I.setVisibility(0);
        }
    }

    @Override // oe1.f1
    public void g() {
        setVisibility(0);
        if (this.f165182x0) {
            if (this.P == null) {
                this.P = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new df1.e(this), false);
            }
            this.P.d();
            this.P.c(7000L, 7000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo51412x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569649hl;
    }

    @Override // oe1.f1
    public boolean h() {
        return this.S;
    }

    @Override // oe1.f1
    /* renamed from: hide */
    public void mo51420x30dd42() {
        setVisibility(8);
    }

    @Override // oe1.f1
    public void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.Q;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // oe1.f1
    /* renamed from: isShow */
    public boolean mo51421xb9a8b747() {
        return getVisibility() == 0;
    }

    @Override // oe1.f1
    public void j() {
        if (mo51421xb9a8b747()) {
            setVisibility(8);
        } else {
            g();
        }
    }

    @Override // oe1.f1
    public void k(oe1.k1 k1Var) {
        this.f165180l1.add(k1Var);
    }

    @Override // oe1.f1
    public void l() {
        this.R = false;
        u();
    }

    @Override // oe1.f1
    public boolean m() {
        return this.f165182x0;
    }

    @Override // oe1.f1
    public void n() {
        if (this.Q == null) {
            this.Q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new df1.f(this), true);
        }
        y();
        this.Q.d();
        this.Q.c(500L, 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    public void o() {
        super.o();
        this.C = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.ggy);
        this.D = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.f565556cq4);
        this.F = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxk);
        this.G = (android.widget.FrameLayout) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxn);
        this.E = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.H = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.k0y);
        this.I = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bdx);
        this.f165179J = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.djo);
        this.K = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.L = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ghm);
        this.M = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.kxh);
    }

    @Override // oe1.f1
    /* renamed from: onDestroy */
    public void mo51422xac79a11b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.Q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.P;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    public void q() {
        if (this.f165168o == 0 || this.f165172s || this.f165164h == null) {
            return;
        }
        this.f165166m.setText(p(this.f165169p / 60) + ":" + p(this.f165169p % 60));
        if (m51409x11ddf3f8() == 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165164h.getLayoutParams();
        int m51409x11ddf3f8 = m51409x11ddf3f8();
        layoutParams.leftMargin = t(this.f165169p, m51409x11ddf3f8);
        this.f165164h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f165162f.getLayoutParams();
        layoutParams2.width = (int) (((this.f165169p * 1.0d) / this.f165168o) * m51409x11ddf3f8);
        this.f165162f.setLayoutParams(layoutParams2);
        requestLayout();
        int i17 = this.f165169p;
        int i18 = this.f165168o;
        oe1.j1 j1Var = this.f165183y0;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i17, i18);
        }
    }

    /* renamed from: setAutoHide */
    public void m51423xcc4e5e13(boolean z17) {
        this.f165182x0 = z17;
    }

    @Override // oe1.f1
    /* renamed from: setDanmakuBtnOnClickListener */
    public void mo51424x69e685ee(oe1.l1 l1Var) {
        this.D.setOnClickListener(new df1.d(this, l1Var));
    }

    @Override // oe1.f1
    /* renamed from: setDanmakuBtnOpen */
    public void mo51425x76647fb9(boolean z17) {
        this.S = z17;
        if (z17) {
            this.D.setImageResource(com.p314xaae8f345.mm.R.raw.f78492x57005d3f);
        } else {
            this.D.setImageResource(com.p314xaae8f345.mm.R.raw.f78491x890b4a0f);
        }
    }

    @Override // oe1.f1
    /* renamed from: setExitFullScreenBtnOnClickListener */
    public void mo51426xe81cd0bc(android.view.View.OnClickListener onClickListener) {
        this.f165179J.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    /* renamed from: setFullScreenBtnOnClickListener */
    public void mo51427x71354d7e(android.view.View.OnClickListener onClickListener) {
        this.C.setOnClickListener(onClickListener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.f1
    /* renamed from: setIsPlay */
    public void mo51416x11f3be80(boolean z17) {
        if (z17) {
            this.f165165i.setImageResource(com.p314xaae8f345.mm.R.raw.f78498x9a40e5e2);
            this.I.setImageResource(com.p314xaae8f345.mm.R.raw.f78498x9a40e5e2);
        } else {
            this.f165165i.setImageResource(com.p314xaae8f345.mm.R.raw.f78499x157e1dc8);
            this.I.setImageResource(com.p314xaae8f345.mm.R.raw.f78499x157e1dc8);
        }
    }

    @Override // oe1.f1
    /* renamed from: setMuteBtnOnClickListener */
    public void mo51428x2fdf2dbc(android.view.View.OnClickListener onClickListener) {
        this.H.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    /* renamed from: setMuteBtnState */
    public void mo51429x9b890a50(boolean z17) {
        if (z17) {
            this.H.setImageResource(com.p314xaae8f345.mm.R.raw.f78496xb1c18a40);
        } else {
            this.H.setImageResource(com.p314xaae8f345.mm.R.raw.f78497x7958d2ee);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.f1
    /* renamed from: setOnPlayButtonClickListener */
    public void mo51417xb892d55(android.view.View.OnClickListener onClickListener) {
        super.mo51417xb892d55(onClickListener);
        this.I.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    /* renamed from: setOnUpdateProgressLenListener */
    public void mo51430x46e95712(oe1.j1 j1Var) {
        this.f165183y0 = j1Var;
    }

    @Override // oe1.f1
    /* renamed from: setPlayBtnInCenterPosition */
    public void mo51431xa239d909(boolean z17) {
        this.f165181p0 = z17;
        w();
    }

    @Override // oe1.f1
    /* renamed from: setShowControlProgress */
    public void mo51432xb4d85e2b(boolean z17) {
        this.V = z17;
        x();
    }

    @Override // oe1.f1
    /* renamed from: setShowDanmakuBtn */
    public void mo51433x8498f2ac(boolean z17) {
        if (z17) {
            this.D.setVisibility(0);
        } else {
            this.D.setVisibility(8);
        }
    }

    @Override // oe1.f1
    /* renamed from: setShowFullScreenBtn */
    public void mo51434x1cf93842(boolean z17) {
        this.T = z17;
        v();
        if (this.R) {
            this.L.setVisibility(0);
        } else {
            this.L.setVisibility(8);
        }
    }

    @Override // oe1.f1
    /* renamed from: setShowMuteBtn */
    public void mo51435xdb9e6204(boolean z17) {
        this.H.setVisibility(z17 ? 0 : 8);
    }

    @Override // oe1.f1
    /* renamed from: setShowPlayBtn */
    public void mo51436x69f2cf09(boolean z17) {
        this.W = z17;
        w();
    }

    @Override // oe1.f1
    /* renamed from: setShowProgress */
    public void mo51437x28c841cc(boolean z17) {
        this.U = z17;
        x();
    }

    @Override // oe1.f1
    /* renamed from: setStatePorter */
    public void mo51438xb1e0831d(oe1.n1 n1Var) {
        this.N = n1Var;
    }

    @Override // oe1.f1
    /* renamed from: setTitle */
    public void mo51439x53bfe316(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.K.setText(str);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f165180l1;
        if (i17 == 0) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                oe1.k1 k1Var = (oe1.k1) it.next();
                if (k1Var != null) {
                    k1Var.a(true);
                }
            }
            return;
        }
        if (i17 == 8 || i17 == 4) {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                oe1.k1 k1Var2 = (oe1.k1) it6.next();
                if (k1Var2 != null) {
                    k1Var2.a(false);
                }
            }
        }
    }

    public final void u() {
        android.view.ViewGroup.LayoutParams layoutParams = this.E.getLayoutParams();
        if (this.R) {
            layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561638o8);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561630o0);
        }
        this.E.setLayoutParams(layoutParams);
        int dimensionPixelSize = this.R ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561639o9) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561631o1);
        this.E.setPadding(0, 0, dimensionPixelSize, 0);
        android.widget.LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        v();
        if (this.R) {
            this.L.setVisibility(0);
        } else {
            this.L.setVisibility(8);
        }
        float dimensionPixelSize2 = this.R ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.o_) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561634o4);
        this.f165166m.setTextSize(0, dimensionPixelSize2);
        this.f165167n.setTextSize(0, dimensionPixelSize2);
        int dimensionPixelSize3 = this.R ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561637o7) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561629nz);
        android.widget.ImageView imageView = this.f165165i;
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize3);
            this.f165165i.setLayoutParams(marginLayoutParams);
        }
        android.widget.LinearLayout linearLayout2 = this.M;
        if (linearLayout2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
            marginLayoutParams2.setMarginStart(dimensionPixelSize3);
            this.M.setLayoutParams(marginLayoutParams2);
        }
        android.widget.ImageView imageView2 = this.D;
        if (imageView2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            marginLayoutParams3.setMarginStart(dimensionPixelSize3);
            this.D.setLayoutParams(marginLayoutParams3);
        }
        android.widget.ImageView imageView3 = this.H;
        if (imageView3 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) imageView3.getLayoutParams();
            marginLayoutParams4.setMarginStart(dimensionPixelSize3);
            this.H.setLayoutParams(marginLayoutParams4);
        }
        android.widget.ImageView imageView4 = this.C;
        if (imageView4 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) imageView4.getLayoutParams();
            marginLayoutParams5.setMarginStart(dimensionPixelSize3);
            this.C.setLayoutParams(marginLayoutParams5);
        }
    }

    public void v() {
        if (!this.T) {
            this.C.setVisibility(8);
            return;
        }
        this.C.setVisibility(0);
        if (this.R) {
            this.C.setImageResource(com.p314xaae8f345.mm.R.raw.f78495xc1579925);
        } else {
            this.C.setImageResource(com.p314xaae8f345.mm.R.raw.f78494xf77dd2b2);
        }
    }

    public final void w() {
        if (!this.W) {
            this.f165165i.setVisibility(8);
            this.I.setVisibility(8);
        } else if (this.f165181p0) {
            this.f165165i.setVisibility(8);
            this.I.setVisibility(0);
        } else {
            this.f165165i.setVisibility(0);
            this.I.setVisibility(8);
        }
    }

    public final void x() {
        boolean z17 = this.V ? this.U : false;
        this.G.setVisibility(z17 ? 0 : 8);
        this.f165166m.setVisibility(z17 ? 0 : 8);
        this.f165167n.setVisibility(z17 ? 0 : 8);
    }

    public final boolean y() {
        oe1.n1 n1Var = this.N;
        if (n1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int mo51375x8a3f46d8 = ((oe1.i) n1Var).f426245a.f165062f.mo51375x8a3f46d8();
        int mo51380x6d590e18 = ((oe1.i) this.N).f426245a.f165062f.mo51380x6d590e18();
        if (mo51375x8a3f46d8 < 0 || mo51380x6d590e18 < 0) {
            return false;
        }
        if (mo51375x8a3f46d8 > mo51380x6d590e18) {
            mo51375x8a3f46d8 = mo51380x6d590e18;
        }
        int m51409x11ddf3f8 = m51409x11ddf3f8();
        if (m51409x11ddf3f8 <= 0) {
            return true;
        }
        int i17 = mo51380x6d590e18 != 0 ? (int) (m51409x11ddf3f8 * ((mo51375x8a3f46d8 * 1.0d) / mo51380x6d590e18)) : 0;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.width = i17;
        this.F.setLayoutParams(layoutParams);
        return true;
    }

    public C12274xd0769b70(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165182x0 = true;
        this.f165180l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public C12274xd0769b70(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165182x0 = true;
        this.f165180l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }
}
