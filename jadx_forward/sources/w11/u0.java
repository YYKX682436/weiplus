package w11;

/* loaded from: classes12.dex */
public class u0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523682d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f523683e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.cx4 f523684f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f523685g;

    public u0(r45.cx4 cx4Var) {
        this.f523684f = cx4Var;
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "MicroMsg.NetSceneSynCheck");
        this.f523685g = c4549xd1736fd9;
        c4549xd1736fd9.m40015x32c52b(3000L, "NetSceneSynCheck");
        boolean a17 = o45.ji.a();
        w11.b2 b2Var = w11.c2.f523524a;
        if (a17) {
            w11.s0 s0Var = new w11.s0();
            this.f523683e = s0Var;
            gm0.j1.i();
            if (gm0.j1.u() != null) {
                gm0.j1.i();
                if (gm0.j1.u().c() != null) {
                    gm0.j1.i();
                    long h17 = gm0.j1.b().h() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                    ((o45.fi) s0Var.mo47979x2d63726f()).f424459a = b2Var.a();
                    ((o45.fi) s0Var.mo47979x2d63726f()).f424462d = h17;
                    ((o45.fi) s0Var.mo47979x2d63726f()).f424460b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    ((o45.fi) s0Var.mo47979x2d63726f()).f424461c = o45.a.b();
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
            return;
        }
        w11.t0 t0Var = new w11.t0();
        this.f523683e = t0Var;
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null) {
                ((o45.gi) t0Var.mo47979x2d63726f()).f424468a = b2Var.a();
                o45.gi giVar = (o45.gi) t0Var.mo47979x2d63726f();
                gm0.j1.i();
                giVar.f424471d = gm0.j1.b().h();
                ((o45.gi) t0Var.mo47979x2d63726f()).f424469b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((o45.gi) t0Var.mo47979x2d63726f()).f424470c = o45.a.b();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getConfigStg() is null");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523682d = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f523683e, this);
        if (mo9409x10f9447a == -1) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = this.f523685g;
            if (c4549xd1736fd9.mo40012xf1a1864d()) {
                c4549xd1736fd9.mo40017xcdd95364();
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReturnTimeout */
    public long mo48003xd8232e5b() {
        return 240000L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 39;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (gm0.j1.a() && !gm0.m.r()) {
            if (o45.ji.a()) {
                o45.hi hiVar = (o45.hi) v0Var.mo13821x7f35c2d1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSynCheck", "synccheck3 syncCheck3 complete, selector=" + hiVar.f424480a);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(hiVar.f424480a, 2, hiVar.a(), this.f523684f);
            } else {
                o45.ii iiVar = (o45.ii) v0Var.mo13821x7f35c2d1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSynCheck", "new syncCheck complete, selector=" + iiVar.f424494a);
                byte[] bArr2 = ((o45.gi) v0Var.mo47979x2d63726f()).f424472e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSynCheck", "onGYNetEnd md5 is null");
                }
                iiVar.f424497d = bArr2;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(iiVar.f424494a, 2, iiVar.a(), this.f523684f);
            }
        }
        this.f523682d.mo815x76e0bfae(i18, i19, str, this);
        this.f523685g.mo40017xcdd95364();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}
