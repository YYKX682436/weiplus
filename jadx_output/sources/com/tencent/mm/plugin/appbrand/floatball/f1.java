package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class f1 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f78092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78093b;

    public f1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var, boolean z17) {
        this.f78093b = k1Var;
        this.f78092a = z17;
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onFloatBallInfoAdded ballInfo: %s", ballInfo.f93063x);
        if (this.f78092a) {
            this.f78093b.y0();
        }
    }
}
