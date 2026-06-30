package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.floatball.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.f5 f78104a;

    public j(com.tencent.mm.plugin.appbrand.floatball.l lVar, com.tencent.mm.plugin.ball.service.f5 f5Var) {
        this.f78104a = f5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.floatball.v0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "beforeOnMenuFloatBallSelected, afterShowVOIPTip");
        com.tencent.mm.plugin.ball.service.f5 f5Var = this.f78104a;
        if (f5Var != null) {
            ((com.tencent.mm.plugin.ball.service.u4) f5Var).a();
        }
    }
}
