package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputFooter */
/* loaded from: classes15.dex */
public class C19652xe1933193 extends com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f271373x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f271374n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f271375o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f271376p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f271377q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageButton f271378r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f271379s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f271380t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f271381u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f271382v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.n3 f271383w;

    public C19652xe1933193(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271377q = null;
        this.f271381u = false;
        this.f271382v = false;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f271374n = abstractActivityC21394xb3d2c0cf;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d4e, this);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564458s0);
        this.f271379s = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.j3(this));
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564368p9);
        this.f271378r = imageButton2;
        imageButton2.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.k3(this));
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f271375o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f271375o = wi6;
        wi6.mo75331xef640234(0);
        this.f271375o.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f271380t = linearLayout;
        linearLayout.setOnClickListener(null);
        this.f271380t.addView(this.f271375o, -1, com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext()));
        this.f271375o.c();
        this.f271375o.i();
        this.f271375o.mo75339x5e04422d(new com.p314xaae8f345.mm.p2470x93e71c27.ui.l3(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f271375o.getLayoutParams();
        layoutParams.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f271375o.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415
    /* renamed from: getPanelView */
    public java.util.List<android.view.View> mo66217xa7118813() {
        return new java.util.ArrayList();
    }

    public final void i() {
        this.f271382v = false;
        this.f271375o.h();
        this.f271375o.setVisibility(8);
    }

    public final void j() {
        this.f271381u = false;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f271376p;
        if (ibVar != null) {
            ibVar.j();
            this.f271376p.setVisibility(8);
            this.f271379s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9u);
            this.f271378r.setVisibility(0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.n3 n3Var = this.f271383w;
            if (n3Var != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.f4) n3Var).f272368a.f271405e.setVisibility(0);
            }
        }
    }

    public final void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        if (i17 == 1) {
            c17189xc14104a.f37861x80c0d267 = 1;
        } else if (i17 != 2) {
            return;
        } else {
            c17189xc14104a.f37866xc755f37d = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputFooter", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(c17189xc14104a.f37845xae7a2e7a), java.lang.Integer.valueOf(c17189xc14104a.f37856x35cf88), java.lang.Integer.valueOf(c17189xc14104a.f37849x5a5c588), java.lang.Integer.valueOf(c17189xc14104a.f37854x614bc6c), java.lang.Long.valueOf(c17189xc14104a.f37855x3b706d59), java.lang.Integer.valueOf(c17189xc14104a.f37865xc099c45b), java.lang.Integer.valueOf(c17189xc14104a.f37862x1d166fd2), java.lang.Long.valueOf(c17189xc14104a.f37864x7cd6cfaa), java.lang.Integer.valueOf(c17189xc14104a.f37863x9ec2f6cd), java.lang.Long.valueOf(c17189xc14104a.f37867x8182a0a5), java.lang.Integer.valueOf(c17189xc14104a.f37850x2fd71e), java.lang.Integer.valueOf(c17189xc14104a.f37848x5a5b64d), java.lang.Integer.valueOf(c17189xc14104a.f37861x80c0d267), java.lang.Integer.valueOf(c17189xc14104a.f37866xc755f37d), java.lang.Integer.valueOf(c17189xc14104a.f37851xe1880c15), java.lang.Long.valueOf(c17189xc14104a.f37852x87f1c082));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1 c17191x850a0de1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1();
        c17191x850a0de1.f37886x6afc6eb = c17189xc14104a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.I(13905, c17191x850a0de1, false, false);
    }

    /* renamed from: setVoiceInputFooterListener */
    public void m75382x8f404dc9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n3 n3Var) {
        this.f271383w = n3Var;
    }
}
