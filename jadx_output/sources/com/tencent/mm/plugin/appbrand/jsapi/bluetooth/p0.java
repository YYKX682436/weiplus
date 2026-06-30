package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class p0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p0 f80092d = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p0();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record#MainProcess, data is null");
            return;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp.class.getClassLoader());
        boolean z17 = bundle.getBoolean("enable");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp) bundle.getParcelable("app");
        if (wCBluetoothBackgroundApp == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record#MainProcess, app is null");
            return;
        }
        wCBluetoothBackgroundApp.toString();
        if (z17) {
            synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0.f80083a) {
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0.f80084b.add(wCBluetoothBackgroundApp);
            }
        } else {
            synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0.f80083a) {
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0.f80084b.remove(wCBluetoothBackgroundApp);
            }
        }
    }
}
