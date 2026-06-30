package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class w4 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s4 f93262a;

    public w4(com.tencent.mm.plugin.ball.service.s4 s4Var) {
        this.f93262a = s4Var;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "transform to float ball animation cancel");
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f93262a;
        gp1.v vVar = s4Var.f93136h;
        if (vVar != null) {
            vVar.u0(true);
        }
        s4Var.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "transform to float ball animation end");
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f93262a;
        gp1.v vVar = s4Var.f93136h;
        if (vVar != null) {
            vVar.u0(true);
        }
        s4Var.f93239n.q(false);
    }
}
