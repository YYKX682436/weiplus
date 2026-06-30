package bw5;

/* loaded from: classes9.dex */
public class i5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109993d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109994e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109995f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109996g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109997h;

    /* renamed from: i, reason: collision with root package name */
    public int f109998i;

    /* renamed from: m, reason: collision with root package name */
    public int f109999m;

    /* renamed from: n, reason: collision with root package name */
    public int f110000n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f110001o = new boolean[9];

    static {
        new bw5.i5();
    }

    public java.lang.String b() {
        return this.f110001o[3] ? this.f109995f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.i5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.i5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i5)) {
            return false;
        }
        bw5.i5 i5Var = (bw5.i5) fVar;
        return n51.f.a(this.f109993d, i5Var.f109993d) && n51.f.a(this.f109994e, i5Var.f109994e) && n51.f.a(this.f109995f, i5Var.f109995f) && n51.f.a(this.f109996g, i5Var.f109996g) && n51.f.a(this.f109997h, i5Var.f109997h) && n51.f.a(java.lang.Integer.valueOf(this.f109998i), java.lang.Integer.valueOf(i5Var.f109998i)) && n51.f.a(java.lang.Integer.valueOf(this.f109999m), java.lang.Integer.valueOf(i5Var.f109999m)) && n51.f.a(java.lang.Integer.valueOf(this.f110000n), java.lang.Integer.valueOf(i5Var.f110000n));
    }

    /* renamed from: getNickname */
    public java.lang.String m12123x8010e5e4() {
        return this.f110001o[4] ? this.f109996g : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110001o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109993d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109994e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109995f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f109996g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f109997h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109998i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109999m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f110000n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f109993d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f109994e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f109995f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f109996g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f109997h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f109998i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f109999m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f110000n) : i18;
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
                this.f109993d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109994e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109995f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109996g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109997h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109998i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109999m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110000n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
