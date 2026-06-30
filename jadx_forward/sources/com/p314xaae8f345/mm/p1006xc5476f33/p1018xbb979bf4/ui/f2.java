package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156079d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156079d = activityC11495xd59e7ca0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156079d;
        android.widget.LinearLayout linearLayout = activityC11495xd59e7ca0.f156006r;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureContainer");
            throw null;
        }
        linearLayout.setVisibility(8);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f156079d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String[] strArr = new java.lang.String[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89 = activityC11495xd59e7ca0.f156013y;
        if (c11487xdaa53b89 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrRegion");
            throw null;
        }
        strArr[0] = c11487xdaa53b89.m48716xfb85ada3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b892 = activityC11495xd59e7ca0.f156014z;
        if (c11487xdaa53b892 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrDetailed");
            throw null;
        }
        strArr[1] = c11487xdaa53b892.m48716xfb85ada3();
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
        j45.l.n(activityC11495xd59e7ca0, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("region_select_map", "view_clk", activityC11495xd59e7ca0.f156000i, 33328);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
