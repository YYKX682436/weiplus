package iv5;

/* loaded from: classes16.dex */
public class n extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376701d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376702e;

    public n(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376701d = null;
        this.f376702e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95960d;
            this.f376701d = n0Var;
            this.f376702e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.k0 k0Var = (av5.k0) comparable;
        fVar.getClass();
        int f17 = fVar.f(k0Var.f95936e);
        int g17 = fVar.g(k0Var.f95937f);
        kv5.i iVar = (kv5.i) fVar;
        fv5.b bVar = iVar.f394300h;
        int i17 = k0Var.f95938g;
        int d17 = bVar.d(i17);
        if (d17 >= 0) {
            i17 = bVar.f348555e[d17];
        } else if (i17 >= 0 && iVar.f394316x.a(i17)) {
            i17 = -1;
        }
        return new av5.k0(k0Var.f95950d, f17, g17, i17);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95960d;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f394311s.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.q();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f394295c.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.k0 k0Var = (av5.k0) comparable;
        this.f376701d.f95953f++;
        av5.u uVar = this.f376702e;
        uVar.A(uVar.f95990f.f95995a.f95960d, true);
        int position = uVar.f106295a.position();
        uVar.w(k0Var.f95936e);
        uVar.w(k0Var.f95937f);
        uVar.w(k0Var.f95938g);
        return position;
    }
}
