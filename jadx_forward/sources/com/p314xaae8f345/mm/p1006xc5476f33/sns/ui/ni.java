package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ni implements com.p314xaae8f345.mm.ui.p2740x696c9db.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f251542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f251544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f251545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f251546g;

    public ni(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee, android.view.View view, android.view.View view2, int i17, int i18, float f17, boolean z17) {
        this.f251546g = activityC18058xc05952ee;
        this.f251540a = view;
        this.f251541b = view2;
        this.f251542c = i17;
        this.f251543d = i18;
        this.f251544e = f17;
        this.f251545f = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o4
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f251546g;
        boolean v76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.v7(activityC18058xc05952ee);
        int i17 = this.f251543d;
        int i18 = this.f251542c;
        float f18 = this.f251544e;
        android.view.View view = this.f251541b;
        if (!v76) {
            android.view.KeyEvent.Callback callback = this.f251540a;
            if (callback instanceof db5.f0) {
                int width = view.getWidth();
                int height = view.getHeight();
                view.setTranslationX(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.s7(activityC18058xc05952ee) + ((i18 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.s7(activityC18058xc05952ee)) * f17));
                view.setTranslationY(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.t7(activityC18058xc05952ee) + ((i17 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.t7(activityC18058xc05952ee)) * f17));
                view.setPivotX(width / 2);
                view.setPivotY(height / 2);
                view.setScaleX(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee) + ((f18 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee)) * f17));
                view.setScaleY(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee) + ((f18 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee)) * f17));
                ((db5.f0) callback).n(1.0f - f17, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
            }
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.v7(activityC18058xc05952ee) && this.f251545f && view != null) {
            int width2 = view.getWidth();
            int height2 = view.getHeight();
            float u76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee) + ((f18 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.u7(activityC18058xc05952ee)) * f17);
            view.setScaleX(u76);
            view.setScaleY(u76);
            view.setTranslationX(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.s7(activityC18058xc05952ee) + ((i18 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.s7(activityC18058xc05952ee)) * f17));
            view.setTranslationY(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.t7(activityC18058xc05952ee) + ((i17 - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.t7(activityC18058xc05952ee)) * f17));
            view.setPivotX(width2 / 2);
            view.setPivotY(height2 / 2);
            float f19 = width2;
            int width3 = (int) (f19 - ((f19 - (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.r7(activityC18058xc05952ee).width() / u76)) * f17));
            float f27 = height2;
            int height3 = (int) (f27 - ((f27 - (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.r7(activityC18058xc05952ee).height() / u76)) * f17));
            view.setClipBounds(new android.graphics.Rect((width2 - width3) / 2, (height2 - height3) / 2, (width2 + width3) / 2, (height2 + height3) / 2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        android.content.Context context;
        com.p314xaae8f345.p2845xc516c4b6.sns.C24777x9830b147 c24777x9830b147;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f251546g;
        r45.jj4 mo70574x2d3ab571 = activityC18058xc05952ee.f248343o.mo70574x2d3ab571();
        if (mo70574x2d3ab571 != null) {
            java.lang.String str = mo70574x2d3ab571.f459388d;
            if (str == null) {
                str = "";
            }
            si0.n0 n0Var = si0.n0.f489670f;
            if (n0Var != null && (context = (android.content.Context) n0Var.f489672e.get()) != null && (c24777x9830b147 = n0Var.f489671d) != null) {
                c24777x9830b147.m91787x137d5104(str, "-1", new si0.m0(n0Var, context));
            }
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1102", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        activityC18058xc05952ee.C1 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1102", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.os.Handler handler = activityC18058xc05952ee.G1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        handler.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mi(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        this.f251546g.f248343o.n0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }
}
