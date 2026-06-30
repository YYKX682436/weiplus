package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter */
/* loaded from: classes9.dex */
public class C16407x72652a1a extends com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415 {

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f228212n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageButton f228213o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f228214p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f228215q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f228216r;

    /* renamed from: s, reason: collision with root package name */
    public int f228217s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f228218t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f228219u;

    public C16407x72652a1a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f228217s = 0;
        this.f228218t = false;
        this.f228219u = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f228212n = abstractActivityC21394xb3d2c0cf;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.bva, this);
        this.f228215q = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.j7g);
        i(false);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.j7f);
        this.f228213o = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mp(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.j7d);
        this.f228214p = c22621x7603e017;
        c22621x7603e017.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.np(this));
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f228216r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f228216r = wi6;
        wi6.mo75331xef640234(0);
        this.f228216r.setVisibility(8);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g)).addView(this.f228216r, -1, 0);
        this.f228216r.c();
        this.f228216r.i();
        this.f228216r.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.op(this));
    }

    @Override // com.p314xaae8f345.mm.ui.C21386xa8232056
    public void e(int i17) {
        super.e(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415
    /* renamed from: getPanelView */
    public java.util.List<android.view.View> mo66217xa7118813() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f228216r);
        return arrayList;
    }

    public final void i(boolean z17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = this.f228215q;
        if (button == null) {
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || this.f228215q.getVisibility() == 4) {
                return;
            }
            this.f228215q.startAnimation(loadAnimation2);
            this.f228215q.setVisibility(8);
            return;
        }
        if (button.getVisibility() == 0 || this.f228215q.getVisibility() == 0) {
            return;
        }
        this.f228215q.startAnimation(loadAnimation);
        this.f228215q.setVisibility(0);
    }

    public final void j() {
        int i17 = this.f228217s;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f228212n;
        if (i17 == 0) {
            this.f228214p.requestFocus();
            abstractActivityC21394xb3d2c0cf.getWindow().setSoftInputMode(16);
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
            this.f228216r.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kp(this), 200L);
            return;
        }
        this.f228214p.requestFocus();
        abstractActivityC21394xb3d2c0cf.getWindow().setSoftInputMode(32);
        abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        this.f228216r.i();
        this.f228216r.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lp(this), 200L);
        android.view.ViewGroup.LayoutParams layoutParams = this.f228216r.getLayoutParams();
        if ((layoutParams == null || layoutParams.height > 0) && !(layoutParams != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext()) && this.f228219u)) {
            return;
        }
        layoutParams.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f228216r.setLayoutParams(layoutParams);
        this.f228219u = false;
    }

    /* renamed from: setHint */
    public void m66218x764b0e09(java.lang.String str) {
        this.f228214p.setHint(str);
    }

    /* renamed from: setMaxLength */
    public void m66219x2c956328(int i17) {
        this.f228214p.mo81583x7e4f2d39(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    /* renamed from: setModeClick */
    public void m66220xe1b25b63(boolean z17) {
        this.f228218t = z17;
    }

    /* renamed from: setOnEditTouchListener */
    public void m66221x61b2348(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qp qpVar) {
    }

    /* renamed from: setOnSmileyShowListener */
    public void m66222x773433a3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.sp spVar) {
    }

    /* renamed from: setOnWishSendImp */
    public void m66223x7ca69bdc(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rp rpVar) {
        this.f228215q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pp(this, rpVar));
    }

    /* renamed from: setText */
    public void m66224x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f228214p;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
            this.f228214p.n(str);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        this.f228217s = 0;
        boolean z17 = i17 == 0;
        if (this.f228216r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "showState " + z17);
            if (z17) {
                j();
                this.f228219u = false;
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                this.f228216r.setVisibility(8);
                this.f228213o.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
                this.f228212n.mo48674x36654fab();
                m66220xe1b25b63(true);
                requestLayout();
            }
        }
        super.setVisibility(i17);
    }
}
