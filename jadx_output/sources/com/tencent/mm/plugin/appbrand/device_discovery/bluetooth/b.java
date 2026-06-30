package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a f77874c;

    public b(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar, java.lang.String str, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        this.f77874c = aVar;
        this.f77872a = str;
        this.f77873b = monitoredBluetoothDeviceInfo;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public void a() {
        boolean z17;
        com.tencent.mm.ipcinvoker.d0.i(this.f77872a, this);
        synchronized (this.f77874c) {
            android.util.Pair pair = new android.util.Pair(this.f77873b, this.f77872a);
            if (((android.util.ArraySet) this.f77874c.f77864b).contains(pair)) {
                ((android.util.ArraySet) this.f77874c.f77864b).remove(pair);
                z17 = true;
            } else {
                z17 = false;
            }
            ((android.util.ArraySet) this.f77874c.f77865c).remove(this.f77873b);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBleKeepAlive", "onDied: " + this.f77873b + " processName: " + this.f77872a + " shouldStart: " + z17);
        if (z17 && this.f77874c.b()) {
            this.f77874c.f77863a.j(this.f77873b, true);
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = this.f77874c;
            synchronized (aVar) {
                ((java.util.ArrayList) aVar.f77866d).add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
        }
    }
}
