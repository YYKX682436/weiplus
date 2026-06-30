package f21;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f340464d;

    /* renamed from: e, reason: collision with root package name */
    public int f340465e;

    /* renamed from: f, reason: collision with root package name */
    public double f340466f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f340467g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.l)) {
            return false;
        }
        f21.l lVar = (f21.l) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f340464d), java.lang.Integer.valueOf(lVar.f340464d)) && n51.f.a(java.lang.Integer.valueOf(this.f340465e), java.lang.Integer.valueOf(lVar.f340465e)) && n51.f.a(java.lang.Double.valueOf(this.f340466f), java.lang.Double.valueOf(lVar.f340466f)) && n51.f.a(this.f340467g, lVar.f340467g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f340464d);
            fVar.e(2, this.f340465e);
            fVar.c(3, this.f340466f);
            java.lang.String str = this.f340467g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f340464d) + 0 + b36.f.e(2, this.f340465e) + b36.f.c(3, this.f340466f);
            java.lang.String str2 = this.f340467g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        f21.l lVar = (f21.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lVar.f340464d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lVar.f340465e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lVar.f340466f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        lVar.f340467g = aVar2.k(intValue);
        return 0;
    }
}
