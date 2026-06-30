package com.p314xaae8f345.mm.p964x2822171a.ui;

/* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout */
/* loaded from: classes14.dex */
public class C11154x38c1a924 extends android.widget.LinearLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f153284t = {com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bph, com.p314xaae8f345.mm.R.C30861xcebc809e.bpi, com.p314xaae8f345.mm.R.C30861xcebc809e.bpj, com.p314xaae8f345.mm.R.C30861xcebc809e.box, com.p314xaae8f345.mm.R.C30861xcebc809e.boy, com.p314xaae8f345.mm.R.C30861xcebc809e.boz, com.p314xaae8f345.mm.R.C30861xcebc809e.f563729bp0, com.p314xaae8f345.mm.R.C30861xcebc809e.f563730bp1, com.p314xaae8f345.mm.R.C30861xcebc809e.f563731bp2, com.p314xaae8f345.mm.R.C30861xcebc809e.f563732bp3, com.p314xaae8f345.mm.R.C30861xcebc809e.f563733bp4, com.p314xaae8f345.mm.R.C30861xcebc809e.f563734bp5, com.p314xaae8f345.mm.R.C30861xcebc809e.bp6};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f153285u = {com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bph, com.p314xaae8f345.mm.R.C30861xcebc809e.bpi, com.p314xaae8f345.mm.R.C30861xcebc809e.bph, com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bpj, com.p314xaae8f345.mm.R.C30861xcebc809e.bpg, com.p314xaae8f345.mm.R.C30861xcebc809e.bpg};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f153286v = {com.p314xaae8f345.mm.R.C30861xcebc809e.bp7, com.p314xaae8f345.mm.R.C30861xcebc809e.bpf, com.p314xaae8f345.mm.R.C30861xcebc809e.bpf, com.p314xaae8f345.mm.R.C30861xcebc809e.bpf, com.p314xaae8f345.mm.R.C30861xcebc809e.bp7};

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f153287d;

    /* renamed from: e, reason: collision with root package name */
    public a31.s f153288e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f153289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153290g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f153291h;

    /* renamed from: i, reason: collision with root package name */
    public a31.t f153292i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f153293m;

    /* renamed from: n, reason: collision with root package name */
    public z21.q f153294n;

    /* renamed from: o, reason: collision with root package name */
    public int f153295o;

    /* renamed from: p, reason: collision with root package name */
    public int f153296p;

    /* renamed from: q, reason: collision with root package name */
    public int f153297q;

    /* renamed from: r, reason: collision with root package name */
    public int f153298r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f153299s;

    public C11154x38c1a924(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f153287d = null;
        this.f153288e = null;
        this.f153290g = false;
        this.f153291h = false;
        this.f153295o = 0;
        this.f153296p = 0;
        this.f153297q = 0;
        this.f153298r = 0;
        this.f153299s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new a31.o(this), true);
        d(context);
    }

    public static void a(com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924) {
        c11154x38c1a924.f153291h = true;
        c11154x38c1a924.m48303x93228229(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setAmpImage */
    public void m48302x1c425879(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = this.f153289f;
        if (c22698xdfbd289f != null) {
            c22698xdfbd289f.setBackgroundResource(i17);
        }
    }

    /* renamed from: setSearchStartBtnView */
    private void m48303x93228229(boolean z17) {
        if (!z17) {
            this.f153289f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bow);
            return;
        }
        this.f153289f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9j);
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) this.f153289f.getBackground();
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void c() {
        if (this.f153290g) {
            this.f153290g = false;
            a31.s sVar = this.f153288e;
            if (sVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                a31.v vVar = ((a31.u) sVar).f82528a;
                g0Var.d(10453, java.lang.Integer.valueOf(vVar.f82530s), 4);
                com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = vVar.f291856h;
                if (o3Var != null) {
                    o3Var.mo81053xeb117c28(true);
                    vVar.f291856h.mo81063x3717e759(true);
                }
                y90.j jVar = vVar.f82532u;
                if (jVar != null) {
                    jVar.G2();
                }
            }
        }
        f();
        if (getVisibility() == 0) {
            setVisibility(8);
        }
        ym1.f.f544667h.n();
        z21.q qVar = this.f153294n;
        if (qVar != null) {
            qVar.f551201m = null;
            qVar.b();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f153299s;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4l, this);
        this.f153287d = inflate;
        this.f153289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        this.f153293m = this.f153287d.findViewById(com.p314xaae8f345.mm.R.id.p6z);
        m48303x93228229(false);
        f();
    }

    public final void e(boolean z17, a31.a aVar) {
        ym1.e eVar = ym1.f.f544667h;
        if (z17) {
            eVar.m();
        } else {
            eVar.n();
        }
        to.g gVar = new to.g();
        try {
            if (z17) {
                gVar.setDataSource(getContext(), android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/2131691932"));
            } else {
                gVar.setDataSource(getContext(), android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/2131691897"));
            }
            gVar.setAudioStreamType(5);
            gVar.setOnCompletionListener(new a31.p(this, aVar));
            gVar.setOnErrorListener(new a31.q(this, aVar));
            gVar.prepare();
            gVar.setLooping(false);
            gVar.start();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceSearchLayout", e17, "", new java.lang.Object[0]);
            gVar.release();
        }
    }

    public void f() {
        m48303x93228229(false);
        this.f153290g = false;
        this.f153291h = false;
        this.f153289f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bow);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f153291h || !this.f153290g) {
            return true;
        }
        c();
        this.f153290g = false;
        return true;
    }

    /* renamed from: setOnSearchListener */
    public void m48304x4b680abd(a31.s sVar) {
        this.f153288e = sVar;
    }

    /* renamed from: setOnVisibleChangeListener */
    public void m48305xa0eada35(a31.t tVar) {
        this.f153292i = tVar;
    }

    /* renamed from: setTopMargin */
    public void m48306x43115121(int i17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f153293m.getLayoutParams();
        layoutParams.topMargin = i17;
        this.f153293m.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (super.getVisibility() != i17) {
            startAnimation(i17 == 8 ? android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd) : android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
            super.setVisibility(i17);
            a31.t tVar = this.f153292i;
            if (tVar != null) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.x0 x0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.x0) tVar;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = x0Var.f288775a;
                    if (activityC22292xa218e7a1.f287872d.getFirstVisiblePosition() > 0) {
                        activityC22292xa218e7a1.f287872d.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.w0(x0Var));
                    }
                }
            }
        }
    }

    public C11154x38c1a924(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153287d = null;
        this.f153288e = null;
        this.f153290g = false;
        this.f153291h = false;
        this.f153295o = 0;
        this.f153296p = 0;
        this.f153297q = 0;
        this.f153298r = 0;
        this.f153299s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new a31.o(this), true);
        d(context);
    }

    public C11154x38c1a924(android.content.Context context) {
        super(context);
        this.f153287d = null;
        this.f153288e = null;
        this.f153290g = false;
        this.f153291h = false;
        this.f153295o = 0;
        this.f153296p = 0;
        this.f153297q = 0;
        this.f153298r = 0;
        this.f153299s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new a31.o(this), true);
        d(context);
    }
}
