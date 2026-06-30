package vz4;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vz4.d0 f523262a = new vz4.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f523263b = new java.lang.Object();

    public static final void a(vz4.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda, java.lang.String str, java.lang.String str2) {
        d0Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19543x781c5eda.f269910g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "wepkg pkgPath is empty");
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c19543x781c5eda.f269910g);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "wepkg file not exists");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o(r6Var);
        if (oVar.f269980b) {
            java.util.Iterator it = oVar.c().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.k) it.next();
                if (kVar.f269964a.equals(str)) {
                    if (str2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgUpdateManager", "patchId is null");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.j.a(kVar);
                    } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, kVar.f269966c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgUpdateManager", "patchId does not match");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.j.a(kVar);
                    }
                }
            }
        }
    }

    public static final void b(java.lang.String str, java.lang.String str2, long j17, boolean z17, vz4.j callBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str);
                r45.m40 m40Var = new r45.m40();
                m40Var.f461669d = str;
                java.lang.String str3 = "";
                if (!z17) {
                    java.lang.String str4 = d17 != null ? d17.f269909f : null;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                m40Var.f461670e = str3;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                r45.c30 c30Var = new r45.c30();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(m40Var);
                c30Var.f452786d = linkedList;
                lVar.f152197a = c30Var;
                lVar.f152198b = new r45.d30();
                lVar.f152199c = "/cgi-bin/mmgame-bin/checkwepkgversion";
                lVar.f152200d = 1313;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                ((ku5.t0) ku5.t0.f394148d).l(new vz4.y(c0Var, str, str2, callBack), 1000 * j17, "MicroMsg.WePkgUpdateManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.k.c(a17, new vz4.c0(str, str2, c0Var, callBack, z17, d17, j17));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg , pkgId = " + str + " appId = " + str2);
        callBack.a("pkgId or appId isNullOrEmpty");
    }
}
