package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v7 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w7 f201581d;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w7 w7Var) {
        this.f201581d = w7Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w7 w7Var = this.f201581d;
        java.util.ArrayList arrayList = w7Var.f201689m;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataList");
            throw null;
        }
        vm2.b0 b0Var = (vm2.b0) kz5.n0.a0(arrayList, i17);
        if (b0Var == null) {
            return;
        }
        int i18 = b0Var.f519615d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionWidget", "dispatchItemClick: " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x7 x7Var = w7Var.f201687h;
        if (i18 == 1) {
            df2.q1 q1Var = (df2.q1) x7Var;
            q1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionController", "onBeautyClick");
            ml2.h1[] h1VarArr = ml2.h1.f409053d;
            q1Var.a7(4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) q1Var.m56789x25fe639c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
            if (r5Var != null) {
                r5Var.d7(bundle);
            }
        } else if (i18 == 2) {
            df2.q1 q1Var2 = (df2.q1) x7Var;
            q1Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorOptionController", "onFlipCameraClick");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) q1Var2.m56789x25fe639c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
            if (r5Var2 != null) {
                ml2.m1[] m1VarArr = ml2.m1.f409244d;
                r5Var2.e7(2);
            }
        } else if (i18 == 3) {
            ((df2.q1) x7Var).Z6(df2.kx.f312140d);
        } else {
            if (i18 != 4) {
                return;
            }
            ((df2.q1) x7Var).Z6(df2.kx.f312141e);
        }
        w7Var.a();
    }
}
