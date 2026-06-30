package im2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373994d;

    public o0(im2.z3 z3Var) {
        this.f373994d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f373994d;
        z3Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) z3Var.m158354x19263085(), 1, false);
        k0Var.f293405n = new im2.o3(z3Var);
        k0Var.f293414s = new im2.p3(z3Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
