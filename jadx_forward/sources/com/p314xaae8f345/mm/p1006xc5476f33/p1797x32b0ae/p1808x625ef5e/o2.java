package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class o2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private o2() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        long j17 = bundle.getLong("timeout");
        int i17 = bundle.getInt("from");
        boolean z17 = bundle.getBoolean("syncCheckUpdate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().p();
        if (j17 <= 0) {
            j17 = 20000;
        }
        long j18 = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp appId:%s", string);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(string, null);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().H(y17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().m(string, y17, z17, i17, j18, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.l2(this, rVar))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "appId: %s, not need to checkUpdate.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225484e).get(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "begin to check appId: %s", string);
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        if (l17) {
            if (!((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225485f).contains(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", string);
                ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).aj(string, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.class.getName());
                ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225485f).add(string);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c(string);
            qVar.f299082f = new java.util.LinkedList(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.m65743xfeb0e170());
            qVar.f299083g[3] = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(string);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().M(arrayList, "ilink", false);
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
            return;
        }
        java.lang.String str2 = "";
        if (java.util.Arrays.asList(j62.e.g().a("clicfg_liteapp_use_raven_list", "", true, true).split(",")).contains(string) || l17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (y17 != null) {
                arrayList2.add(new e70.v(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, y17.f14362x26947355));
            }
            e70.w wVar = new e70.w(string, null, arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(string);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().M(arrayList3, "ilink", false);
            ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(wVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.m2(this, k2Var, y17, string));
            return;
        }
        if (y17 != null && (str = y17.f14368xd0d13783) != null && !str.isEmpty()) {
            str2 = y17.f14368xd0d13783;
        }
        oq1.r rVar2 = new oq1.r();
        rVar2.f428901a = string;
        rVar2.f428902b = string;
        rVar2.f428903c = str2;
        if (y17 == null || z17) {
            rVar2.f428904d = 1;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().M(arrayList4, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55702xce94d634, false);
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).wi(rVar2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.n2(this, k2Var, string, y17));
    }
}
