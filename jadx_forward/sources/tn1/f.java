package tn1;

/* loaded from: classes12.dex */
public class f extends kn1.a {

    /* renamed from: d, reason: collision with root package name */
    public static tn1.f f502350d;

    /* renamed from: b, reason: collision with root package name */
    public tn1.d f502351b;

    /* renamed from: c, reason: collision with root package name */
    public tn1.c f502352c;

    public static tn1.f f() {
        if (f502350d == null) {
            tn1.f fVar = new tn1.f();
            f502350d = fVar;
            kn1.a.a(fVar);
        }
        return f502350d;
    }

    @Override // kn1.a
    public void b() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        tn1.d dVar = this.f502351b;
        objArr[0] = java.lang.Integer.valueOf(dVar != null ? dVar.f502345o : -1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BackupStorageModel", "releaseBackupModel: uin=%s", objArr);
        f502350d = null;
    }

    public void c() {
        if (e().f502345o != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupStorageModel", "[backupInitStorage] backupStorage has already initialized");
            return;
        }
        gm0.j1.i();
        java.lang.String d17 = gm0.j1.u().d();
        int C = c01.d9.b().C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupStorageModel", "[backupInitStorage] accountPath=%s, uin=%d", d17, java.lang.Integer.valueOf(C));
        tn1.d e17 = e();
        e17.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(C);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupStorage", "setBackupStorage, accPath:%s, accUin:%d, caller:%s", d17, valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        e17.f502345o = C;
        e17.f502346p = d17;
        e17.f502344n = c01.d9.b().s();
        e17.f502331a = c01.d9.b().p();
        e17.f502332b = c01.d9.b().q();
        e17.f502334d = c01.d9.b().r();
        e17.f502333c = c01.d9.b().u();
        e17.f502337g = c01.d9.b().y();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        e17.f502335e = m11.b1.Di();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        e17.f502336f = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
        e17.f502339i = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        e17.f502338h = t21.o2.Ui();
        e17.f502340j = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai();
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        e17.f502341k = zo3.p.Ri();
        e17.f502342l = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
        c01.d9.b().getClass();
        gm0.j1.i();
        gm0.j1.b().c();
        e17.f502343m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
    }

    public tn1.c d() {
        if (this.f502352c == null) {
            this.f502352c = new tn1.c();
        }
        return this.f502352c;
    }

    public tn1.d e() {
        if (this.f502351b == null) {
            this.f502351b = new tn1.d();
        }
        return this.f502351b;
    }
}
