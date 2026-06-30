package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCBoolean, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        try {
            i95.n0.c(com.tencent.mm.plugin.zero.s0.class);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).SetDebugFlag(iPCBoolean.f68400d);
        } finally {
            if (rVar != null) {
                rVar.a(iPCVoid);
            }
        }
    }
}
