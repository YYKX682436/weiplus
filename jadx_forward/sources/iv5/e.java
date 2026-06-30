package iv5;

/* loaded from: classes16.dex */
public class e extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376680d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376681e;

    public e(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376680d = null;
        this.f376681e = null;
        av5.n0 n0Var = yVar2.f95995a.f95964h;
        this.f376680d = n0Var;
        this.f376681e = yVar2.d(n0Var);
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.e eVar = (av5.e) comparable;
        fVar.getClass();
        int i17 = eVar.f95899e;
        kv5.i iVar = (kv5.i) fVar;
        fv5.b bVar = iVar.f394305m;
        int d17 = bVar.d(i17);
        if (d17 >= 0) {
            i17 = bVar.f348555e[d17];
        } else if (i17 >= 0 && iVar.C.a(i17)) {
            i17 = -1;
        }
        return new av5.e(eVar.f95950d, i17);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95964h;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f394314v.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return new av5.e(bVar.f106295a.position(), bVar.m());
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f394298f.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        this.f376680d.f95953f++;
        av5.u uVar = this.f376681e;
        int position = uVar.f106295a.position();
        uVar.w(((av5.e) comparable).f95899e);
        return position;
    }
}
