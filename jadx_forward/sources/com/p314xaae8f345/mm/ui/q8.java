package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21389xb8f36d3b f291079d;

    public q8(com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b) {
        this.f291079d = c21389xb8f36d3b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = this.f291079d;
        if (c21389xb8f36d3b.f278395y == intValue && intValue == 0 && java.lang.System.currentTimeMillis() - c21389xb8f36d3b.f278394x <= 300) {
            c21389xb8f36d3b.C.mo50303x856b99f0(0);
            ((zr.b) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.b.class)).O6(new zr.a(1, c21389xb8f36d3b.F));
            c21389xb8f36d3b.f278394x = java.lang.System.currentTimeMillis();
            c21389xb8f36d3b.f278395y = intValue;
            yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (intValue == 0) {
            fg5.c.f344034a.a(1L, c21389xb8f36d3b.F, null, null);
        }
        if (c21389xb8f36d3b.f278378e != null) {
            if (intValue != 0 || c21389xb8f36d3b.f278395y != 0) {
                c21389xb8f36d3b.f278394x = java.lang.System.currentTimeMillis();
                c21389xb8f36d3b.f278395y = intValue;
                c21389xb8f36d3b.f278378e.mo78781x6d7cadf2(intValue);
                yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            c21389xb8f36d3b.C.mo50307xb9e94560(0, 300L);
        }
        c21389xb8f36d3b.f278394x = java.lang.System.currentTimeMillis();
        c21389xb8f36d3b.f278395y = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", (java.lang.Integer) view.getTag());
        yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
