package iv5;

/* loaded from: classes16.dex */
public class b extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f376674d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f376675e;

    public b(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f376674d = null;
        this.f376675e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f95995a.f95968l;
            this.f376674d = n0Var;
            this.f376675e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.c cVar = (av5.c) comparable;
        fVar.getClass();
        int length = cVar.f95890e.length;
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = fVar.a(cVar.f95890e[i17]);
        }
        return new av5.c(cVar.f95950d, iArr);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f95995a.f95968l;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.A.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.d();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f394303k.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.c cVar = (av5.c) comparable;
        this.f376674d.f95953f++;
        av5.u uVar = this.f376675e;
        uVar.A(uVar.f95990f.f95995a.f95968l, true);
        int position = uVar.f106295a.position();
        uVar.w(cVar.f95890e.length);
        for (int i17 : cVar.f95890e) {
            uVar.w(i17);
        }
        return position;
    }
}
