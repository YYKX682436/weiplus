package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f82294d;

    public e(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f82294d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "checkOrSendOnReceiveCacheMsgChannelBatch appId:%s", this.f82294d.f74803n);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.d(this), "checkOrSendOnReceiveCacheMsgChannelBatch");
    }
}
