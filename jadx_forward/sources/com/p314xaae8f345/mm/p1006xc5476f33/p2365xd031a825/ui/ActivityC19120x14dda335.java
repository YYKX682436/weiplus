package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI */
/* loaded from: classes9.dex */
public class ActivityC19120x14dda335 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f261621d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7 f261622e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261623f;

    /* renamed from: g, reason: collision with root package name */
    public int f261624g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261625h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f261626i = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261627m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f261628n = null;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335 activityC19120x14dda335, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        activityC19120x14dda335.m83105x7498fe14().putParcelable("key_bankcard", c19091x9511676c);
        activityC19120x14dda335.m83106x57340563().d(new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8a;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kfr);
        this.f261624g = m83105x7498fe14().getInt("key_scene", 0);
        this.f261625h = m83105x7498fe14().getString("key_top_tips");
        this.f261626i = m83105x7498fe14().getBoolean("key_is_show_new_bankcard", true);
        this.f261627m = m83105x7498fe14().getString("bottom_tips");
        java.util.ArrayList parcelableArrayList = m83105x7498fe14().getParcelableArrayList("key_showing_bankcards");
        this.f261628n = parcelableArrayList;
        if (parcelableArrayList == null) {
            this.f261628n = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h();
        }
        this.f261621d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ode);
        this.f261622e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21523x2cc1edc7) findViewById(com.p314xaae8f345.mm.R.id.aem);
        this.f261623f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.avy);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261625h)) {
            this.f261621d.setVisibility(8);
        } else {
            this.f261621d.setVisibility(0);
            this.f261621d.setText(this.f261625h);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f261627m)) {
            this.f261623f.setVisibility(8);
        } else {
            this.f261623f.setVisibility(0);
            this.f261623f.setText(this.f261627m);
        }
        if (this.f261624g == 0) {
            this.f261623f.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
            b4Var.f261679d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o8(this);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575145kz0);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 14, string.length(), 33);
            this.f261623f.setText(spannableString);
            this.f261623f.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        this.f261622e.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t8(this, null));
        this.f261622e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r8(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
