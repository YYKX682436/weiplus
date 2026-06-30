package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1301x6b0147b.p1302x32b0ae;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar */
/* loaded from: classes15.dex */
public class C13020xcda67afb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf implements oe1.f1 {
    public static final /* synthetic */ int U = 0;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.view.View E;
    public android.view.View F;
    public oe1.n1 G;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 H;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f176056J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public ns1.c R;
    public oe1.j1 S;
    public final java.util.concurrent.ConcurrentLinkedQueue T;

    public C13020xcda67afb(android.content.Context context) {
        super(context);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, oe1.f1
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f165169p;
        int i19 = this.f165168o;
        oe1.j1 j1Var = this.S;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i18, i19);
        }
    }

    @Override // oe1.f1
    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.H;
        if (b4Var != null) {
            b4Var.d();
            this.H.c(7000L, 7000L);
        }
    }

    @Override // oe1.f1
    public boolean c() {
        return this.f176056J;
    }

    @Override // oe1.f1
    public void d() {
    }

    @Override // oe1.f1
    public boolean e() {
        return false;
    }

    @Override // oe1.f1
    /* renamed from: enterFullScreen */
    public void mo51419x31f09cd3() {
        this.f176056J = true;
        u();
    }

    @Override // oe1.f1
    public void f() {
    }

    @Override // oe1.f1
    public void g() {
        setVisibility(0);
        if (this.Q) {
            if (this.H == null) {
                this.H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ns1.a(this), false);
            }
            this.H.d();
            this.H.c(7000L, 7000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo51412x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d3j;
    }

    @Override // oe1.f1
    public boolean h() {
        return this.K;
    }

    @Override // oe1.f1
    /* renamed from: hide */
    public void mo51420x30dd42() {
        setVisibility(8);
    }

    @Override // oe1.f1
    public void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.I;
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
        this.T.add(k1Var);
    }

    @Override // oe1.f1
    public void l() {
        this.f176056J = false;
        u();
    }

    @Override // oe1.f1
    public boolean m() {
        return this.Q;
    }

    @Override // oe1.f1
    public void n() {
        if (this.I == null) {
            this.I = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ns1.b(this), true);
        }
        x();
        this.I.d();
        this.I.c(500L, 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    public void o() {
        super.o();
        this.C = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxk);
        this.D = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f569078oy5);
        this.E = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.F = findViewById(com.p314xaae8f345.mm.R.id.ci_);
    }

    @Override // oe1.f1
    /* renamed from: onDestroy */
    public void mo51422xac79a11b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.I;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.H;
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
        oe1.j1 j1Var = this.S;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i17, i18);
        }
    }

    /* renamed from: setAutoHide */
    public void m54405xcc4e5e13(boolean z17) {
        this.Q = z17;
    }

    /* renamed from: setBtnCloseListener */
    public void m54406x34df7252(android.view.View.OnClickListener onClickListener) {
        this.D.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    /* renamed from: setDanmakuBtnOnClickListener */
    public void mo51424x69e685ee(oe1.l1 l1Var) {
    }

    @Override // oe1.f1
    /* renamed from: setDanmakuBtnOpen */
    public void mo51425x76647fb9(boolean z17) {
        this.K = z17;
    }

    @Override // oe1.f1
    /* renamed from: setExitFullScreenBtnOnClickListener */
    public void mo51426xe81cd0bc(android.view.View.OnClickListener onClickListener) {
    }

    @Override // oe1.f1
    /* renamed from: setFullScreenBtnOnClickListener */
    public void mo51427x71354d7e(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.f1
    /* renamed from: setIsPlay */
    public void mo51416x11f3be80(boolean z17) {
        android.widget.ImageView imageView;
        if (z17) {
            this.f165165i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
        } else {
            this.f165165i.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
        }
        ns1.c cVar = this.R;
        if (cVar == null || (imageView = ((ns1.e) cVar).f420886a.f176060g) == null) {
            return;
        }
        imageView.setVisibility(z17 ? 8 : 0);
    }

    @Override // oe1.f1
    /* renamed from: setMuteBtnOnClickListener */
    public void mo51428x2fdf2dbc(android.view.View.OnClickListener onClickListener) {
    }

    @Override // oe1.f1
    /* renamed from: setMuteBtnState */
    public void mo51429x9b890a50(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.f1
    /* renamed from: setOnPlayButtonClickListener */
    public void mo51417xb892d55(android.view.View.OnClickListener onClickListener) {
        super.mo51417xb892d55(onClickListener);
    }

    /* renamed from: setOnPlayStatusChangeListener */
    public void m54407xaeef7d6b(ns1.c cVar) {
        this.R = cVar;
    }

    @Override // oe1.f1
    /* renamed from: setOnUpdateProgressLenListener */
    public void mo51430x46e95712(oe1.j1 j1Var) {
        this.S = j1Var;
    }

    @Override // oe1.f1
    /* renamed from: setPlayBtnInCenterPosition */
    public void mo51431xa239d909(boolean z17) {
        this.P = z17;
        v();
    }

    @Override // oe1.f1
    /* renamed from: setShowControlProgress */
    public void mo51432xb4d85e2b(boolean z17) {
        this.M = z17;
        w();
    }

    @Override // oe1.f1
    /* renamed from: setShowDanmakuBtn */
    public void mo51433x8498f2ac(boolean z17) {
    }

    @Override // oe1.f1
    /* renamed from: setShowFullScreenBtn */
    public void mo51434x1cf93842(boolean z17) {
    }

    @Override // oe1.f1
    /* renamed from: setShowMuteBtn */
    public void mo51435xdb9e6204(boolean z17) {
    }

    @Override // oe1.f1
    /* renamed from: setShowPlayBtn */
    public void mo51436x69f2cf09(boolean z17) {
        this.N = z17;
        v();
    }

    @Override // oe1.f1
    /* renamed from: setShowProgress */
    public void mo51437x28c841cc(boolean z17) {
        this.L = z17;
        w();
    }

    @Override // oe1.f1
    /* renamed from: setStatePorter */
    public void mo51438xb1e0831d(oe1.n1 n1Var) {
        this.G = n1Var;
    }

    @Override // oe1.f1
    /* renamed from: setTitle */
    public void mo51439x53bfe316(java.lang.String str) {
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.T;
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
        float dimensionPixelSize = this.f176056J ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.o_) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561634o4);
        this.f165166m.setTextSize(0, dimensionPixelSize);
        this.f165167n.setTextSize(0, dimensionPixelSize);
        int dimensionPixelSize2 = this.f176056J ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561637o7) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561629nz);
        android.widget.ImageView imageView = this.f165165i;
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize2);
            this.f165165i.setLayoutParams(marginLayoutParams);
        }
    }

    public final void v() {
        if (!this.N) {
            this.f165165i.setVisibility(8);
        } else if (this.P) {
            this.f165165i.setVisibility(8);
        } else {
            this.f165165i.setVisibility(0);
        }
    }

    public final void w() {
        boolean z17 = this.M ? this.L : false;
        this.f165166m.setVisibility(z17 ? 0 : 8);
        this.f165167n.setVisibility(z17 ? 0 : 8);
    }

    public final boolean x() {
        oe1.n1 n1Var = this.G;
        if (n1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoLiteControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int mo51375x8a3f46d8 = ((oe1.i) n1Var).f426245a.f165062f.mo51375x8a3f46d8();
        int mo51380x6d590e18 = ((oe1.i) this.G).f426245a.f165062f.mo51380x6d590e18();
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
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.width = i17;
        this.C.setLayoutParams(layoutParams);
        return true;
    }

    public C13020xcda67afb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public C13020xcda67afb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }
}
