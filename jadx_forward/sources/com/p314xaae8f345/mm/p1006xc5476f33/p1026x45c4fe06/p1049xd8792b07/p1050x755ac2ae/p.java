package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f159479d;

    public p(yz5.l lVar) {
        this.f159479d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        boolean z17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.List list = kz5.p0.f395529d;
        yz5.l lVar = this.f159479d;
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a;
            t91.a.f498100a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, data is null");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(list)));
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59.class.getClassLoader());
        java.util.List parcelableArrayList = bundle.getParcelableArrayList("List_MonitoredBluetoothDeviceInfo");
        if (parcelableArrayList != null) {
            list = parcelableArrayList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) obj2;
            if (c11858x835ced59.m50225x7b953cf2()) {
                z17 = true;
            } else {
                t91.a.f498100a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, deviceInfo: " + c11858x835ced59 + " is invalid");
                z17 = false;
            }
            if (z17) {
                arrayList.add(obj2);
            }
        }
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
    }
}
