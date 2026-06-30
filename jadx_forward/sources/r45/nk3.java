package r45;

/* loaded from: classes9.dex */
public class nk3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462991d;

    /* renamed from: e, reason: collision with root package name */
    public int f462992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462993f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f462994g;

    /* renamed from: h, reason: collision with root package name */
    public double f462995h;

    /* renamed from: i, reason: collision with root package name */
    public double f462996i;

    /* renamed from: m, reason: collision with root package name */
    public double f462997m;

    /* renamed from: n, reason: collision with root package name */
    public double f462998n;

    /* renamed from: o, reason: collision with root package name */
    public int f462999o;

    /* renamed from: p, reason: collision with root package name */
    public double f463000p;

    /* renamed from: q, reason: collision with root package name */
    public int f463001q;

    /* renamed from: r, reason: collision with root package name */
    public int f463002r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f463003s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f463004t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nk3)) {
            return false;
        }
        r45.nk3 nk3Var = (r45.nk3) fVar;
        return n51.f.a(this.f76494x2de60e5e, nk3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f462991d), java.lang.Integer.valueOf(nk3Var.f462991d)) && n51.f.a(java.lang.Integer.valueOf(this.f462992e), java.lang.Integer.valueOf(nk3Var.f462992e)) && n51.f.a(this.f462993f, nk3Var.f462993f) && n51.f.a(this.f462994g, nk3Var.f462994g) && n51.f.a(java.lang.Double.valueOf(this.f462995h), java.lang.Double.valueOf(nk3Var.f462995h)) && n51.f.a(java.lang.Double.valueOf(this.f462996i), java.lang.Double.valueOf(nk3Var.f462996i)) && n51.f.a(java.lang.Double.valueOf(this.f462997m), java.lang.Double.valueOf(nk3Var.f462997m)) && n51.f.a(java.lang.Double.valueOf(this.f462998n), java.lang.Double.valueOf(nk3Var.f462998n)) && n51.f.a(java.lang.Integer.valueOf(this.f462999o), java.lang.Integer.valueOf(nk3Var.f462999o)) && n51.f.a(java.lang.Double.valueOf(this.f463000p), java.lang.Double.valueOf(nk3Var.f463000p)) && n51.f.a(java.lang.Integer.valueOf(this.f463001q), java.lang.Integer.valueOf(nk3Var.f463001q)) && n51.f.a(java.lang.Integer.valueOf(this.f463002r), java.lang.Integer.valueOf(nk3Var.f463002r)) && n51.f.a(this.f463003s, nk3Var.f463003s) && n51.f.a(this.f463004t, nk3Var.f463004t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f462991d);
            fVar.e(3, this.f462992e);
            java.lang.String str = this.f462993f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f462994g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f462994g.mo75956x3d5d1f78(fVar);
            }
            fVar.c(6, this.f462995h);
            fVar.c(7, this.f462996i);
            fVar.c(8, this.f462997m);
            fVar.c(9, this.f462998n);
            fVar.e(10, this.f462999o);
            fVar.c(11, this.f463000p);
            fVar.e(12, this.f463001q);
            fVar.e(13, this.f463002r);
            java.lang.String str2 = this.f463003s;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            java.lang.String str3 = this.f463004t;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f462991d) + b36.f.e(3, this.f462992e);
            java.lang.String str4 = this.f462993f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f462994g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            int c17 = i18 + b36.f.c(6, this.f462995h) + b36.f.c(7, this.f462996i) + b36.f.c(8, this.f462997m) + b36.f.c(9, this.f462998n) + b36.f.e(10, this.f462999o) + b36.f.c(11, this.f463000p) + b36.f.e(12, this.f463001q) + b36.f.e(13, this.f463002r);
            java.lang.String str5 = this.f463003s;
            if (str5 != null) {
                c17 += b36.f.j(14, str5);
            }
            java.lang.String str6 = this.f463004t;
            return str6 != null ? c17 + b36.f.j(15, str6) : c17;
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
        r45.nk3 nk3Var = (r45.nk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    nk3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                nk3Var.f462991d = aVar2.g(intValue);
                return 0;
            case 3:
                nk3Var.f462992e = aVar2.g(intValue);
                return 0;
            case 4:
                nk3Var.f462993f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    nk3Var.f462994g = cu5Var3;
                }
                return 0;
            case 6:
                nk3Var.f462995h = aVar2.e(intValue);
                return 0;
            case 7:
                nk3Var.f462996i = aVar2.e(intValue);
                return 0;
            case 8:
                nk3Var.f462997m = aVar2.e(intValue);
                return 0;
            case 9:
                nk3Var.f462998n = aVar2.e(intValue);
                return 0;
            case 10:
                nk3Var.f462999o = aVar2.g(intValue);
                return 0;
            case 11:
                nk3Var.f463000p = aVar2.e(intValue);
                return 0;
            case 12:
                nk3Var.f463001q = aVar2.g(intValue);
                return 0;
            case 13:
                nk3Var.f463002r = aVar2.g(intValue);
                return 0;
            case 14:
                nk3Var.f463003s = aVar2.k(intValue);
                return 0;
            case 15:
                nk3Var.f463004t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
