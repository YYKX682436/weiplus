package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f293298d;

    public d3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f293298d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f293298d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r3 r3Var = z2Var.K;
        if (r3Var != null) {
            r3Var.a(z2Var.f293588d, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
