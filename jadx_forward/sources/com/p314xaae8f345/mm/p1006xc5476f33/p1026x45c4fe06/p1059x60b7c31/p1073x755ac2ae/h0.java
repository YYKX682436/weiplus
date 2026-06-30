package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    public static final int f33958x366c91de = 1090;

    /* renamed from: NAME */
    public static final java.lang.String f33959x24728b = "onMonitoredBluetoothDeviceFound";

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 f161606i;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 deviceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        this.f161606i = deviceInfo;
        java.lang.String str = deviceInfo.f65990x28d45f97;
        java.lang.String str2 = deviceInfo.f65991x19e082da;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "<init>#OnMonitoredBluetoothDeviceFoundEvent, appId: " + str + ", deviceId: " + str2);
        s("bluetoothDeviceId", str2);
    }

    public final void u(yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = this.f161606i;
        java.lang.String str = c11858x835ced59.f65990x28d45f97;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = b17 != null ? b17.C0() : null;
        if (C0 != null && true == C0.s(f33959x24728b)) {
            p(C0);
            m();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.v0.a(c11858x835ced59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m1.f159458n, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.c0(C0));
            if (lVar != null) {
                lVar.mo146xb9724478(C0);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchWhenReady, dispatchWhenRuntimeReady, appService exists: ");
        sb6.append(C0 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b0(this, lVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        if (b18 != null) {
            b18.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e0(b0Var, b18));
            o6Var = b18;
        }
        if (o6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.d0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g0(str, b0Var), str));
        }
    }
}
