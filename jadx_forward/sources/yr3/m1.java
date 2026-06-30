package yr3;

/* loaded from: classes11.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f546484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.n1 f546485e;

    public m1(r45.u5 u5Var, yr3.n1 n1Var) {
        this.f546484d = u5Var;
        this.f546485e = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallLiveViewHolder$filling$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eq1.h hVar = eq1.h.f337345a;
        r45.u5 u5Var = this.f546484d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 d17 = hVar.d(u5Var.f468564f, u5Var.f468563e);
        java.lang.String str = u5Var.f468564f;
        java.lang.String str2 = u5Var.f468562d;
        yr3.n1 n1Var = this.f546485e;
        hVar.g(14, str, d17, str2, n1Var.f546248d.z().d1());
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(n1Var.f546489g, n1Var.f546248d.z().d1(), u5Var.f468564f, 14, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(n1Var.f546248d.z().d1()), d17 != null ? d17.m76794xd0557130() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallLiveViewHolder$filling$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
