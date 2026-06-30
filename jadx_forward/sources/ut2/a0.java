package ut2;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f512345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f512346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.jj0 f512347f;

    public a0(ut2.k0 k0Var, java.util.List list, bw5.jj0 jj0Var) {
        this.f512345d = k0Var;
        this.f512346e = list;
        this.f512347f = jj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveCouponListEntranceViewHolder$setupCouponItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.k0 k0Var = this.f512345d;
        k0Var.f512490a.K(true);
        if (zl2.r4.f555483a.w1()) {
            ut2.k0.a(k0Var, 14);
        } else {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.f4 f4Var = ml2.f4.f408980u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : this.f512346e) {
                if (((so2.j5) obj) instanceof cm2.k0) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
                arrayList3.add((cm2.k0) j5Var);
            }
            bw5.jj0 jj0Var = this.f512347f;
            java.lang.String str = jj0Var != null ? jj0Var.f110531g[1] ? jj0Var.f110528d : "" : null;
            r0Var.Ej(f4Var, arrayList3, str != null ? str : "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveCouponListEntranceViewHolder$setupCouponItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
