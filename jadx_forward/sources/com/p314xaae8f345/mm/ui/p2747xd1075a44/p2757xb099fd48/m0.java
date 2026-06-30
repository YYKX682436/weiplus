package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293457e;

    public m0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, int i17) {
        this.f293457e = k0Var;
        this.f293456d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293457e;
        if (k0Var.f293422y != null) {
            int size = k0Var.R.size();
            int i17 = this.f293456d;
            if (i17 < size) {
                k0Var.f293422y.mo888x34063ac(k0Var.R.getItem(i17), i17);
            }
        }
        if (!k0Var.U1) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
