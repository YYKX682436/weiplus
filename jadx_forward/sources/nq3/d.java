package nq3;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0, zs3.t {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420525d = "";

    /* renamed from: e, reason: collision with root package name */
    public bt3.l0 f420526e;

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar.f68319xf604e54a.equals(this.f420525d)) {
            int i18 = yVar.f68328x10a0fed7;
            if (i18 == 2) {
                b(yVar, true);
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 3L, 1L, false);
            } else if (i18 == 3 || i18 == 4) {
                b(yVar, false);
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 5L, 1L, false);
            }
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
            this.f420525d = "";
            c();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "onSceneProgressEnd %s %s %s", this.f420525d, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
    }

    public boolean a() {
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return false;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(11);
        int i18 = calendar.get(12);
        return (i17 != 1 || i18 < 30) ? i17 >= 2 && i17 <= 6 : i18 >= (java.lang.Math.abs(gm0.j1.b().h()) % 30) + 30;
    }

    public final void b(zs3.y yVar, boolean z17) {
        if (1 == yVar.f68334x2262335f) {
            int i17 = yVar.f68321xf1ebe47b;
            if (i17 == 7 || i17 == 5) {
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(yVar.f68329x1209e7cb, java.lang.Long.valueOf(yVar.f68324xaca5bdda.split("@")[2]).longValue());
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(true, yVar.f68319xf604e54a, Li.I0(), z17, false, Li.Q0());
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "start to download next file");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        nVar.f347069u.a(new nq3.c(this, null));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.equals(this.f420526e) && this.f420525d.equals(java.lang.String.valueOf(this.f420526e.f105851m))) {
            gm0.j1.d().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
            this.f420525d = "";
            c();
            if (i17 == 0 && i18 == 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 2L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 4L, 1L, false);
            }
        }
    }
}
