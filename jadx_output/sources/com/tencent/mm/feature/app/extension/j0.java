package com.tencent.mm.feature.app.extension;

/* loaded from: classes12.dex */
class j0 implements com.tencent.mm.ipcinvoker.j {
    private j0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || iPCString.f68406d == null) {
            return;
        }
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).getCallBack().parseKVPluginMsg(iPCString.f68406d);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.KVStrategySysCmdMsgList", "sync strategy from syscmd", null);
    }
}
