package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class b5 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s4 f93127d;

    public b5(com.tencent.mm.plugin.ball.service.s4 s4Var) {
        this.f93127d = s4Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(iPCBoolean != null && iPCBoolean.f68400d);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimationInNotMMProcess onCallback %s", objArr);
        this.f93127d.l0();
    }
}
