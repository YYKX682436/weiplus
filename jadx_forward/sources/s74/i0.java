package s74;

/* loaded from: classes4.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f485876g;

    public i0(s74.f3 f3Var, s74.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, org.json.JSONObject jSONObject) {
        this.f485873d = f3Var;
        this.f485874e = o0Var;
        this.f485875f = c17933xe8d1b226;
        this.f485876g = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.f3 f3Var = this.f485873d;
        s34.e eVar = f3Var.e().f370821b.f38163x890a6858;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = null;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdConsultBarInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdConsultBarInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
            list = eVar.f484154b;
        } else {
            list = null;
        }
        int i17 = 0;
        if (list == null || list.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
            return;
        }
        s74.o0 o0Var = this.f485874e;
        w64.n nVar = new w64.n(o0Var.E(), o0Var.H(), o0Var.G(), null, null);
        l44.k4 k4Var = l44.k4.f397753a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485875f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f17 = o0Var.C().f();
        kz5.p0 p0Var = kz5.p0.f395529d;
        nVar.x(l44.k4.c(k4Var, c17933xe8d1b226, 1, f17, null, p0Var, p0Var, null, null, 128, null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i18 = f3Var.W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (i18 < list.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            i17 = f3Var.W;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        org.json.JSONObject jSONObject = this.f485876g;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "consultBarTitleClick")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 b17 = ((s34.g) list.get(i17)).b();
            if (b17 != null) {
                b17.f244102a = 25;
            }
            c17702x544f64e9 = ((s34.g) list.get(i17)).b();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "consultBarButtonClick")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = ((s34.g) list.get(i17)).a();
            if (a17 != null) {
                a17.f244102a = 26;
            }
            c17702x544f64e9 = ((s34.g) list.get(i17)).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = c17702x544f64e9;
        if (c17702x544f64e92 != null) {
            nVar.p(new w64.c(c17702x544f64e92, this.f485875f, 0, null, false, 0, false, null, 248, null));
            nVar.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
    }
}
