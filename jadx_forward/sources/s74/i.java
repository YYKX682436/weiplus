package s74;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f485867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f485868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f485870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f485871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f485872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, r45.jj4 jj4Var, s74.o0 o0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.FrameLayout frameLayout) {
        super(0);
        this.f485867d = i17;
        this.f485868e = jj4Var;
        this.f485869f = o0Var;
        this.f485870g = i18;
        this.f485871h = h0Var;
        this.f485872i = frameLayout;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17;
        android.widget.FrameLayout n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        r45.jj4 jj4Var = this.f485868e;
        s74.o0 o0Var = this.f485869f;
        int i17 = this.f485867d;
        if ((i17 == 5 || i17 == 15) && jj4Var != null) {
            o0Var.C().b().setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F = o0Var.F();
            if (F != null) {
                F.m70598x59285800(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o0Var.f485988v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        } else {
            o0Var.C().b().setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F2 = o0Var.F();
            if (F2 != null) {
                F2.m70598x59285800(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o0Var.f485988v = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        android.view.ViewParent parent = o0Var.C().c().getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(o0Var.C().c());
        }
        int i18 = this.f485870g;
        r45.lj4 lj4Var = jj4Var.f459398p;
        float f18 = (i18 * lj4Var.f461054e) / lj4Var.f461053d;
        s74.f3 D = o0Var.D();
        if (D != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = D.B;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f17 = -1.0f;
        }
        if (f17 > 0.0f) {
            s74.f3 D2 = o0Var.D();
            if (D2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f18 = D2.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            } else {
                f18 = -1.0f;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.j(), "init mainContainer size, w=" + i18 + ", h=" + f18);
        s74.f3 D3 = o0Var.D();
        if (D3 != null && (n17 = D3.n()) != null) {
            n17.addView(o0Var.C().c(), i18, (int) f18);
        }
        s74.f3 D4 = o0Var.D();
        if ((D4 != null ? D4.i() : 0) >= 101) {
            android.view.ViewGroup.LayoutParams layoutParams = o0Var.C().c().getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 17;
            }
            o0Var.C().c().requestLayout();
        }
        s74.f3 D5 = o0Var.D();
        int i19 = D5 != null ? D5.i() : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f485871h;
        if (i19 < 101) {
            s74.o0.y(o0Var, (s74.j3) h0Var.f391656d);
            if (o0Var.H() != 0) {
                java.lang.Object e17 = o0Var.C().e();
                android.widget.FrameLayout frameLayout = this.f485872i;
                frameLayout.setTag(e17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f19 = o0Var.C().f();
                frameLayout.setOnClickListener(f19 != null ? f19.T : null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F3 = o0Var.F();
            if (F3 != null) {
                F3.setTag(o0Var.C().e());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F4 = o0Var.F();
            if (F4 != null) {
                F4.setOnClickListener(new s74.f(o0Var));
            }
            o0Var.C().b().setTag(o0Var.C().e());
            o0Var.C().b().setOnClickListener(new s74.g(o0Var));
        } else {
            s74.h hVar = new s74.h(o0Var, h0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            hVar.mo152xb9724478();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        return f0Var;
    }
}
