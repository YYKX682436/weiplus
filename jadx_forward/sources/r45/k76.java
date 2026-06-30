package r45;

/* loaded from: classes4.dex */
public class k76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459994g;

    /* renamed from: h, reason: collision with root package name */
    public int f459995h;

    /* renamed from: i, reason: collision with root package name */
    public int f459996i;

    /* renamed from: m, reason: collision with root package name */
    public int f459997m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459998n;

    /* renamed from: o, reason: collision with root package name */
    public int f459999o;

    /* renamed from: p, reason: collision with root package name */
    public int f460000p;

    /* renamed from: q, reason: collision with root package name */
    public int f460001q;

    /* renamed from: r, reason: collision with root package name */
    public long f460002r;

    /* renamed from: s, reason: collision with root package name */
    public long f460003s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cu5 f460004t;

    /* renamed from: u, reason: collision with root package name */
    public int f460005u;

    /* renamed from: v, reason: collision with root package name */
    public r45.mo5 f460006v;

    /* renamed from: x, reason: collision with root package name */
    public int f460008x;

    /* renamed from: y, reason: collision with root package name */
    public int f460009y;

    /* renamed from: z, reason: collision with root package name */
    public int f460010z;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f460007w = new java.util.LinkedList();
    public java.util.LinkedList B = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k76)) {
            return false;
        }
        r45.k76 k76Var = (r45.k76) fVar;
        return n51.f.a(this.f459991d, k76Var.f459991d) && n51.f.a(this.f459992e, k76Var.f459992e) && n51.f.a(this.f459993f, k76Var.f459993f) && n51.f.a(this.f459994g, k76Var.f459994g) && n51.f.a(java.lang.Integer.valueOf(this.f459995h), java.lang.Integer.valueOf(k76Var.f459995h)) && n51.f.a(java.lang.Integer.valueOf(this.f459996i), java.lang.Integer.valueOf(k76Var.f459996i)) && n51.f.a(java.lang.Integer.valueOf(this.f459997m), java.lang.Integer.valueOf(k76Var.f459997m)) && n51.f.a(this.f459998n, k76Var.f459998n) && n51.f.a(java.lang.Integer.valueOf(this.f459999o), java.lang.Integer.valueOf(k76Var.f459999o)) && n51.f.a(java.lang.Integer.valueOf(this.f460000p), java.lang.Integer.valueOf(k76Var.f460000p)) && n51.f.a(java.lang.Integer.valueOf(this.f460001q), java.lang.Integer.valueOf(k76Var.f460001q)) && n51.f.a(java.lang.Long.valueOf(this.f460002r), java.lang.Long.valueOf(k76Var.f460002r)) && n51.f.a(java.lang.Long.valueOf(this.f460003s), java.lang.Long.valueOf(k76Var.f460003s)) && n51.f.a(this.f460004t, k76Var.f460004t) && n51.f.a(java.lang.Integer.valueOf(this.f460005u), java.lang.Integer.valueOf(k76Var.f460005u)) && n51.f.a(this.f460006v, k76Var.f460006v) && n51.f.a(this.f460007w, k76Var.f460007w) && n51.f.a(java.lang.Integer.valueOf(this.f460008x), java.lang.Integer.valueOf(k76Var.f460008x)) && n51.f.a(java.lang.Integer.valueOf(this.f460009y), java.lang.Integer.valueOf(k76Var.f460009y)) && n51.f.a(java.lang.Integer.valueOf(this.f460010z), java.lang.Integer.valueOf(k76Var.f460010z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(k76Var.A)) && n51.f.a(this.B, k76Var.B);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459991d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459992e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459993f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f459994g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f459995h);
            fVar.e(6, this.f459996i);
            fVar.e(7, this.f459997m);
            java.lang.String str5 = this.f459998n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f459999o);
            fVar.e(10, this.f460000p);
            fVar.e(11, this.f460001q);
            fVar.h(12, this.f460002r);
            fVar.h(13, this.f460003s);
            r45.cu5 cu5Var = this.f460004t;
            if (cu5Var != null) {
                fVar.i(14, cu5Var.mo75928xcd1e8d8());
                this.f460004t.mo75956x3d5d1f78(fVar);
            }
            fVar.e(15, this.f460005u);
            r45.mo5 mo5Var = this.f460006v;
            if (mo5Var != null) {
                fVar.i(16, mo5Var.mo75928xcd1e8d8());
                this.f460006v.mo75956x3d5d1f78(fVar);
            }
            fVar.g(17, 8, this.f460007w);
            fVar.e(18, this.f460008x);
            fVar.e(22, this.f460009y);
            fVar.e(23, this.f460010z);
            fVar.e(24, this.A);
            fVar.g(25, 8, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f459991d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f459992e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f459993f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f459994g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f459995h) + b36.f.e(6, this.f459996i) + b36.f.e(7, this.f459997m);
            java.lang.String str10 = this.f459998n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            int e18 = e17 + b36.f.e(9, this.f459999o) + b36.f.e(10, this.f460000p) + b36.f.e(11, this.f460001q) + b36.f.h(12, this.f460002r) + b36.f.h(13, this.f460003s);
            r45.cu5 cu5Var2 = this.f460004t;
            if (cu5Var2 != null) {
                e18 += b36.f.i(14, cu5Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(15, this.f460005u);
            r45.mo5 mo5Var2 = this.f460006v;
            if (mo5Var2 != null) {
                e19 += b36.f.i(16, mo5Var2.mo75928xcd1e8d8());
            }
            return e19 + b36.f.g(17, 8, this.f460007w) + b36.f.e(18, this.f460008x) + b36.f.e(22, this.f460009y) + b36.f.e(23, this.f460010z) + b36.f.e(24, this.A) + b36.f.g(25, 8, this.B);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f460007w.clear();
            this.B.clear();
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
        r45.k76 k76Var = (r45.k76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k76Var.f459991d = aVar2.k(intValue);
                return 0;
            case 2:
                k76Var.f459992e = aVar2.k(intValue);
                return 0;
            case 3:
                k76Var.f459993f = aVar2.k(intValue);
                return 0;
            case 4:
                k76Var.f459994g = aVar2.k(intValue);
                return 0;
            case 5:
                k76Var.f459995h = aVar2.g(intValue);
                return 0;
            case 6:
                k76Var.f459996i = aVar2.g(intValue);
                return 0;
            case 7:
                k76Var.f459997m = aVar2.g(intValue);
                return 0;
            case 8:
                k76Var.f459998n = aVar2.k(intValue);
                return 0;
            case 9:
                k76Var.f459999o = aVar2.g(intValue);
                return 0;
            case 10:
                k76Var.f460000p = aVar2.g(intValue);
                return 0;
            case 11:
                k76Var.f460001q = aVar2.g(intValue);
                return 0;
            case 12:
                k76Var.f460002r = aVar2.i(intValue);
                return 0;
            case 13:
                k76Var.f460003s = aVar2.i(intValue);
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    k76Var.f460004t = cu5Var3;
                }
                return 0;
            case 15:
                k76Var.f460005u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.mo5 mo5Var3 = new r45.mo5();
                    if (bArr3 != null && bArr3.length > 0) {
                        mo5Var3.mo11468x92b714fd(bArr3);
                    }
                    k76Var.f460006v = mo5Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr4 != null && bArr4.length > 0) {
                        l86Var.mo11468x92b714fd(bArr4);
                    }
                    k76Var.f460007w.add(l86Var);
                }
                return 0;
            case 18:
                k76Var.f460008x = aVar2.g(intValue);
                return 0;
            case 19:
            case 20:
            case 21:
            default:
                return -1;
            case 22:
                k76Var.f460009y = aVar2.g(intValue);
                return 0;
            case 23:
                k76Var.f460010z = aVar2.g(intValue);
                return 0;
            case 24:
                k76Var.A = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr5 != null && bArr5.length > 0) {
                        d86Var.mo11468x92b714fd(bArr5);
                    }
                    k76Var.B.add(d86Var);
                }
                return 0;
        }
    }
}
