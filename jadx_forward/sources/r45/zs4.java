package r45;

/* loaded from: classes4.dex */
public class zs4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473885g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473886h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f473887i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473888m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f473889n;

    /* renamed from: o, reason: collision with root package name */
    public int f473890o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f473891p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f473892q;

    /* renamed from: r, reason: collision with root package name */
    public int f473893r;

    /* renamed from: s, reason: collision with root package name */
    public int f473894s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f473895t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f473896u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zs4)) {
            return false;
        }
        r45.zs4 zs4Var = (r45.zs4) fVar;
        return n51.f.a(this.f473882d, zs4Var.f473882d) && n51.f.a(this.f473883e, zs4Var.f473883e) && n51.f.a(this.f473884f, zs4Var.f473884f) && n51.f.a(this.f473885g, zs4Var.f473885g) && n51.f.a(this.f473886h, zs4Var.f473886h) && n51.f.a(java.lang.Boolean.valueOf(this.f473887i), java.lang.Boolean.valueOf(zs4Var.f473887i)) && n51.f.a(java.lang.Boolean.valueOf(this.f473888m), java.lang.Boolean.valueOf(zs4Var.f473888m)) && n51.f.a(java.lang.Boolean.valueOf(this.f473889n), java.lang.Boolean.valueOf(zs4Var.f473889n)) && n51.f.a(java.lang.Integer.valueOf(this.f473890o), java.lang.Integer.valueOf(zs4Var.f473890o)) && n51.f.a(java.lang.Boolean.valueOf(this.f473891p), java.lang.Boolean.valueOf(zs4Var.f473891p)) && n51.f.a(java.lang.Boolean.valueOf(this.f473892q), java.lang.Boolean.valueOf(zs4Var.f473892q)) && n51.f.a(java.lang.Integer.valueOf(this.f473893r), java.lang.Integer.valueOf(zs4Var.f473893r)) && n51.f.a(java.lang.Integer.valueOf(this.f473894s), java.lang.Integer.valueOf(zs4Var.f473894s)) && n51.f.a(java.lang.Boolean.valueOf(this.f473895t), java.lang.Boolean.valueOf(zs4Var.f473895t)) && n51.f.a(this.f473896u, zs4Var.f473896u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473882d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473883e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f473884f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f473885g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473886h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.a(7, this.f473887i);
            fVar.a(8, this.f473888m);
            fVar.a(9, this.f473889n);
            fVar.e(10, this.f473890o);
            fVar.a(11, this.f473891p);
            fVar.a(12, this.f473892q);
            fVar.e(13, this.f473893r);
            fVar.e(14, this.f473894s);
            fVar.a(15, this.f473895t);
            java.lang.String str5 = this.f473896u;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f473882d;
            int j17 = str6 != null ? b36.f.j(2, str6) + 0 : 0;
            java.lang.String str7 = this.f473883e;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f473884f;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f473885g;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473886h;
            if (gVar2 != null) {
                j17 += b36.f.b(6, gVar2);
            }
            int a17 = j17 + b36.f.a(7, this.f473887i) + b36.f.a(8, this.f473888m) + b36.f.a(9, this.f473889n) + b36.f.e(10, this.f473890o) + b36.f.a(11, this.f473891p) + b36.f.a(12, this.f473892q) + b36.f.e(13, this.f473893r) + b36.f.e(14, this.f473894s) + b36.f.a(15, this.f473895t);
            java.lang.String str10 = this.f473896u;
            return str10 != null ? a17 + b36.f.j(16, str10) : a17;
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
        r45.zs4 zs4Var = (r45.zs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                zs4Var.f473882d = aVar2.k(intValue);
                return 0;
            case 3:
                zs4Var.f473883e = aVar2.k(intValue);
                return 0;
            case 4:
                zs4Var.f473884f = aVar2.k(intValue);
                return 0;
            case 5:
                zs4Var.f473885g = aVar2.k(intValue);
                return 0;
            case 6:
                zs4Var.f473886h = aVar2.d(intValue);
                return 0;
            case 7:
                zs4Var.f473887i = aVar2.c(intValue);
                return 0;
            case 8:
                zs4Var.f473888m = aVar2.c(intValue);
                return 0;
            case 9:
                zs4Var.f473889n = aVar2.c(intValue);
                return 0;
            case 10:
                zs4Var.f473890o = aVar2.g(intValue);
                return 0;
            case 11:
                zs4Var.f473891p = aVar2.c(intValue);
                return 0;
            case 12:
                zs4Var.f473892q = aVar2.c(intValue);
                return 0;
            case 13:
                zs4Var.f473893r = aVar2.g(intValue);
                return 0;
            case 14:
                zs4Var.f473894s = aVar2.g(intValue);
                return 0;
            case 15:
                zs4Var.f473895t = aVar2.c(intValue);
                return 0;
            case 16:
                zs4Var.f473896u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
