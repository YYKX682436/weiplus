package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgchannel.e f82293d;

    public d(com.tencent.mm.plugin.appbrand.jsapi.msgchannel.e eVar) {
        this.f82293d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList wxaAppMsgChannelList = (com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(this.f82293d.f82294d.f74803n), com.tencent.mm.plugin.appbrand.jsapi.msgchannel.f.class);
        if (wxaAppMsgChannelList == null || (arrayList = wxaAppMsgChannelList.f86015d) == null || arrayList.size() < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync cache is empty.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync appId:%s, cache list:%d", this.f82293d.f82294d.f74803n, java.lang.Integer.valueOf(wxaAppMsgChannelList.f86015d.size()));
            new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.g().x(this.f82293d.f82294d.C0(), wxaAppMsgChannelList.f86015d);
        }
    }
}
