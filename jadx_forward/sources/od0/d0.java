package od0;

/* loaded from: classes8.dex */
public class d0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {
    public d0(od0.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "cgireport succ, stack: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            jx3.f.INSTANCE.mo68477x336bdfd8(416L, 4L, 1L, false);
            return 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SecInfoReporterImpl", "cgireport failed, err: %d:%d %s, stack: %s", valueOf, valueOf2, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        jx3.f.INSTANCE.mo68477x336bdfd8(416L, 5L, 1L, false);
        return 0;
    }
}
