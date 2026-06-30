package xq3;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f537611d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537612e;

    /* renamed from: f, reason: collision with root package name */
    public int f537613f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.e)) {
            return false;
        }
        xq3.e eVar = (xq3.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f537611d), java.lang.Integer.valueOf(eVar.f537611d)) && n51.f.a(this.f537612e, eVar.f537612e) && n51.f.a(java.lang.Integer.valueOf(this.f537613f), java.lang.Integer.valueOf(eVar.f537613f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f537611d);
            java.lang.String str = this.f537612e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f537613f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f537611d) + 0;
            java.lang.String str2 = this.f537612e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f537613f);
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
        xq3.e eVar = (xq3.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f537611d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            eVar.f537612e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        eVar.f537613f = aVar2.g(intValue);
        return 0;
    }
}
