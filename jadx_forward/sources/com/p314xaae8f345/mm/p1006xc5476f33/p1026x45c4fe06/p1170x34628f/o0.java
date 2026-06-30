package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z1 f168468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 f168469e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var, r45.z1 z1Var) {
        this.f168469e = p0Var;
        this.f168468d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var = this.f168469e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72 = p0Var.f168516e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = p0Var.f168513b;
        r45.z1 z1Var = this.f168468d;
        if (z1Var != null) {
            java.lang.Boolean bool = c12494xc37d1f72.F;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = o6Var.S2(false);
                if (S2 == null) {
                    booleanValue = false;
                } else {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(S2.qe("gameComponent")));
                    c12494xc37d1f72.F = valueOf;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeader", "canShowActivityInfo:%b", valueOf);
                    booleanValue = c12494xc37d1f72.F.booleanValue();
                }
            }
            if (booleanValue) {
                c12494xc37d1f72.D.setVisibility(0);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.e70 e70Var = z1Var.f473111d;
                if (e70Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e70Var.f454596d)) {
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x0(1, z1Var.f473111d));
                }
                r45.e70 e70Var2 = z1Var.f473112e;
                if (e70Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e70Var2.f454596d)) {
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x0(0, z1Var.f473112e));
                }
                if (!linkedList.isEmpty()) {
                    android.view.View view = c12494xc37d1f72.f167899z;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showActivityInfo", "(Lcom/tencent/mm/protocal/protobuf/ActivityInfo;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showActivityInfo", "(Lcom/tencent/mm/protocal/protobuf/ActivityInfo;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c12494xc37d1f72.D.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q0(c12494xc37d1f72, c12494xc37d1f72.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aih)));
                    c12494xc37d1f72.D.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s0(c12494xc37d1f72, linkedList, o6Var));
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c12494xc37d1f72.f167881e.getContext());
                    c1162x665295de.Q(1);
                    c12494xc37d1f72.D.mo7967x900dcbe1(c1162x665295de);
                    c12494xc37d1f72.D.setNestedScrollingEnabled(false);
                    c12494xc37d1f72.D.setOverScrollMode(2);
                    return;
                }
            }
        }
        c12494xc37d1f72.D.setVisibility(8);
    }
}
