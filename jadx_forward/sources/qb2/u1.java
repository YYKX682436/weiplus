package qb2;

/* loaded from: classes8.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qb2.u1 f442833a = new qb2.u1();

    public final boolean a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.mo145255x88e404c3() + " WHERE type = " + i17;
        boolean m145253xb158737d = jk6.m145253xb158737d(jk6.mo145255x88e404c3(), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewXmlDataLogic", "clearAll sql: " + str + ", success: " + m145253xb158737d);
        return m145253xb158737d;
    }

    public final boolean b(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.mo145255x88e404c3() + " WHERE type = " + i17 + " AND createTime < " + j17;
        boolean m145253xb158737d = jk6.m145253xb158737d(jk6.mo145255x88e404c3(), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewXmlDataLogic", "clearBeforeTime sql: " + str + ", success: " + m145253xb158737d);
        return m145253xb158737d;
    }

    public final java.util.List c(int i17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "SELECT * FROM " + jk6.mo145255x88e404c3() + " WHERE type = " + i17 + " ORDER BY createTime ASC";
        android.database.Cursor m145256x1d3f4980 = jk6.m145256x1d3f4980(str, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            linkedList = new java.util.LinkedList();
            while (m145256x1d3f4980.moveToNext()) {
                try {
                    l75.f0 f0Var = (l75.f0) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.zj0.class.newInstance();
                    f0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                    linkedList.add(f0Var);
                } finally {
                }
            }
            vz5.b.a(m145256x1d3f4980, null);
        } else {
            linkedList = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewXmlDataLogic", "queryAll sql: " + str + ", size: " + linkedList.size());
        return linkedList;
    }

    public final boolean d(java.lang.String localId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.mo145255x88e404c3() + " WHERE localId = " + localId;
        boolean m145253xb158737d = jk6.m145253xb158737d(jk6.mo145255x88e404c3(), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewXmlDataLogic", "removeById sql: " + str + ", success: " + m145253xb158737d);
        return m145253xb158737d;
    }
}
