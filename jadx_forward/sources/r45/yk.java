package r45;

/* loaded from: classes8.dex */
public class yk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472695d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472696e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472697f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472698g;

    /* renamed from: h, reason: collision with root package name */
    public int f472699h;

    /* renamed from: i, reason: collision with root package name */
    public int f472700i;

    /* renamed from: m, reason: collision with root package name */
    public int f472701m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472702n;

    /* renamed from: o, reason: collision with root package name */
    public int f472703o;

    /* renamed from: p, reason: collision with root package name */
    public int f472704p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yk)) {
            return false;
        }
        r45.yk ykVar = (r45.yk) fVar;
        return n51.f.a(this.f472695d, ykVar.f472695d) && n51.f.a(this.f472696e, ykVar.f472696e) && n51.f.a(this.f472697f, ykVar.f472697f) && n51.f.a(this.f472698g, ykVar.f472698g) && n51.f.a(java.lang.Integer.valueOf(this.f472699h), java.lang.Integer.valueOf(ykVar.f472699h)) && n51.f.a(java.lang.Integer.valueOf(this.f472700i), java.lang.Integer.valueOf(ykVar.f472700i)) && n51.f.a(java.lang.Integer.valueOf(this.f472701m), java.lang.Integer.valueOf(ykVar.f472701m)) && n51.f.a(this.f472702n, ykVar.f472702n) && n51.f.a(java.lang.Integer.valueOf(this.f472703o), java.lang.Integer.valueOf(ykVar.f472703o)) && n51.f.a(java.lang.Integer.valueOf(this.f472704p), java.lang.Integer.valueOf(ykVar.f472704p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472695d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472696e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472697f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472698g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f472699h);
            fVar.e(6, this.f472700i);
            fVar.e(7, this.f472701m);
            java.lang.String str5 = this.f472702n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f472703o);
            fVar.e(10, this.f472704p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f472695d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f472696e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f472697f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f472698g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f472699h) + b36.f.e(6, this.f472700i) + b36.f.e(7, this.f472701m);
            java.lang.String str10 = this.f472702n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f472703o) + b36.f.e(10, this.f472704p);
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
        r45.yk ykVar = (r45.yk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ykVar.f472695d = aVar2.k(intValue);
                return 0;
            case 2:
                ykVar.f472696e = aVar2.k(intValue);
                return 0;
            case 3:
                ykVar.f472697f = aVar2.k(intValue);
                return 0;
            case 4:
                ykVar.f472698g = aVar2.k(intValue);
                return 0;
            case 5:
                ykVar.f472699h = aVar2.g(intValue);
                return 0;
            case 6:
                ykVar.f472700i = aVar2.g(intValue);
                return 0;
            case 7:
                ykVar.f472701m = aVar2.g(intValue);
                return 0;
            case 8:
                ykVar.f472702n = aVar2.k(intValue);
                return 0;
            case 9:
                ykVar.f472703o = aVar2.g(intValue);
                return 0;
            case 10:
                ykVar.f472704p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
