package fr2;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.x f347285d;

    public r(fr2.x xVar) {
        this.f347285d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.x xVar = this.f347285d;
        xVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) xVar.m158354x19263085(), 0, true);
        k0Var.f293405n = new fr2.t(xVar);
        k0Var.f293414s = new fr2.u(xVar);
        if (xVar.f347303n == null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            xVar.f347303n = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        }
        o25.y1 y1Var = xVar.f347303n;
        if (y1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).Di(xVar.m80379x76847179(), k0Var, 2, null, new fr2.w(k0Var, xVar));
        }
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
