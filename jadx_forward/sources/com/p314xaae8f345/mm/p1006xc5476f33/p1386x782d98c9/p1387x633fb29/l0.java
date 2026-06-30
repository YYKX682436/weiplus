package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180498d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f180499e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180500f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180501g;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 o0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f180498d = str;
        this.f180499e = str2;
        this.f180500f = str3;
        this.f180501g = str4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = this.f180499e;
        if (str3 != null) {
            str3.equals(str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void V0(java.lang.String str, int i17, long j17) {
        java.lang.String str2 = this.f180499e;
        if (str2 == null || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, mac(%s) is null or not correct.(mac : %s, state : %s, type : %s)", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "mac(%s), connectState(%s), profileType(%s)", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        java.lang.String str3 = this.f180501g;
        java.lang.String str4 = this.f180500f;
        java.lang.String str5 = this.f180498d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str5, str4, 0, str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device state none.(mac : %s)", str);
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device is connectiong.(mac: %s)", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str5, str4, 1, str3);
            return;
        }
        if (i17 != 2) {
            if (i17 != 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str5, str4, -1, str3);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str5, str4, 4, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device disconnected.(mac : %s)", str);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device connected now start send data to it.(mac : %s)", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(str5, str4, 2, str3);
        iq1.i iVar = new iq1.i();
        iVar.f375201e = iq1.i.f375229m;
        iVar.f375202f = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().g(str2, iVar.c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
        java.lang.String str2 = this.f180499e;
        if (str2 == null || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onRecvFromDevice, mac(%s) is null or not correct.(mac : %s, succ : %s)", str2, str, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (!z17 || bArr == null) {
            return;
        }
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().h(str2, this.f180498d, bArr)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceEventManager", "The parser isn't a correct type.");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "Read data from bytes failed.");
        }
    }
}
