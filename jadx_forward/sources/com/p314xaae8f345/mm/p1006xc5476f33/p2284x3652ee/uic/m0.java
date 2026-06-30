package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes8.dex */
public final class m0 extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k0 f256312d = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k0(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 23 || i17 == 24;
    }

    @Override // pk3.b
    public boolean Mb(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return false;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            rk4.k5.e("onMultiTaskItemClick main process", "TingMultiTaskRegisterUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k0.a(f256312d, info, m158354x19263085());
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tingTaskInfo", info);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.l0.class);
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }
}
