package el2;

/* loaded from: classes3.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k92 f335468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f335469f;

    public w1(el2.c2 c2Var, r45.k92 k92Var, r45.y42 y42Var) {
        this.f335467d = c2Var;
        this.f335468e = k92Var;
        this.f335469f = y42Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLivePromoteFixedEntranceWidget$setAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f101131a;
        el2.c2 c2Var = this.f335467d;
        gk2.e l17 = c2Var.l();
        r45.k92 k92Var = this.f335468e;
        bf2.c.c(cVar, l17, 5, 4, pm0.v.u(k92Var.m75942xfb822ef2(0)), 0, null, 0, 2, null, 0, nd1.y0.f72985x366c91de, null);
        df2.nt ntVar = (df2.nt) c2Var.f335295e.U0(df2.nt.class);
        r45.y42 y42Var = this.f335469f;
        if (ntVar != null) {
            r45.yp5 yp5Var = new r45.yp5();
            yp5Var.set(0, java.lang.Long.valueOf(y42Var.m75942xfb822ef2(0)));
            yp5Var.set(2, 1);
            yp5Var.set(1, 4);
            yp5Var.set(3, y42Var.m75934xbce7f2f(5));
            ntVar.a7(yp5Var);
        }
        if (y42Var.m75933x41a8a7f2(3)) {
            c2Var.n(y42Var, java.lang.Long.valueOf(k92Var.m75942xfb822ef2(0)), new el2.u1(y42Var, c2Var));
        } else {
            el2.c2.k(c2Var, new el2.v1(c2Var, k92Var, y42Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLivePromoteFixedEntranceWidget$setAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
