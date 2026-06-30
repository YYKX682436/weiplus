package pk2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.n0 f437464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f437466f;

    public l0(pk2.n0 n0Var, android.view.View view, java.util.LinkedList linkedList) {
        this.f437464d = n0Var;
        this.f437465e = view;
        this.f437466f = linkedList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f437465e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pk2.n0 n0Var = this.f437464d;
        r45.oa4 oa4Var = ((mm2.e1) n0Var.f445960a.c(mm2.e1.class)).f410529z;
        int i17 = dk2.ef.f314909c;
        int i18 = oa4Var != null ? oa4Var.f463608J : 0;
        if (i17 <= 0) {
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c5 c5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c5(context);
        c5Var.f199498b = new pk2.m0(n0Var);
        c5Var.a(context.getResources().getConfiguration().orientation == 2, this.f437466f, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
