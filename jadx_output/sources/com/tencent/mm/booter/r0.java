package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class r0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.u0 f63558d;

    public r0(com.tencent.mm.booter.u0 u0Var) {
        this.f63558d = u0Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.booter.u0 u0Var = this.f63558d;
        u0Var.getClass();
        gm0.j1.i();
        gm0.j1.e().j(new com.tencent.mm.booter.t0(u0Var));
        return false;
    }
}
