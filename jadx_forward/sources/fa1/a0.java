package fa1;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f342203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f342204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 f342205f;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.C11874x3ec834d0 c11874x3ec834d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, long j17) {
        this.f342205f = c11874x3ec834d0;
        this.f342203d = tVar;
        this.f342204e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar = this.f342203d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var2 != null) {
            this.f342205f.m50345x7190a28f(this.f342204e, l0Var2.L(), l0Var2.G(), l0Var2.z(), 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0.class);
        if (j0Var == null || (x07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) j0Var).x0(2)) == null || (l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) x07.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class)) == null) {
            return;
        }
        this.f342205f.m50345x7190a28f(this.f342204e, 0L, l0Var.G(), 0L, 1);
    }
}
