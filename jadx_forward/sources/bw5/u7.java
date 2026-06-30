package bw5;

/* loaded from: classes9.dex */
public class u7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115287d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115288e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115289f;

    /* renamed from: g, reason: collision with root package name */
    public int f115290g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115291h;

    /* renamed from: i, reason: collision with root package name */
    public int f115292i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115293m;

    /* renamed from: n, reason: collision with root package name */
    public int f115294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115295o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f115296p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f115297q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f115298r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.t7 f115299s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f115300t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f115301u = new boolean[15];

    static {
        new bw5.u7();
    }

    public java.lang.String b() {
        return this.f115301u[2] ? this.f115288e : "";
    }

    public java.lang.String c() {
        return this.f115301u[5] ? this.f115291h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u7)) {
            return false;
        }
        bw5.u7 u7Var = (bw5.u7) fVar;
        return n51.f.a(this.f115287d, u7Var.f115287d) && n51.f.a(this.f115288e, u7Var.f115288e) && n51.f.a(this.f115289f, u7Var.f115289f) && n51.f.a(java.lang.Integer.valueOf(this.f115290g), java.lang.Integer.valueOf(u7Var.f115290g)) && n51.f.a(this.f115291h, u7Var.f115291h) && n51.f.a(java.lang.Integer.valueOf(this.f115292i), java.lang.Integer.valueOf(u7Var.f115292i)) && n51.f.a(java.lang.Boolean.valueOf(this.f115293m), java.lang.Boolean.valueOf(u7Var.f115293m)) && n51.f.a(java.lang.Integer.valueOf(this.f115294n), java.lang.Integer.valueOf(u7Var.f115294n)) && n51.f.a(java.lang.Boolean.valueOf(this.f115295o), java.lang.Boolean.valueOf(u7Var.f115295o)) && n51.f.a(this.f115296p, u7Var.f115296p) && n51.f.a(java.lang.Boolean.valueOf(this.f115297q), java.lang.Boolean.valueOf(u7Var.f115297q)) && n51.f.a(java.lang.Boolean.valueOf(this.f115298r), java.lang.Boolean.valueOf(u7Var.f115298r)) && n51.f.a(this.f115299s, u7Var.f115299s) && n51.f.a(this.f115300t, u7Var.f115300t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.u7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u7) super.mo11468x92b714fd(bArr);
    }

    public bw5.u7 e(java.lang.String str) {
        this.f115287d = str;
        this.f115301u[1] = true;
        return this;
    }

    public bw5.u7 f(java.lang.String str) {
        this.f115289f = str;
        this.f115301u[3] = true;
        return this;
    }

    public bw5.u7 g(int i17) {
        this.f115290g = i17;
        this.f115301u[4] = true;
        return this;
    }

    /* renamed from: getAppid */
    public java.lang.String m13091x74292946() {
        return this.f115301u[1] ? this.f115287d : "";
    }

    /* renamed from: getPath */
    public java.lang.String m13092xfb83cc9b() {
        return this.f115301u[3] ? this.f115289f : "";
    }

    /* renamed from: getScene */
    public int m13093x7520bed6() {
        return this.f115290g;
    }

    public bw5.u7 i(java.lang.String str) {
        this.f115291h = str;
        this.f115301u[5] = true;
        return this;
    }

    public bw5.u7 j(int i17) {
        this.f115292i = i17;
        this.f115301u[6] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115301u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115287d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115288e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f115289f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115290g);
            }
            java.lang.String str4 = this.f115291h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115292i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f115293m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115294n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f115295o);
            }
            java.lang.String str5 = this.f115296p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.a(11, this.f115297q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f115298r);
            }
            bw5.t7 t7Var = this.f115299s;
            if (t7Var != null && zArr[13]) {
                fVar.i(13, t7Var.mo75928xcd1e8d8());
                this.f115299s.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f115300t;
            if (str6 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f115287d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f115288e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f115289f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f115290g);
            }
            java.lang.String str10 = this.f115291h;
            if (str10 != null && zArr[5]) {
                j17 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f115292i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f115293m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f115294n);
            }
            if (zArr[9]) {
                j17 += b36.f.a(9, this.f115295o);
            }
            java.lang.String str11 = this.f115296p;
            if (str11 != null && zArr[10]) {
                j17 += b36.f.j(10, str11);
            }
            if (zArr[11]) {
                j17 += b36.f.a(11, this.f115297q);
            }
            if (zArr[12]) {
                j17 += b36.f.a(12, this.f115298r);
            }
            bw5.t7 t7Var2 = this.f115299s;
            if (t7Var2 != null && zArr[13]) {
                j17 += b36.f.i(13, t7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f115300t;
            return (str12 == null || !zArr[14]) ? j17 : j17 + b36.f.j(14, str12);
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
                this.f115287d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115288e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115289f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115290g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115291h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115292i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115293m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115294n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115295o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115296p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115297q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115298r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.t7 t7Var3 = new bw5.t7();
                    if (bArr != null && bArr.length > 0) {
                        t7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115299s = t7Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f115300t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
