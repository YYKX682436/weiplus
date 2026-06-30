package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class l00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.le0 f216536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f216538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 f216541i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216542m;

    public l00(r45.le0 le0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 o00Var, in5.s0 s0Var) {
        this.f216536d = le0Var;
        this.f216537e = abstractC14490x69736cb5;
        this.f216538f = qt2Var;
        this.f216539g = str;
        this.f216540h = str2;
        this.f216541i = o00Var;
        this.f216542m = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC$checkShowClickSelfReadTips$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        r45.le0 le0Var = this.f216536d;
        lVarArr[0] = new jz5.l("main_status_interactive_icon_type", java.lang.Integer.valueOf(le0Var != null ? le0Var.m75939xb282bd08(2) : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216537e;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str = feedObject2.m76829x97edf6c0()) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str);
        lVarArr[2] = new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[3] = new jz5.l("commentscene", java.lang.Integer.valueOf(this.f216538f.m75939xb282bd08(5)));
        ((cy1.a) rVar).Bj("profile_feed_vv", "view_clk", kz5.c1.k(lVarArr), 1, false);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f216539g;
        java.lang.String substring = str2.substring(0, r26.n0.L(str2, "=", 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(this.f216540h);
        java.lang.String format = java.lang.String.format(sb6.toString() + "&from_page=2", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f216541i.f216939d, "rawUrl=".concat(format));
        intent.putExtra("rawUrl", format);
        j45.l.j(this.f216542m.f374654e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC$checkShowClickSelfReadTips$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
