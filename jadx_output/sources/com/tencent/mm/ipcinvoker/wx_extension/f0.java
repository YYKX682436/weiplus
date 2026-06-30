package com.tencent.mm.ipcinvoker.wx_extension;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper, com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper> {
    private f0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.wx_extension.w wVar;
        com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper iPCRunCgi$IPCRunCgiParamsWrapper = (com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper) obj;
        com.tencent.mm.modelbase.o oVar = iPCRunCgi$IPCRunCgiParamsWrapper.f68413e;
        if (oVar != null && oVar.f70711b.f70700a.getClass() != com.tencent.mm.protobuf.f.class) {
            java.lang.String str = iPCRunCgi$IPCRunCgiParamsWrapper.f68412d;
            if (str == null) {
                wVar = com.tencent.mm.ipcinvoker.wx_extension.h0.f68432b;
            } else {
                try {
                    wVar = (com.tencent.mm.ipcinvoker.wx_extension.w) d56.b.i(str).c().f226632b;
                } catch (d56.c e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCRunCgi", "createInterceptor with name:%s, get exception:%s", iPCRunCgi$IPCRunCgiParamsWrapper.f68412d, e17);
                    wVar = com.tencent.mm.ipcinvoker.wx_extension.h0.f68432b;
                }
            }
            com.tencent.mm.ipcinvoker.wx_extension.h0.b(oVar, wVar, new com.tencent.mm.ipcinvoker.wx_extension.e0(this, rVar), null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IPCRunCgi", "InvokeTask, mm received invalid rr %s", oVar);
        if (rVar != null) {
            com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper iPCRunCgiRespWrapper = new com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper();
            iPCRunCgiRespWrapper.f68458g = oVar;
            iPCRunCgiRespWrapper.f68457f = null;
            iPCRunCgiRespWrapper.f68455d = 3;
            iPCRunCgiRespWrapper.f68456e = -2;
            rVar.a(iPCRunCgiRespWrapper);
        }
    }
}
