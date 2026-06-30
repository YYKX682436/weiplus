package bw5;

/* loaded from: classes9.dex */
public class s5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114332e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114333f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114334g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114335h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114336i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f114337m;

    /* renamed from: n, reason: collision with root package name */
    public int f114338n;

    /* renamed from: o, reason: collision with root package name */
    public int f114339o;

    /* renamed from: p, reason: collision with root package name */
    public int f114340p;

    /* renamed from: q, reason: collision with root package name */
    public int f114341q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f114342r = new boolean[12];

    static {
        new bw5.s5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s5)) {
            return false;
        }
        bw5.s5 s5Var = (bw5.s5) fVar;
        return n51.f.a(this.f114331d, s5Var.f114331d) && n51.f.a(this.f114332e, s5Var.f114332e) && n51.f.a(this.f114333f, s5Var.f114333f) && n51.f.a(this.f114334g, s5Var.f114334g) && n51.f.a(this.f114335h, s5Var.f114335h) && n51.f.a(this.f114336i, s5Var.f114336i) && n51.f.a(this.f114337m, s5Var.f114337m) && n51.f.a(java.lang.Integer.valueOf(this.f114338n), java.lang.Integer.valueOf(s5Var.f114338n)) && n51.f.a(java.lang.Integer.valueOf(this.f114339o), java.lang.Integer.valueOf(s5Var.f114339o)) && n51.f.a(java.lang.Integer.valueOf(this.f114340p), java.lang.Integer.valueOf(s5Var.f114340p)) && n51.f.a(java.lang.Integer.valueOf(this.f114341q), java.lang.Integer.valueOf(s5Var.f114341q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114342r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114331d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114332e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114333f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f114334g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f114335h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f114336i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f114337m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114338n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f114339o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f114340p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114341q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f114331d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f114332e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f114333f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f114334g;
            if (str11 != null && zArr[4]) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f114335h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f114336i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f114337m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f114338n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f114339o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f114340p);
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f114341q) : i18;
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
                this.f114331d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114332e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114333f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114334g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114335h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114336i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114337m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114338n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114339o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114340p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114341q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
