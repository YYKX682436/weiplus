package bw5;

/* loaded from: classes2.dex */
public class lp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final bw5.lp0 f111423v = new bw5.lp0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f111424d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111425e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.gq0 f111426f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fq0 f111427g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111428h;

    /* renamed from: i, reason: collision with root package name */
    public int f111429i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.q50 f111430m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111431n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.u50 f111432o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.u70 f111433p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f111434q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.s70 f111435r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f111436s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f111437t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f111438u = new boolean[19];

    public java.lang.String b() {
        return this.f111438u[2] ? this.f111425e : "";
    }

    public bw5.fq0 c() {
        return this.f111438u[7] ? this.f111427g : new bw5.fq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lp0)) {
            return false;
        }
        bw5.lp0 lp0Var = (bw5.lp0) fVar;
        return n51.f.a(this.f111424d, lp0Var.f111424d) && n51.f.a(this.f111425e, lp0Var.f111425e) && n51.f.a(this.f111426f, lp0Var.f111426f) && n51.f.a(this.f111427g, lp0Var.f111427g) && n51.f.a(this.f111428h, lp0Var.f111428h) && n51.f.a(java.lang.Integer.valueOf(this.f111429i), java.lang.Integer.valueOf(lp0Var.f111429i)) && n51.f.a(this.f111430m, lp0Var.f111430m) && n51.f.a(this.f111431n, lp0Var.f111431n) && n51.f.a(this.f111432o, lp0Var.f111432o) && n51.f.a(this.f111433p, lp0Var.f111433p) && n51.f.a(java.lang.Boolean.valueOf(this.f111434q), java.lang.Boolean.valueOf(lp0Var.f111434q)) && n51.f.a(this.f111435r, lp0Var.f111435r) && n51.f.a(this.f111436s, lp0Var.f111436s) && n51.f.a(this.f111437t, lp0Var.f111437t);
    }

    public bw5.v70 d() {
        return this.f111438u[1] ? this.f111424d : new bw5.v70();
    }

    public bw5.gq0 e() {
        return this.f111438u[4] ? this.f111426f : new bw5.gq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.lp0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.lp0) super.mo11468x92b714fd(bArr);
    }

    public bw5.lp0 g(java.lang.String str) {
        this.f111425e = str;
        this.f111438u[2] = true;
        return this;
    }

    public bw5.lp0 i(bw5.fq0 fq0Var) {
        this.f111427g = fq0Var;
        this.f111438u[7] = true;
        return this;
    }

    public bw5.lp0 j(bw5.v70 v70Var) {
        this.f111424d = v70Var;
        this.f111438u[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111438u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f111424d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.mo75928xcd1e8d8());
                this.f111424d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f111425e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.gq0 gq0Var = this.f111426f;
            if (gq0Var != null && zArr[4]) {
                fVar.i(4, gq0Var.mo75928xcd1e8d8());
                this.f111426f.mo75956x3d5d1f78(fVar);
            }
            bw5.fq0 fq0Var = this.f111427g;
            if (fq0Var != null && zArr[7]) {
                fVar.i(7, fq0Var.mo75928xcd1e8d8());
                this.f111427g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f111428h;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f111429i);
            }
            bw5.q50 q50Var = this.f111430m;
            if (q50Var != null && zArr[10]) {
                fVar.i(10, q50Var.mo75928xcd1e8d8());
                this.f111430m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f111431n;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            bw5.u50 u50Var = this.f111432o;
            if (u50Var != null && zArr[12]) {
                fVar.i(12, u50Var.mo75928xcd1e8d8());
                this.f111432o.mo75956x3d5d1f78(fVar);
            }
            bw5.u70 u70Var = this.f111433p;
            if (u70Var != null && zArr[14]) {
                fVar.i(14, u70Var.mo75928xcd1e8d8());
                this.f111433p.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.a(15, this.f111434q);
            }
            bw5.s70 s70Var = this.f111435r;
            if (s70Var != null && zArr[16]) {
                fVar.i(16, s70Var.mo75928xcd1e8d8());
                this.f111435r.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f111436s;
            if (str4 != null && zArr[17]) {
                fVar.j(17, str4);
            }
            java.lang.String str5 = this.f111437t;
            if (str5 == null || !zArr[18]) {
                return 0;
            }
            fVar.j(18, str5);
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var2 = this.f111424d;
            int i18 = (v70Var2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, v70Var2.mo75928xcd1e8d8());
            java.lang.String str6 = this.f111425e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.gq0 gq0Var2 = this.f111426f;
            if (gq0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, gq0Var2.mo75928xcd1e8d8());
            }
            bw5.fq0 fq0Var2 = this.f111427g;
            if (fq0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, fq0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f111428h;
            if (str7 != null && zArr[8]) {
                i18 += b36.f.j(8, str7);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f111429i);
            }
            bw5.q50 q50Var2 = this.f111430m;
            if (q50Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, q50Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f111431n;
            if (str8 != null && zArr[11]) {
                i18 += b36.f.j(11, str8);
            }
            bw5.u50 u50Var2 = this.f111432o;
            if (u50Var2 != null && zArr[12]) {
                i18 += b36.f.i(12, u50Var2.mo75928xcd1e8d8());
            }
            bw5.u70 u70Var2 = this.f111433p;
            if (u70Var2 != null && zArr[14]) {
                i18 += b36.f.i(14, u70Var2.mo75928xcd1e8d8());
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f111434q);
            }
            bw5.s70 s70Var2 = this.f111435r;
            if (s70Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, s70Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f111436s;
            if (str9 != null && zArr[17]) {
                i18 += b36.f.j(17, str9);
            }
            java.lang.String str10 = this.f111437t;
            return (str10 == null || !zArr[18]) ? i18 : i18 + b36.f.j(18, str10);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr != null && bArr.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr);
                    }
                    this.f111424d = v70Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f111425e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            case 5:
            case 6:
            case 13:
            default:
                return -1;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.gq0 gq0Var3 = new bw5.gq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gq0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f111426f = gq0Var3;
                }
                zArr[4] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.fq0 fq0Var3 = new bw5.fq0();
                    if (bArr3 != null && bArr3.length > 0) {
                        fq0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f111427g = fq0Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111428h = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111429i = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.q50 q50Var3 = new bw5.q50();
                    if (bArr4 != null && bArr4.length > 0) {
                        q50Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f111430m = q50Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f111431n = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.u50 u50Var3 = new bw5.u50();
                    if (bArr5 != null && bArr5.length > 0) {
                        u50Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f111432o = u50Var3;
                }
                zArr[12] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.u70 u70Var3 = new bw5.u70();
                    if (bArr6 != null && bArr6.length > 0) {
                        u70Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f111433p = u70Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f111434q = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.s70 s70Var3 = new bw5.s70();
                    if (bArr7 != null && bArr7.length > 0) {
                        s70Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f111435r = s70Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f111436s = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f111437t = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}
