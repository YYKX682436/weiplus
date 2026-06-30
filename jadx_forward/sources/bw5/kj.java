package bw5;

/* loaded from: classes2.dex */
public class kj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110923f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110925h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110926i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110927m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110928n;

    /* renamed from: o, reason: collision with root package name */
    public int f110929o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110930p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f110931q = new boolean[11];

    static {
        new bw5.kj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kj mo11468x92b714fd(byte[] bArr) {
        return (bw5.kj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kj)) {
            return false;
        }
        bw5.kj kjVar = (bw5.kj) fVar;
        return n51.f.a(this.f110921d, kjVar.f110921d) && n51.f.a(this.f110922e, kjVar.f110922e) && n51.f.a(this.f110923f, kjVar.f110923f) && n51.f.a(this.f110924g, kjVar.f110924g) && n51.f.a(this.f110925h, kjVar.f110925h) && n51.f.a(this.f110926i, kjVar.f110926i) && n51.f.a(this.f110927m, kjVar.f110927m) && n51.f.a(this.f110928n, kjVar.f110928n) && n51.f.a(java.lang.Integer.valueOf(this.f110929o), java.lang.Integer.valueOf(kjVar.f110929o)) && n51.f.a(this.f110930p, kjVar.f110930p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110931q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110921d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110922e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f110923f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f110924g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f110925h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f110926i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f110927m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f110928n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            if (zArr[9]) {
                fVar.e(9, this.f110929o);
            }
            java.lang.String str9 = this.f110930p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f110921d;
            if (str10 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str10);
            }
            java.lang.String str11 = this.f110922e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f110923f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f110924g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f110925h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f110926i;
            if (str15 != null && zArr[6]) {
                i18 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f110927m;
            if (str16 != null && zArr[7]) {
                i18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f110928n;
            if (str17 != null && zArr[8]) {
                i18 += b36.f.j(8, str17);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f110929o);
            }
            java.lang.String str18 = this.f110930p;
            return (str18 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str18);
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
                this.f110921d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110922e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110923f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110924g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110925h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110926i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110927m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110928n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110929o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110930p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
