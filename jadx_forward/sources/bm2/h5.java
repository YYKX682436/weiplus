package bm2;

/* loaded from: classes3.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f103476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f103477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103478f;

    public h5(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, bm2.m4 m4Var, bm2.n5 n5Var) {
        this.f103476d = c19782x23db1cfa;
        this.f103477e = m4Var;
        this.f103478f = n5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$setAvatar$setClickToOpenSwitchRolePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f103476d;
        java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
        bm2.m4 m4Var = this.f103477e;
        r45.xn1 xn1Var = m4Var.f103634a;
        r0Var.yk(5, (r13 & 2) != 0 ? null : m76197x6c03c64c, (r13 & 4) != 0 ? null : xn1Var != null ? java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(7)) : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        bm2.n5.x(this.f103478f, m4Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$setAvatar$setClickToOpenSwitchRolePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
