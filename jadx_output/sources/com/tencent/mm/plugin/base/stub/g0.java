package com.tencent.mm.plugin.base.stub;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.HandleScanResultEvent f93748d;

    public g0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider, com.tencent.mm.autogen.events.HandleScanResultEvent handleScanResultEvent) {
        this.f93748d = handleScanResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f93748d.e()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "handle scan result failed again");
    }
}
