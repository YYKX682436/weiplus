package kv5;

/* loaded from: classes16.dex */
public final class g extends dv5.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv5.h f394291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kv5.h hVar, dv5.e eVar) {
        super(eVar);
        this.f394291b = hVar;
    }

    @Override // dv5.e
    public void b(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39, int i47) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.b(i17, i18, m17, i27, i28, j17, i29, i37, i38, i39, i47);
        }
    }

    @Override // dv5.e
    public void c(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.c(i17, i18, m17, i27, i28, j17, i29, i37, i38, i39);
        }
    }

    @Override // dv5.e
    public void d(int i17, int i18, int i19, int i27, int i28, int[] iArr) {
        kv5.h hVar = this.f394291b;
        int c17 = hVar.f394292a.c(i19);
        int e17 = hVar.f394292a.e(i28);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.d(i17, i18, c17, i27, e17, iArr);
        }
    }

    @Override // dv5.e
    public void e(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        kv5.h hVar = this.f394291b;
        int c17 = hVar.f394292a.c(i19);
        int e17 = hVar.f394292a.e(i37);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.e(i17, i18, c17, i27, i28, i29, e17);
        }
    }

    @Override // dv5.e
    public void f(int i17, int i18, int i19, int i27, int i28, long j17, int i29) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.f(i17, i18, m17, i27, i28, j17, i29);
        }
    }

    @Override // dv5.e
    public void h(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.h(i17, i18, m17, i27, i28, j17, i29, i37);
        }
    }

    @Override // dv5.e
    public void j(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.j(i17, i18, m17, i27, i28, j17, i29, i37, i38);
        }
    }

    @Override // dv5.e
    public void k(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.k(i17, i18, m17, i27, i28, j17, i29, i37);
        }
    }

    @Override // dv5.e
    public void l(int i17, int i18, int i19, int i27, int i28, long j17) {
        int m17 = m(i19, i27);
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.l(i17, i18, m17, i27, i28, j17);
        }
    }

    public final int m(int i17, int i18) {
        kv5.h hVar = this.f394291b;
        switch (i18) {
            case 2:
                return hVar.f394292a.g(i17);
            case 3:
                return hVar.f394292a.f(i17);
            case 4:
                return hVar.f394292a.c(i17);
            case 5:
                return hVar.f394292a.b(i17);
            case 6:
                throw new java.lang.IllegalArgumentException("METHOD_AND_PROTO_REF should not use this method to do transform.");
            case 7:
                kv5.i iVar = (kv5.i) hVar.f394292a;
                fv5.b bVar = iVar.f394298f;
                int d17 = bVar.d(i17);
                if (d17 >= 0) {
                    return bVar.f348555e[d17];
                }
                if (i17 < 0 || !iVar.f394314v.a(i17)) {
                    return i17;
                }
                return -1;
            case 8:
                kv5.i iVar2 = (kv5.i) hVar.f394292a;
                fv5.b bVar2 = iVar2.f394299g;
                int d18 = bVar2.d(i17);
                if (d18 >= 0) {
                    return bVar2.f348555e[d18];
                }
                if (i17 < 0 || !iVar2.f394315w.a(i17)) {
                    return i17;
                }
                return -1;
            case 9:
                return hVar.f394292a.e(i17);
            default:
                return i17;
        }
    }
}
