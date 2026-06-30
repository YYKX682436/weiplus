package r45;

/* loaded from: classes10.dex */
public class yx1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472992e;

    /* renamed from: f, reason: collision with root package name */
    public int f472993f;

    /* renamed from: g, reason: collision with root package name */
    public int f472994g;

    /* renamed from: h, reason: collision with root package name */
    public int f472995h;

    /* renamed from: i, reason: collision with root package name */
    public r45.xn1 f472996i;

    /* renamed from: m, reason: collision with root package name */
    public int f472997m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f472998n;

    /* renamed from: o, reason: collision with root package name */
    public r45.by1 f472999o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473000p;

    /* renamed from: q, reason: collision with root package name */
    public int f473001q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f473002r;

    /* renamed from: s, reason: collision with root package name */
    public int f473003s;

    /* renamed from: t, reason: collision with root package name */
    public int f473004t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yx1)) {
            return false;
        }
        r45.yx1 yx1Var = (r45.yx1) fVar;
        return n51.f.a(this.f472991d, yx1Var.f472991d) && n51.f.a(this.f472992e, yx1Var.f472992e) && n51.f.a(java.lang.Integer.valueOf(this.f472993f), java.lang.Integer.valueOf(yx1Var.f472993f)) && n51.f.a(java.lang.Integer.valueOf(this.f472994g), java.lang.Integer.valueOf(yx1Var.f472994g)) && n51.f.a(java.lang.Integer.valueOf(this.f472995h), java.lang.Integer.valueOf(yx1Var.f472995h)) && n51.f.a(this.f472996i, yx1Var.f472996i) && n51.f.a(java.lang.Integer.valueOf(this.f472997m), java.lang.Integer.valueOf(yx1Var.f472997m)) && n51.f.a(java.lang.Boolean.valueOf(this.f472998n), java.lang.Boolean.valueOf(yx1Var.f472998n)) && n51.f.a(this.f472999o, yx1Var.f472999o) && n51.f.a(this.f473000p, yx1Var.f473000p) && n51.f.a(java.lang.Integer.valueOf(this.f473001q), java.lang.Integer.valueOf(yx1Var.f473001q)) && n51.f.a(this.f473002r, yx1Var.f473002r) && n51.f.a(java.lang.Integer.valueOf(this.f473003s), java.lang.Integer.valueOf(yx1Var.f473003s)) && n51.f.a(java.lang.Integer.valueOf(this.f473004t), java.lang.Integer.valueOf(yx1Var.f473004t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472991d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472992e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f472993f);
            fVar.e(4, this.f472994g);
            fVar.e(5, this.f472995h);
            r45.xn1 xn1Var = this.f472996i;
            if (xn1Var != null) {
                fVar.i(6, xn1Var.mo75928xcd1e8d8());
                this.f472996i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f472997m);
            fVar.a(8, this.f472998n);
            r45.by1 by1Var = this.f472999o;
            if (by1Var != null) {
                fVar.i(9, by1Var.mo75928xcd1e8d8());
                this.f472999o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f473000p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f473001q);
            java.lang.String str4 = this.f473002r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f473003s);
            fVar.e(14, this.f473004t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f472991d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f472992e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f472993f) + b36.f.e(4, this.f472994g) + b36.f.e(5, this.f472995h);
            r45.xn1 xn1Var2 = this.f472996i;
            if (xn1Var2 != null) {
                e17 += b36.f.i(6, xn1Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f472997m) + b36.f.a(8, this.f472998n);
            r45.by1 by1Var2 = this.f472999o;
            if (by1Var2 != null) {
                e18 += b36.f.i(9, by1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f473000p;
            if (str7 != null) {
                e18 += b36.f.j(10, str7);
            }
            int e19 = e18 + b36.f.e(11, this.f473001q);
            java.lang.String str8 = this.f473002r;
            if (str8 != null) {
                e19 += b36.f.j(12, str8);
            }
            return e19 + b36.f.e(13, this.f473003s) + b36.f.e(14, this.f473004t);
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
        r45.yx1 yx1Var = (r45.yx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yx1Var.f472991d = aVar2.k(intValue);
                return 0;
            case 2:
                yx1Var.f472992e = aVar2.k(intValue);
                return 0;
            case 3:
                yx1Var.f472993f = aVar2.g(intValue);
                return 0;
            case 4:
                yx1Var.f472994g = aVar2.g(intValue);
                return 0;
            case 5:
                yx1Var.f472995h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.mo11468x92b714fd(bArr);
                    }
                    yx1Var.f472996i = xn1Var3;
                }
                return 0;
            case 7:
                yx1Var.f472997m = aVar2.g(intValue);
                return 0;
            case 8:
                yx1Var.f472998n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.by1 by1Var3 = new r45.by1();
                    if (bArr2 != null && bArr2.length > 0) {
                        by1Var3.mo11468x92b714fd(bArr2);
                    }
                    yx1Var.f472999o = by1Var3;
                }
                return 0;
            case 10:
                yx1Var.f473000p = aVar2.k(intValue);
                return 0;
            case 11:
                yx1Var.f473001q = aVar2.g(intValue);
                return 0;
            case 12:
                yx1Var.f473002r = aVar2.k(intValue);
                return 0;
            case 13:
                yx1Var.f473003s = aVar2.g(intValue);
                return 0;
            case 14:
                yx1Var.f473004t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
