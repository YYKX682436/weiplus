package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class u9 implements k91.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75996b;

    public u9(com.tencent.mm.plugin.appbrand.appcache.v9 v9Var, java.lang.String str, int i17) {
        this.f75995a = str;
        this.f75996b = i17;
    }

    @Override // k91.q1
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "CommonConfigManager.getConfig config:%s", str);
        java.lang.String str2 = this.f75995a;
        int i17 = this.f75996b;
        java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", str2, java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.appbrand.ipc.m0.f78421a;
        synchronized (hashMap2) {
            mMToClientEvent = (com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent) hashMap2.get(str2);
        }
        if (mMToClientEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
            return;
        }
        synchronized (mMToClientEvent) {
            mMToClientEvent.f78381f = 3;
            mMToClientEvent.f78382g = str2;
            mMToClientEvent.f78383h = i17;
            mMToClientEvent.f78384i = str;
            mMToClientEvent.c();
        }
    }
}
