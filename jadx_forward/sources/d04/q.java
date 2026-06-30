package d04;

/* loaded from: classes13.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307022d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f307022d = c17326x8613bffb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11264, 3);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb.H1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u scanUIModel = this.f307022d.getScanUIModel();
        if (scanUIModel != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) scanUIModel;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(activityC17284x451cd422.C, 11, activityC17284x451cd422.f240700y0);
            bz3.h hVar = bz3.h.f118307a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanClientConfigManager", "clickQrcodeBtnNew");
            bz3.h.f118309c = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bz3.h.f118308b;
            if (o4Var != null) {
                o4Var.putInt("qrcode_btn_new_clicked", 1);
            }
            e04.g2.a(activityC17284x451cd422, new c01.ka(7));
            activityC17284x451cd422.W = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.CLICK_MY_QRCODE;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.i("view_clk", kd0.g3.f388179h, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = activityC17284x451cd422.f240677e;
            if (c17310x947f6bba != null) {
                e04.j1 m68703x9ba6cf9 = c17310x947f6bba.m68703x9ba6cf9();
                e04.i1 i1Var = e04.i1.f327493h;
                m68703x9ba6cf9.getClass();
                i1Var.toString();
                m68703x9ba6cf9.f327519u = i1Var;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
