package gv2;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv2.n0 f357637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f357638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jv2.i f357639f;

    public z(gv2.n0 n0Var, in5.s0 s0Var, jv2.i iVar) {
        this.f357637d = n0Var;
        this.f357638e = s0Var;
        this.f357639f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 g2Var = this.f357637d.f357580e;
        android.view.View itemView = this.f357638e.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var;
        q3Var.getClass();
        jv2.i item = this.f357639f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(itemView.getContext(), 1, false);
        iv2.b bVar = q3Var.f211904h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q4(item, bVar.f376662e);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.t4(item, q3Var.f211901e, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.h3(q3Var));
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
