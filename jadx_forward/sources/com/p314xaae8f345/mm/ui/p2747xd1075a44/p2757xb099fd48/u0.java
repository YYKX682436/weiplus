package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class u0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293528d;

    public u0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f293528d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293528d;
        if (i17 < k0Var.L.size()) {
            db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) k0Var.L.f309877d).get(i17);
            if (h4Var == null || h4Var.f309908s) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            db5.t4 t4Var = k0Var.f293414s;
            if (t4Var != null) {
                t4Var.mo888x34063ac(h4Var, i17);
            } else {
                h4Var.c();
            }
        } else if (k0Var.M.size() > 0 && i17 < k0Var.L.size() + k0Var.M.size()) {
            db5.h4 h4Var2 = (db5.h4) k0Var.M.getItem(i17 - k0Var.L.size());
            if (h4Var2 == null || h4Var2.f309908s) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            db5.t4 t4Var2 = k0Var.f293415t;
            if (t4Var2 != null) {
                t4Var2.mo888x34063ac(h4Var2, i17);
            } else {
                h4Var2.c();
            }
        } else {
            if (!k0Var.f293398i2) {
                yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            k0Var.A.a();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g1 g1Var = k0Var.B;
            if (g1Var != null) {
                g1Var.a();
            }
        }
        if (!k0Var.U1) {
            k0Var.u();
        }
        k0Var.W1 = true;
        k0Var.f293395h = true;
        k0Var.f293384a2 = i17;
        k0Var.f293401l1.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
