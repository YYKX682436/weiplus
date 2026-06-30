package r45;

/* loaded from: classes9.dex */
public class r1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465940d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465941e;

    /* renamed from: f, reason: collision with root package name */
    public double f465942f;

    /* renamed from: g, reason: collision with root package name */
    public double f465943g;

    /* renamed from: h, reason: collision with root package name */
    public long f465944h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465945i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465946m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465947n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465948o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465949p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r1)) {
            return false;
        }
        r45.r1 r1Var = (r45.r1) fVar;
        return n51.f.a(this.f465940d, r1Var.f465940d) && n51.f.a(this.f465941e, r1Var.f465941e) && n51.f.a(java.lang.Double.valueOf(this.f465942f), java.lang.Double.valueOf(r1Var.f465942f)) && n51.f.a(java.lang.Double.valueOf(this.f465943g), java.lang.Double.valueOf(r1Var.f465943g)) && n51.f.a(java.lang.Long.valueOf(this.f465944h), java.lang.Long.valueOf(r1Var.f465944h)) && n51.f.a(this.f465945i, r1Var.f465945i) && n51.f.a(this.f465946m, r1Var.f465946m) && n51.f.a(this.f465947n, r1Var.f465947n) && n51.f.a(this.f465948o, r1Var.f465948o) && n51.f.a(this.f465949p, r1Var.f465949p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465940d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465941e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f465942f);
            fVar.c(4, this.f465943g);
            fVar.h(5, this.f465944h);
            java.lang.String str3 = this.f465945i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f465946m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f465947n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f465948o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f465949p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f465940d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f465941e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int c17 = j17 + b36.f.c(3, this.f465942f) + b36.f.c(4, this.f465943g) + b36.f.h(5, this.f465944h);
            java.lang.String str10 = this.f465945i;
            if (str10 != null) {
                c17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f465946m;
            if (str11 != null) {
                c17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f465947n;
            if (str12 != null) {
                c17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f465948o;
            if (str13 != null) {
                c17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f465949p;
            return str14 != null ? c17 + b36.f.j(10, str14) : c17;
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
        r45.r1 r1Var = (r45.r1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r1Var.f465940d = aVar2.k(intValue);
                return 0;
            case 2:
                r1Var.f465941e = aVar2.k(intValue);
                return 0;
            case 3:
                r1Var.f465942f = aVar2.e(intValue);
                return 0;
            case 4:
                r1Var.f465943g = aVar2.e(intValue);
                return 0;
            case 5:
                r1Var.f465944h = aVar2.i(intValue);
                return 0;
            case 6:
                r1Var.f465945i = aVar2.k(intValue);
                return 0;
            case 7:
                r1Var.f465946m = aVar2.k(intValue);
                return 0;
            case 8:
                r1Var.f465947n = aVar2.k(intValue);
                return 0;
            case 9:
                r1Var.f465948o = aVar2.k(intValue);
                return 0;
            case 10:
                r1Var.f465949p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
