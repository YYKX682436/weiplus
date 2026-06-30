package r45;

/* loaded from: classes9.dex */
public class cx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453416d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453417e;

    /* renamed from: f, reason: collision with root package name */
    public long f453418f;

    /* renamed from: g, reason: collision with root package name */
    public int f453419g;

    /* renamed from: h, reason: collision with root package name */
    public int f453420h;

    /* renamed from: i, reason: collision with root package name */
    public int f453421i;

    /* renamed from: m, reason: collision with root package name */
    public int f453422m;

    /* renamed from: n, reason: collision with root package name */
    public int f453423n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453424o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453425p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453426q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453427r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f453428s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f453429t;

    /* renamed from: u, reason: collision with root package name */
    public int f453430u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx3)) {
            return false;
        }
        r45.cx3 cx3Var = (r45.cx3) fVar;
        return n51.f.a(this.f453416d, cx3Var.f453416d) && n51.f.a(this.f453417e, cx3Var.f453417e) && n51.f.a(java.lang.Long.valueOf(this.f453418f), java.lang.Long.valueOf(cx3Var.f453418f)) && n51.f.a(java.lang.Integer.valueOf(this.f453419g), java.lang.Integer.valueOf(cx3Var.f453419g)) && n51.f.a(java.lang.Integer.valueOf(this.f453420h), java.lang.Integer.valueOf(cx3Var.f453420h)) && n51.f.a(java.lang.Integer.valueOf(this.f453421i), java.lang.Integer.valueOf(cx3Var.f453421i)) && n51.f.a(java.lang.Integer.valueOf(this.f453422m), java.lang.Integer.valueOf(cx3Var.f453422m)) && n51.f.a(java.lang.Integer.valueOf(this.f453423n), java.lang.Integer.valueOf(cx3Var.f453423n)) && n51.f.a(this.f453424o, cx3Var.f453424o) && n51.f.a(this.f453425p, cx3Var.f453425p) && n51.f.a(this.f453426q, cx3Var.f453426q) && n51.f.a(this.f453427r, cx3Var.f453427r) && n51.f.a(this.f453428s, cx3Var.f453428s) && n51.f.a(this.f453429t, cx3Var.f453429t) && n51.f.a(java.lang.Integer.valueOf(this.f453430u), java.lang.Integer.valueOf(cx3Var.f453430u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453416d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453417e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f453418f);
            fVar.e(4, this.f453419g);
            fVar.e(5, this.f453420h);
            fVar.e(6, this.f453421i);
            fVar.e(7, this.f453422m);
            fVar.e(8, this.f453423n);
            java.lang.String str3 = this.f453424o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f453425p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f453426q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f453427r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f453428s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f453429t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.e(15, this.f453430u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f453416d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f453417e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int h17 = j17 + b36.f.h(3, this.f453418f) + b36.f.e(4, this.f453419g) + b36.f.e(5, this.f453420h) + b36.f.e(6, this.f453421i) + b36.f.e(7, this.f453422m) + b36.f.e(8, this.f453423n);
            java.lang.String str11 = this.f453424o;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f453425p;
            if (str12 != null) {
                h17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f453426q;
            if (str13 != null) {
                h17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f453427r;
            if (str14 != null) {
                h17 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f453428s;
            if (str15 != null) {
                h17 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f453429t;
            if (str16 != null) {
                h17 += b36.f.j(14, str16);
            }
            return h17 + b36.f.e(15, this.f453430u);
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
        r45.cx3 cx3Var = (r45.cx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cx3Var.f453416d = aVar2.k(intValue);
                return 0;
            case 2:
                cx3Var.f453417e = aVar2.k(intValue);
                return 0;
            case 3:
                cx3Var.f453418f = aVar2.i(intValue);
                return 0;
            case 4:
                cx3Var.f453419g = aVar2.g(intValue);
                return 0;
            case 5:
                cx3Var.f453420h = aVar2.g(intValue);
                return 0;
            case 6:
                cx3Var.f453421i = aVar2.g(intValue);
                return 0;
            case 7:
                cx3Var.f453422m = aVar2.g(intValue);
                return 0;
            case 8:
                cx3Var.f453423n = aVar2.g(intValue);
                return 0;
            case 9:
                cx3Var.f453424o = aVar2.k(intValue);
                return 0;
            case 10:
                cx3Var.f453425p = aVar2.k(intValue);
                return 0;
            case 11:
                cx3Var.f453426q = aVar2.k(intValue);
                return 0;
            case 12:
                cx3Var.f453427r = aVar2.k(intValue);
                return 0;
            case 13:
                cx3Var.f453428s = aVar2.k(intValue);
                return 0;
            case 14:
                cx3Var.f453429t = aVar2.k(intValue);
                return 0;
            case 15:
                cx3Var.f453430u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
