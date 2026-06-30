package go2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355554d;

    public n(go2.z zVar) {
        this.f355554d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.j0.f409116i.m(ml2.y3.f409808m);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 2L, "", null, 4, null);
        go2.z zVar = this.f355554d;
        zVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) zVar.m80379x76847179(), 1, true);
        k0Var.f293405n = new go2.r(zVar);
        k0Var.f293414s = new go2.s(zVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
