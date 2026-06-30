package r45;

/* loaded from: classes9.dex */
public class k6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459948e;

    /* renamed from: f, reason: collision with root package name */
    public int f459949f;

    /* renamed from: g, reason: collision with root package name */
    public int f459950g;

    /* renamed from: h, reason: collision with root package name */
    public int f459951h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459952i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uq0 f459953m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459954n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459955o;

    /* renamed from: p, reason: collision with root package name */
    public int f459956p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f459957q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k6)) {
            return false;
        }
        r45.k6 k6Var = (r45.k6) fVar;
        return n51.f.a(this.f459947d, k6Var.f459947d) && n51.f.a(this.f459948e, k6Var.f459948e) && n51.f.a(java.lang.Integer.valueOf(this.f459949f), java.lang.Integer.valueOf(k6Var.f459949f)) && n51.f.a(java.lang.Integer.valueOf(this.f459950g), java.lang.Integer.valueOf(k6Var.f459950g)) && n51.f.a(java.lang.Integer.valueOf(this.f459951h), java.lang.Integer.valueOf(k6Var.f459951h)) && n51.f.a(this.f459952i, k6Var.f459952i) && n51.f.a(this.f459953m, k6Var.f459953m) && n51.f.a(this.f459954n, k6Var.f459954n) && n51.f.a(this.f459955o, k6Var.f459955o) && n51.f.a(java.lang.Integer.valueOf(this.f459956p), java.lang.Integer.valueOf(k6Var.f459956p)) && n51.f.a(this.f459957q, k6Var.f459957q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459947d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459948e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f459949f);
            fVar.e(4, this.f459950g);
            fVar.e(5, this.f459951h);
            java.lang.String str3 = this.f459952i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.uq0 uq0Var = this.f459953m;
            if (uq0Var != null) {
                fVar.i(7, uq0Var.mo75928xcd1e8d8());
                this.f459953m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f459954n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f459955o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f459956p);
            fVar.g(11, 8, this.f459957q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f459947d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f459948e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f459949f) + b36.f.e(4, this.f459950g) + b36.f.e(5, this.f459951h);
            java.lang.String str8 = this.f459952i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            r45.uq0 uq0Var2 = this.f459953m;
            if (uq0Var2 != null) {
                e17 += b36.f.i(7, uq0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f459954n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f459955o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f459956p) + b36.f.g(11, 8, this.f459957q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459957q.clear();
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
        r45.k6 k6Var = (r45.k6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k6Var.f459947d = aVar2.k(intValue);
                return 0;
            case 2:
                k6Var.f459948e = aVar2.k(intValue);
                return 0;
            case 3:
                k6Var.f459949f = aVar2.g(intValue);
                return 0;
            case 4:
                k6Var.f459950g = aVar2.g(intValue);
                return 0;
            case 5:
                k6Var.f459951h = aVar2.g(intValue);
                return 0;
            case 6:
                k6Var.f459952i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.uq0 uq0Var3 = new r45.uq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        uq0Var3.mo11468x92b714fd(bArr2);
                    }
                    k6Var.f459953m = uq0Var3;
                }
                return 0;
            case 8:
                k6Var.f459954n = aVar2.k(intValue);
                return 0;
            case 9:
                k6Var.f459955o = aVar2.k(intValue);
                return 0;
            case 10:
                k6Var.f459956p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.ln0 ln0Var = new r45.ln0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ln0Var.mo11468x92b714fd(bArr3);
                    }
                    k6Var.f459957q.add(ln0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
