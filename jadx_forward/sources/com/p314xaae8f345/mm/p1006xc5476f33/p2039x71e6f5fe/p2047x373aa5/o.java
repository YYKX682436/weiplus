package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 f241498d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116) {
        this.f241498d = c17345xe981d116;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = this.f241498d;
        if (c17345xe981d116.f241427v.f240998g) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273 c5966x180c3273 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273();
            c5966x180c3273.f136263g.f89566a = 2;
            c5966x180c3273.e();
            c17345xe981d116.f241427v.a();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273 c5966x180c32732 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273();
            c5966x180c32732.f136263g.f89566a = 1;
            c5966x180c32732.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17315x949fc5b3 c17315x949fc5b3 = c17345xe981d116.f241427v;
            c17315x949fc5b3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
            c17315x949fc5b3.f240998g = true;
            c17315x949fc5b3.f240995d.setImageResource(com.p314xaae8f345.mm.R.raw.f80998x8f54a24);
            c17315x949fc5b3.f240996e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i9j);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
