package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u f276849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276850e;

    public t(com.p314xaae8f345.mm.p2621x8fb0427b.u uVar, int i17) {
        this.f276849d = uVar;
        this.f276850e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.u uVar = this.f276849d;
        uVar.y0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (int i17 = 0; i17 < this.f276850e; i17++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.r rVar = new com.p314xaae8f345.mm.p2621x8fb0427b.r();
            long j17 = i17 + currentTimeMillis;
            rVar.f68529x4b6e3897 = java.lang.String.valueOf(j17);
            rVar.f68531x297eb4f7 = j17;
            rVar.f68530xc6808d16 = currentTimeMillis;
            uVar.z0(rVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "mockExposeAdCount traceId=" + rVar.f68529x4b6e3897);
        }
    }
}
