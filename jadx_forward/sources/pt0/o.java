package pt0;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pt0.o f439749a = new pt0.o();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f439750b = jz5.h.b(pt0.n.f439748d);

    public final boolean a(java.lang.String str) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f439750b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).getBoolean(str + "_migrated_3", false);
    }

    public final void b(java.lang.String tableName, boolean z17, long j17, java.lang.Long l17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.IDataCleanService", "setDataCleanResult, tableName " + tableName + ", cleanDone: " + z17 + ", timeCost: " + j17 + ", indexTimeCost: " + l17 + ", cleanCount: " + j18);
        java.lang.Object mo141623x754a37bb = ((jz5.n) f439750b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).putBoolean(tableName.concat("_migrated_3"), z17);
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("db_dataclean_succeed");
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.r(tableName);
            long j19 = 1000;
            c6754x4f2fd58c.f140818n = (int) (j17 / j19);
            if (l17 != null) {
                l17.longValue();
                c6754x4f2fd58c.f140819o = (int) (l17.longValue() / j19);
            }
            c6754x4f2fd58c.f140820p = (int) j18;
            c6754x4f2fd58c.k();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c2.p("db_dataclean_failed");
        c6754x4f2fd58c2.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6754x4f2fd58c2.r(tableName);
        long j27 = 1000;
        c6754x4f2fd58c2.f140818n = (int) (j17 / j27);
        if (l17 != null) {
            l17.longValue();
            c6754x4f2fd58c2.f140819o = (int) (l17.longValue() / j27);
        }
        c6754x4f2fd58c2.f140820p = (int) j18;
        c6754x4f2fd58c2.k();
    }
}
