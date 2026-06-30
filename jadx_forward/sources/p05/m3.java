package p05;

/* loaded from: classes5.dex */
public final class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.m3 f432154a = new p05.m3();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.v87 v87Var = (r45.v87) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "CgiWeVisGetModel: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            p05.p3 p3Var = p05.p3.f432172a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v87Var);
            p05.p3.f432175d = v87Var;
            p05.p3.f432172a.b().H("target_info", pm0.v.D(p05.p3.f432175d));
            java.util.LinkedList<r45.w87> NewConfigList = v87Var.f469526d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
            for (r45.w87 w87Var : NewConfigList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "resp: " + w87Var.f470504d + '.' + w87Var.f470505e + ", " + w87Var.f470506f + ", " + ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var.f470504d, w87Var.f470505e) + ", " + w87Var.f470507g);
            }
            java.util.LinkedList<r45.w87> NewConfigList2 = p05.p3.f432175d.f469526d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList2, "NewConfigList");
            for (r45.w87 w87Var2 : NewConfigList2) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(p05.a3.f431976e + '/' + w87Var2.f470504d + '.' + w87Var2.f470505e + '/' + w87Var2.f470507g)) {
                    java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(w87Var2.f470504d, w87Var2.f470505e);
                    if (Bi != null) {
                        java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var2.f470504d, w87Var2.f470505e);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w87Var2.f470506f, Ni)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "checkCopyResFile: get cached " + w87Var2.f470504d + '.' + w87Var2.f470505e + ", " + Bi);
                            p05.p3.f432172a.a(w87Var2.f470504d, w87Var2.f470505e, Bi);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeVisModelMgr", "checkCopyResFile: cached md5 mismatch res:" + Ni + ", config:" + w87Var2.f470506f);
                        }
                    }
                }
            }
            p05.p3 p3Var2 = p05.p3.f432172a;
            p3Var2.e();
            p3Var2.f();
            p3Var2.b().putLong("cgi_time", java.lang.System.currentTimeMillis());
            p05.m4.f432155a.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRes: [");
            java.util.LinkedList linkedList = p05.p3.f432176e;
            sb6.append(kz5.n0.g0(linkedList, null, null, null, 0, null, null, 63, null));
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", sb6.toString());
            if (!linkedList.isEmpty()) {
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.k0(linkedList));
            }
            p3Var2.d(86400000L);
            p05.a3 a3Var = p05.a3.f431972a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_wevision_model_delete_unused_enable_android, true)) {
                pm0.v.L("WeVisFileUtil_checkDeleteFile", true, p05.y2.f432270d);
            }
        } else if (i17 == 4) {
            p05.p3 p3Var3 = p05.p3.f432172a;
            p3Var3.b().putLong("cgi_time", java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982 c7133xa3508982 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7133xa3508982();
            if (tq5.i.f502802a == 0) {
                tq5.i.f502802a = 2014500;
            }
            c7133xa3508982.f144459d = tq5.i.f502802a;
            c7133xa3508982.f144464i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
            c7133xa3508982.f144462g = 10;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisionModelReporter", "reportCgiFailed: " + c7133xa3508982.n());
            c7133xa3508982.k();
            p3Var3.d(86400000L);
        } else {
            pm0.v.V(1800000L, p05.l3.f432119d);
        }
        return jz5.f0.f384359a;
    }
}
