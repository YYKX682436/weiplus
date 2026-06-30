package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.voip.widget.VoipScoreDialog */
/* loaded from: classes14.dex */
public class ActivityC18942xf3a93c9a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f258656i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18872x6bcd52ff f258657d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f258658e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView[] f258659f = new android.widget.ImageView[5];

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f258660g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f258661h = 0;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18942xf3a93c9a activityC18942xf3a93c9a, int i17) {
        rk0.c.c("MicroMsg.VoipScoreDialog", "doScoreStat %s %s %s", java.lang.Integer.valueOf(activityC18942xf3a93c9a.f258661h), java.lang.Integer.valueOf(i17), activityC18942xf3a93c9a.f258657d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15684, java.lang.Integer.valueOf(activityC18942xf3a93c9a.f258657d.f257846f), java.lang.Long.valueOf(activityC18942xf3a93c9a.f258657d.f257847g), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC18942xf3a93c9a.f258661h), java.lang.Integer.valueOf(activityC18942xf3a93c9a.f258657d.f257845e), java.lang.Long.valueOf(activityC18942xf3a93c9a.f258657d.f257849i), java.lang.Long.valueOf(activityC18942xf3a93c9a.f258657d.f257848h));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4t;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18872x6bcd52ff c18872x6bcd52ff = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18872x6bcd52ff) getIntent().getParcelableExtra("key_score_state");
        this.f258657d = c18872x6bcd52ff;
        if (c18872x6bcd52ff == null) {
            rk0.c.b("MicroMsg.VoipScoreDialog", "onCreate error, scoreState is null", new java.lang.Object[0]);
            finish();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4s, null);
        this.f258658e = viewGroup;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.man);
        android.widget.ImageView[] imageViewArr = this.f258659f;
        imageViewArr[0] = imageView;
        imageViewArr[1] = (android.widget.ImageView) this.f258658e.findViewById(com.p314xaae8f345.mm.R.id.mao);
        imageViewArr[2] = (android.widget.ImageView) this.f258658e.findViewById(com.p314xaae8f345.mm.R.id.map);
        imageViewArr[3] = (android.widget.ImageView) this.f258658e.findViewById(com.p314xaae8f345.mm.R.id.maq);
        imageViewArr[4] = (android.widget.ImageView) this.f258658e.findViewById(com.p314xaae8f345.mm.R.id.mar);
        for (int i17 = 0; i17 < imageViewArr.length; i17++) {
            imageViewArr[i17].setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.q(this, i17));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.u(this.f258657d.f257844d);
        u1Var.d(this.f258658e);
        u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575011kd5));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.r(this));
        u1Var.a(false);
        u1Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.s(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
        this.f258660g = j0Var;
        if (j0Var != null) {
            j0Var.show();
        } else {
            finish();
        }
    }
}
