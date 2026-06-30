package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 f159414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z f159415c;

    public g0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar) {
        this.f159413a = str;
        this.f159414b = c11858x835ced59;
        this.f159415c = zVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    public void a(int i17, java.lang.String str) {
        t91.a.f498100a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp fail, deviceId: " + this.f159413a + ", errCode: " + i17 + ", errMsg: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.v0.a(this.f159414b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m1.f159457m, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.f0(i17));
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159443i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar = this.f159415c;
        synchronized (obj) {
            ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159444j).remove(zVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a, this.f159415c.f159512a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p
    /* renamed from: onSuccess */
    public void mo50232xe05b4124(java.lang.String processName) {
        java.util.Set<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59> set;
        java.lang.String i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        t91.a.f498100a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp success, deviceId: " + this.f159413a);
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159443i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar = this.f159415c;
        synchronized (obj) {
            ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159446l).add(zVar);
            ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159444j).remove(zVar);
            set = (java.util.Set) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159445k).remove(zVar);
        }
        if (set != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar2 = this.f159415c;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 deviceInfo : set) {
                zVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17 = a17.c(zVar2.f159512a, zVar2.f159513b);
                if (c17 != null && (i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) a17.f(c17)).i()) != null) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(i17, deviceInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.y.f159509d, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159436b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = this.f159414b;
        synchronized (aVar) {
            ((android.util.ArraySet) aVar.f159397b).add(new android.util.Pair(c11858x835ced59, processName));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBleKeepAlive", "registerKeepAlive: " + c11858x835ced59 + " processName: " + processName);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.a(processName, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b(aVar, processName, c11858x835ced59));
    }
}
