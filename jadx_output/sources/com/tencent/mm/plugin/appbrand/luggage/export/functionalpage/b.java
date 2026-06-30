package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f85572m;

    /* renamed from: n, reason: collision with root package name */
    public final int f85573n;

    public b(java.lang.String str, int i17, java.lang.String str2, kotlin.jvm.internal.i iVar) {
        this.f85572m = str;
        this.f85573n = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.xe7 xe7Var = new r45.xe7();
        xe7Var.f390041d = i17;
        xe7Var.f390042e = str2 == null ? null : com.tencent.mm.protobuf.g.c(str2);
        xe7Var.f390043f = str;
        lVar.f70664a = xe7Var;
        lVar.f70665b = new r45.ye7();
        lVar.f70667d = 2889;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/updatedeeplinkinfo";
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "onCgiBack errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + ", cgiHash[" + hashCode() + ']');
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRuntimeUpdateDeepLinkInfo", "run() ticket:" + this.f85572m + " status:" + this.f85573n + ", cgiHash[" + hashCode() + ']');
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }
}
