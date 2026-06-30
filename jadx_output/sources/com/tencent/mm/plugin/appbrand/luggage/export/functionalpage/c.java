package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.modelbase.i {
    public c(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ps6 ps6Var = new r45.ps6();
        ps6Var.f383394d = str;
        ps6Var.f383395e = i17;
        ps6Var.f383396f = str2;
        lVar.f70664a = ps6Var;
        lVar.f70665b = new r45.qs6();
        lVar.f70667d = 2578;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/updateruntimeqrcode";
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiUpdateRuntimeQrcode", "onCgiBack errType[" + i17 + "] errCode[" + i18 + "] errMsg[" + str + ']');
    }

    public /* synthetic */ c(java.lang.String str, int i17, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 4) != 0 ? null : str2);
    }
}
