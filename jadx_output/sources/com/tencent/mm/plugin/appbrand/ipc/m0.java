package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f78421a = new java.util.HashMap();

    public static void a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMToClientEventCenter", "notify unread:%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f78421a;
        synchronized (hashMap) {
            mMToClientEvent = (com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent) hashMap.get(str);
        }
        if (mMToClientEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
            return;
        }
        synchronized (mMToClientEvent) {
            mMToClientEvent.f78381f = 4;
            mMToClientEvent.f78386n = i17;
            mMToClientEvent.c();
        }
    }

    public static void b(java.lang.String str, android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent mMToClientEvent;
        java.util.HashMap hashMap = f78421a;
        synchronized (hashMap) {
            mMToClientEvent = (com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent) hashMap.get(str);
        }
        if (mMToClientEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMToClientEventCenter", "notify failed, appId[%s] data[%s]", str, parcelable);
            return;
        }
        if (mMToClientEvent == null || parcelable == null) {
            return;
        }
        if (parcelable == null) {
            mMToClientEvent.getClass();
            return;
        }
        synchronized (mMToClientEvent) {
            mMToClientEvent.f78381f = 5;
            mMToClientEvent.f78387o = parcelable.getClass().getName();
            mMToClientEvent.f78388p = parcelable;
            mMToClientEvent.c();
        }
    }
}
