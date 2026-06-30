package bw5;

/* loaded from: classes2.dex */
public class en0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f108496d;

    /* renamed from: e, reason: collision with root package name */
    public double f108497e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108498f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108499g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108500h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108501i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108502m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108503n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108504o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108505p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f108506q = new boolean[11];

    static {
        new bw5.en0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.en0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.en0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.en0)) {
            return false;
        }
        bw5.en0 en0Var = (bw5.en0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f108496d), java.lang.Double.valueOf(en0Var.f108496d)) && n51.f.a(java.lang.Double.valueOf(this.f108497e), java.lang.Double.valueOf(en0Var.f108497e)) && n51.f.a(this.f108498f, en0Var.f108498f) && n51.f.a(this.f108499g, en0Var.f108499g) && n51.f.a(this.f108500h, en0Var.f108500h) && n51.f.a(this.f108501i, en0Var.f108501i) && n51.f.a(this.f108502m, en0Var.f108502m) && n51.f.a(this.f108503n, en0Var.f108503n) && n51.f.a(this.f108504o, en0Var.f108504o) && n51.f.a(this.f108505p, en0Var.f108505p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.en0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108506q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f108496d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f108497e);
            }
            java.lang.String str = this.f108498f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f108499g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f108500h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f108501i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f108502m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f108503n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f108504o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f108505p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f108496d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f108497e);
            }
            java.lang.String str9 = this.f108498f;
            if (str9 != null && zArr[3]) {
                c17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f108499g;
            if (str10 != null && zArr[4]) {
                c17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f108500h;
            if (str11 != null && zArr[5]) {
                c17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f108501i;
            if (str12 != null && zArr[6]) {
                c17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f108502m;
            if (str13 != null && zArr[7]) {
                c17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f108503n;
            if (str14 != null && zArr[8]) {
                c17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f108504o;
            if (str15 != null && zArr[9]) {
                c17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f108505p;
            return (str16 == null || !zArr[10]) ? c17 : c17 + b36.f.j(10, str16);
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
                this.f108496d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108497e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108498f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108499g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108500h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108501i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108502m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108503n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108504o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108505p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
