package fq3;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq3.n f347060d;

    public m(fq3.n nVar, fq3.j jVar) {
        this.f347060d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        java.util.Iterator it;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIORITY_DB_VERSION_INT;
        int i17 = 0;
        int r17 = c17.r(u3Var, 0);
        if (r17 != 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PluginPriority", "New DB FILE %d %d", java.lang.Integer.valueOf(r17), 7);
            gm0.j1.i();
            com.p314xaae8f345.mm.vfs.w6.h(new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o());
            gm0.j1.u().c().x(u3Var, 7);
        }
        fq3.n nVar = this.f347060d;
        gm0.j1.i();
        nVar.f347062n = new kq3.h(gm0.j1.u().h());
        fq3.n nVar2 = this.f347060d;
        nVar2.f347061m = nVar2.f347062n.e(16777217L, 0L);
        fq3.n nVar3 = this.f347060d;
        if (nVar3.f347061m == 0) {
            nVar3.f347061m = java.lang.System.currentTimeMillis();
            fq3.n nVar4 = this.f347060d;
            nVar4.f347062n.i(16777217L, nVar4.f347061m);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PluginPriority", "install priority time %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, this.f347060d.f347061m / 1000));
        fq3.n nVar5 = this.f347060d;
        nVar5.f347063o = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e(nVar5.f347062n);
        fq3.n nVar6 = this.f347060d;
        nVar6.f347064p = new nq3.f(nVar6.f347062n);
        fq3.n nVar7 = this.f347060d;
        nVar7.f347065q = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.f(nVar7.f347062n);
        fq3.n nVar8 = this.f347060d;
        nVar8.f347066r = new nq3.g(nVar8.f347062n);
        fq3.n nVar9 = this.f347060d;
        nVar9.f347067s = new mq3.d(nVar9.f347062n);
        fq3.n nVar10 = this.f347060d;
        nVar10.f347068t = new mq3.c(nVar10.f347062n);
        this.f347060d.f347069u = new kq3.l();
        fq3.n nVar11 = this.f347060d;
        nVar11.f347070v = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.d();
        nVar11.f347071w = new nq3.e();
        nVar11.f347073y = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c();
        fq3.n nVar12 = this.f347060d;
        nVar12.f347074z = new nq3.d();
        nVar12.f347072x = new mq3.b();
        sq3.e.f492893m.a();
        fq3.n nVar13 = this.f347060d;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(sq3.e.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(sq3.e.class);
        }
        nVar13.A = (sq3.b) ((sq3.e) a17).P6(sq3.b.class);
        sq3.b bVar = this.f347060d.A;
        bVar.getClass();
        p75.n0 n0Var = dm.n1.f320134u;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("Status", (java.lang.Integer) 1);
        p75.h1 j17 = n0Var.j(contentValues);
        j17.f434184c = dm.n1.f320138y.i(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadStorage", "c2c pre download update downloading msg count : " + j17.a().f(bVar.f274680g.Q4()));
        sq3.b bVar2 = this.f347060d.A;
        bVar2.getClass();
        long j18 = 1209600000;
        p75.m0 x17 = dm.n1.C.x(java.lang.Long.valueOf(c01.id.c() - 1209600000));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f434209a;
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        n75.b bVar3 = bVar2.f274680g;
        l75.k0 Q4 = bVar3.Q4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadStorage", "delete old pre download msg, res:" + (Q4 != null ? Q4.mo70514xb06685ab(table, b17, e17) : -1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadStorage", "vacuum old pre download msg, res:" + (Q4 != null ? java.lang.Boolean.valueOf(Q4.u()) : null));
        long c18 = c01.id.c() - 1209600000;
        p75.n0 n0Var2 = dm.o1.f320395g;
        n0Var2.getClass();
        p75.m0 x18 = dm.o1.f320396h.x(java.lang.Long.valueOf(c18));
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table2 = n0Var2.f434209a;
        p75.h hVar2 = (p75.h) x18;
        java.lang.String b18 = hVar2.b();
        java.lang.String[] e18 = hVar2.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table2, "table");
        l75.k0 Q42 = bVar3.Q4();
        if (Q42 != null) {
            Q42.mo70514xb06685ab(table2, b18, e18);
        }
        i95.m c19 = i95.n0.c(rq3.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        jm0.o oVar = (jm0.o) c19;
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a18 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(rq3.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        rq3.m mVar = (rq3.m) ((jm0.g) a18);
        long c27 = c01.id.c();
        if (java.lang.Math.abs(c27 - java.lang.System.currentTimeMillis()) > 3600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadMediaMoveFSC", "system time maybe error");
        } else {
            java.util.Iterator it6 = kz5.c0.i(1, 2, 3, 4).iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(mVar.T6(intValue)).G();
                if (G != null) {
                    int length = G.length;
                    int i18 = i17;
                    while (i18 < length) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = G[i18];
                        if (c27 - r6Var.B() > j18) {
                            r6Var.l();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete expired type ");
                            sb6.append(intValue);
                            sb6.append(": ");
                            sb6.append(r6Var.m82467xfb82e301());
                            sb6.append(",  ");
                            it = it6;
                            sb6.append(r6Var.B());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadMediaMoveFSC", sb6.toString());
                        } else {
                            it = it6;
                        }
                        i18++;
                        it6 = it;
                        i17 = 0;
                        j18 = 1209600000;
                    }
                }
            }
        }
        this.f347060d.B = new pq3.j();
        mo48813x58998cd();
        kq3.l lVar = this.f347060d.f347069u;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityTaskRunner", "start tick");
        kq3.k kVar = lVar.f392812b;
        if (kVar != null) {
            kVar.mo50307xb9e94560(2, 5000L);
        }
        kq3.k kVar2 = lVar.f392812b;
        if (kVar2 != null) {
            kVar2.mo50305x3d8a09a2(0);
        }
        long e19 = this.f347060d.f347062n.e(16777218L, -1L);
        long j19 = java.util.Calendar.getInstance().get(5);
        if (j19 != e19) {
            java.lang.String format = java.lang.String.format("%d,%d", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG, null), 0L)), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownloadMax"), 0)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityReportLogic", "report16341 %s", format);
            jx3.f.INSTANCE.mo68478xbd3cda5f(16341, format);
            this.f347060d.f347062n.i(16777218L, j19);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f347060d.C, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = this.f347060d.f347063o;
        eVar.getClass();
        eVar.f234715a.d(java.lang.String.format("DELETE FROM %s WHERE createtime < ?", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 7776000000L)});
        this.f347060d.f347069u.a(new tq3.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PluginPriority", "Init Priority Use Time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
