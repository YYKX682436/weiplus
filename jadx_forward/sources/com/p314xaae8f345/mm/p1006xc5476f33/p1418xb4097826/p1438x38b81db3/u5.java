package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f186207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f186209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f186211h;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var, java.lang.String str, r45.qt2 qt2Var) {
        this.f186207d = q6Var;
        this.f186208e = s0Var;
        this.f186209f = z0Var;
        this.f186210g = str;
        this.f186211h = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.z0 z0Var = this.f186209f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = z0Var.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f186207d;
        q6Var.getClass();
        in5.s0 s0Var = this.f186208e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        android.content.Intent intent = new android.content.Intent();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        java.lang.String str = this.f186210g;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185858i.a(str, 156, i17 + 10000, currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "click linkLayout, url:" + str + ", urlWithReportParams:" + a17);
        intent.putExtra("rawUrl", a17);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
        zy2.v9 v9Var = (zy2.v9) zVar.a(activityC0065xcd7aa112).c(zy2.v9.class);
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa aaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) v9Var;
        r45.md5 md5Var = aaVar.f198440e;
        if ((md5Var != null && md5Var.m75942xfb822ef2(0) == m59251x5db1b11) || aaVar.f198441f) {
            java.lang.String str2 = aaVar.f198439d;
            intent.putExtra("KShareTraceLastGMsgId", str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToH5 lastGMsgId:" + str2);
        }
        j45.l.j(context2, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            e27.a(new ec2.a(19, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.n(q6Var, this.f186211h, z0Var.E, 2L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
