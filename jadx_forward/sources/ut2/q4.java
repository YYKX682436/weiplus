package ut2;

/* loaded from: classes3.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k74 f512591e;

    public q4(ut2.j5 j5Var, r45.k74 k74Var) {
        this.f512590d = j5Var;
        this.f512591e = k74Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        ut2.j5 j5Var = this.f512590d;
        android.content.Context context = j5Var.f512470e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        r45.k74 k74Var = this.f512591e;
        c19786x6a1e2862.m76551x3af0573b(k74Var);
        c19786x6a1e2862.m76550x2592a27b(6);
        ac4Var.set(1, c19786x6a1e2862);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(2, bool);
        ac4Var.set(3, bool);
        ac4Var.set(4, 1);
        c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        j5Var.f512469d.u();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j5Var.f512473h, "enter licenseLiteApp " + pm0.b0.g(k74Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
