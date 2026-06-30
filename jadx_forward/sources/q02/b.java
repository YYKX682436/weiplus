package q02;

/* loaded from: classes4.dex */
public abstract class b {
    public static java.util.LinkedList a() {
        java.util.LinkedList linkedList = null;
        if (b() == null) {
            return null;
        }
        q02.c b17 = b();
        b17.getClass();
        android.database.Cursor m145256x1d3f4980 = b17.m145256x1d3f4980(java.lang.String.format("select * from %s order by %s desc", "DownloadTaskItem", "modifyTime"), new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            linkedList = new java.util.LinkedList();
            while (m145256x1d3f4980.moveToNext()) {
                q02.a aVar = new q02.a();
                aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                linkedList.add(aVar);
            }
            m145256x1d3f4980.close();
        }
        return linkedList;
    }

    public static q02.c b() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadTaskItemDbHelp", "service not ready");
                    return null;
                }
                l02.t tVar = (l02.t) ((m02.t) i95.n0.c(m02.t.class));
                if (tVar.f396371d == null) {
                    synchronized (tVar) {
                        if (tVar.f396371d == null) {
                            tVar.f396371d = new q02.c(gm0.j1.u().f354686f);
                        }
                    }
                }
                return tVar.f396371d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadTaskItemDbHelp", "no user login");
        return null;
    }

    public static boolean c(java.lang.String str, int i17) {
        if (b() == null) {
            return false;
        }
        q02.a aVar = new q02.a();
        aVar.f67416x28d45f97 = str;
        aVar.f67418x10a0fed7 = i17;
        aVar.f67417x15b870c = java.lang.System.currentTimeMillis();
        return b().mo9952xce0038c9(aVar, new java.lang.String[0]);
    }
}
