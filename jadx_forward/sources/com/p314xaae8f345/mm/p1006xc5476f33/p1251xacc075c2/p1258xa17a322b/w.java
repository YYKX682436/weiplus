package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes.dex */
public final class w implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f174454a;

    public w(yz5.p pVar) {
        this.f174454a = pVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y0
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[+] Create backup package complete, error = " + i17 + ", packageId = " + arrayList);
        long j17 = arrayList.isEmpty() ? -1L : (java.lang.Long) arrayList.get(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        this.f174454a.mo149xb9724478(valueOf, j17);
    }
}
