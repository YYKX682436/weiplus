package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f159510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 f159511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59) {
        super(1);
        this.f159510d = z17;
        this.f159511e = c11858x835ced59;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a;
        java.lang.String field_appId = c11858x835ced59.f65990x28d45f97;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "stopStatWeApp， appId: ".concat(field_appId));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159494c.remove(field_appId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a;
        java.lang.String field_appId2 = c11858x835ced59.f65990x28d45f97;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId2, "field_appId");
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppSuspend, appId: ".concat(field_appId2));
        uk0.a.c(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(field_appId2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.i0.f159428d, null, 4, null);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 appService = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appService, "appService");
        if (this.f159510d) {
            t91.a.f498100a.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, isConnected, not need stat");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a;
            java.lang.String field_appId = this.f159511e.f65990x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            t91.a aVar = t91.a.f498100a;
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "startStatWeApp， appId: ".concat(field_appId));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159494c.add(field_appId)) {
                u81.h hVar = appService.t3().N;
                if (hVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = this.f159511e;
                    aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, appRunningStateController is null");
                    a(c11858x835ced59);
                } else if (u81.b.DESTROYED == hVar.b()) {
                    aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, weApp is destroyed");
                    a(this.f159511e);
                } else if (u81.b.SUSPEND == hVar.b()) {
                    a(this.f159511e);
                } else {
                    hVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.x0(hVar, this.f159511e));
                }
            } else {
                aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, already start stat");
            }
        }
        return jz5.f0.f384359a;
    }
}
