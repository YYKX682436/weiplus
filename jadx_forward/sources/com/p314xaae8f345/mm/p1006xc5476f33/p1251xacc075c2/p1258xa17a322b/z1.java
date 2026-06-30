package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 f174502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f174504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f174505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 f174506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f174507i;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, qo1.j0 j0Var, po1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9, yz5.l lVar) {
        this.f174502d = y1Var;
        this.f174503e = gVar;
        this.f174504f = j0Var;
        this.f174505g = dVar;
        this.f174506h = c12853x6acde7c9;
        this.f174507i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String message;
        long j17;
        long j18;
        long j19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start report for pageAction=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = this.f174502d;
        sb6.append(y1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = y1Var.f174497d;
        c6839x89375b51.f141600e = y1Var.f174498e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174503e;
        po1.d dVar = this.f174505g;
        if (dVar == null) {
            if (gVar != null) {
                po1.c cVar = po1.d.f438827i;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
                dVar = cVar.a(uVar);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            str = dVar.f438828a;
            c6839x89375b51.f141602g = c6839x89375b51.b("ToDeviceID", str, true);
            int ordinal = dVar.f438829b.ordinal();
            if (ordinal == 0) {
                j19 = 2;
            } else if (ordinal == 1) {
                j19 = 3;
            } else if (ordinal == 2) {
                j19 = 5;
            } else if (ordinal == 3) {
                j19 = 1;
            } else {
                if (ordinal != 4) {
                    throw new jz5.j();
                }
                j19 = 0;
            }
            c6839x89375b51.f141601f = j19;
        } else {
            str = null;
        }
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174222f.get(str);
            if (nVar == null) {
                nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n.f174190d;
            }
            int ordinal2 = nVar.ordinal();
            if (ordinal2 == 0) {
                j18 = 0;
            } else if (ordinal2 == 1) {
                j18 = 1;
            } else if (ordinal2 == 2) {
                j18 = 2;
            } else {
                if (ordinal2 != 3) {
                    throw new jz5.j();
                }
                j18 = 3;
            }
            c6839x89375b51.A = j18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174506h;
        if (gVar != null) {
            c6839x89375b51.f141612q = gVar.f297362d;
            c6839x89375b51.f141604i = ((gVar.f297368m & 1) != 0) != false ? 1L : 0L;
            c6839x89375b51.f141619x = gVar.f297370o.f297371d;
            if (c12853x6acde7c9 == null) {
                po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = gVar.f297367i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
                c12853x6acde7c9 = aVar.a(iVar);
            }
        }
        if (c12853x6acde7c9 != null) {
            c6839x89375b51.f141613r = c12853x6acde7c9.f174263d == po1.b.f438822d ? 1 : 0;
            java.util.List list = c12853x6acde7c9.f174264e;
            c6839x89375b51.f141614s = list.size();
            java.util.List list2 = c12853x6acde7c9.f174265f;
            c6839x89375b51.f141615t = list2.size();
            po1.b bVar = c12853x6acde7c9.f174263d;
            c6839x89375b51.f141616u = bVar == po1.b.f438824f ? 1 : 0;
            long j27 = c12853x6acde7c9.f174266g;
            c6839x89375b51.f141617v = j27 > 0 ? 1 : 0;
            c6839x89375b51.C = j27;
            c6839x89375b51.D = c12853x6acde7c9.f174267h;
            int ordinal3 = bVar.ordinal();
            if (ordinal3 == 0) {
                j17 = 0;
            } else if (ordinal3 == 1) {
                j17 = ((list2.isEmpty() ^ true) && (list.isEmpty() ^ true)) ? 3L : list2.isEmpty() ^ true ? 2L : 1L;
            } else {
                if (ordinal3 != 2) {
                    throw new jz5.j();
                }
                j17 = 4;
            }
            c6839x89375b51.B = j17;
        }
        c6839x89375b51.f141618w = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.h(false).size();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i0 g17 = gVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().g(gVar.f297362d) : null;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        qo1.j0 j0Var = this.f174504f;
        if (j0Var == null) {
            j0Var = gVar != null ? qo1.j1.f447056a.d(gVar.f297362d) : null;
        }
        if (j0Var != null && (j0Var instanceof qo1.f0)) {
            if (y1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.C1) {
                linkedHashMap.put("errno", java.lang.Long.valueOf(((qo1.i0) ((qo1.f0) j0Var).d().f384367e).f447052d));
            }
            qo1.f0 f0Var = (qo1.f0) j0Var;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
            if (a2Var != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 a17 = a2Var.a();
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c17 = a2Var.c();
                c6839x89375b51.f141603h = c6839x89375b51.b("BackupSessionID", a17.f297435d, true);
                c6839x89375b51.f141620y = c17.f297483h;
                c6839x89375b51.f141621z = f0Var.f447022o;
                if (g17 != null) {
                    c6839x89375b51.f141608m = g17.f297382m;
                    c6839x89375b51.f141610o = g17.f297383n;
                    c6839x89375b51.f141605j = g17.f297380h;
                    c6839x89375b51.f141606k = g17.f297379g;
                    c6839x89375b51.f141609n = g17.f297384o;
                    c6839x89375b51.f141607l = g17.f297381i;
                    linkedHashMap.put("beginDuration", java.lang.Long.valueOf(g17.f297386q));
                    linkedHashMap.put("endDuration", java.lang.Long.valueOf(g17.f297387r));
                    linkedHashMap.put("fullDiffConvCount", java.lang.Long.valueOf(g17.f297389t));
                    linkedHashMap.put("limitedFullDiffConvCount", java.lang.Long.valueOf(g17.f297390u));
                    linkedHashMap.put("importingDuration", java.lang.Long.valueOf(g17.f297388s));
                    linkedHashMap.put("prevBackupTime", java.lang.Long.valueOf(gVar.f297370o.f297372e));
                    linkedHashMap.put("uploadMsgSize", java.lang.Long.valueOf(g17.f297391v));
                    linkedHashMap.put("uploadMediaSize", java.lang.Long.valueOf(g17.f297392w));
                    linkedHashMap.put("uploadIndexSize", java.lang.Long.valueOf(g17.f297393x));
                }
            }
            c6839x89375b51.f141611p = f0Var.f447009b.f297470d;
        }
        try {
            java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            message = r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamReport28098", e17, "json error", new java.lang.Object[0]);
            message = e17.getMessage();
        }
        c6839x89375b51.p(message);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "extraInfo = " + c6839x89375b51.E);
        c6839x89375b51.G = !((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui() ? 1 : 0;
        yz5.l lVar = this.f174507i;
        if (lVar != null) {
            lVar.mo146xb9724478(c6839x89375b51);
        }
        c6839x89375b51.k();
    }
}
