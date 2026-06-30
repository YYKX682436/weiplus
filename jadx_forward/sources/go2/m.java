package go2;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355542d;

    public m(go2.z zVar) {
        this.f355542d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.z zVar = this.f355542d;
        zVar.getClass();
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 kg6 = w40.e.kg((w40.e) c17, zVar.m80379x76847179(), null, 29, 2, null);
        kg6.f293405n = new go2.t(zVar);
        kg6.f293414s = new go2.u(zVar);
        kg6.f293387d = go2.v.f355602d;
        kg6.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
