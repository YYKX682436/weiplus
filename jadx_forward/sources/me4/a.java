package me4;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {
    public a(me4.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (v34.b.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InitTaskMgr", "DeviceIdInitTask run, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InitTaskMgr", "mDeviceIdInitTask exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.waid.InitTaskMgr$1");
    }
}
