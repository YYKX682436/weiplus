package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 f291024d;

    public p3(com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 c21354xd0cc2aa9) {
        this.f291024d = c21354xd0cc2aa9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.ui.q3 q3Var = this.f291024d.f278175q;
        if (q3Var != null) {
            c21470xb673f8d = ((com.p314xaae8f345.mm.ui.n) q3Var).f290922a.f39293x1c18ee31;
            c21470xb673f8d.m80845x940d026a(intValue, true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
