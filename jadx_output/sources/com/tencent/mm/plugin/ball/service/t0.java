package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class t0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.z f93251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93252e;

    public t0(com.tencent.mm.plugin.ball.service.o4 o4Var, gp1.z zVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93251d = zVar;
        this.f93252e = ballInfo;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        if (iPCBoolean == null || !iPCBoolean.f68400d) {
            return;
        }
        this.f93251d.X0(this.f93252e);
    }
}
