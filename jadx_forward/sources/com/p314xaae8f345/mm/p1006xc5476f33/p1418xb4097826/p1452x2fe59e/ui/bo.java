package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class bo implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c f191263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 f191264b;

    public bo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c activityC14114xff3e44c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6) {
        this.f191263a = activityC14114xff3e44c;
        this.f191264b = c15114xedf903f6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lg lgVar = this.f191263a.C;
        if (lgVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f191264b;
        boolean z17 = c15114xedf903f6.f210744i;
        boolean z18 = c15114xedf903f6.f210745m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c0Var = lgVar.f188502e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg dgVar = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg) c0Var : null;
        if (dgVar == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = lgVar.f188501d;
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.imn);
        if (findViewById == null) {
            i18 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i18 = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        lgVar.o().m82690xd3a27e96(z17);
        lgVar.o().m82688x390c1d00(z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = dgVar.f188103t;
        java.util.ArrayList m56388xcaeb60d0 = abstractC13919x46aff122 != null ? abstractC13919x46aff122.m56388xcaeb60d0() : null;
        if (m56388xcaeb60d0 != null) {
            java.util.Iterator it = m56388xcaeb60d0.iterator();
            i19 = i18;
            while (it.hasNext()) {
                if ((((so2.j5) it.next()).mo2128x1ed62e84() == dgVar.A ? 1 : i18) != 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        i19 = -1;
        if (i19 >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = lgVar.m56068x4905e9fa().getLayoutManager();
            if (layoutManager != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c15415x74224fd8, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c15415x74224fd8.P(((java.lang.Integer) arrayList2.get(i18)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c15415x74224fd8, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            if (!z17) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = lgVar.o().getStickTopLoadingLayout();
                if (stickTopLoadingLayout != null) {
                    stickTopLoadingLayout.setVisibility(8);
                }
                lgVar.o().m82707x9a17759f(null);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).Q6(lgVar.m56068x4905e9fa());
            return;
        }
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = lgVar.m56068x4905e9fa();
        if (m56068x4905e9fa != null) {
            m56068x4905e9fa.setVisibility(8);
        }
        jz5.g gVar = lgVar.f191807t;
        android.widget.TextView textView = (android.widget.TextView) ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).findViewById(com.p314xaae8f345.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "showErrorUi", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(i18)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "showErrorUi", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if ((string.length() != 0 ? i18 : 1) != 0) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cv_);
        } else {
            textView.setText(string);
        }
    }
}
