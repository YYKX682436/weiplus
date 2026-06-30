package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI */
/* loaded from: classes12.dex */
public class ActivityC22294xac144901 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f287892o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f287893d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f287894e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f287895f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f287896g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287897h;

    /* renamed from: i, reason: collision with root package name */
    public int f287898i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f287899m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.q1 f287900n;

    public final void U6() {
        if (this.f287899m) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("response_delete", true);
            intent.putExtra("remark_image_path", this.f287896g);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2m;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f287894e = findViewById(com.p314xaae8f345.mm.R.id.cgc);
        this.f287893d = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574088gy5);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f287893d.setVerticalFadingEdgeEnabled(false);
        this.f287893d.setHorizontalFadingEdgeEnabled(false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.q1 q1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.q1(this);
        this.f287900n = q1Var;
        q1Var.f288659d = this.f287896g;
        this.f287893d.setAdapter((android.widget.SpinnerAdapter) q1Var);
        this.f287893d.setSelection(this.f287898i);
        this.f287893d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.p1(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.ui.p2690x38b72420.n1(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.o1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f287895f = getIntent().getStringExtra("Contact_User");
        this.f287896g = getIntent().getStringArrayListExtra("remark_image_path");
        getIntent().getBooleanExtra("view_temp_remark_image", false);
        this.f287897h = getIntent().getBooleanExtra("view_only", false);
        this.f287898i = getIntent().getIntExtra("selected_item", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f287895f)) {
            finish();
        } else {
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
