package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI */
/* loaded from: classes9.dex */
public class ActivityC19084x72adb339 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f260842d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f260843e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260844f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f260845g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f260846h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260847i;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d9f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        mo78530x8b45058f();
        m78600x5843c740(false);
        mo54450xbf7c1df6("");
        this.f260844f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pqj);
        this.f260845g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pqi);
        this.f260846h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.pqk);
        this.f260842d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pqg);
        this.f260843e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pqh);
        this.f260847i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pqf);
        int i17 = m83105x7498fe14().getInt("realname_verify_process_finish_err_jump");
        int i18 = m83105x7498fe14().getInt("realname_verify_process_finish_passport_page_style");
        if (i17 == 1) {
            this.f260842d.setVisibility(0);
            this.f260843e.setVisibility(0);
            this.f260846h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80098x46b9ce81, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23)));
            java.lang.String string = m83105x7498fe14().getString("realname_verify_process_finish_page");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                this.f260842d.setText(string);
            }
            this.f260843e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            this.f260842d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.y3(this));
            this.f260843e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.z3(this));
        } else if (i18 == 1) {
            this.f260846h.setVisibility(8);
            this.f260842d.setVisibility(0);
            this.f260843e.setVisibility(0);
            java.lang.String string2 = m83105x7498fe14().getString("realname_verify_process_finish_confirm_btn_title");
            java.lang.String string3 = m83105x7498fe14().getString("realname_verify_process_finish_cancel_btn_title");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                this.f260842d.setText(string2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                this.f260843e.setText(string3);
            }
            this.f260842d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c4(this));
            this.f260843e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.d4(this));
        } else {
            this.f260842d.setVisibility(8);
            this.f260843e.setVisibility(0);
            this.f260846h.setImageResource(com.p314xaae8f345.mm.R.raw.f80945x296d8d8);
            java.lang.String string4 = m83105x7498fe14().getString("realname_verify_process_finish_page");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                this.f260843e.setText(string4);
            }
            this.f260843e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a4(this));
        }
        java.lang.String string5 = m83105x7498fe14().getString("realname_verify_process_finish_title");
        java.lang.String string6 = m83105x7498fe14().getString("realname_verify_process_finish_desc");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
            this.f260844f.setText(string5);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6)) {
            this.f260845g.setText(string6);
            this.f260845g.setVisibility(0);
        }
        java.lang.String string7 = m83105x7498fe14().getString("realname_verify_process_finish_bottom_wording");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string7)) {
            this.f260847i.setVisibility(8);
        } else {
            this.f260847i.setVisibility(0);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f260847i, string7, 0, string7.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.w3(this), true), mo55332x76847179());
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
