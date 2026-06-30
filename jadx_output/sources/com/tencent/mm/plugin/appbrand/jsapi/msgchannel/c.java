package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f82291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage f82292e;

    public c(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage appBrandOnReceiveCacheMsgChannelBatchIPCMessage) {
        this.f82291d = o6Var;
        this.f82292e = appBrandOnReceiveCacheMsgChannelBatchIPCMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage", "run task and dispatch");
        new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.g().x(this.f82291d.C0(), this.f82292e.f82288f);
    }
}
