package fc4;

/* loaded from: classes4.dex */
public final class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f342703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("intent_localid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(stringExtra);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
            return;
        }
        this.f342703d = (android.widget.Button) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gne);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        android.widget.Button button = this.f342703d;
        if (button == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
            r45.q1 q1Var = m70371x485d7.f39019x6e5c4c04;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h7.a(m80379x76847179(), nsVar, m70371x485d7.f39019x6e5c4c04);
            if (nsVar.W) {
                button.setVisibility(0);
                button.setText(nsVar.X);
                button.setOnClickListener(new fc4.i(q1Var, m70371x485d7, this));
                if (m158354x19263085().getRequestedOrientation() != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    boolean k18 = com.p314xaae8f345.mm.ui.bk.k(m80379x76847179());
                    int j17 = com.p314xaae8f345.mm.ui.bk.j(m80379x76847179());
                    android.widget.Button button2 = this.f342703d;
                    if (button2 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    } else {
                        if (k18 && button2.getVisibility() == 0) {
                            android.view.ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin += j17;
                            button2.setLayoutParams(marginLayoutParams);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
                    }
                }
            } else {
                button.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC");
    }
}
