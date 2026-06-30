package r45;

/* loaded from: classes9.dex */
public class co2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453218d;

    /* renamed from: e, reason: collision with root package name */
    public long f453219e;

    /* renamed from: f, reason: collision with root package name */
    public long f453220f;

    /* renamed from: g, reason: collision with root package name */
    public int f453221g;

    /* renamed from: h, reason: collision with root package name */
    public long f453222h;

    /* renamed from: i, reason: collision with root package name */
    public int f453223i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f453224m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f453225n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f453226o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453227p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453228q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453229r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f453230s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f453231t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f453232u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f453233v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f453234w;

    /* renamed from: x, reason: collision with root package name */
    public int f453235x;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co2)) {
            return false;
        }
        r45.co2 co2Var = (r45.co2) fVar;
        return n51.f.a(this.f453218d, co2Var.f453218d) && n51.f.a(java.lang.Long.valueOf(this.f453219e), java.lang.Long.valueOf(co2Var.f453219e)) && n51.f.a(java.lang.Long.valueOf(this.f453220f), java.lang.Long.valueOf(co2Var.f453220f)) && n51.f.a(java.lang.Integer.valueOf(this.f453221g), java.lang.Integer.valueOf(co2Var.f453221g)) && n51.f.a(java.lang.Long.valueOf(this.f453222h), java.lang.Long.valueOf(co2Var.f453222h)) && n51.f.a(java.lang.Integer.valueOf(this.f453223i), java.lang.Integer.valueOf(co2Var.f453223i)) && n51.f.a(this.f453224m, co2Var.f453224m) && n51.f.a(java.lang.Integer.valueOf(this.f453225n), java.lang.Integer.valueOf(co2Var.f453225n)) && n51.f.a(java.lang.Boolean.valueOf(this.f453226o), java.lang.Boolean.valueOf(co2Var.f453226o)) && n51.f.a(this.f453227p, co2Var.f453227p) && n51.f.a(this.f453228q, co2Var.f453228q) && n51.f.a(this.f453229r, co2Var.f453229r) && n51.f.a(this.f453230s, co2Var.f453230s) && n51.f.a(java.lang.Boolean.valueOf(this.f453231t), java.lang.Boolean.valueOf(co2Var.f453231t)) && n51.f.a(this.f453232u, co2Var.f453232u) && n51.f.a(this.f453233v, co2Var.f453233v) && n51.f.a(java.lang.Boolean.valueOf(this.f453234w), java.lang.Boolean.valueOf(co2Var.f453234w)) && n51.f.a(java.lang.Integer.valueOf(this.f453235x), java.lang.Integer.valueOf(co2Var.f453235x));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453224m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453218d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f453219e);
            fVar.h(3, this.f453220f);
            fVar.e(4, this.f453221g);
            fVar.h(5, this.f453222h);
            fVar.e(6, this.f453223i);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f453225n);
            fVar.a(9, this.f453226o);
            java.lang.String str2 = this.f453227p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f453228q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f453229r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f453230s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            fVar.a(14, this.f453231t);
            java.lang.String str6 = this.f453232u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f453233v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            fVar.a(17, this.f453234w);
            fVar.e(18, this.f453235x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f453218d;
            int j17 = (str8 != null ? b36.f.j(1, str8) + 0 : 0) + b36.f.h(2, this.f453219e) + b36.f.h(3, this.f453220f) + b36.f.e(4, this.f453221g) + b36.f.h(5, this.f453222h) + b36.f.e(6, this.f453223i) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f453225n) + b36.f.a(9, this.f453226o);
            java.lang.String str9 = this.f453227p;
            if (str9 != null) {
                j17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f453228q;
            if (str10 != null) {
                j17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f453229r;
            if (str11 != null) {
                j17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f453230s;
            if (str12 != null) {
                j17 += b36.f.j(13, str12);
            }
            int a17 = j17 + b36.f.a(14, this.f453231t);
            java.lang.String str13 = this.f453232u;
            if (str13 != null) {
                a17 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f453233v;
            if (str14 != null) {
                a17 += b36.f.j(16, str14);
            }
            return a17 + b36.f.a(17, this.f453234w) + b36.f.e(18, this.f453235x);
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
        r45.co2 co2Var = (r45.co2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                co2Var.f453218d = aVar2.k(intValue);
                return 0;
            case 2:
                co2Var.f453219e = aVar2.i(intValue);
                return 0;
            case 3:
                co2Var.f453220f = aVar2.i(intValue);
                return 0;
            case 4:
                co2Var.f453221g = aVar2.g(intValue);
                return 0;
            case 5:
                co2Var.f453222h = aVar2.i(intValue);
                return 0;
            case 6:
                co2Var.f453223i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.co2 co2Var2 = new r45.co2();
                    if (bArr2 != null && bArr2.length > 0) {
                        co2Var2.mo11468x92b714fd(bArr2);
                    }
                    co2Var.f453224m.add(co2Var2);
                }
                return 0;
            case 8:
                co2Var.f453225n = aVar2.g(intValue);
                return 0;
            case 9:
                co2Var.f453226o = aVar2.c(intValue);
                return 0;
            case 10:
                co2Var.f453227p = aVar2.k(intValue);
                return 0;
            case 11:
                co2Var.f453228q = aVar2.k(intValue);
                return 0;
            case 12:
                co2Var.f453229r = aVar2.k(intValue);
                return 0;
            case 13:
                co2Var.f453230s = aVar2.k(intValue);
                return 0;
            case 14:
                co2Var.f453231t = aVar2.c(intValue);
                return 0;
            case 15:
                co2Var.f453232u = aVar2.k(intValue);
                return 0;
            case 16:
                co2Var.f453233v = aVar2.k(intValue);
                return 0;
            case 17:
                co2Var.f453234w = aVar2.c(intValue);
                return 0;
            case 18:
                co2Var.f453235x = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
