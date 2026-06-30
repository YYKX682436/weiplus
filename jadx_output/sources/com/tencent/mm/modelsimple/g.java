package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(com.tencent.mm.protobuf.g extDeviceId, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(extDeviceId, "extDeviceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.bn0 bn0Var = new r45.bn0();
        bn0Var.f370885d = extDeviceId;
        bn0Var.f370889h = "";
        bn0Var.f370886e = i17;
        bn0Var.f370887f = i18;
        bn0Var.f370888g = i19;
        r45.cn0 cn0Var = new r45.cn0();
        r45.ie ieVar = new r45.ie();
        cn0Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        lVar.f70664a = bn0Var;
        lVar.f70665b = cn0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceoplog";
        lVar.f70667d = 4048;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiExtDeviceOplog", "opcode:" + bn0Var.f370887f + " setting:" + i19);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiExtDeviceOplog", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
