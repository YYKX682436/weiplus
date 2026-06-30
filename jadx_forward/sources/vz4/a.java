package vz4;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 abstractC19538xebb9e287) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = ((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072) abstractC19538xebb9e287).f269877i;
        if (c19543x781c5eda == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommJsLoader", "wepkgVersion is null");
            vz4.b.f523251a = null;
            return;
        }
        java.lang.String str = c19543x781c5eda.f269909f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommJsLoader", "version is null");
            vz4.b.f523251a = null;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar = vz4.b.f523251a;
        if (sVar == null || !str.equals(sVar.f269995d.f269909f)) {
            if (!c19543x781c5eda.f269923w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommJsLoader", "bigPackage is not ready");
                vz4.b.f523251a = null;
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.z.c(vz4.b.c(), c19543x781c5eda.f269909f, c19543x781c5eda.f269910g, c19543x781c5eda.f269916p, c19543x781c5eda.f269918r);
            if (c17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19543x781c5eda.f269910g) && com.p314xaae8f345.mm.vfs.w6.j(c19543x781c5eda.f269910g)) {
                vz4.b.f523251a = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s(c19543x781c5eda, c17, (java.util.Map) null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommJsLoader", "path not exist");
                vz4.b.f523251a = null;
            }
        }
    }
}
