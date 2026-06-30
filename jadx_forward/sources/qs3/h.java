package qs3;

/* loaded from: classes15.dex */
public final class h extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447882a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447882a = c16945xe78973e5;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16954x37c15e44 m67826x9fd65ab4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447882a;
        if (i17 == 0) {
            c16945xe78973e5.f(c16945xe78973e5.getMember(), c16945xe78973e5.getState());
            return;
        }
        if (i17 == 1) {
            c16945xe78973e5.setVisibility(4);
            c16945xe78973e5.e();
            android.view.View view = c16945xe78973e5.f236505d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            qs3.e eVar = c16945xe78973e5.f236520v;
            if (eVar != null) {
                r45.oi5 member = c16945xe78973e5.getMember();
                ps3.e state = c16945xe78973e5.getState();
                qs3.w0 w0Var = (qs3.w0) eVar;
                if (member != null) {
                    str = member.f463816d;
                    if (str == null && (str = member.f463820h) == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7 = w0Var.f447937a;
                qs3.p0 p0Var = c16953xeaa414a7.f236578q;
                if (p0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                android.view.View view2 = (android.view.View) p0Var.f447913j.get(str);
                if (view2 != null) {
                    java.lang.Object tag = view2.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
                    qs3.o0 o0Var = (qs3.o0) tag;
                    if (state != ps3.e.f439609d) {
                        o0Var.f447903c.c();
                    }
                }
                m67826x9fd65ab4 = c16953xeaa414a7.m67826x9fd65ab4();
                m67826x9fd65ab4.a();
            }
        }
    }
}
