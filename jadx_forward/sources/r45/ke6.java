package r45;

/* loaded from: classes4.dex */
public class ke6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f460162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460164f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460165g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460166h;

    /* renamed from: i, reason: collision with root package name */
    public int f460167i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460168m;

    /* renamed from: n, reason: collision with root package name */
    public int f460169n;

    /* renamed from: o, reason: collision with root package name */
    public int f460170o;

    /* renamed from: p, reason: collision with root package name */
    public int f460171p;

    /* renamed from: q, reason: collision with root package name */
    public int f460172q;

    /* renamed from: r, reason: collision with root package name */
    public int f460173r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f460174s;

    /* renamed from: t, reason: collision with root package name */
    public int f460175t;

    /* renamed from: u, reason: collision with root package name */
    public int f460176u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ke6)) {
            return false;
        }
        r45.ke6 ke6Var = (r45.ke6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f460162d), java.lang.Long.valueOf(ke6Var.f460162d)) && n51.f.a(this.f460163e, ke6Var.f460163e) && n51.f.a(this.f460164f, ke6Var.f460164f) && n51.f.a(this.f460165g, ke6Var.f460165g) && n51.f.a(this.f460166h, ke6Var.f460166h) && n51.f.a(java.lang.Integer.valueOf(this.f460167i), java.lang.Integer.valueOf(ke6Var.f460167i)) && n51.f.a(this.f460168m, ke6Var.f460168m) && n51.f.a(java.lang.Integer.valueOf(this.f460169n), java.lang.Integer.valueOf(ke6Var.f460169n)) && n51.f.a(java.lang.Integer.valueOf(this.f460170o), java.lang.Integer.valueOf(ke6Var.f460170o)) && n51.f.a(java.lang.Integer.valueOf(this.f460171p), java.lang.Integer.valueOf(ke6Var.f460171p)) && n51.f.a(java.lang.Integer.valueOf(this.f460172q), java.lang.Integer.valueOf(ke6Var.f460172q)) && n51.f.a(java.lang.Integer.valueOf(this.f460173r), java.lang.Integer.valueOf(ke6Var.f460173r)) && n51.f.a(this.f460174s, ke6Var.f460174s) && n51.f.a(java.lang.Integer.valueOf(this.f460175t), java.lang.Integer.valueOf(ke6Var.f460175t)) && n51.f.a(java.lang.Integer.valueOf(this.f460176u), java.lang.Integer.valueOf(ke6Var.f460176u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f460162d);
            java.lang.String str = this.f460163e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460164f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460165g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460166h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f460167i);
            java.lang.String str5 = this.f460168m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f460169n);
            fVar.e(9, this.f460170o);
            fVar.e(10, this.f460171p);
            fVar.e(11, this.f460172q);
            fVar.e(12, this.f460173r);
            java.lang.String str6 = this.f460174s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f460175t);
            fVar.e(15, this.f460176u);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f460162d) + 0;
            java.lang.String str7 = this.f460163e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f460164f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f460165g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f460166h;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            int e17 = h17 + b36.f.e(6, this.f460167i);
            java.lang.String str11 = this.f460168m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f460169n) + b36.f.e(9, this.f460170o) + b36.f.e(10, this.f460171p) + b36.f.e(11, this.f460172q) + b36.f.e(12, this.f460173r);
            java.lang.String str12 = this.f460174s;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f460175t) + b36.f.e(15, this.f460176u);
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
        r45.ke6 ke6Var = (r45.ke6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ke6Var.f460162d = aVar2.i(intValue);
                return 0;
            case 2:
                ke6Var.f460163e = aVar2.k(intValue);
                return 0;
            case 3:
                ke6Var.f460164f = aVar2.k(intValue);
                return 0;
            case 4:
                ke6Var.f460165g = aVar2.k(intValue);
                return 0;
            case 5:
                ke6Var.f460166h = aVar2.k(intValue);
                return 0;
            case 6:
                ke6Var.f460167i = aVar2.g(intValue);
                return 0;
            case 7:
                ke6Var.f460168m = aVar2.k(intValue);
                return 0;
            case 8:
                ke6Var.f460169n = aVar2.g(intValue);
                return 0;
            case 9:
                ke6Var.f460170o = aVar2.g(intValue);
                return 0;
            case 10:
                ke6Var.f460171p = aVar2.g(intValue);
                return 0;
            case 11:
                ke6Var.f460172q = aVar2.g(intValue);
                return 0;
            case 12:
                ke6Var.f460173r = aVar2.g(intValue);
                return 0;
            case 13:
                ke6Var.f460174s = aVar2.k(intValue);
                return 0;
            case 14:
                ke6Var.f460175t = aVar2.g(intValue);
                return 0;
            case 15:
                ke6Var.f460176u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
