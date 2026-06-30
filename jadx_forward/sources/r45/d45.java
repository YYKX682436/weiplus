package r45;

/* loaded from: classes15.dex */
public class d45 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453630d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453631e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453636m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453637n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453640q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453641r;

    /* renamed from: f, reason: collision with root package name */
    public int f453632f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f453633g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f453634h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f453635i = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f453638o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f453639p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d45)) {
            return false;
        }
        r45.d45 d45Var = (r45.d45) fVar;
        return n51.f.a(this.f453630d, d45Var.f453630d) && n51.f.a(this.f453631e, d45Var.f453631e) && n51.f.a(java.lang.Integer.valueOf(this.f453632f), java.lang.Integer.valueOf(d45Var.f453632f)) && n51.f.a(java.lang.Long.valueOf(this.f453633g), java.lang.Long.valueOf(d45Var.f453633g)) && n51.f.a(java.lang.Long.valueOf(this.f453634h), java.lang.Long.valueOf(d45Var.f453634h)) && n51.f.a(java.lang.Long.valueOf(this.f453635i), java.lang.Long.valueOf(d45Var.f453635i)) && n51.f.a(this.f453636m, d45Var.f453636m) && n51.f.a(this.f453637n, d45Var.f453637n) && n51.f.a(java.lang.Integer.valueOf(this.f453638o), java.lang.Integer.valueOf(d45Var.f453638o)) && n51.f.a(this.f453639p, d45Var.f453639p) && n51.f.a(this.f453640q, d45Var.f453640q) && n51.f.a(this.f453641r, d45Var.f453641r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453639p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453630d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453631e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f453632f);
            fVar.h(4, this.f453633g);
            fVar.h(5, this.f453634h);
            fVar.h(6, this.f453635i);
            java.lang.String str3 = this.f453636m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f453637n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f453638o);
            fVar.g(10, 3, linkedList);
            java.lang.String str5 = this.f453640q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f453641r;
            if (str6 == null) {
                return 0;
            }
            fVar.j(12, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f453630d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f453631e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f453632f) + b36.f.h(4, this.f453633g) + b36.f.h(5, this.f453634h) + b36.f.h(6, this.f453635i);
            java.lang.String str9 = this.f453636m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f453637n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            int e18 = e17 + b36.f.e(9, this.f453638o) + b36.f.g(10, 3, linkedList);
            java.lang.String str11 = this.f453640q;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f453641r;
            return str12 != null ? e18 + b36.f.j(12, str12) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.d45 d45Var = (r45.d45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d45Var.f453630d = aVar2.k(intValue);
                return 0;
            case 2:
                d45Var.f453631e = aVar2.k(intValue);
                return 0;
            case 3:
                d45Var.f453632f = aVar2.g(intValue);
                return 0;
            case 4:
                d45Var.f453633g = aVar2.i(intValue);
                return 0;
            case 5:
                d45Var.f453634h = aVar2.i(intValue);
                return 0;
            case 6:
                d45Var.f453635i = aVar2.i(intValue);
                return 0;
            case 7:
                d45Var.f453636m = aVar2.k(intValue);
                return 0;
            case 8:
                d45Var.f453637n = aVar2.k(intValue);
                return 0;
            case 9:
                d45Var.f453638o = aVar2.g(intValue);
                return 0;
            case 10:
                d45Var.f453639p.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 11:
                d45Var.f453640q = aVar2.k(intValue);
                return 0;
            case 12:
                d45Var.f453641r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
