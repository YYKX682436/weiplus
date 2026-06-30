package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class l1 extends lf.e {

    /* renamed from: u, reason: collision with root package name */
    public static volatile java.lang.Boolean f162990u;

    static {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable open:%b", java.lang.Boolean.valueOf(android.bluetooth.BluetoothAdapter.getDefaultAdapter().isEnabled()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TencentLocationManagerWxImp", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable fail");
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TencentLocationManagerWxImp", "isGPSEnable " + com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() + ", isNetworkEnable:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TencentLocationManagerWxImp", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TencentLocationManagerWxImp", "Imei:%s", wo.w0.g(true));
    }
}
