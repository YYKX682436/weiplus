package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202229d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202229d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "hasShowAnchorInteractionWishRedDot");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_INTERACTION_WISH_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        java.lang.Integer num = 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 3);
        if (num != null) {
            num.intValue();
            jSONObject.put("type", num.intValue());
        }
        jSONObject.put("sub_element", 1);
        jSONObject.put("sub_type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202229d;
        t0Var.getClass();
        ll2.e.b(ll2.e.f400666a, t0Var.C(), false, false, 6, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "disposeInteractionWishRedDot path=".concat(t0Var.C()));
        r45.c04 data = t0Var.f202314r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.m75942xfb822ef2(1) > 0 && data.m75942xfb822ef2(0) > ((long) 0) && data.m75942xfb822ef2(0) <= ((long) 3)) {
            if (t0Var.K == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(t0Var.f199914d, 1, false);
                t0Var.K = k0Var;
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m0(t0Var);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.p0(t0Var);
                k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q0(t0Var);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = t0Var.K;
            if (k0Var2 != null) {
                k0Var2.v();
            }
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e) ((jz5.n) t0Var.f202309J).mo141623x754a37bb()).y(t0Var.f202314r, t0Var.f202316t, t0Var.f202317u, t0Var.f202321y);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
