package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class kb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI f110221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n01 f110222e;

    public kb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI, r45.n01 n01Var) {
        this.f110221d = finderLivePostSecurityUI;
        this.f110222e = n01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI = this.f110221d;
        java.lang.String str = finderLivePostSecurityUI.f109396v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("confirmBtnView click, url = ");
        r45.n01 n01Var = this.f110222e;
        sb6.append(n01Var.getString(5));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i17 = finderLivePostSecurityUI.D;
        if (i17 == 2) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327949g2, finderLivePostSecurityUI.f7("157"), null, "157", null, null, false, 116, null);
        } else if (i17 == 3) {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327952h2, finderLivePostSecurityUI.f7("158"), null, "158", null, null, false, 116, null);
        } else if (i17 == 4) {
            i95.m c19 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.f327955i2, finderLivePostSecurityUI.f7("160"), null, "160", null, null, false, 116, null);
        }
        if (n01Var.getInteger(4) == 1) {
            java.lang.String string = n01Var.getString(5);
            if (string != null) {
                if (finderLivePostSecurityUI.D == 3) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("159", com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.g7(finderLivePostSecurityUI, null, null, 3, null));
                    i95.m c27 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c27, "getService(...)");
                    zy2.zb.I8((zy2.zb) c27, ml2.u1.Y1, finderLivePostSecurityUI.f7("159"), null, "159", null, null, false, 116, null);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("open_custom_style_url", true);
                    intent.putExtra("forceHideShare", true);
                    intent.putExtra("show_native_web_view", true);
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("screen_orientation", 1);
                    j45.l.n(finderLivePostSecurityUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, finderLivePostSecurityUI.B);
                } else {
                    com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.d7(finderLivePostSecurityUI, string);
                }
            }
        } else {
            finderLivePostSecurityUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
