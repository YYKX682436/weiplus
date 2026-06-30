package r45;

/* loaded from: classes9.dex */
public class lm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461156e;

    /* renamed from: f, reason: collision with root package name */
    public long f461157f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461158g;

    /* renamed from: h, reason: collision with root package name */
    public long f461159h;

    /* renamed from: i, reason: collision with root package name */
    public long f461160i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461161m;

    /* renamed from: n, reason: collision with root package name */
    public long f461162n;

    /* renamed from: o, reason: collision with root package name */
    public long f461163o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f461164p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f461165q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461166r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461167s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f461168t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f461169u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm5)) {
            return false;
        }
        r45.lm5 lm5Var = (r45.lm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461155d), java.lang.Integer.valueOf(lm5Var.f461155d)) && n51.f.a(this.f461156e, lm5Var.f461156e) && n51.f.a(java.lang.Long.valueOf(this.f461157f), java.lang.Long.valueOf(lm5Var.f461157f)) && n51.f.a(java.lang.Boolean.valueOf(this.f461158g), java.lang.Boolean.valueOf(lm5Var.f461158g)) && n51.f.a(java.lang.Long.valueOf(this.f461159h), java.lang.Long.valueOf(lm5Var.f461159h)) && n51.f.a(java.lang.Long.valueOf(this.f461160i), java.lang.Long.valueOf(lm5Var.f461160i)) && n51.f.a(java.lang.Boolean.valueOf(this.f461161m), java.lang.Boolean.valueOf(lm5Var.f461161m)) && n51.f.a(java.lang.Long.valueOf(this.f461162n), java.lang.Long.valueOf(lm5Var.f461162n)) && n51.f.a(java.lang.Long.valueOf(this.f461163o), java.lang.Long.valueOf(lm5Var.f461163o)) && n51.f.a(this.f461164p, lm5Var.f461164p) && n51.f.a(this.f461165q, lm5Var.f461165q) && n51.f.a(this.f461166r, lm5Var.f461166r) && n51.f.a(this.f461167s, lm5Var.f461167s) && n51.f.a(this.f461168t, lm5Var.f461168t) && n51.f.a(this.f461169u, lm5Var.f461169u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461155d);
            java.lang.String str = this.f461156e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f461157f);
            fVar.a(4, this.f461158g);
            fVar.h(5, this.f461159h);
            fVar.h(6, this.f461160i);
            fVar.a(7, this.f461161m);
            fVar.h(8, this.f461162n);
            fVar.h(9, this.f461163o);
            java.lang.String str2 = this.f461164p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f461165q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f461166r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f461167s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f461168t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f461169u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461155d) + 0;
            java.lang.String str8 = this.f461156e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            int h17 = e17 + b36.f.h(3, this.f461157f) + b36.f.a(4, this.f461158g) + b36.f.h(5, this.f461159h) + b36.f.h(6, this.f461160i) + b36.f.a(7, this.f461161m) + b36.f.h(8, this.f461162n) + b36.f.h(9, this.f461163o);
            java.lang.String str9 = this.f461164p;
            if (str9 != null) {
                h17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f461165q;
            if (str10 != null) {
                h17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f461166r;
            if (str11 != null) {
                h17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f461167s;
            if (str12 != null) {
                h17 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f461168t;
            if (str13 != null) {
                h17 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f461169u;
            return str14 != null ? h17 + b36.f.j(15, str14) : h17;
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
        r45.lm5 lm5Var = (r45.lm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lm5Var.f461155d = aVar2.g(intValue);
                return 0;
            case 2:
                lm5Var.f461156e = aVar2.k(intValue);
                return 0;
            case 3:
                lm5Var.f461157f = aVar2.i(intValue);
                return 0;
            case 4:
                lm5Var.f461158g = aVar2.c(intValue);
                return 0;
            case 5:
                lm5Var.f461159h = aVar2.i(intValue);
                return 0;
            case 6:
                lm5Var.f461160i = aVar2.i(intValue);
                return 0;
            case 7:
                lm5Var.f461161m = aVar2.c(intValue);
                return 0;
            case 8:
                lm5Var.f461162n = aVar2.i(intValue);
                return 0;
            case 9:
                lm5Var.f461163o = aVar2.i(intValue);
                return 0;
            case 10:
                lm5Var.f461164p = aVar2.k(intValue);
                return 0;
            case 11:
                lm5Var.f461165q = aVar2.k(intValue);
                return 0;
            case 12:
                lm5Var.f461166r = aVar2.k(intValue);
                return 0;
            case 13:
                lm5Var.f461167s = aVar2.k(intValue);
                return 0;
            case 14:
                lm5Var.f461168t = aVar2.k(intValue);
                return 0;
            case 15:
                lm5Var.f461169u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
