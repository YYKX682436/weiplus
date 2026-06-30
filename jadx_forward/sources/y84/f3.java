package y84;

/* loaded from: classes4.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f541583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f541584e;

    public f3(y84.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f541583d = h3Var;
        this.f541584e = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y84.h3 h3Var = this.f541583d;
        y84.l3 E = y84.h3.E(h3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = E != null ? E.a() : null;
        y84.h3.M(h3Var, a17);
        if (a17 != null) {
            a17.f244102a = 38;
        }
        w64.n a18 = y84.h3.C(h3Var).a();
        if (a18 != null) {
            a18.n(a17, this.f541584e);
        }
        w64.n a19 = y84.h3.C(h3Var).a();
        if (a19 != null) {
            a19.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$2");
    }
}
