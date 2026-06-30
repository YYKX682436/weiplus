package iv5;

/* loaded from: classes16.dex */
public class k extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376695d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376696e;

    public k(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376695d = null;
        this.f376696e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95961e;
            this.f376695d = n0Var;
            this.f376696e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.e0 e0Var = (av5.e0) comparable;
        fVar.getClass();
        return new av5.e0(e0Var.f95950d, fVar.g(e0Var.f95900e), fVar.g(e0Var.f95901f), fVar.f(e0Var.f95902g));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95961e;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f394312t.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.l();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f394296d.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.e0 e0Var = (av5.e0) comparable;
        this.f376695d.f95953f++;
        av5.u uVar = this.f376696e;
        uVar.A(uVar.f95990f.f95995a.f95961e, true);
        int position = uVar.f106295a.position();
        uVar.z(e0Var.f95900e);
        uVar.z(e0Var.f95901f);
        uVar.w(e0Var.f95902g);
        return position;
    }
}
