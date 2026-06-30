package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class i0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 f218952n;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.e0 e0Var) {
        this.f218952n = d0Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InitResourceTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        o("start");
        int i17 = 0;
        try {
            for (java.lang.String str : new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N("assets:///fts/fts_t2s.txt", 0, -1)).split("\n")) {
                java.lang.String[] split = str.split(",");
                o13.s.f423798k.put(split[0], split[1]);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.PluginFTS", e17, e17.getMessage(), new java.lang.Object[0]);
            this.f218952n.rj("LoadFTSPinYinFail");
        }
        o("t2s");
        try {
            java.lang.String[] split2 = new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N("assets:///fts/fts_py.txt", 0, -1)).split("\n");
            int i18 = 0;
            while (i18 < split2.length) {
                java.lang.String[] split3 = split2[i18].split(",");
                java.lang.String str2 = split3[i17];
                int length = split3.length - 1;
                java.lang.String[] strArr = new java.lang.String[length];
                int i19 = i17;
                while (i19 < length) {
                    int i27 = i19 + 1;
                    if (i27 < split3.length) {
                        strArr[i19] = split3[i27];
                    }
                    i19 = i27;
                }
                if (length > 0) {
                    int i28 = i17;
                    while (i28 < length) {
                        java.lang.String str3 = strArr[i28];
                        q13.b bVar = o13.s.f423797j;
                        if (bVar.f441216a.add(str3)) {
                            char[] charArray = str3.toLowerCase().toCharArray();
                            q13.c cVar = bVar.f441217b;
                            for (int i29 = i17; i29 < charArray.length; i29++) {
                                char c17 = charArray[i29];
                                int i37 = c17 - 'a';
                                q13.c[] cVarArr = cVar.f441218a;
                                if (cVarArr[i37] == null) {
                                    cVarArr[i37] = new q13.c(c17);
                                }
                                cVar = cVarArr[i37];
                            }
                            cVar.f441219b = true;
                        }
                        i28++;
                        i17 = 0;
                    }
                    o13.s.f423799l.put(str2, strArr);
                }
                i18++;
                i17 = 0;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.PluginFTS", e18, e18.getMessage(), new java.lang.Object[0]);
            this.f218952n.rj("LoadFTST2SFail");
        }
        o("py");
        o13.o oVar = o13.p.f423782b;
        gm0.j1.i();
        java.lang.String h17 = gm0.j1.u().h();
        com.p314xaae8f345.mm.vfs.z7 a17 = h17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(h17);
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17 == null ? new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("FTS5IndexMicroMsg_encrypt.db", false, false), null, null) : new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/FTS5IndexMicroMsg_encrypt.db", false, false), a17.f294813g, a17.f294814h), null);
        oVar.f423776a = ((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) / 1048576;
        oVar.f423777b = this.f218952n.f218914f.k(-301L, 0L);
        oVar.f423778c = this.f218952n.f218914f.k(-302L, 0L);
        oVar.f423780e = this.f218952n.f218914f.k(-303L, 0L);
        oVar.f423779d = this.f218952n.f218914f.k(-304L, 0L);
        long k17 = this.f218952n.f218914f.k(-300L, 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = o13.n.f423774a;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(k17);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (timeInMillis == calendar.getTimeInMillis()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "not need to report fts data");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeyFTSData %d %d %d %d %d", java.lang.Long.valueOf(oVar.f423776a), java.lang.Long.valueOf(oVar.f423777b), java.lang.Long.valueOf(oVar.f423778c), java.lang.Long.valueOf(oVar.f423780e), java.lang.Long.valueOf(oVar.f423779d));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            o13.p.a(arrayList, 729, 0, 1);
            if (oVar.f423776a > 1536) {
                o13.p.a(arrayList, 729, 1, 1);
            }
            if (oVar.f423777b >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                o13.p.a(arrayList, 729, 2, 1);
            }
            if (oVar.f423778c >= 5000) {
                o13.p.a(arrayList, 729, 3, 1);
            }
            if (oVar.f423780e >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                o13.p.a(arrayList, 729, 4, 1);
            }
            if (oVar.f423779d >= 1000000) {
                o13.p.a(arrayList, 729, 5, 1);
            }
            jx3.f.INSTANCE.b(arrayList, false);
            this.f218952n.f218914f.q(-300L, currentTimeMillis);
        }
        o("reportData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "ftsDBSize: %s mainEnDBPath:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(com.p314xaae8f345.mm.vfs.w6.k(gm0.j1.u().h() + "FTS5IndexMicroMsg_encrypt.db")), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(com.p314xaae8f345.mm.vfs.w6.k(gm0.j1.u().g())));
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{T2S: %d PY: %d}", java.lang.Integer.valueOf(o13.s.f423798k.size()), java.lang.Integer.valueOf(o13.s.f423799l.size()));
    }
}
