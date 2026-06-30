package q8;

/* loaded from: classes15.dex */
public final class d implements q8.o {
    @Override // q8.o
    public void a(t9.p pVar, int i17) {
        pVar.x(i17);
    }

    @Override // q8.o
    public void b(long j17, int i17, int i18, int i19, q8.n nVar) {
    }

    @Override // q8.o
    public void c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
    }

    @Override // q8.o
    public int d(q8.f fVar, int i17, boolean z17) {
        q8.b bVar = (q8.b) fVar;
        int min = java.lang.Math.min(bVar.f442154f, i17);
        bVar.g(min);
        if (min == 0) {
            min = bVar.d(q8.b.f442148g, 0, java.lang.Math.min(i17, 4096), 0, true);
        }
        if (min != -1) {
            bVar.f442151c += min;
        }
        if (min != -1) {
            return min;
        }
        if (z17) {
            return -1;
        }
        throw new java.io.EOFException();
    }
}
