package com.p314xaae8f345.mm.ui.p2746xf1c361fc;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.ui.websearch.WebSearchVoiceUI */
/* loaded from: classes14.dex */
public class ActivityC22595x36a11daa extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m f292757d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f292758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f292759f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292760g;

    /* renamed from: h, reason: collision with root package name */
    public int f292761h;

    /* renamed from: i, reason: collision with root package name */
    public int f292762i;

    /* renamed from: m, reason: collision with root package name */
    public vj5.h f292763m = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9o;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getStatusBarColor */
    public int mo78523xb48e4618() {
        return getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aac);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initNavigationSwipeBack */
    public boolean mo52921x858d605d() {
        boolean mo52921x858d605d = super.mo52921x858d605d();
        if (!getF147381t()) {
            vj5.a.a(m78513xc2a54588(), mo78523xb48e4618(), true);
        }
        return mo52921x858d605d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initSwipeBack */
    public void mo64511xb83ef811() {
        super.mo64511xb83ef811();
        if (m78735x28280f95() != null && m78735x28280f95().getChildCount() > 0) {
            android.view.View childAt = m78735x28280f95().getChildAt(0);
            m78735x28280f95().removeView(childAt);
            vj5.h hVar = new vj5.h(this);
            this.f292763m = hVar;
            hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
            m78735x28280f95().addView(this.f292763m);
            m78735x28280f95().m81446x590ab8fc(this.f292763m);
        }
        vj5.a.a(m78513xc2a54588(), mo78523xb48e4618(), true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78559x68e5fd88(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6);
        mo54451xb23a6b0d(-16777216);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().j().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aac));
            mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aac)));
        }
        mo54448x9c8c0d33(new zk5.b(this));
        if (getIntent() != null) {
            this.f292759f = getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            this.f292760g = getIntent().getStringExtra("subSessionId");
            this.f292761h = getIntent().getIntExtra("key_scene", -1);
            this.f292762i = getIntent().getIntExtra("key_is_nav_voice", 0);
        }
        this.f292758e = findViewById(com.p314xaae8f345.mm.R.id.p7f);
        this.f39322x2305be9.J();
        if (this.f292757d == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m(mo55332x76847179(), false, null);
            this.f292757d = mVar;
            mVar.m75918x6c4ebec7(new zk5.c(this));
        }
        this.f292757d.d();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar2 = this.f292757d;
        if (mVar2.F) {
            mVar2.F = false;
            android.view.View findViewById = mVar2.findViewById(com.p314xaae8f345.mm.R.id.p5q);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i17 = mVar2.E;
            if (layoutParams == null) {
                layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i17);
            }
            layoutParams.height = i17;
            findViewById.setLayoutParams(layoutParams);
            mVar2.f();
            mVar2.requestLayout();
        }
        this.f292757d.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        ((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m7g)).addView(this.f292757d, layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15178, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", this.f292759f, this.f292760g, java.lang.Integer.valueOf(this.f292761h), java.lang.Integer.valueOf(this.f292762i));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f292757d;
        if (mVar != null) {
            mVar.c();
        }
    }
}
