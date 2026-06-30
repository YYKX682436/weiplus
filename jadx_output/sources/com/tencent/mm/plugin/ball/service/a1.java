package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class a1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.t f93123d;

    public a1(com.tencent.mm.plugin.ball.service.o4 o4Var, gp1.t tVar) {
        this.f93123d = tVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        gp1.t tVar = this.f93123d;
        if (tVar != null) {
            tVar.a(iPCInteger.f68404d);
        }
    }
}
