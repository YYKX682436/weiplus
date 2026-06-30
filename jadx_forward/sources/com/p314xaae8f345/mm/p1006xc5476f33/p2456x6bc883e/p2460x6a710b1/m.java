package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f270031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a f270032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 f270033f;

    public m(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072) {
        this.f270031d = j17;
        this.f270032e = aVar;
        this.f270033f = c19540x47e34072;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUtil", "bind service time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f270031d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = this.f270033f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar = this.f270032e;
        if (aVar != null) {
            aVar.a(c19540x47e34072);
        }
        c19540x47e34072.x();
    }
}
