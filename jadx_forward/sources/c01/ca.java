package c01;

/* loaded from: classes11.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f118623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.da f118624e;

    public ca(long j17, c01.da daVar) {
        this.f118623d = j17;
        this.f118624e = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(1333L, 0L, 1L, true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) ((c01.j8) i95.n0.c(c01.j8.class))).wi();
        com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        long j17 = this.f118623d;
        x4Var.u0("", j17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().l();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84().e();
        c01.da daVar = this.f118624e;
        if (daVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new c01.ba(this));
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "Delete all messages, synchronized part, time: %d ms", java.lang.Long.valueOf(currentTimeMillis2));
        fVar.mo68477x336bdfd8(1333L, 6L, currentTimeMillis2 / 1000, true);
        if (daVar == null || !daVar.a()) {
            c01.w9.c();
            if (daVar == null || !daVar.a()) {
                c01.w9.d();
                if (daVar == null || !daVar.a()) {
                    java.util.List u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().u1("bottlemessage");
                    if (u17 != null) {
                        for (int i17 = 0; i17 < u17.size(); i17++) {
                            c01.w9.e((com.p314xaae8f345.mm.p2621x8fb0427b.f9) u17.get(i17), true);
                        }
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z0("bottlemessage");
                    if (daVar == null || !daVar.a()) {
                        c01.w9.b(j17, 1);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0("", 0L);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "Delete all messages, asynchronous part, time: %d ms", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) - currentTimeMillis2));
                    }
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m13790x9616526c() {
        return super.toString() + "|deleteAllMsg";
    }
}
