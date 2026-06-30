package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class kb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 f191754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n01 f191755e;

    public kb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986, r45.n01 n01Var) {
        this.f191754d = activityC14022xa7ad2986;
        this.f191755e = n01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986 activityC14022xa7ad2986 = this.f191754d;
        java.lang.String str = activityC14022xa7ad2986.f190929v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("confirmBtnView click, url = ");
        r45.n01 n01Var = this.f191755e;
        sb6.append(n01Var.m75945x2fec8307(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int i17 = activityC14022xa7ad2986.D;
        if (i17 == 2) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409482g2, activityC14022xa7ad2986.f7("157"), null, "157", null, null, false, 116, null);
        } else if (i17 == 3) {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409485h2, activityC14022xa7ad2986.f7("158"), null, "158", null, null, false, 116, null);
        } else if (i17 == 4) {
            i95.m c19 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.f409488i2, activityC14022xa7ad2986.f7("160"), null, "160", null, null, false, 116, null);
        }
        if (n01Var.m75939xb282bd08(4) == 1) {
            java.lang.String m75945x2fec8307 = n01Var.m75945x2fec8307(5);
            if (m75945x2fec8307 != null) {
                if (activityC14022xa7ad2986.D == 3) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("159", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.g7(activityC14022xa7ad2986, null, null, 3, null));
                    i95.m c27 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                    zy2.zb.I8((zy2.zb) c27, ml2.u1.Y1, activityC14022xa7ad2986.f7("159"), null, "159", null, null, false, 116, null);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("open_custom_style_url", true);
                    intent.putExtra("forceHideShare", true);
                    intent.putExtra("show_native_web_view", true);
                    intent.putExtra("rawUrl", m75945x2fec8307);
                    intent.putExtra("screen_orientation", 1);
                    j45.l.n(activityC14022xa7ad2986.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, activityC14022xa7ad2986.B);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14022xa7ad2986.d7(activityC14022xa7ad2986, m75945x2fec8307);
                }
            }
        } else {
            activityC14022xa7ad2986.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
