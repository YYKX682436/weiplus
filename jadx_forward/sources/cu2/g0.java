package cu2;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.g0 f303937a = new cu2.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f303938b = new java.util.concurrent.ConcurrentHashMap();

    public final int a(long j17) {
        f303938b.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0 bb0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).mo141623x754a37bb();
        p75.m0 i17 = dm.b4.f317372h.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var = dm.b4.f317371g;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        p75.h hVar = (p75.h) i17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        java.lang.String table = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 k0Var = bb0Var.f208052d;
        if (k0Var != null) {
            return k0Var.mo70514xb06685ab(table, b17, e17);
        }
        return -1;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 b(long j17) {
        if (j17 == 0) {
            return null;
        }
        android.database.Cursor m145256x1d3f4980 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).mo141623x754a37bb()).m145256x1d3f4980("SELECT rowid, * FROM FinderCourseInfo WHERE topic_id = " + j17, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                if (m145256x1d3f4980.moveToNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 ak0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0();
                    ak0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                    vz5.b.a(m145256x1d3f4980, null);
                    return ak0Var;
                }
                vz5.b.a(m145256x1d3f4980, null);
            } finally {
            }
        }
        return null;
    }

    public final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 paidCollectionInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paidCollectionInfo, "paidCollectionInfo");
        f303938b.remove(java.lang.Long.valueOf(paidCollectionInfo.f65975xe4b3ebd0));
        boolean mo11260x413cb2b4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).mo141623x754a37bb()).mo11260x413cb2b4(paidCollectionInfo);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionLogic", "replaceCollection:new course id=" + paidCollectionInfo.f65975xe4b3ebd0 + " success=" + mo11260x413cb2b4);
        return mo11260x413cb2b4;
    }

    public final nr2.m d(r45.uz0 courseInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(courseInfo, "courseInfo");
        r45.do2 do2Var = new r45.do2();
        do2Var.set(0, courseInfo);
        return new nr2.m(do2Var);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 e(r45.uz0 courseInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(courseInfo, "courseInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 ak0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0();
        ak0Var.f65975xe4b3ebd0 = courseInfo.m75942xfb822ef2(0);
        ak0Var.f65973x4d9967ce = courseInfo;
        ak0Var.f65974x9255f2b0 = new r45.n11();
        return ak0Var;
    }
}
