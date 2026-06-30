package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 f230941d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r3 r3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 t3Var) {
        this.f230941d = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightSettingsUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 t3Var = this.f230941d;
        t3Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = t3Var.f230958b;
            if (i17 >= strArr.length) {
                db5.e1.b(t3Var.f230961e, "", linkedList, linkedList2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s3(t3Var));
                yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightSettingsUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                linkedList.add(strArr[i17]);
                linkedList2.add(java.lang.Integer.valueOf(i17));
                i17++;
            }
        }
    }
}
