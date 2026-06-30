package iv5;

/* loaded from: classes16.dex */
public class r extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376711d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376712e;

    public r(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376711d = null;
        this.f376712e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95967k;
            this.f376711d = n0Var;
            this.f376712e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.p0 p0Var = (av5.p0) comparable;
        fVar.getClass();
        if (p0Var == av5.p0.f95984f) {
            return p0Var;
        }
        int length = p0Var.f95985e.length;
        short[] sArr = new short[length];
        for (int i17 = 0; i17 < length; i17++) {
            sArr[i17] = (short) fVar.g(p0Var.f95985e[i17]);
        }
        return new av5.p0(p0Var.f95950d, sArr);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95967k;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.f394316x.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.s();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f394300h.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        this.f376711d.f95953f++;
        av5.u uVar = this.f376712e;
        uVar.A(uVar.f95990f.f95995a.f95967k, true);
        int position = uVar.f106295a.position();
        short[] sArr = ((av5.p0) comparable).f95985e;
        uVar.w(sArr.length);
        for (short s17 : sArr) {
            uVar.y(s17);
        }
        return position;
    }
}
