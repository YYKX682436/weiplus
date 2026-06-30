package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c f270046a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c c19548xc9500d9c) {
        this.f270046a = c19548xc9500d9c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgVersionUpdater", "check wepkg version, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f152244b.f152233a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 16L, 1L, false);
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.b(this, (r45.d30) fVar));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgVersionUpdater", "get checkwepkgversion error");
            }
        }
    }
}
