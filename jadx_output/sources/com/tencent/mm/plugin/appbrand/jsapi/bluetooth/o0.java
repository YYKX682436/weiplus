package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class o0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o0 f80091a = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o0();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount#MainProcess, data is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp) bundle.getParcelable("app");
        if (wCBluetoothBackgroundApp == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount#MainProcess, app is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        int i17 = bundle.getInt("maxCount");
        java.util.HashSet hashSet = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0.f80084b;
        kz5.h0.A(hashSet, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j0.f80079d);
        boolean z17 = true;
        if (hashSet.contains(wCBluetoothBackgroundApp)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "canIEnableBackgroundSupport, backgroundApps contains me");
        } else {
            boolean z18 = i17 >= hashSet.size() + 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "canIEnableBackgroundSupport, can: " + z18);
            z17 = z18;
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17);
    }
}
