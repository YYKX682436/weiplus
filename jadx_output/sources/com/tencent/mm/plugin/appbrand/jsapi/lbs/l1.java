package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class l1 extends lf.e {

    /* renamed from: u, reason: collision with root package name */
    public static volatile java.lang.Boolean f81457u;

    static {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable open:%b", java.lang.Boolean.valueOf(android.bluetooth.BluetoothAdapter.getDefaultAdapter().isEnabled()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable fail");
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TencentLocationManagerWxImp", "isGPSEnable " + com.tencent.mm.sdk.platformtools.n2.a() + ", isNetworkEnable:" + com.tencent.mm.sdk.platformtools.n2.b());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", e18, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TencentLocationManagerWxImp", "Imei:%s", wo.w0.g(true));
    }
}
