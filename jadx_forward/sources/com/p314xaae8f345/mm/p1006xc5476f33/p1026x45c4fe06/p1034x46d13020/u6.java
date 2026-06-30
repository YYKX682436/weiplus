package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class u6 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 f158115d;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 v6Var) {
        this.f158115d = v6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6 q6Var;
        java.util.List list;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaDesktopEntranceShowLogic", "CGI[getwxadesktopentrance] errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && fVar != null && (fVar instanceof r45.vs3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 v6Var = this.f158115d;
            java.util.LinkedList<r45.fl0> entrance_info = ((r45.vs3) fVar).f470040e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrance_info, "entrance_info");
            synchronized (v6Var.f158135a) {
                for (r45.fl0 fl0Var : entrance_info) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p6 p6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6.f158078d;
                    int i19 = fl0Var.f455951d;
                    p6Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6[] m49814xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q6.m49814xcee59d22();
                    int length = m49814xcee59d22.length;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= length) {
                            q6Var = null;
                            break;
                        }
                        q6Var = m49814xcee59d22[i27];
                        if (i19 == q6Var.ordinal()) {
                            break;
                        }
                        i27++;
                    }
                    if (q6Var != null && (list = (java.util.List) ((java.util.LinkedHashMap) v6Var.f158135a).get(q6Var)) != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6) it.next()).a(fl0Var);
                        }
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaDesktopEntranceShowLogic", "refresh() cgi return errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        return 0;
    }
}
