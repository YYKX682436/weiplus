package r45;

/* loaded from: classes7.dex */
public class mh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public int f462041d;

    /* renamed from: e, reason: collision with root package name */
    public float f462042e;

    /* renamed from: f, reason: collision with root package name */
    public float f462043f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462044g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462046i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462049o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462050p;

    /* renamed from: r, reason: collision with root package name */
    public int f462052r;

    /* renamed from: s, reason: collision with root package name */
    public int f462053s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f462055u;

    /* renamed from: v, reason: collision with root package name */
    public int f462056v;

    /* renamed from: w, reason: collision with root package name */
    public long f462057w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f462058x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f462059y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f462060z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f462045h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f462047m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f462048n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f462051q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public int f462054t = 1;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mh4)) {
            return false;
        }
        r45.mh4 mh4Var = (r45.mh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462041d), java.lang.Integer.valueOf(mh4Var.f462041d)) && n51.f.a(java.lang.Float.valueOf(this.f462042e), java.lang.Float.valueOf(mh4Var.f462042e)) && n51.f.a(java.lang.Float.valueOf(this.f462043f), java.lang.Float.valueOf(mh4Var.f462043f)) && n51.f.a(this.f462044g, mh4Var.f462044g) && n51.f.a(this.f462045h, mh4Var.f462045h) && n51.f.a(this.f462046i, mh4Var.f462046i) && n51.f.a(this.f462047m, mh4Var.f462047m) && n51.f.a(this.f462048n, mh4Var.f462048n) && n51.f.a(this.f462049o, mh4Var.f462049o) && n51.f.a(this.f462050p, mh4Var.f462050p) && n51.f.a(this.f462051q, mh4Var.f462051q) && n51.f.a(java.lang.Integer.valueOf(this.f462052r), java.lang.Integer.valueOf(mh4Var.f462052r)) && n51.f.a(java.lang.Integer.valueOf(this.f462053s), java.lang.Integer.valueOf(mh4Var.f462053s)) && n51.f.a(java.lang.Integer.valueOf(this.f462054t), java.lang.Integer.valueOf(mh4Var.f462054t)) && n51.f.a(this.f462055u, mh4Var.f462055u) && n51.f.a(java.lang.Integer.valueOf(this.f462056v), java.lang.Integer.valueOf(mh4Var.f462056v)) && n51.f.a(java.lang.Long.valueOf(this.f462057w), java.lang.Long.valueOf(mh4Var.f462057w)) && n51.f.a(java.lang.Boolean.valueOf(this.f462058x), java.lang.Boolean.valueOf(mh4Var.f462058x)) && n51.f.a(this.f462059y, mh4Var.f462059y) && n51.f.a(this.f462060z, mh4Var.f462060z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(mh4Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(mh4Var.B)) && n51.f.a(this.C, mh4Var.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462051q;
        java.util.LinkedList linkedList2 = this.f462048n;
        java.util.LinkedList linkedList3 = this.f462045h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462041d);
            fVar.d(2, this.f462042e);
            fVar.d(3, this.f462043f);
            java.lang.String str = this.f462044g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, linkedList3);
            java.lang.String str2 = this.f462046i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 1, this.f462047m);
            fVar.g(8, 8, linkedList2);
            java.lang.String str3 = this.f462049o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f462050p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f462052r);
            fVar.e(13, this.f462053s);
            fVar.e(14, this.f462054t);
            java.lang.String str5 = this.f462055u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.e(16, this.f462056v);
            fVar.h(17, this.f462057w);
            fVar.a(18, this.f462058x);
            java.lang.String str6 = this.f462059y;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            java.lang.String str7 = this.f462060z;
            if (str7 != null) {
                fVar.j(20, str7);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            java.lang.String str8 = this.C;
            if (str8 != null) {
                fVar.j(23, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462041d) + 0 + b36.f.d(2, this.f462042e) + b36.f.d(3, this.f462043f);
            java.lang.String str9 = this.f462044g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int g17 = e17 + b36.f.g(5, 1, linkedList3);
            java.lang.String str10 = this.f462046i;
            if (str10 != null) {
                g17 += b36.f.j(6, str10);
            }
            int g18 = g17 + b36.f.g(7, 1, this.f462047m) + b36.f.g(8, 8, linkedList2);
            java.lang.String str11 = this.f462049o;
            if (str11 != null) {
                g18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f462050p;
            if (str12 != null) {
                g18 += b36.f.j(10, str12);
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f462052r) + b36.f.e(13, this.f462053s) + b36.f.e(14, this.f462054t);
            java.lang.String str13 = this.f462055u;
            if (str13 != null) {
                g19 += b36.f.j(15, str13);
            }
            int e18 = g19 + b36.f.e(16, this.f462056v) + b36.f.h(17, this.f462057w) + b36.f.a(18, this.f462058x);
            java.lang.String str14 = this.f462059y;
            if (str14 != null) {
                e18 += b36.f.j(19, str14);
            }
            java.lang.String str15 = this.f462060z;
            if (str15 != null) {
                e18 += b36.f.j(20, str15);
            }
            int e19 = e18 + b36.f.e(21, this.A) + b36.f.e(22, this.B);
            java.lang.String str16 = this.C;
            return str16 != null ? e19 + b36.f.j(23, str16) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            this.f462047m.clear();
            linkedList2.clear();
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
        r45.mh4 mh4Var = (r45.mh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mh4Var.f462041d = aVar2.g(intValue);
                return 0;
            case 2:
                mh4Var.f462042e = aVar2.f(intValue);
                return 0;
            case 3:
                mh4Var.f462043f = aVar2.f(intValue);
                return 0;
            case 4:
                mh4Var.f462044g = aVar2.k(intValue);
                return 0;
            case 5:
                mh4Var.f462045h.add(aVar2.k(intValue));
                return 0;
            case 6:
                mh4Var.f462046i = aVar2.k(intValue);
                return 0;
            case 7:
                mh4Var.f462047m.add(aVar2.k(intValue));
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nh4 nh4Var = new r45.nh4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nh4Var.mo11468x92b714fd(bArr2);
                    }
                    mh4Var.f462048n.add(nh4Var);
                }
                return 0;
            case 9:
                mh4Var.f462049o = aVar2.k(intValue);
                return 0;
            case 10:
                mh4Var.f462050p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.kh4 kh4Var = new r45.kh4();
                    if (bArr3 != null && bArr3.length > 0) {
                        kh4Var.mo11468x92b714fd(bArr3);
                    }
                    mh4Var.f462051q.add(kh4Var);
                }
                return 0;
            case 12:
                mh4Var.f462052r = aVar2.g(intValue);
                return 0;
            case 13:
                mh4Var.f462053s = aVar2.g(intValue);
                return 0;
            case 14:
                mh4Var.f462054t = aVar2.g(intValue);
                return 0;
            case 15:
                mh4Var.f462055u = aVar2.k(intValue);
                return 0;
            case 16:
                mh4Var.f462056v = aVar2.g(intValue);
                return 0;
            case 17:
                mh4Var.f462057w = aVar2.i(intValue);
                return 0;
            case 18:
                mh4Var.f462058x = aVar2.c(intValue);
                return 0;
            case 19:
                mh4Var.f462059y = aVar2.k(intValue);
                return 0;
            case 20:
                mh4Var.f462060z = aVar2.k(intValue);
                return 0;
            case 21:
                mh4Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                mh4Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                mh4Var.C = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
