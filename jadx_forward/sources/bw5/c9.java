package bw5;

/* loaded from: classes9.dex */
public class c9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107507d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107508e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107509f;

    /* renamed from: g, reason: collision with root package name */
    public int f107510g;

    /* renamed from: h, reason: collision with root package name */
    public int f107511h;

    /* renamed from: i, reason: collision with root package name */
    public int f107512i;

    /* renamed from: m, reason: collision with root package name */
    public int f107513m;

    /* renamed from: n, reason: collision with root package name */
    public int f107514n;

    /* renamed from: o, reason: collision with root package name */
    public int f107515o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.c7 f107516p;

    /* renamed from: q, reason: collision with root package name */
    public int f107517q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.b9 f107518r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.l6 f107519s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f107520t = new boolean[14];

    static {
        new bw5.c9();
    }

    public bw5.c7 b() {
        return this.f107520t[10] ? this.f107516p : new bw5.c7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.c9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c9)) {
            return false;
        }
        bw5.c9 c9Var = (bw5.c9) fVar;
        return n51.f.a(this.f107507d, c9Var.f107507d) && n51.f.a(this.f107508e, c9Var.f107508e) && n51.f.a(this.f107509f, c9Var.f107509f) && n51.f.a(java.lang.Integer.valueOf(this.f107510g), java.lang.Integer.valueOf(c9Var.f107510g)) && n51.f.a(java.lang.Integer.valueOf(this.f107511h), java.lang.Integer.valueOf(c9Var.f107511h)) && n51.f.a(java.lang.Integer.valueOf(this.f107512i), java.lang.Integer.valueOf(c9Var.f107512i)) && n51.f.a(java.lang.Integer.valueOf(this.f107513m), java.lang.Integer.valueOf(c9Var.f107513m)) && n51.f.a(java.lang.Integer.valueOf(this.f107514n), java.lang.Integer.valueOf(c9Var.f107514n)) && n51.f.a(java.lang.Integer.valueOf(this.f107515o), java.lang.Integer.valueOf(c9Var.f107515o)) && n51.f.a(this.f107516p, c9Var.f107516p) && n51.f.a(java.lang.Integer.valueOf(this.f107517q), java.lang.Integer.valueOf(c9Var.f107517q)) && n51.f.a(this.f107518r, c9Var.f107518r) && n51.f.a(this.f107519s, c9Var.f107519s);
    }

    public bw5.c9 d(int i17) {
        this.f107510g = i17;
        this.f107520t[4] = true;
        return this;
    }

    public bw5.c9 e(java.lang.String str) {
        this.f107507d = str;
        this.f107520t[1] = true;
        return this;
    }

    public bw5.c9 f(java.lang.String str) {
        this.f107508e = str;
        this.f107520t[2] = true;
        return this;
    }

    public bw5.c9 g(java.lang.String str) {
        this.f107509f = str;
        this.f107520t[3] = true;
        return this;
    }

    /* renamed from: getText */
    public java.lang.String m11655xfb85ada3() {
        return this.f107520t[1] ? this.f107507d : "";
    }

    public bw5.c9 i(int i17) {
        this.f107515o = i17;
        this.f107520t[9] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107520t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107507d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107508e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107509f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107510g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107511h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107512i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107513m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107514n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107515o);
            }
            bw5.c7 c7Var = this.f107516p;
            if (c7Var != null && zArr[10]) {
                fVar.i(10, c7Var.mo75928xcd1e8d8());
                this.f107516p.mo75956x3d5d1f78(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f107517q);
            }
            bw5.b9 b9Var = this.f107518r;
            if (b9Var != null && zArr[12]) {
                fVar.i(12, b9Var.mo75928xcd1e8d8());
                this.f107518r.mo75956x3d5d1f78(fVar);
            }
            bw5.l6 l6Var = this.f107519s;
            if (l6Var == null || !zArr[13]) {
                return 0;
            }
            fVar.i(13, l6Var.mo75928xcd1e8d8());
            this.f107519s.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f107507d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            java.lang.String str5 = this.f107508e;
            if (str5 != null && zArr[2]) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f107509f;
            if (str6 != null && zArr[3]) {
                j17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f107510g);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f107511h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f107512i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f107513m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f107514n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f107515o);
            }
            bw5.c7 c7Var2 = this.f107516p;
            if (c7Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, c7Var2.mo75928xcd1e8d8());
            }
            if (zArr[11]) {
                j17 += b36.f.e(11, this.f107517q);
            }
            bw5.b9 b9Var2 = this.f107518r;
            if (b9Var2 != null && zArr[12]) {
                j17 += b36.f.i(12, b9Var2.mo75928xcd1e8d8());
            }
            bw5.l6 l6Var2 = this.f107519s;
            return (l6Var2 == null || !zArr[13]) ? j17 : j17 + b36.f.i(13, l6Var2.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f107507d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107508e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107509f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107510g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107511h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107512i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107513m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107514n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107515o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.c7 c7Var3 = new bw5.c7();
                    if (bArr != null && bArr.length > 0) {
                        c7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107516p = c7Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f107517q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.b9 b9Var3 = new bw5.b9();
                    if (bArr2 != null && bArr2.length > 0) {
                        b9Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107518r = b9Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.l6 l6Var3 = new bw5.l6();
                    if (bArr3 != null && bArr3.length > 0) {
                        l6Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f107519s = l6Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
