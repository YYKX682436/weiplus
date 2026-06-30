package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
final class r0 implements com.tencent.mm.ipcinvoker.wx_extension.w {
    private r0() {
    }

    public /* synthetic */ r0(com.tencent.mm.plugin.appbrand.networking.n0 n0Var) {
        this();
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.w
    public com.tencent.mm.modelbase.o a(com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCgiServiceWC.IPCRunCgiMainProcessMonitor", "before run cgi, rr.url=%s, rr.cmdid=%d", oVar.f70712c, java.lang.Integer.valueOf(oVar.f70713d));
        return oVar;
    }
}
