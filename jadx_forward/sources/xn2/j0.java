package xn2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b f537049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f537050f;

    public j0(xn2.p0 p0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        this.f537048d = p0Var;
        this.f537049e = c5505x8c69712b;
        this.f537050f = c19792x256d2725;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoPresenter$showLastExitFeedHintEventListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xn2.p0 p0Var = this.f537048d;
        java.lang.String str = p0Var.f537078c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click last exit feed, id:");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b = this.f537049e;
        sb6.append(c5505x8c69712b.f135836g.f88469a);
        sb6.append(", feed:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f537050f.m76802x2dd01666();
        sb6.append(m76802x2dd01666 != null ? m76802x2dd01666.m76944x730bcac6() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        xn2.p0 p0Var2 = this.f537048d;
        android.app.Activity activity = p0Var2.f537076a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = c5505x8c69712b.f135836g.f88470b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderObject, "finderObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(finderObject, 0);
        int i17 = qg3.g1.f444353d;
        p0Var2.n(4, activity, null, a17, 0, p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32(), p0Var.h());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoPresenter$showLastExitFeedHintEventListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
