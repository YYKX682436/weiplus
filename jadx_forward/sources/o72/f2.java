package o72;

/* loaded from: classes12.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.i2 f424866d;

    public f2(o72.i2 i2Var) {
        this.f424866d = i2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.i2 i2Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().di();
        this.f424866d.f424889d = java.lang.System.currentTimeMillis();
        o72.i2 i2Var2 = this.f424866d;
        long j17 = i2Var2.f424889d;
        long j18 = i2Var2.f424888c;
        o72.i2 i2Var3 = this.f424866d;
        i2Var3.f424889d = -1L;
        i2Var3.f424888c = -1L;
        synchronized (i2Var3.f424890e) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN, java.lang.Boolean.TRUE);
            i2Var = this.f424866d;
            i2Var.f424886a = false;
        }
        i2Var.f424892g.mo50305x3d8a09a2(0);
    }
}
