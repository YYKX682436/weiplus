package r45;

/* loaded from: classes10.dex */
public class ji0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f459355d;

    /* renamed from: e, reason: collision with root package name */
    public float f459356e;

    /* renamed from: f, reason: collision with root package name */
    public int f459357f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459358g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459359h;

    /* renamed from: i, reason: collision with root package name */
    public float f459360i;

    /* renamed from: m, reason: collision with root package name */
    public int f459361m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459362n;

    /* renamed from: o, reason: collision with root package name */
    public int f459363o;

    /* renamed from: p, reason: collision with root package name */
    public int f459364p;

    /* renamed from: q, reason: collision with root package name */
    public r45.he6 f459365q;

    /* renamed from: r, reason: collision with root package name */
    public r45.di0 f459366r;

    /* renamed from: s, reason: collision with root package name */
    public r45.kp f459367s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ji0)) {
            return false;
        }
        r45.ji0 ji0Var = (r45.ji0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f459355d), java.lang.Float.valueOf(ji0Var.f459355d)) && n51.f.a(java.lang.Float.valueOf(this.f459356e), java.lang.Float.valueOf(ji0Var.f459356e)) && n51.f.a(java.lang.Integer.valueOf(this.f459357f), java.lang.Integer.valueOf(ji0Var.f459357f)) && n51.f.a(this.f459358g, ji0Var.f459358g) && n51.f.a(this.f459359h, ji0Var.f459359h) && n51.f.a(java.lang.Float.valueOf(this.f459360i), java.lang.Float.valueOf(ji0Var.f459360i)) && n51.f.a(java.lang.Integer.valueOf(this.f459361m), java.lang.Integer.valueOf(ji0Var.f459361m)) && n51.f.a(this.f459362n, ji0Var.f459362n) && n51.f.a(java.lang.Integer.valueOf(this.f459363o), java.lang.Integer.valueOf(ji0Var.f459363o)) && n51.f.a(java.lang.Integer.valueOf(this.f459364p), java.lang.Integer.valueOf(ji0Var.f459364p)) && n51.f.a(this.f459365q, ji0Var.f459365q) && n51.f.a(this.f459366r, ji0Var.f459366r) && n51.f.a(this.f459367s, ji0Var.f459367s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f459355d);
            fVar.d(2, this.f459356e);
            fVar.e(3, this.f459357f);
            java.lang.String str = this.f459358g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f459359h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.d(6, this.f459360i);
            fVar.e(7, this.f459361m);
            java.lang.String str3 = this.f459362n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f459363o);
            fVar.e(10, this.f459364p);
            r45.he6 he6Var = this.f459365q;
            if (he6Var != null) {
                fVar.i(11, he6Var.mo75928xcd1e8d8());
                this.f459365q.mo75956x3d5d1f78(fVar);
            }
            r45.di0 di0Var = this.f459366r;
            if (di0Var != null) {
                fVar.i(12, di0Var.mo75928xcd1e8d8());
                this.f459366r.mo75956x3d5d1f78(fVar);
            }
            r45.kp kpVar = this.f459367s;
            if (kpVar == null) {
                return 0;
            }
            fVar.i(13, kpVar.mo75928xcd1e8d8());
            this.f459367s.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f459355d) + 0 + b36.f.d(2, this.f459356e) + b36.f.e(3, this.f459357f);
            java.lang.String str4 = this.f459358g;
            if (str4 != null) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f459359h;
            if (str5 != null) {
                d17 += b36.f.j(5, str5);
            }
            int d18 = d17 + b36.f.d(6, this.f459360i) + b36.f.e(7, this.f459361m);
            java.lang.String str6 = this.f459362n;
            if (str6 != null) {
                d18 += b36.f.j(8, str6);
            }
            int e17 = d18 + b36.f.e(9, this.f459363o) + b36.f.e(10, this.f459364p);
            r45.he6 he6Var2 = this.f459365q;
            if (he6Var2 != null) {
                e17 += b36.f.i(11, he6Var2.mo75928xcd1e8d8());
            }
            r45.di0 di0Var2 = this.f459366r;
            if (di0Var2 != null) {
                e17 += b36.f.i(12, di0Var2.mo75928xcd1e8d8());
            }
            r45.kp kpVar2 = this.f459367s;
            return kpVar2 != null ? e17 + b36.f.i(13, kpVar2.mo75928xcd1e8d8()) : e17;
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
        r45.ji0 ji0Var = (r45.ji0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ji0Var.f459355d = aVar2.f(intValue);
                return 0;
            case 2:
                ji0Var.f459356e = aVar2.f(intValue);
                return 0;
            case 3:
                ji0Var.f459357f = aVar2.g(intValue);
                return 0;
            case 4:
                ji0Var.f459358g = aVar2.k(intValue);
                return 0;
            case 5:
                ji0Var.f459359h = aVar2.k(intValue);
                return 0;
            case 6:
                ji0Var.f459360i = aVar2.f(intValue);
                return 0;
            case 7:
                ji0Var.f459361m = aVar2.g(intValue);
                return 0;
            case 8:
                ji0Var.f459362n = aVar2.k(intValue);
                return 0;
            case 9:
                ji0Var.f459363o = aVar2.g(intValue);
                return 0;
            case 10:
                ji0Var.f459364p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he6 he6Var3 = new r45.he6();
                    if (bArr != null && bArr.length > 0) {
                        he6Var3.mo11468x92b714fd(bArr);
                    }
                    ji0Var.f459365q = he6Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.di0 di0Var3 = new r45.di0();
                    if (bArr2 != null && bArr2.length > 0) {
                        di0Var3.mo11468x92b714fd(bArr2);
                    }
                    ji0Var.f459366r = di0Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.kp kpVar3 = new r45.kp();
                    if (bArr3 != null && bArr3.length > 0) {
                        kpVar3.mo11468x92b714fd(bArr3);
                    }
                    ji0Var.f459367s = kpVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
