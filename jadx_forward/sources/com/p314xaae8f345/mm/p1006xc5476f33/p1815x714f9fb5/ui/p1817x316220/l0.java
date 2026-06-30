package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 f226377d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var) {
        this.f226377d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var = this.f226377d;
        p0Var.T.setSelected(true);
        za3.i1 i1Var = p0Var.X;
        i1Var.f552489n = true;
        i1Var.a(p0Var.f226266i.f226337f);
        p0Var.X.d(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, "6", "", 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
