package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderImagePreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/f7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI */
/* loaded from: classes3.dex */
public final class ActivityC15037x1b952727 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public android.graphics.Rect B;
    public float C;
    public float D;
    public float E;
    public float F;
    public android.graphics.Bitmap G;

    /* renamed from: t, reason: collision with root package name */
    public final int f210118t = 1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f210119u = "MicroMsg.FinderImagePreviewUI";

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f210120v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f210121w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f210122x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f210123y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f210124z;

    public final void c7() {
        if (this.B == null) {
            finish();
            return;
        }
        if (this.A) {
            finish();
            return;
        }
        this.A = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210119u, "runExitAnimation");
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f210121w;
        if (c22506x89e75b89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        android.view.View selectedView = c22506x89e75b89.getSelectedView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView;
        com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f210123y;
        if (c22779x313407ae == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animationLayout");
            throw null;
        }
        android.view.View view = this.f210122x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryBg");
            throw null;
        }
        android.view.View view2 = this.f210120v;
        if (view2 != null) {
            c22779x313407ae.a(view, view2, new com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3(this.B), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k7(c21524xecd57b9a, this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l7(c21524xecd57b9a, this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.akj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo78514x143f1b92().F().o();
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78514x143f1b92().E0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210120v = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ghs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210121w = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ght);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f210122x = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f564589vf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f210123y = (com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae) findViewById4;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_file_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("key_url_list");
        boolean booleanExtra = getIntent().getBooleanExtra("allow_long_click_save_image", true);
        this.f210124z = getIntent().getBooleanExtra("key_preview_avatar", false);
        this.B = (android.graphics.Rect) getIntent().getParcelableExtra("key_thumb_location");
        java.lang.String str = this.f210119u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "files %s, urls", stringArrayListExtra, stringArrayListExtra2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f7 f7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f7(this);
        java.util.ArrayList arrayList = f7Var.f210655d;
        if (stringArrayListExtra != null) {
            arrayList.addAll(stringArrayListExtra);
            f7Var.f210656e = true;
        } else if (stringArrayListExtra2 != null) {
            arrayList.addAll(stringArrayListExtra2);
            f7Var.f210656e = false;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f210121w;
        if (c22506x89e75b89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        c22506x89e75b89.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.h7(this));
        if (this.f210124z && booleanExtra) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b892 = this.f210121w;
            if (c22506x89e75b892 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
                throw null;
            }
            c22506x89e75b892.mo55655xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.i7(this, stringArrayListExtra2));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b893 = this.f210121w;
        if (c22506x89e75b893 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        c22506x89e75b893.setAdapter((android.widget.SpinnerAdapter) f7Var);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b894 = this.f210121w;
        if (c22506x89e75b894 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gallery");
            throw null;
        }
        c22506x89e75b894.mo55654x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.g7(this));
        if (this.B == null) {
            android.view.View view = this.f210122x;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryBg");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "runEnterAnimation");
        com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f210123y;
        if (c22779x313407ae == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animationLayout");
            throw null;
        }
        android.view.View view2 = this.f210122x;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryBg");
            throw null;
        }
        android.view.View view3 = this.f210120v;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        ym5.b bVar = new ym5.b(c22779x313407ae, view3, new com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3(this.B), view2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j7(this), null);
        if ((c22779x313407ae.getMeasuredState() & (-16777216)) > 0) {
            bVar.run();
        } else {
            c22779x313407ae.getViewTreeObserver().addOnPreDrawListener(new ym5.c(c22779x313407ae, bVar));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(5894);
        mo43517x10010bd5();
    }
}
