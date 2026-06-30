package dg3;

/* loaded from: classes3.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f313861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f313862e;

    public h(dg3.k kVar, mf3.k kVar2) {
        this.f313861d = kVar;
        this.f313862e = kVar2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        dg3.k kVar = this.f313861d;
        cg3.a aVar = (cg3.a) kVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.H1(this.f313862e, kVar.f313865d, g4Var);
        }
    }
}
