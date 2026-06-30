package vr4;

/* loaded from: classes9.dex */
public class i1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f521267d;

    /* renamed from: e, reason: collision with root package name */
    public int f521268e;

    /* renamed from: f, reason: collision with root package name */
    public long f521269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f521270g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f521271h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f521272i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f521273m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521274n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521275o;

    /* renamed from: p, reason: collision with root package name */
    public double f521276p;

    /* renamed from: q, reason: collision with root package name */
    public double f521277q;

    /* renamed from: r, reason: collision with root package name */
    public int f521278r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f521279s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f521280t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f521281u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f521282v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.i1)) {
            return false;
        }
        vr4.i1 i1Var = (vr4.i1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f521267d), java.lang.Integer.valueOf(i1Var.f521267d)) && n51.f.a(java.lang.Integer.valueOf(this.f521268e), java.lang.Integer.valueOf(i1Var.f521268e)) && n51.f.a(java.lang.Long.valueOf(this.f521269f), java.lang.Long.valueOf(i1Var.f521269f)) && n51.f.a(this.f521270g, i1Var.f521270g) && n51.f.a(this.f521271h, i1Var.f521271h) && n51.f.a(this.f521272i, i1Var.f521272i) && n51.f.a(this.f521273m, i1Var.f521273m) && n51.f.a(this.f521274n, i1Var.f521274n) && n51.f.a(this.f521275o, i1Var.f521275o) && n51.f.a(java.lang.Double.valueOf(this.f521276p), java.lang.Double.valueOf(i1Var.f521276p)) && n51.f.a(java.lang.Double.valueOf(this.f521277q), java.lang.Double.valueOf(i1Var.f521277q)) && n51.f.a(java.lang.Integer.valueOf(this.f521278r), java.lang.Integer.valueOf(i1Var.f521278r)) && n51.f.a(this.f521279s, i1Var.f521279s) && n51.f.a(this.f521280t, i1Var.f521280t) && n51.f.a(this.f521281u, i1Var.f521281u) && n51.f.a(this.f521282v, i1Var.f521282v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f521282v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f521267d);
            fVar.e(2, this.f521268e);
            fVar.h(3, this.f521269f);
            java.lang.String str = this.f521270g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f521271h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f521272i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f521273m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f521274n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f521275o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.c(10, this.f521276p);
            fVar.c(11, this.f521277q);
            fVar.e(12, this.f521278r);
            java.lang.String str7 = this.f521279s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f521280t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f521281u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            fVar.g(17, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f521267d) + 0 + b36.f.e(2, this.f521268e) + b36.f.h(3, this.f521269f);
            java.lang.String str10 = this.f521270g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f521271h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f521272i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f521273m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f521274n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f521275o;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            int c17 = e17 + b36.f.c(10, this.f521276p) + b36.f.c(11, this.f521277q) + b36.f.e(12, this.f521278r);
            java.lang.String str16 = this.f521279s;
            if (str16 != null) {
                c17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f521280t;
            if (str17 != null) {
                c17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f521281u;
            if (str18 != null) {
                c17 += b36.f.j(16, str18);
            }
            return c17 + b36.f.g(17, 6, linkedList);
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
        vr4.i1 i1Var = (vr4.i1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i1Var.f521267d = aVar2.g(intValue);
                return 0;
            case 2:
                i1Var.f521268e = aVar2.g(intValue);
                return 0;
            case 3:
                i1Var.f521269f = aVar2.i(intValue);
                return 0;
            case 4:
                i1Var.f521270g = aVar2.k(intValue);
                return 0;
            case 5:
                i1Var.f521271h = aVar2.k(intValue);
                return 0;
            case 6:
                i1Var.f521272i = aVar2.k(intValue);
                return 0;
            case 7:
                i1Var.f521273m = aVar2.k(intValue);
                return 0;
            case 8:
                i1Var.f521274n = aVar2.k(intValue);
                return 0;
            case 9:
                i1Var.f521275o = aVar2.k(intValue);
                return 0;
            case 10:
                i1Var.f521276p = aVar2.e(intValue);
                return 0;
            case 11:
                i1Var.f521277q = aVar2.e(intValue);
                return 0;
            case 12:
                i1Var.f521278r = aVar2.g(intValue);
                return 0;
            case 13:
                i1Var.f521279s = aVar2.k(intValue);
                return 0;
            case 14:
                i1Var.f521280t = aVar2.k(intValue);
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                i1Var.f521281u = aVar2.k(intValue);
                return 0;
            case 17:
                i1Var.f521282v.add(aVar2.d(intValue));
                return 0;
        }
    }
}
