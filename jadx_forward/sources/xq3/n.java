package xq3;

/* loaded from: classes12.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537640f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f537641g;

    /* renamed from: h, reason: collision with root package name */
    public int f537642h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.n)) {
            return false;
        }
        xq3.n nVar = (xq3.n) fVar;
        return n51.f.a(this.f537638d, nVar.f537638d) && n51.f.a(this.f537639e, nVar.f537639e) && n51.f.a(this.f537640f, nVar.f537640f) && n51.f.a(this.f537641g, nVar.f537641g) && n51.f.a(java.lang.Integer.valueOf(this.f537642h), java.lang.Integer.valueOf(nVar.f537642h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f537638d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f537639e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f537640f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f537641g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f537642h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f537638d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f537639e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f537640f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f537641g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f537642h);
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
        xq3.n nVar = (xq3.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f537638d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nVar.f537639e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nVar.f537640f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nVar.f537641g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nVar.f537642h = aVar2.g(intValue);
        return 0;
    }
}
