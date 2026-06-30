package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes9.dex */
public final class j implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f290022d;

    public j(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f290022d = rVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r70.h hVar = (r70.h) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentImgForwardTask", "Image send result: " + hVar.f474642a + ", msgLocalId: " + hVar.f474644c + ", imgLocalId: " + hVar.f474645d);
        if (com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.i.f290016a[hVar.f474642a.ordinal()] == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentImgForwardTask", "Image sent successfully");
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f290022d;
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
            }
        }
        return jz5.f0.f384359a;
    }
}
