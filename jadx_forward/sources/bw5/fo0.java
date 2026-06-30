package bw5;

/* loaded from: classes2.dex */
public class fo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108950d;

    /* renamed from: e, reason: collision with root package name */
    public int f108951e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108952f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108953g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108954h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108955i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108956m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108957n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f108958o = new boolean[9];

    static {
        new bw5.fo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fo0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fo0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fo0)) {
            return false;
        }
        bw5.fo0 fo0Var = (bw5.fo0) fVar;
        return n51.f.a(this.f108950d, fo0Var.f108950d) && n51.f.a(java.lang.Integer.valueOf(this.f108951e), java.lang.Integer.valueOf(fo0Var.f108951e)) && n51.f.a(this.f108952f, fo0Var.f108952f) && n51.f.a(this.f108953g, fo0Var.f108953g) && n51.f.a(this.f108954h, fo0Var.f108954h) && n51.f.a(this.f108955i, fo0Var.f108955i) && n51.f.a(this.f108956m, fo0Var.f108956m) && n51.f.a(this.f108957n, fo0Var.f108957n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108958o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108950d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108951e);
            }
            java.lang.String str2 = this.f108952f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f108953g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f108954h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f108955i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f108956m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f108957n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f108950d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108951e);
            }
            java.lang.String str9 = this.f108952f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f108953g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f108954h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f108955i;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f108956m;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f108957n;
            return (str14 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str14);
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
                this.f108950d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108951e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108952f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108953g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108954h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108955i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108956m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108957n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
