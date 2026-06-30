package f21;

/* loaded from: classes9.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f340458d;

    /* renamed from: e, reason: collision with root package name */
    public int f340459e;

    /* renamed from: f, reason: collision with root package name */
    public int f340460f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.j)) {
            return false;
        }
        f21.j jVar = (f21.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f340458d), java.lang.Integer.valueOf(jVar.f340458d)) && n51.f.a(java.lang.Integer.valueOf(this.f340459e), java.lang.Integer.valueOf(jVar.f340459e)) && n51.f.a(java.lang.Integer.valueOf(this.f340460f), java.lang.Integer.valueOf(jVar.f340460f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f340458d);
            fVar.e(2, this.f340459e);
            fVar.e(3, this.f340460f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f340458d) + 0 + b36.f.e(2, this.f340459e) + b36.f.e(3, this.f340460f);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        f21.j jVar = (f21.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f340458d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            jVar.f340459e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jVar.f340460f = aVar2.g(intValue);
        return 0;
    }
}
