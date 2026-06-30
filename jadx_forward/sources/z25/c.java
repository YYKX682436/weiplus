package z25;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z25.f f551307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z25.d f551308e;

    public c(z25.d dVar, z25.f fVar) {
        this.f551308e = dVar;
        this.f551307d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1431, 0);
        z25.f fVar = this.f551307d;
        int i17 = fVar.f551324b;
        if (i17 == 1) {
            g0Var.A(1431, 3);
        } else if (i17 == 2) {
            g0Var.A(1431, 6);
        } else if (i17 == 3) {
            g0Var.A(1431, 9);
        }
        z25.d dVar = this.f551308e;
        dVar.f551310b = fVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.f551333k = java.lang.System.currentTimeMillis();
        dVar.e(3);
    }

    /* renamed from: toString */
    public java.lang.String m178341x9616526c() {
        return super.toString() + "|addUploadTask";
    }
}
