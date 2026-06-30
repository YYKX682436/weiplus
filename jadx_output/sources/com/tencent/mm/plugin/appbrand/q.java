package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f87716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87717e;

    public q(com.tencent.mm.plugin.appbrand.p pVar, boolean[] zArr, android.content.Context context) {
        this.f87716d = zArr;
        this.f87717e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) obj;
        boolean[] zArr = this.f87716d;
        boolean z17 = zArr[0];
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            zArr[0] = true;
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = sVar.f47684a;
            b1Var.f317016c = sVar.f47685b;
            b1Var.f317032k = mc1.c.CTRL_INDEX;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f87717e, b1Var);
        }
        return f0Var;
    }
}
