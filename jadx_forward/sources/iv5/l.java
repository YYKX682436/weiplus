package iv5;

/* loaded from: classes16.dex */
public class l extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376697d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376698e;

    public l(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376697d = null;
        this.f376698e = null;
        av5.n0 n0Var = yVar2.f95995a.f95965i;
        this.f376697d = n0Var;
        this.f376698e = yVar2.d(n0Var);
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.h0 h0Var = (av5.h0) comparable;
        fVar.getClass();
        int ordinal = h0Var.f95914e.ordinal();
        boolean z17 = true;
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
            z17 = false;
        }
        int i17 = h0Var.f95916g;
        return new av5.h0(h0Var.f95950d, h0Var.f95914e, h0Var.f95915f, z17 ? fVar.b(i17) : fVar.c(i17), h0Var.f95917h);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95965i;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f394315w.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.n();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f394299g.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.h0 h0Var = (av5.h0) comparable;
        this.f376697d.f95953f++;
        av5.u uVar = this.f376698e;
        int position = uVar.f106295a.position();
        uVar.z(h0Var.f95914e.f95909d);
        uVar.z(h0Var.f95915f);
        uVar.z(h0Var.f95916g);
        uVar.z(h0Var.f95917h);
        return position;
    }
}
