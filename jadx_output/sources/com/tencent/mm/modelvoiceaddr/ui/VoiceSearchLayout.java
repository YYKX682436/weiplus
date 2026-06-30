package com.tencent.mm.modelvoiceaddr.ui;

/* loaded from: classes14.dex */
public class VoiceSearchLayout extends android.widget.LinearLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f71751t = {com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bph, com.tencent.mm.R.drawable.bpi, com.tencent.mm.R.drawable.bpj, com.tencent.mm.R.drawable.box, com.tencent.mm.R.drawable.boy, com.tencent.mm.R.drawable.boz, com.tencent.mm.R.drawable.f482196bp0, com.tencent.mm.R.drawable.f482197bp1, com.tencent.mm.R.drawable.f482198bp2, com.tencent.mm.R.drawable.f482199bp3, com.tencent.mm.R.drawable.f482200bp4, com.tencent.mm.R.drawable.f482201bp5, com.tencent.mm.R.drawable.bp6};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f71752u = {com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bph, com.tencent.mm.R.drawable.bpi, com.tencent.mm.R.drawable.bph, com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bpj, com.tencent.mm.R.drawable.bpg, com.tencent.mm.R.drawable.bpg};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f71753v = {com.tencent.mm.R.drawable.bp7, com.tencent.mm.R.drawable.bpf, com.tencent.mm.R.drawable.bpf, com.tencent.mm.R.drawable.bpf, com.tencent.mm.R.drawable.bp7};

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f71754d;

    /* renamed from: e, reason: collision with root package name */
    public a31.s f71755e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f71756f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f71757g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f71758h;

    /* renamed from: i, reason: collision with root package name */
    public a31.t f71759i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f71760m;

    /* renamed from: n, reason: collision with root package name */
    public z21.q f71761n;

    /* renamed from: o, reason: collision with root package name */
    public int f71762o;

    /* renamed from: p, reason: collision with root package name */
    public int f71763p;

    /* renamed from: q, reason: collision with root package name */
    public int f71764q;

    /* renamed from: r, reason: collision with root package name */
    public int f71765r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f71766s;

    public VoiceSearchLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f71754d = null;
        this.f71755e = null;
        this.f71757g = false;
        this.f71758h = false;
        this.f71762o = 0;
        this.f71763p = 0;
        this.f71764q = 0;
        this.f71765r = 0;
        this.f71766s = new com.tencent.mm.sdk.platformtools.b4(new a31.o(this), true);
        d(context);
    }

    public static void a(com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout) {
        voiceSearchLayout.f71758h = true;
        voiceSearchLayout.setSearchStartBtnView(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmpImage(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.f71756f;
        if (weImageButton != null) {
            weImageButton.setBackgroundResource(i17);
        }
    }

    private void setSearchStartBtnView(boolean z17) {
        if (!z17) {
            this.f71756f.setBackgroundResource(com.tencent.mm.R.drawable.bow);
            return;
        }
        this.f71756f.setBackgroundResource(com.tencent.mm.R.drawable.b9j);
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) this.f71756f.getBackground();
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public void c() {
        if (this.f71757g) {
            this.f71757g = false;
            a31.s sVar = this.f71755e;
            if (sVar != null) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                a31.v vVar = ((a31.u) sVar).f995a;
                g0Var.d(10453, java.lang.Integer.valueOf(vVar.f997s), 4);
                com.tencent.mm.ui.tools.o3 o3Var = vVar.f210323h;
                if (o3Var != null) {
                    o3Var.setEditTextEnabled(true);
                    vVar.f210323h.setStatusBtnEnabled(true);
                }
                y90.j jVar = vVar.f999u;
                if (jVar != null) {
                    jVar.G2();
                }
            }
        }
        f();
        if (getVisibility() == 0) {
            setVisibility(8);
        }
        ym1.f.f463134h.n();
        z21.q qVar = this.f71761n;
        if (qVar != null) {
            qVar.f469668m = null;
            qVar.b();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f71766s;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d4l, this);
        this.f71754d = inflate;
        this.f71756f = (com.tencent.mm.ui.widget.imageview.WeImageButton) inflate.findViewById(com.tencent.mm.R.id.f487617p71);
        this.f71760m = this.f71754d.findViewById(com.tencent.mm.R.id.p6z);
        setSearchStartBtnView(false);
        f();
    }

    public final void e(boolean z17, a31.a aVar) {
        ym1.e eVar = ym1.f.f463134h;
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceSearchLayout", e17, "", new java.lang.Object[0]);
            gVar.release();
        }
    }

    public void f() {
        setSearchStartBtnView(false);
        this.f71757g = false;
        this.f71758h = false;
        this.f71756f.setBackgroundResource(com.tencent.mm.R.drawable.bow);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f71758h || !this.f71757g) {
            return true;
        }
        c();
        this.f71757g = false;
        return true;
    }

    public void setOnSearchListener(a31.s sVar) {
        this.f71755e = sVar;
    }

    public void setOnVisibleChangeListener(a31.t tVar) {
        this.f71759i = tVar;
    }

    public void setTopMargin(int i17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f71760m.getLayoutParams();
        layoutParams.topMargin = i17;
        this.f71760m.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (super.getVisibility() != i17) {
            startAnimation(i17 == 8 ? android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477784bd) : android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc));
            super.setVisibility(i17);
            a31.t tVar = this.f71759i;
            if (tVar != null) {
                com.tencent.mm.ui.contact.x0 x0Var = (com.tencent.mm.ui.contact.x0) tVar;
                if (i17 == 0) {
                    com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI = x0Var.f207242a;
                    if (chatroomContactUI.f206339d.getFirstVisiblePosition() > 0) {
                        chatroomContactUI.f206339d.post(new com.tencent.mm.ui.contact.w0(x0Var));
                    }
                }
            }
        }
    }

    public VoiceSearchLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71754d = null;
        this.f71755e = null;
        this.f71757g = false;
        this.f71758h = false;
        this.f71762o = 0;
        this.f71763p = 0;
        this.f71764q = 0;
        this.f71765r = 0;
        this.f71766s = new com.tencent.mm.sdk.platformtools.b4(new a31.o(this), true);
        d(context);
    }

    public VoiceSearchLayout(android.content.Context context) {
        super(context);
        this.f71754d = null;
        this.f71755e = null;
        this.f71757g = false;
        this.f71758h = false;
        this.f71762o = 0;
        this.f71763p = 0;
        this.f71764q = 0;
        this.f71765r = 0;
        this.f71766s = new com.tencent.mm.sdk.platformtools.b4(new a31.o(this), true);
        d(context);
    }
}
