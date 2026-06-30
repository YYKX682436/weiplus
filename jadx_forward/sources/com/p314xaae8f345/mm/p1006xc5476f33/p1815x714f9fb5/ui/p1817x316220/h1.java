package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226357d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226357d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226357d;
        x1Var.D1.setText("");
        x1Var.C();
        if (x1Var.Q) {
            x1Var.y(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1.OPENED);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
