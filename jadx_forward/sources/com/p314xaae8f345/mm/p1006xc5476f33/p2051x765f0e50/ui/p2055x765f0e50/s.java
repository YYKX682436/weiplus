package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 f243057d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var) {
        this.f243057d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC$attachScanButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = this.f243057d;
        int W6 = i0Var.W6();
        v24.e eVar = i0Var.f242839d;
        if (eVar != null) {
            v24.e.c(eVar, 11, W6, null, null, 0, 28, null);
        }
        if (!iq.b.g(i0Var.m80379x76847179()) && !iq.b.x(i0Var.m80379x76847179()) && !iq.b.c(i0Var.m80379x76847179(), true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_is_hide_right_btn", true);
            intent.putExtra("key_scan_report_enter_scene", 4);
            intent.putExtra("key_is_hide_right_btn", true);
            intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            j45.l.j(i0Var.m80379x76847179(), "scanner", ".ui.BaseScanUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC$attachScanButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
