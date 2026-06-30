package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class s8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21389xb8f36d3b f291310d;

    public s8(com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b) {
        this.f291310d = c21389xb8f36d3b;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue == 0) {
            com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = this.f291310d;
            if (c21389xb8f36d3b.f278395y == intValue) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20113xe34cc462()) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "onMainTabLongClick");
                    c21389xb8f36d3b.C.mo50303x856b99f0(0);
                    ((zr.b) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.b.class)).O6(new zr.a(2, c21389xb8f36d3b.F));
                    c21389xb8f36d3b.f278394x = java.lang.System.currentTimeMillis();
                    c21389xb8f36d3b.f278395y = intValue;
                    yj0.a.i(true, this, "com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
