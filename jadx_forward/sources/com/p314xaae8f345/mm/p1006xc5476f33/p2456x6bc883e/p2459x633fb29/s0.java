package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class s0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f270001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 f270002e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var, java.lang.String str, java.util.List list, boolean z17) {
        this.f270002e = p0Var;
        this.f269999b = str;
        this.f270000c = list;
        this.f270001d = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 abstractC19538xebb9e287) {
        java.lang.Object obj = this.f269927a;
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27;
        boolean z18 = this.f270001d;
        java.util.List list = this.f270000c;
        java.lang.String str = this.f269999b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var = this.f270002e;
        if (!z17 || !(abstractC19538xebb9e287 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "object instanceof  WepkgPreloadFile is false");
            p0Var.c(str, list, z18);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee c19541x2b0e01ee = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee) abstractC19538xebb9e287;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27) obj;
        if (c19541x2b0e01ee.f269893t != com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e.OK || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19541x2b0e01ee.f269892s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download, errCode:%s,  to loop", c19541x2b0e01ee.f269893t);
            p0Var.c(str, list, z18);
            return;
        }
        java.lang.String str2 = c19542xf3901c27.f269896e;
        java.lang.String str3 = c19542xf3901c27.f269899h;
        java.lang.String str4 = c19541x2b0e01ee.f269892s;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = 4002;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c272 = c19540x47e34072.f269880o;
        c19542xf3901c272.f269896e = str2;
        c19542xf3901c272.f269899h = str3;
        c19542xf3901c272.f269898g = str4;
        c19542xf3901c272.f269905q = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c19540x47e34072.z();
        } else {
            c19540x47e34072.s();
        }
        p0Var.c(str, list, z18);
    }
}
