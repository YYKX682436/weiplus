package r45;

/* loaded from: classes9.dex */
public class bn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452410d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452412f;

    /* renamed from: g, reason: collision with root package name */
    public int f452413g;

    /* renamed from: h, reason: collision with root package name */
    public int f452414h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452415i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452416m;

    /* renamed from: n, reason: collision with root package name */
    public int f452417n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn)) {
            return false;
        }
        r45.bn bnVar = (r45.bn) fVar;
        return n51.f.a(this.f452410d, bnVar.f452410d) && n51.f.a(this.f452411e, bnVar.f452411e) && n51.f.a(this.f452412f, bnVar.f452412f) && n51.f.a(java.lang.Integer.valueOf(this.f452413g), java.lang.Integer.valueOf(bnVar.f452413g)) && n51.f.a(java.lang.Integer.valueOf(this.f452414h), java.lang.Integer.valueOf(bnVar.f452414h)) && n51.f.a(this.f452415i, bnVar.f452415i) && n51.f.a(this.f452416m, bnVar.f452416m) && n51.f.a(java.lang.Integer.valueOf(this.f452417n), java.lang.Integer.valueOf(bnVar.f452417n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452410d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452411e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452412f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f452413g);
            fVar.e(5, this.f452414h);
            java.lang.String str4 = this.f452415i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452416m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f452417n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f452410d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f452411e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f452412f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f452413g) + b36.f.e(5, this.f452414h);
            java.lang.String str8 = this.f452415i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452416m;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            return e17 + b36.f.e(8, this.f452417n);
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
        r45.bn bnVar = (r45.bn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bnVar.f452410d = aVar2.k(intValue);
                return 0;
            case 2:
                bnVar.f452411e = aVar2.k(intValue);
                return 0;
            case 3:
                bnVar.f452412f = aVar2.k(intValue);
                return 0;
            case 4:
                bnVar.f452413g = aVar2.g(intValue);
                return 0;
            case 5:
                bnVar.f452414h = aVar2.g(intValue);
                return 0;
            case 6:
                bnVar.f452415i = aVar2.k(intValue);
                return 0;
            case 7:
                bnVar.f452416m = aVar2.d(intValue);
                return 0;
            case 8:
                bnVar.f452417n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
