package df2;

/* loaded from: classes10.dex */
public final class g3 extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(int i17, int i18, r45.kf5 kf5Var, yz5.q settingInvoke) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingInvoke, "settingInvoke");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.live.plugin.ILiveStatus");
        qo0.c cVar = (qo0.c) ubVar;
        boolean z17 = i17 == 0;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l R6 = R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(R6);
            df2.d3 d3Var = new df2.d3(this, z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
            ni2.x0 x0Var = new ni2.x0(N6, cVar, R6, d3Var, x7Var != null ? x7Var.F : null, settingInvoke);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(x0Var, null, false, 0, 7, null);
            x0Var.N = i18;
            x0Var.M = i18;
            x0Var.P = kf5Var;
            if (pm0.v.z(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                x0Var.h0();
            } else if (pm0.v.z(i18, 64)) {
                x0Var.g0();
            } else {
                x0Var.f0();
            }
            x0Var.i0();
            if (((mm2.c1) ((df2.d3) x0Var.f419035J).a().a(mm2.c1.class)).f410425u3) {
                return;
            }
            android.view.View view = x0Var.V;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (pm0.v.z(x0Var.N, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                return;
            }
            android.view.View view2 = x0Var.X;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModSettingLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
