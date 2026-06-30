package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public enum p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.k {
    INSTANCE;

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7073x1992e4f7 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.j jVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7073x1992e4f7 c7073x1992e4f7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7073x1992e4f7();
        c7073x1992e4f7.f143807d = c7073x1992e4f7.b("AppId", jVar.f169031a, true);
        c7073x1992e4f7.f143808e = c7073x1992e4f7.b("PagePath", jVar.f169032b, true);
        c7073x1992e4f7.f143809f = c7073x1992e4f7.b("VideoUrl", jVar.f169033c, true);
        return c7073x1992e4f7;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.n nVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7073x1992e4f7 a17 = a(jVar);
        int ordinal = nVar.ordinal();
        int i17 = 1;
        int i18 = ordinal != 0 ? ordinal != 1 ? 6 : 5 : 4;
        a17.f143810g = i18;
        if (6 == i18) {
            int ordinal2 = nVar.ordinal();
            if (ordinal2 != 2) {
                i17 = 3;
                if (ordinal2 == 3) {
                    i17 = 2;
                } else if (ordinal2 != 4) {
                    i17 = ordinal2 != 5 ? 0 : 4;
                }
            }
            a17.f143811h = i17;
        }
        a17.k();
    }
}
