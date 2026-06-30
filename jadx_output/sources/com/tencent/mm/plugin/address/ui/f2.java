package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74546d;

    public f2(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        this.f74546d = walletAddAddressUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74546d;
        android.widget.LinearLayout linearLayout = walletAddAddressUI.f74473r;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("addrCaptureContainer");
            throw null;
        }
        linearLayout.setVisibility(8);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f74546d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String[] strArr = new java.lang.String[2];
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = walletAddAddressUI.f74480y;
        if (addrItemView == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        strArr[0] = addrItemView.getText();
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = walletAddAddressUI.f74481z;
        if (addrItemView2 == null) {
            kotlin.jvm.internal.o.o("addrDetailed");
            throw null;
        }
        strArr[1] = addrItemView2.getText();
        java.util.List i17 = kz5.c0.i(strArr);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : i17) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        java.lang.String g07 = kz5.n0.g0(arrayList2, "", null, null, 0, null, null, 62, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("wallet_address", g07);
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", -1);
        intent.putExtra("key_geo_coder_four_level", true);
        j45.l.n(walletAddAddressUI, ya.b.LOCATION, ".ui.RedirectUI", intent, 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("region_select_map", "view_clk", walletAddAddressUI.f74467i, 33328);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
