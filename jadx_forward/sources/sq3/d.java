package sq3;

/* loaded from: classes4.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PREDOWNLOAD_CHECK_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        java.lang.String str = gm0.j1.u().h() + "PreDownloadCheck.db";
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m17, 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreDownloadCheckDB", "diff version, delete old db;");
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(sq3.e.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(sq3.e.class);
        }
        if (((sq3.e) a17).O6(str)) {
            gm0.j1.u().c().x(u3Var, 2);
        }
    }
}
