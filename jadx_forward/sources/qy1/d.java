package qy1;

/* loaded from: classes8.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f449255e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f449256d;

    static {
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(qy1.e.f449257v, "CgiReportLocalItemDataCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        f449255e = new java.lang.String[]{m145250x3fdc6f77};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, qy1.e.f449257v, "CgiReportLocalItemDataCache", dm.v1.f321982m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = qy1.e.f449257v;
        this.f449256d = db6;
    }

    public final int y0(java.util.List list) {
        int i17 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        l75.k0 k0Var = this.f449256d;
        long b17 = k0Var.b();
        try {
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (z0(((java.lang.Number) it.next()).longValue())) {
                        i17++;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiLocalDataStorage", "deleteByLocalId err info = " + e17);
            }
            return i17;
        } finally {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }

    public final boolean z0(long j17) {
        int i17;
        try {
            i17 = this.f449256d.mo70514xb06685ab("CgiReportLocalItemDataCache", "localItemReportId=?", new java.lang.String[]{"" + j17});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiLocalDataStorage", "cur localId = " + j17 + ", delete err info = " + e17);
            i17 = 0;
        }
        return i17 > 0;
    }
}
