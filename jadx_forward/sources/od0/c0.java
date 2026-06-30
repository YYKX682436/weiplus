package od0;

/* loaded from: classes8.dex */
public class c0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426065d;

    public c0(od0.v vVar, int i17) {
        this.f426065d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19 = this.f426065d;
        if (i17 == 0 && i18 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "cgireport succ, ctx: %d, stack: %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            jx3.f.INSTANCE.mo68477x336bdfd8(416L, 1L, 1L, false);
            return 0;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SecInfoReporterImpl", "cgireport failed, ctx: %d, err: %d:%d %s, stack: %s", valueOf2, valueOf3, valueOf4, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        jx3.f.INSTANCE.mo68477x336bdfd8(416L, 2L, 1L, false);
        return 0;
    }
}
