package r45;

/* loaded from: classes9.dex */
public class a65 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451313f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451315h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451316i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451317m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451318n;

    /* renamed from: o, reason: collision with root package name */
    public long f451319o;

    /* renamed from: p, reason: collision with root package name */
    public long f451320p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451321q;

    /* renamed from: r, reason: collision with root package name */
    public long f451322r;

    /* renamed from: s, reason: collision with root package name */
    public int f451323s;

    /* renamed from: t, reason: collision with root package name */
    public int f451324t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f451325u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f451326v;

    /* renamed from: w, reason: collision with root package name */
    public long f451327w;

    /* renamed from: x, reason: collision with root package name */
    public int f451328x;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a65)) {
            return false;
        }
        r45.a65 a65Var = (r45.a65) fVar;
        return n51.f.a(this.f451311d, a65Var.f451311d) && n51.f.a(this.f451312e, a65Var.f451312e) && n51.f.a(this.f451313f, a65Var.f451313f) && n51.f.a(this.f451314g, a65Var.f451314g) && n51.f.a(this.f451315h, a65Var.f451315h) && n51.f.a(this.f451316i, a65Var.f451316i) && n51.f.a(this.f451317m, a65Var.f451317m) && n51.f.a(this.f451318n, a65Var.f451318n) && n51.f.a(java.lang.Long.valueOf(this.f451319o), java.lang.Long.valueOf(a65Var.f451319o)) && n51.f.a(java.lang.Long.valueOf(this.f451320p), java.lang.Long.valueOf(a65Var.f451320p)) && n51.f.a(this.f451321q, a65Var.f451321q) && n51.f.a(java.lang.Long.valueOf(this.f451322r), java.lang.Long.valueOf(a65Var.f451322r)) && n51.f.a(java.lang.Integer.valueOf(this.f451323s), java.lang.Integer.valueOf(a65Var.f451323s)) && n51.f.a(java.lang.Integer.valueOf(this.f451324t), java.lang.Integer.valueOf(a65Var.f451324t)) && n51.f.a(this.f451325u, a65Var.f451325u) && n51.f.a(this.f451326v, a65Var.f451326v) && n51.f.a(java.lang.Long.valueOf(this.f451327w), java.lang.Long.valueOf(a65Var.f451327w)) && n51.f.a(java.lang.Integer.valueOf(this.f451328x), java.lang.Integer.valueOf(a65Var.f451328x));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451311d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451312e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451313f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451314g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f451315h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f451316i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f451317m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f451318n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.h(9, this.f451319o);
            fVar.h(10, this.f451320p);
            java.lang.String str9 = this.f451321q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            fVar.h(12, this.f451322r);
            fVar.e(13, this.f451323s);
            fVar.e(14, this.f451324t);
            java.lang.String str10 = this.f451325u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f451326v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.h(17, this.f451327w);
            fVar.e(18, this.f451328x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f451311d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f451312e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f451313f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f451314g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f451315h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f451316i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f451317m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f451318n;
            if (str19 != null) {
                j17 += b36.f.j(8, str19);
            }
            int h17 = j17 + b36.f.h(9, this.f451319o) + b36.f.h(10, this.f451320p);
            java.lang.String str20 = this.f451321q;
            if (str20 != null) {
                h17 += b36.f.j(11, str20);
            }
            int h18 = h17 + b36.f.h(12, this.f451322r) + b36.f.e(13, this.f451323s) + b36.f.e(14, this.f451324t);
            java.lang.String str21 = this.f451325u;
            if (str21 != null) {
                h18 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f451326v;
            if (str22 != null) {
                h18 += b36.f.j(16, str22);
            }
            return h18 + b36.f.h(17, this.f451327w) + b36.f.e(18, this.f451328x);
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
        r45.a65 a65Var = (r45.a65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a65Var.f451311d = aVar2.k(intValue);
                return 0;
            case 2:
                a65Var.f451312e = aVar2.k(intValue);
                return 0;
            case 3:
                a65Var.f451313f = aVar2.k(intValue);
                return 0;
            case 4:
                a65Var.f451314g = aVar2.k(intValue);
                return 0;
            case 5:
                a65Var.f451315h = aVar2.k(intValue);
                return 0;
            case 6:
                a65Var.f451316i = aVar2.k(intValue);
                return 0;
            case 7:
                a65Var.f451317m = aVar2.k(intValue);
                return 0;
            case 8:
                a65Var.f451318n = aVar2.k(intValue);
                return 0;
            case 9:
                a65Var.f451319o = aVar2.i(intValue);
                return 0;
            case 10:
                a65Var.f451320p = aVar2.i(intValue);
                return 0;
            case 11:
                a65Var.f451321q = aVar2.k(intValue);
                return 0;
            case 12:
                a65Var.f451322r = aVar2.i(intValue);
                return 0;
            case 13:
                a65Var.f451323s = aVar2.g(intValue);
                return 0;
            case 14:
                a65Var.f451324t = aVar2.g(intValue);
                return 0;
            case 15:
                a65Var.f451325u = aVar2.k(intValue);
                return 0;
            case 16:
                a65Var.f451326v = aVar2.k(intValue);
                return 0;
            case 17:
                a65Var.f451327w = aVar2.i(intValue);
                return 0;
            case 18:
                a65Var.f451328x = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
