package r45;

/* loaded from: classes2.dex */
public class tg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f467928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467930f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467931g;

    /* renamed from: h, reason: collision with root package name */
    public int f467932h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467933i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467934m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467935n;

    /* renamed from: o, reason: collision with root package name */
    public int f467936o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f467937p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg4)) {
            return false;
        }
        r45.tg4 tg4Var = (r45.tg4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f467928d), java.lang.Long.valueOf(tg4Var.f467928d)) && n51.f.a(this.f467929e, tg4Var.f467929e) && n51.f.a(this.f467930f, tg4Var.f467930f) && n51.f.a(this.f467931g, tg4Var.f467931g) && n51.f.a(java.lang.Integer.valueOf(this.f467932h), java.lang.Integer.valueOf(tg4Var.f467932h)) && n51.f.a(this.f467933i, tg4Var.f467933i) && n51.f.a(this.f467934m, tg4Var.f467934m) && n51.f.a(this.f467935n, tg4Var.f467935n) && n51.f.a(java.lang.Integer.valueOf(this.f467936o), java.lang.Integer.valueOf(tg4Var.f467936o)) && n51.f.a(java.lang.Boolean.valueOf(this.f467937p), java.lang.Boolean.valueOf(tg4Var.f467937p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f467928d);
            java.lang.String str = this.f467929e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467930f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467931g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f467932h);
            java.lang.String str4 = this.f467933i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f467934m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f467935n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f467936o);
            fVar.a(10, this.f467937p);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f467928d) + 0;
            java.lang.String str7 = this.f467929e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f467930f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f467931g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            int e17 = h17 + b36.f.e(5, this.f467932h);
            java.lang.String str10 = this.f467933i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f467934m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f467935n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f467936o) + b36.f.a(10, this.f467937p);
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
        r45.tg4 tg4Var = (r45.tg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tg4Var.f467928d = aVar2.i(intValue);
                return 0;
            case 2:
                tg4Var.f467929e = aVar2.k(intValue);
                return 0;
            case 3:
                tg4Var.f467930f = aVar2.k(intValue);
                return 0;
            case 4:
                tg4Var.f467931g = aVar2.k(intValue);
                return 0;
            case 5:
                tg4Var.f467932h = aVar2.g(intValue);
                return 0;
            case 6:
                tg4Var.f467933i = aVar2.k(intValue);
                return 0;
            case 7:
                tg4Var.f467934m = aVar2.k(intValue);
                return 0;
            case 8:
                tg4Var.f467935n = aVar2.k(intValue);
                return 0;
            case 9:
                tg4Var.f467936o = aVar2.g(intValue);
                return 0;
            case 10:
                tg4Var.f467937p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
