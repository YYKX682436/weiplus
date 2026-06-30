package r45;

/* loaded from: classes4.dex */
public class df6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f453916d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453917e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453918f;

    /* renamed from: g, reason: collision with root package name */
    public int f453919g;

    /* renamed from: h, reason: collision with root package name */
    public int f453920h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f453921i;

    /* renamed from: m, reason: collision with root package name */
    public int f453922m;

    /* renamed from: o, reason: collision with root package name */
    public int f453924o;

    /* renamed from: q, reason: collision with root package name */
    public int f453926q;

    /* renamed from: r, reason: collision with root package name */
    public int f453927r;

    /* renamed from: s, reason: collision with root package name */
    public int f453928s;

    /* renamed from: t, reason: collision with root package name */
    public int f453929t;

    /* renamed from: u, reason: collision with root package name */
    public int f453930u;

    /* renamed from: w, reason: collision with root package name */
    public int f453932w;

    /* renamed from: y, reason: collision with root package name */
    public int f453934y;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f453923n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f453925p = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f453931v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f453933x = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f453935z = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df6)) {
            return false;
        }
        r45.df6 df6Var = (r45.df6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f453916d), java.lang.Long.valueOf(df6Var.f453916d)) && n51.f.a(this.f453917e, df6Var.f453917e) && n51.f.a(this.f453918f, df6Var.f453918f) && n51.f.a(java.lang.Integer.valueOf(this.f453919g), java.lang.Integer.valueOf(df6Var.f453919g)) && n51.f.a(java.lang.Integer.valueOf(this.f453920h), java.lang.Integer.valueOf(df6Var.f453920h)) && n51.f.a(this.f453921i, df6Var.f453921i) && n51.f.a(java.lang.Integer.valueOf(this.f453922m), java.lang.Integer.valueOf(df6Var.f453922m)) && n51.f.a(this.f453923n, df6Var.f453923n) && n51.f.a(java.lang.Integer.valueOf(this.f453924o), java.lang.Integer.valueOf(df6Var.f453924o)) && n51.f.a(this.f453925p, df6Var.f453925p) && n51.f.a(java.lang.Integer.valueOf(this.f453926q), java.lang.Integer.valueOf(df6Var.f453926q)) && n51.f.a(java.lang.Integer.valueOf(this.f453927r), java.lang.Integer.valueOf(df6Var.f453927r)) && n51.f.a(java.lang.Integer.valueOf(this.f453928s), java.lang.Integer.valueOf(df6Var.f453928s)) && n51.f.a(java.lang.Integer.valueOf(this.f453929t), java.lang.Integer.valueOf(df6Var.f453929t)) && n51.f.a(java.lang.Integer.valueOf(this.f453930u), java.lang.Integer.valueOf(df6Var.f453930u)) && n51.f.a(this.f453931v, df6Var.f453931v) && n51.f.a(java.lang.Integer.valueOf(this.f453932w), java.lang.Integer.valueOf(df6Var.f453932w)) && n51.f.a(this.f453933x, df6Var.f453933x) && n51.f.a(java.lang.Integer.valueOf(this.f453934y), java.lang.Integer.valueOf(df6Var.f453934y)) && n51.f.a(this.f453935z, df6Var.f453935z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453935z;
        java.util.LinkedList linkedList2 = this.f453933x;
        java.util.LinkedList linkedList3 = this.f453931v;
        java.util.LinkedList linkedList4 = this.f453925p;
        java.util.LinkedList linkedList5 = this.f453923n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f453916d);
            java.lang.String str = this.f453917e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453918f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f453919g);
            fVar.e(5, this.f453920h);
            r45.cu5 cu5Var = this.f453921i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.mo75928xcd1e8d8());
                this.f453921i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f453922m);
            fVar.g(8, 8, linkedList5);
            fVar.e(9, this.f453924o);
            fVar.g(10, 8, linkedList4);
            fVar.e(11, this.f453926q);
            fVar.e(12, this.f453927r);
            fVar.e(13, this.f453928s);
            fVar.e(14, this.f453929t);
            fVar.e(15, this.f453930u);
            fVar.g(16, 8, linkedList3);
            fVar.e(17, this.f453932w);
            fVar.g(18, 8, linkedList2);
            fVar.e(19, this.f453934y);
            fVar.g(20, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f453916d) + 0;
            java.lang.String str3 = this.f453917e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f453918f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int e17 = h17 + b36.f.e(4, this.f453919g) + b36.f.e(5, this.f453920h);
            r45.cu5 cu5Var2 = this.f453921i;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f453922m) + b36.f.g(8, 8, linkedList5) + b36.f.e(9, this.f453924o) + b36.f.g(10, 8, linkedList4) + b36.f.e(11, this.f453926q) + b36.f.e(12, this.f453927r) + b36.f.e(13, this.f453928s) + b36.f.e(14, this.f453929t) + b36.f.e(15, this.f453930u) + b36.f.g(16, 8, linkedList3) + b36.f.e(17, this.f453932w) + b36.f.g(18, 8, linkedList2) + b36.f.e(19, this.f453934y) + b36.f.g(20, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.df6 df6Var = (r45.df6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                df6Var.f453916d = aVar2.i(intValue);
                return 0;
            case 2:
                df6Var.f453917e = aVar2.k(intValue);
                return 0;
            case 3:
                df6Var.f453918f = aVar2.k(intValue);
                return 0;
            case 4:
                df6Var.f453919g = aVar2.g(intValue);
                return 0;
            case 5:
                df6Var.f453920h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    df6Var.f453921i = cu5Var3;
                }
                return 0;
            case 7:
                df6Var.f453922m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ke6 ke6Var = new r45.ke6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ke6Var.mo11468x92b714fd(bArr3);
                    }
                    df6Var.f453923n.add(ke6Var);
                }
                return 0;
            case 9:
                df6Var.f453924o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.ke6 ke6Var2 = new r45.ke6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ke6Var2.mo11468x92b714fd(bArr4);
                    }
                    df6Var.f453925p.add(ke6Var2);
                }
                return 0;
            case 11:
                df6Var.f453926q = aVar2.g(intValue);
                return 0;
            case 12:
                df6Var.f453927r = aVar2.g(intValue);
                return 0;
            case 13:
                df6Var.f453928s = aVar2.g(intValue);
                return 0;
            case 14:
                df6Var.f453929t = aVar2.g(intValue);
                return 0;
            case 15:
                df6Var.f453930u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var.b(bArr5);
                    }
                    df6Var.f453931v.add(du5Var);
                }
                return 0;
            case 17:
                df6Var.f453932w = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var2.b(bArr6);
                    }
                    df6Var.f453933x.add(du5Var2);
                }
                return 0;
            case 19:
                df6Var.f453934y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.ke6 ke6Var3 = new r45.ke6();
                    if (bArr7 != null && bArr7.length > 0) {
                        ke6Var3.mo11468x92b714fd(bArr7);
                    }
                    df6Var.f453935z.add(ke6Var3);
                }
                return 0;
            default:
                return -1;
        }
    }
}
