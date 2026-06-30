package com.tencent.mm.modelsimple;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class NetSceneGetDisasterInfo$1$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.APPHasInitEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.n0 f71281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetSceneGetDisasterInfo$1$1(com.tencent.mm.modelsimple.n0 n0Var, androidx.lifecycle.y yVar, java.lang.String str, java.lang.String str2) {
        super(yVar);
        this.f71281f = n0Var;
        this.f71279d = str;
        this.f71280e = str2;
        this.__eventId = -1206899071;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.APPHasInitEvent aPPHasInitEvent) {
        com.tencent.mm.modelsimple.n0 n0Var = this.f71281f;
        n0Var.f71376f.f71387g.dead();
        n0Var.f71376f.f71387g = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after 5s[%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.f193073c));
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.modelsimple.m0(this), 5000L);
        return true;
    }
}
