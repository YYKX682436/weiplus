package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8;

/* loaded from: classes8.dex */
public abstract class f {
    public static void a(java.util.List list, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(list);
        b(hashSet, i17, -1, false);
    }

    public static void b(java.util.Set set, int i17, int i18, boolean z17) {
        if (set == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                stringBuffer.append(str);
                stringBuffer.append(";");
                r45.m40 m40Var = new r45.m40();
                m40Var.f461669d = str;
                m40Var.f461671f = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str);
                if (d17 == null) {
                    m40Var.f461670e = "";
                    linkedList.add(m40Var);
                } else {
                    m40Var.f461670e = d17.f269909f;
                    java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                    if (java.lang.Math.abs((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - d17.f269920t) + d17.f269913m) >= d17.f269913m) {
                        linkedList.add(m40Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
                        c19540x47e34072.f269876h = 3003;
                        c19540x47e34072.f269877i.f269907d = str;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.g0(c19540x47e34072));
                        } else {
                            c19540x47e34072.d();
                        }
                    } else {
                        stringBuffer2.append(str);
                        stringBuffer2.append(";");
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionUpdater", "All wepkg list[%s] to update, excluded wepkg list[%s], scene:%d, downloadTriggerType:%d, isReportSize:%b", stringBuffer.toString(), stringBuffer2.toString(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) || linkedList.size() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c c19548xc9500d9c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c();
        c19548xc9500d9c.f270038i = i18;
        c19548xc9500d9c.f270039m = z17;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.m40 m40Var2 = (r45.m40) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq wepkgCheckReq = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.C19548xc9500d9c.WepkgCheckReq(null);
            wepkgCheckReq.f270040d = m40Var2.f461669d;
            wepkgCheckReq.f270041e = m40Var2.f461670e;
            wepkgCheckReq.f270042f = m40Var2.f461671f;
            ((java.util.ArrayList) c19548xc9500d9c.f270037h).add(wepkgCheckReq);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.a(c19548xc9500d9c));
        } else {
            c19548xc9500d9c.d();
        }
    }
}
