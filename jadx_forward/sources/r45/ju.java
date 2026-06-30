package r45;

/* loaded from: classes15.dex */
public class ju extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459638f;

    /* renamed from: g, reason: collision with root package name */
    public int f459639g;

    /* renamed from: h, reason: collision with root package name */
    public int f459640h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459641i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ju)) {
            return false;
        }
        r45.ju juVar = (r45.ju) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459636d), java.lang.Integer.valueOf(juVar.f459636d)) && n51.f.a(this.f459637e, juVar.f459637e) && n51.f.a(this.f459638f, juVar.f459638f) && n51.f.a(java.lang.Integer.valueOf(this.f459639g), java.lang.Integer.valueOf(juVar.f459639g)) && n51.f.a(java.lang.Integer.valueOf(this.f459640h), java.lang.Integer.valueOf(juVar.f459640h)) && n51.f.a(this.f459641i, juVar.f459641i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459636d);
            java.lang.String str = this.f459637e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459638f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f459639g);
            fVar.e(5, this.f459640h);
            java.lang.String str3 = this.f459641i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459636d) + 0;
            java.lang.String str4 = this.f459637e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f459638f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f459639g) + b36.f.e(5, this.f459640h);
            java.lang.String str6 = this.f459641i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.ju juVar = (r45.ju) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                juVar.f459636d = aVar2.g(intValue);
                return 0;
            case 2:
                juVar.f459637e = aVar2.k(intValue);
                return 0;
            case 3:
                juVar.f459638f = aVar2.k(intValue);
                return 0;
            case 4:
                juVar.f459639g = aVar2.g(intValue);
                return 0;
            case 5:
                juVar.f459640h = aVar2.g(intValue);
                return 0;
            case 6:
                juVar.f459641i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
