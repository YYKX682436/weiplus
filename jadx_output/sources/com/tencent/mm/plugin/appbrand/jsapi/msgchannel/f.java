package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes7.dex */
final class f implements com.tencent.mm.ipcinvoker.k0 {
    private f() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "ipc PullOnReceiveCacheMsgChannelBatchTask Task, src:%s", iPCString.toString());
            oh1.h1 h1Var = oh1.h1.INSTANCE;
            java.lang.String iPCString2 = iPCString.toString();
            synchronized (h1Var) {
                arrayList = (java.util.ArrayList) h1Var.f345225d.remove(iPCString2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", e17, "ipc PullOnReceiveCacheMsgChannelBatchTask task", new java.lang.Object[0]);
        }
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "msgChannels is null");
            return new com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList();
        }
        com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList wxaAppMsgChannelList = new com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList();
        wxaAppMsgChannelList.f86015d = arrayList;
        return wxaAppMsgChannelList;
    }
}
