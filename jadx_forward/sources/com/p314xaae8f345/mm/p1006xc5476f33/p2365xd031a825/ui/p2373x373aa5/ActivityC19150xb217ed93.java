package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardLuckyMoneyDialog */
/* loaded from: classes3.dex */
public class ActivityC19150xb217ed93 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f262264d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        if (fp.h.c(19)) {
            getWindow().setFlags(67108864, 67108864);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_layer_info");
        if (byteArrayExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", "WalletSuccPageAwardLuckyMoneyDialog onCreate error! cannot get layerInfoBytes!");
            finish();
        }
        try {
            new a36.f().mo11468x92b714fd(byteArrayExtra);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", e17, "parse layer info byte error! %s", e17.getMessage());
            finish();
        }
        this.f262264d = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.che);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)).setOnClickListener(new gt4.s1(this));
        android.view.ViewGroup viewGroup = this.f262264d;
        gt4.t1 t1Var = new gt4.t1(this);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new gt4.u1(this, viewGroup, scaleAnimation2));
        scaleAnimation2.setAnimationListener(t1Var);
        if (viewGroup != null) {
            viewGroup.startAnimation(scaleAnimation);
        }
    }
}
