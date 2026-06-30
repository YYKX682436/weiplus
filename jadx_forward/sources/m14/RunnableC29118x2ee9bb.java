package m14;

/* renamed from: m14.f$$a */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC29118x2ee9bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f404406d;

    public /* synthetic */ RunnableC29118x2ee9bb(m14.f fVar) {
        this.f404406d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m14.f fVar = this.f404406d;
        fVar.getClass();
        java.util.List q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        java.util.ArrayList arrayList = (java.util.ArrayList) q17;
        if (!arrayList.isEmpty()) {
            java.util.List e17 = c01.t1.e(q17);
            if (e17 != null) {
                int i17 = 0;
                while (true) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
                    if (i17 >= arrayList2.size()) {
                        break;
                    }
                    if (((java.lang.Boolean) arrayList2.get(i17)).booleanValue()) {
                        o25.s1 a17 = f14.g.a();
                        java.lang.String str = (java.lang.String) arrayList.get(i17);
                        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
                        com.p314xaae8f345.mm.p950x112e8cc1.f.d().b(str);
                    }
                    i17++;
                }
            }
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingChattingResetHelper", "doResetChatHistory >> delete history: %s", arrayList.get(i18));
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai((java.lang.String) arrayList.get(i18));
            }
        }
        ((hn.k0) ((vg3.i4) i95.n0.c(vg3.i4.class))).Ai();
        if (z65.c.a() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_sync_delete_message", "1").equals("1")) {
            m14.k kVar = new m14.k(fVar);
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = fVar.f404405d;
            java.util.Map map = c01.w9.f119072b;
            ((ku5.t0) ku5.t0.f394148d).a(new c01.RunnableC1366x6a761ff(kVar, c01.id.c(), c26987xeef691ab));
        } else {
            m14.l lVar = new m14.l(fVar);
            java.util.Map map2 = c01.w9.f119072b;
            long c17 = c01.id.c();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("LATEST_STORAGE_DATA", gm0.j1.b().h(), 1).putLong("latest_clean_chat_log_time", java.lang.System.currentTimeMillis());
            s75.d.b(new c01.ca(c17, lVar), "deleteAllMsg");
        }
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str2 = "" + (java.lang.System.currentTimeMillis() / 1000);
        ((ce0.e) jVar).getClass();
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p957x53236a1b.g1.f152859g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "enterSessionFunction %s %s %s", 9, "clearAllMsg", str2);
        if (com.p314xaae8f345.mm.p957x53236a1b.g1.H()) {
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(c01.z1.r(), 9, "clearAllMsg", str2));
        }
    }
}
