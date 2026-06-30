package a82;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f2037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f2041h;

    public i2(a82.h2 h2Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f2041h = h2Var;
        this.f2037d = m1Var;
        this.f2038e = i17;
        this.f2039f = i18;
        this.f2040g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.m1 m1Var = this.f2037d;
        if (m1Var.getType() == 401 && (m1Var instanceof o72.h5)) {
            a82.h2 h2Var = this.f2041h;
            h2Var.f2013f = false;
            o72.r2 r2Var = ((o72.h5) m1Var).f343346f;
            long j17 = r2Var.field_localId;
            ((java.util.HashMap) a82.h2.f2009i).remove(java.lang.Long.valueOf(j17));
            int i17 = this.f2038e;
            int i18 = this.f2039f;
            if ((i17 == 0 && i18 == 0) || i18 == -400) {
                ((java.util.HashSet) a82.h2.f2010m).add(java.lang.Long.valueOf(j17));
            }
            int i19 = this.f2038e;
            if ((i19 == 0 || i18 == -400) ? false : true) {
                a82.j1.f2045a.d(r2Var, false, i19, this.f2039f, this.f2040g);
                java.util.Map map = o72.v2.f343502a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10659, 0, java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(i18 == -401 ? -4 : i17 == 4 ? -2 : -1), java.lang.Long.valueOf(o72.x1.N(r2Var)), java.lang.Long.valueOf(o72.v2.a(r2Var.field_localId)));
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavSendService", "achieved retry limit, set error, localId:%d", java.lang.Long.valueOf(j17));
                if (r2Var.field_itemStatus == 12) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(14, r2Var.field_localId);
                }
                if (r2Var.field_itemStatus == 9) {
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(11, r2Var.field_localId);
                }
            }
            if (a82.h2.a(h2Var)) {
                return;
            }
            ((s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 2, new a82.h2$$a());
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
