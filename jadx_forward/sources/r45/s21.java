package r45;

/* loaded from: classes2.dex */
public class s21 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466962g;

    /* renamed from: h, reason: collision with root package name */
    public int f466963h;

    /* renamed from: i, reason: collision with root package name */
    public int f466964i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466965m;

    /* renamed from: n, reason: collision with root package name */
    public int f466966n;

    /* renamed from: o, reason: collision with root package name */
    public int f466967o;

    /* renamed from: p, reason: collision with root package name */
    public int f466968p;

    /* renamed from: q, reason: collision with root package name */
    public int f466969q;

    /* renamed from: r, reason: collision with root package name */
    public int f466970r;

    /* renamed from: s, reason: collision with root package name */
    public r45.so2 f466971s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f466972t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public r45.ub1 f466973u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s21)) {
            return false;
        }
        r45.s21 s21Var = (r45.s21) fVar;
        return n51.f.a(this.f466959d, s21Var.f466959d) && n51.f.a(this.f466960e, s21Var.f466960e) && n51.f.a(this.f466961f, s21Var.f466961f) && n51.f.a(this.f466962g, s21Var.f466962g) && n51.f.a(java.lang.Integer.valueOf(this.f466963h), java.lang.Integer.valueOf(s21Var.f466963h)) && n51.f.a(java.lang.Integer.valueOf(this.f466964i), java.lang.Integer.valueOf(s21Var.f466964i)) && n51.f.a(this.f466965m, s21Var.f466965m) && n51.f.a(java.lang.Integer.valueOf(this.f466966n), java.lang.Integer.valueOf(s21Var.f466966n)) && n51.f.a(java.lang.Integer.valueOf(this.f466967o), java.lang.Integer.valueOf(s21Var.f466967o)) && n51.f.a(java.lang.Integer.valueOf(this.f466968p), java.lang.Integer.valueOf(s21Var.f466968p)) && n51.f.a(java.lang.Integer.valueOf(this.f466969q), java.lang.Integer.valueOf(s21Var.f466969q)) && n51.f.a(java.lang.Integer.valueOf(this.f466970r), java.lang.Integer.valueOf(s21Var.f466970r)) && n51.f.a(this.f466971s, s21Var.f466971s) && n51.f.a(this.f466972t, s21Var.f466972t) && n51.f.a(this.f466973u, s21Var.f466973u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466972t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466959d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466960e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466961f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466962g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f466963h);
            fVar.e(6, this.f466964i);
            java.lang.String str5 = this.f466965m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f466966n);
            fVar.e(9, this.f466967o);
            fVar.e(10, this.f466968p);
            fVar.e(11, this.f466969q);
            fVar.e(12, this.f466970r);
            r45.so2 so2Var = this.f466971s;
            if (so2Var != null) {
                fVar.i(13, so2Var.mo75928xcd1e8d8());
                this.f466971s.mo75956x3d5d1f78(fVar);
            }
            fVar.g(14, 8, linkedList);
            r45.ub1 ub1Var = this.f466973u;
            if (ub1Var != null) {
                fVar.i(15, ub1Var.mo75928xcd1e8d8());
                this.f466973u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f466959d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f466960e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f466961f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f466962g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f466963h) + b36.f.e(6, this.f466964i);
            java.lang.String str10 = this.f466965m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f466966n) + b36.f.e(9, this.f466967o) + b36.f.e(10, this.f466968p) + b36.f.e(11, this.f466969q) + b36.f.e(12, this.f466970r);
            r45.so2 so2Var2 = this.f466971s;
            if (so2Var2 != null) {
                e18 += b36.f.i(13, so2Var2.mo75928xcd1e8d8());
            }
            int g17 = e18 + b36.f.g(14, 8, linkedList);
            r45.ub1 ub1Var2 = this.f466973u;
            return ub1Var2 != null ? g17 + b36.f.i(15, ub1Var2.mo75928xcd1e8d8()) : g17;
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
        r45.s21 s21Var = (r45.s21) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s21Var.f466959d = aVar2.k(intValue);
                return 0;
            case 2:
                s21Var.f466960e = aVar2.k(intValue);
                return 0;
            case 3:
                s21Var.f466961f = aVar2.k(intValue);
                return 0;
            case 4:
                s21Var.f466962g = aVar2.k(intValue);
                return 0;
            case 5:
                s21Var.f466963h = aVar2.g(intValue);
                return 0;
            case 6:
                s21Var.f466964i = aVar2.g(intValue);
                return 0;
            case 7:
                s21Var.f466965m = aVar2.k(intValue);
                return 0;
            case 8:
                s21Var.f466966n = aVar2.g(intValue);
                return 0;
            case 9:
                s21Var.f466967o = aVar2.g(intValue);
                return 0;
            case 10:
                s21Var.f466968p = aVar2.g(intValue);
                return 0;
            case 11:
                s21Var.f466969q = aVar2.g(intValue);
                return 0;
            case 12:
                s21Var.f466970r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.so2 so2Var3 = new r45.so2();
                    if (bArr2 != null && bArr2.length > 0) {
                        so2Var3.mo11468x92b714fd(bArr2);
                    }
                    s21Var.f466971s = so2Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.zb1 zb1Var = new r45.zb1();
                    if (bArr3 != null && bArr3.length > 0) {
                        zb1Var.mo11468x92b714fd(bArr3);
                    }
                    s21Var.f466972t.add(zb1Var);
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.ub1 ub1Var3 = new r45.ub1();
                    if (bArr4 != null && bArr4.length > 0) {
                        ub1Var3.mo11468x92b714fd(bArr4);
                    }
                    s21Var.f466973u = ub1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
