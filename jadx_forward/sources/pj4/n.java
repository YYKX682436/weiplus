package pj4;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436719d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436720e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436721f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436722g;

    /* renamed from: h, reason: collision with root package name */
    public double f436723h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f436724i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f436725m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n)) {
            return false;
        }
        pj4.n nVar = (pj4.n) fVar;
        return n51.f.a(this.f436719d, nVar.f436719d) && n51.f.a(this.f436720e, nVar.f436720e) && n51.f.a(this.f436721f, nVar.f436721f) && n51.f.a(java.lang.Boolean.valueOf(this.f436722g), java.lang.Boolean.valueOf(nVar.f436722g)) && n51.f.a(java.lang.Double.valueOf(this.f436723h), java.lang.Double.valueOf(nVar.f436723h)) && n51.f.a(java.lang.Boolean.valueOf(this.f436724i), java.lang.Boolean.valueOf(nVar.f436724i)) && n51.f.a(this.f436725m, nVar.f436725m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436719d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436720e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436721f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f436722g);
            fVar.c(5, this.f436723h);
            fVar.a(6, this.f436724i);
            java.lang.String str4 = this.f436725m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f436719d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f436720e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f436721f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f436722g) + b36.f.c(5, this.f436723h) + b36.f.a(6, this.f436724i);
            java.lang.String str8 = this.f436725m;
            return str8 != null ? a17 + b36.f.j(7, str8) : a17;
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
        pj4.n nVar = (pj4.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f436719d = aVar2.k(intValue);
                return 0;
            case 2:
                nVar.f436720e = aVar2.k(intValue);
                return 0;
            case 3:
                nVar.f436721f = aVar2.k(intValue);
                return 0;
            case 4:
                nVar.f436722g = aVar2.c(intValue);
                return 0;
            case 5:
                nVar.f436723h = aVar2.e(intValue);
                return 0;
            case 6:
                nVar.f436724i = aVar2.c(intValue);
                return 0;
            case 7:
                nVar.f436725m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
