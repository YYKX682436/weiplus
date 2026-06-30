package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.d f269932d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.d dVar) {
        this.f269932d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
        c19540x47e34072.f269876h = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c19540x47e34072.z();
        } else {
            c19540x47e34072.s();
        }
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda> list = c19540x47e34072.f269878m;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.d dVar = this.f269932d;
        if (L0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "no need to clean wepkg");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "need to clean list.size:%s", java.lang.Integer.valueOf(list.size()));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda : list) {
                if (c19543x781c5eda != null) {
                    dVar.f269943a.g(c19543x781c5eda.f269907d, 2, 8);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "start clean dirty wepkg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i iVar = dVar.f269943a;
        iVar.getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.c());
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null && G.length != 0) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2 != null) {
                    iVar.g(r6Var2.m82467xfb82e301(), 3, 9);
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long b17 = dVar.f269943a.b(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.c()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "local wepkg size: %d, cost time: %d", java.lang.Long.valueOf(b17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        wz4.f L02 = wz4.f.L0();
        if (L02.f532336d) {
            android.database.Cursor m145256x1d3f4980 = L02.m145256x1d3f4980(java.lang.String.format("select %s from %s order by %s asc", "pkgId", "WepkgVersion", "accessTime"), new java.lang.String[0]);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (m145256x1d3f4980 != null) {
                if (!m145256x1d3f4980.moveToFirst()) {
                    m145256x1d3f4980.close();
                }
                do {
                    java.lang.String string = m145256x1d3f4980.getString(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        arrayList2.add(string);
                    }
                } while (m145256x1d3f4980.moveToNext());
                m145256x1d3f4980.close();
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return;
        }
        while (b17 > 209715200 && arrayList.size() > 0) {
            java.lang.String str = (java.lang.String) arrayList.remove(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                dVar.f269943a.g(str, 2, 10);
                b17 = dVar.f269943a.b(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.c()));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg finish!");
    }
}
