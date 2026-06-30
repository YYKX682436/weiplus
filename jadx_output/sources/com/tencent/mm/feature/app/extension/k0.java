package com.tencent.mm.feature.app.extension;

/* loaded from: classes12.dex */
public class k0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).getCallBack().parseKVPluginMsg(g17);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, new com.tencent.mm.ipcinvoker.type.IPCString(g17), com.tencent.mm.feature.app.extension.j0.class, null);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
