package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f159824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p f159825d;

    public d(java.lang.String str, int i17, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar) {
        this.f159822a = str;
        this.f159823b = i17;
        this.f159824c = atomicBoolean;
        this.f159825d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindRemoteService onRemoteProcessDied(");
        java.lang.String str = this.f159822a;
        sb6.append(str);
        sb6.append("), id:");
        sb6.append(this.f159823b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHeadlessStartService", sb6.toString());
        if (!this.f159824c.getAndSet(true) && (pVar = this.f159825d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p.b(pVar, -5, null, 2, null);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(str, this);
    }
}
