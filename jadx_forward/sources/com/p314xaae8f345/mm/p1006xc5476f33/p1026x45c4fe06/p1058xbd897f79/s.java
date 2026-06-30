package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class s implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y f159839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f159841c;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, yz5.a aVar) {
        this.f159839a = yVar;
        this.f159840b = o6Var;
        this.f159841c = aVar;
    }

    @Override // ph1.d
    public final void a(ph1.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-ensureEntryModuleLoadedAndCallback, appId:" + this.f159839a.f159851d.f158811d + ", instanceId:" + this.f159839a.f159851d.f128810w + ", sessionId:" + this.f159839a.f159851d.f128809v + ", loadModuleResult:" + gVar);
        if (ph1.g.OK != gVar) {
            l81.v0 v0Var = this.f159839a.f159854g;
            if (v0Var != null) {
                l81.v0.b(v0Var, -9, null, 2, null);
            }
            this.f159841c.mo152xb9724478();
            return;
        }
        this.f159840b.N.f506965a.s(u81.u.AWAKE_IN_BACKGROUND, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y yVar = this.f159839a;
        if (yVar.f159855h != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f159840b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config = yVar.f159851d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            t91.a aVar = t91.a.f498100a;
            aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, runtime(" + runtime.f156336n + ')');
            android.os.PersistableBundle persistableBundle = config.V;
            android.os.PersistableBundle persistableBundle2 = persistableBundle != null ? persistableBundle.getPersistableBundle("DeviceDiscovery_bluetoothDeviceInfo") : null;
            if (persistableBundle2 != null) {
                c11858x835ced59 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59();
                c11858x835ced59.f65990x28d45f97 = persistableBundle2.getString("appid");
                c11858x835ced59.f65991x19e082da = persistableBundle2.getString("bluetoothDeviceId");
                c11858x835ced59.f65996x62fb9eae = persistableBundle2.getString("deviceId");
                c11858x835ced59.f65995x94d24c6d = persistableBundle2.getInt("envVersion");
                c11858x835ced59.f65992x13d36e99 = persistableBundle2.getString("entryPackage");
            } else {
                c11858x835ced59 = null;
            }
            boolean z17 = (persistableBundle != null ? persistableBundle.getInt("DeviceDiscovery_isBluetoothDeviceConnected") : 0) != 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deliverOnBluetoothDeviceFound, appId: ");
            sb6.append(c11858x835ced59 != null ? c11858x835ced59.f65990x28d45f97 : null);
            sb6.append(", deviceId: ");
            sb6.append(c11858x835ced59 != null ? c11858x835ced59.f65991x19e082da : null);
            sb6.append(", isConnected: ");
            sb6.append(z17);
            aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", sb6.toString());
            if (c11858x835ced59 == null || !c11858x835ced59.m50225x7b953cf2()) {
                aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, deviceInfo is invalid");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.v0.a(c11858x835ced59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m1.f159456i, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.w0(runtime));
                aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "onFound, appId: " + c11858x835ced59.f65990x28d45f97 + ", deviceId: " + c11858x835ced59.f65991x19e082da + ", isConnected: " + z17);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0(c11858x835ced59).u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.y0(z17, c11858x835ced59));
            }
        }
        l81.v0 v0Var2 = this.f159839a.f159854g;
        if (v0Var2 != null) {
            v0Var2.mo50385xe05b4124();
        }
        this.f159841c.mo152xb9724478();
    }
}
