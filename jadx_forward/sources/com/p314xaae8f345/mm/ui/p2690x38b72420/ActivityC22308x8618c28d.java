package com.p314xaae8f345.mm.ui.p2690x38b72420;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/contact/ContactSayHiImagePreviewUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "com/tencent/mm/ui/contact/z2", "com/tencent/mm/ui/contact/a3", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI */
/* loaded from: classes12.dex */
public final class ActivityC22308x8618c28d extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f287943s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f287944d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f287945e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f287946f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f287947g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287948h;

    /* renamed from: i, reason: collision with root package name */
    public int f287949i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f287950m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.z2 f287951n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f287952o = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.e3(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f287953p = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.h3(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f287954q = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.g3(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f287955r = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.c3(this));

    public final void U6() {
        if (this.f287950m) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("response_delete", true);
            intent.putExtra("remark_image_path", this.f287947g);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f287945e = findViewById(com.p314xaae8f345.mm.R.id.cgc);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ghs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.tools.MMGestureGallery");
        this.f287944d = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById;
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f287944d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22506x89e75b89);
        c22506x89e75b89.setVerticalFadingEdgeEnabled(false);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b892 = this.f287944d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22506x89e75b892);
        c22506x89e75b892.setHorizontalFadingEdgeEnabled(false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.z2 z2Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.z2(this);
        this.f287951n = z2Var;
        z2Var.f288801d = this.f287947g;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b893 = this.f287944d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22506x89e75b893);
        c22506x89e75b893.setAdapter((android.widget.SpinnerAdapter) this.f287951n);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b894 = this.f287944d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22506x89e75b894);
        c22506x89e75b894.setSelection(this.f287949i);
        android.view.View view = (android.view.View) ((jz5.n) this.f287955r).mo141623x754a37bb();
        int i17 = this.f287948h ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar = this.f287953p;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.i3(this));
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = com.p314xaae8f345.mm.ui.bl.h(this);
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setLayoutParams(layoutParams2);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.j3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f287946f = getIntent().getStringExtra("Contact_User");
        this.f287947g = getIntent().getStringArrayListExtra("remark_image_path");
        getIntent().getBooleanExtra("view_temp_remark_image", false);
        this.f287948h = getIntent().getBooleanExtra("view_only", false);
        this.f287949i = getIntent().getIntExtra("selected_item", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f287946f)) {
            finish();
            return;
        }
        mo43517x10010bd5();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        mo78514x143f1b92().E0(0);
        mo78514x143f1b92().I();
        getWindow().getDecorView().setSystemUiVisibility(2);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 != 4 || event.getRepeatCount() != 0) {
            return super.onKeyDown(i17, event);
        }
        U6();
        return true;
    }
}
