package y84;

/* loaded from: classes4.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f541590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f541591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f541592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f541593g;

    public g3(y84.h3 h3Var, int i17, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f541590d = h3Var;
        this.f541591e = i17;
        this.f541592f = list;
        this.f541593g = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y84.h3 h3Var = this.f541590d;
        java.lang.String j17 = h3Var.j();
        int i17 = this.f541591e;
        java.util.List list = this.f541592f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f541593g;
        try {
            y84.l3 E = y84.h3.E(h3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = E != null ? E.a() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.util.List z07 = h3Var.z0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVirtualIndexToPosIndexList$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.util.List list2 = h3Var.I0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVirtualIndexToPosIndexList$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue = ((java.lang.Number) ((java.util.ArrayList) list2).get(i17)).intValue();
            java.lang.String str = ((y84.n3) list.get(intValue)).f541696e;
            if (str == null) {
                str = "";
            }
            if (((java.util.ArrayList) z07).contains(str)) {
                y84.h3.N(h3Var, a17, str);
                if (a17 != null) {
                    a17.f244102a = 37;
                }
            } else {
                y84.h3.M(h3Var, a17);
                if (a17 != null) {
                    a17.f244102a = 36;
                }
                intValue = 0;
            }
            w64.n a18 = y84.h3.C(h3Var).a();
            if (a18 != null) {
                a18.o(a17, c17933xe8d1b226, intValue);
            }
            w64.n a19 = y84.h3.C(h3Var).a();
            if (a19 != null) {
                a19.k(view);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$2");
    }
}
