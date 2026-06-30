package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class g3 extends p13.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h3 h3Var, p13.u request) {
        super(request);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchSettingTask";
    }

    @Override // p13.c
    public int k() {
        return 52;
    }

    @Override // p13.t
    public void p(p13.v ftsResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        p13.u uVar = this.f432668n;
        ftsResult.f432692d = p13.r.b(uVar.f432674c, true);
        ftsResult.f432693e = new java.util.ArrayList();
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        if (y1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTS5SearchSettingLogic", "ISettingSearchFeatureService is null");
            ftsResult.f432691c = -1;
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "start search!!!!!!");
            java.util.List<wd0.x1> b17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(p3325xe03a0797.p3326xc267989b.l.f(null, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f3(y1Var, ftsResult, null), 1, null));
            if (b17 != null && !b17.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (wd0.x1 x1Var : b17) {
                    if (!uVar.f432681j.contains(x1Var.f526314d)) {
                        arrayList.add(x1Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "All results filtered by blockSet");
                    ftsResult.f432691c = 0;
                    return;
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ftsResult.f432693e.add(r((wd0.x1) it.next()));
                }
                ftsResult.f432691c = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Search success, result count: " + ftsResult.f432693e.size());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "No setting search results");
            ftsResult.f432691c = 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTS5SearchSettingLogic", "Setting search error", e17);
            ftsResult.f432691c = -1;
        }
    }

    public final p13.y r(wd0.x1 settingResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingResult, "settingResult");
        p13.y yVar = new p13.y();
        yVar.f432717b = 786432;
        yVar.f432723h = settingResult.f526311a;
        yVar.f432720e = settingResult.f526314d;
        yVar.f432730o = settingResult;
        int ordinal = settingResult.f526316f.ordinal();
        if (ordinal == 0) {
            yVar.f432718c = 1;
            yVar.f432733r = 0;
        } else if (ordinal == 1) {
            yVar.f432718c = 1;
            yVar.f432733r = 1;
        } else if (ordinal == 2) {
            yVar.f432718c = 1;
            yVar.f432733r = 0;
        }
        yVar.f432721f = java.lang.System.currentTimeMillis();
        return yVar;
    }
}
