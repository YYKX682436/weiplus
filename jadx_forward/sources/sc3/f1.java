package sc3;

/* loaded from: classes7.dex */
public final class f1 implements yg.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487978a;

    public f1(sc3.k1 k1Var) {
        this.f487978a = k1Var;
    }

    @Override // yg.y
    public final void b(int i17) {
        sc3.k1 k1Var = this.f487978a;
        qc3.c H0 = k1Var.H0();
        pc3.c cVar = (pc3.c) k1Var.f488022u.get(java.lang.Integer.valueOf(i17));
        H0.c(i17, (cVar != null ? cVar.f434904e : null) != null);
    }
}
