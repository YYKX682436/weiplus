package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes11.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam f78090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f78091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam appBrandFloatBallTingController$OperateAppBrandTingParam, com.tencent.mm.ipcinvoker.r rVar) {
        super(0);
        this.f78090d = appBrandFloatBallTingController$OperateAppBrandTingParam;
        this.f78091e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
        bw5.eq0 eq0Var = bw5.eq0.TingMusic;
        sl4.a a17 = jm4.t2.a(eq0Var);
        bw5.lp0 B0 = a17 instanceof cm4.a ? ((cm4.a) a17).B0() : null;
        boolean z17 = B0 != null && rk4.j5.h(B0);
        com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam appBrandFloatBallTingController$OperateAppBrandTingParam = this.f78090d;
        boolean b17 = z17 ? kotlin.jvm.internal.o.b(B0.d().l().getAppId(), appBrandFloatBallTingController$OperateAppBrandTingParam.f78062e) : false;
        com.tencent.mm.ipcinvoker.r rVar = this.f78091e;
        if (b17) {
            b66.g a18 = b66.i.f18167d.a(eq0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallTingController", "operate: " + appBrandFloatBallTingController$OperateAppBrandTingParam.f78061d);
            java.lang.String str = appBrandFloatBallTingController$OperateAppBrandTingParam.f78061d;
            if (kotlin.jvm.internal.o.b("onEnterPage", str)) {
                if (a18 != null) {
                    ((b66.i) a18).e();
                }
            } else if (kotlin.jvm.internal.o.b("onExitPage", str) && a18 != null) {
                ((b66.i) a18).d();
            }
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            }
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        }
        return jz5.f0.f302826a;
    }
}
