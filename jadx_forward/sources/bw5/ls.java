package bw5;

/* loaded from: classes2.dex */
public class ls extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111474d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111475e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111476f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111477g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111478h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111479i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111480m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111481n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111482o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f111483p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f111484q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f111485r = new boolean[25];

    static {
        new bw5.ls();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ls mo11468x92b714fd(byte[] bArr) {
        return (bw5.ls) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ls)) {
            return false;
        }
        bw5.ls lsVar = (bw5.ls) fVar;
        return n51.f.a(this.f111474d, lsVar.f111474d) && n51.f.a(this.f111475e, lsVar.f111475e) && n51.f.a(this.f111476f, lsVar.f111476f) && n51.f.a(this.f111477g, lsVar.f111477g) && n51.f.a(this.f111478h, lsVar.f111478h) && n51.f.a(this.f111479i, lsVar.f111479i) && n51.f.a(this.f111480m, lsVar.f111480m) && n51.f.a(this.f111481n, lsVar.f111481n) && n51.f.a(this.f111482o, lsVar.f111482o) && n51.f.a(this.f111483p, lsVar.f111483p) && n51.f.a(this.f111484q, lsVar.f111484q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ls();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111485r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111474d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f111475e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f111476f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f111477g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f111478h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f111479i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f111480m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f111481n;
            if (str8 != null && zArr[21]) {
                fVar.j(21, str8);
            }
            java.lang.String str9 = this.f111482o;
            if (str9 != null && zArr[22]) {
                fVar.j(22, str9);
            }
            java.lang.String str10 = this.f111483p;
            if (str10 != null && zArr[23]) {
                fVar.j(23, str10);
            }
            java.lang.String str11 = this.f111484q;
            if (str11 != null && zArr[24]) {
                fVar.j(24, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f111474d;
            if (str12 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str12);
            }
            java.lang.String str13 = this.f111475e;
            if (str13 != null && zArr[2]) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f111476f;
            if (str14 != null && zArr[3]) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f111477g;
            if (str15 != null && zArr[4]) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f111478h;
            if (str16 != null && zArr[5]) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f111479i;
            if (str17 != null && zArr[6]) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f111480m;
            if (str18 != null && zArr[7]) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f111481n;
            if (str19 != null && zArr[21]) {
                i18 += b36.f.j(21, str19);
            }
            java.lang.String str20 = this.f111482o;
            if (str20 != null && zArr[22]) {
                i18 += b36.f.j(22, str20);
            }
            java.lang.String str21 = this.f111483p;
            if (str21 != null && zArr[23]) {
                i18 += b36.f.j(23, str21);
            }
            java.lang.String str22 = this.f111484q;
            return (str22 == null || !zArr[24]) ? i18 : i18 + b36.f.j(24, str22);
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
                this.f111474d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111475e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111476f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111477g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111478h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111479i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111480m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                switch (intValue) {
                    case 21:
                        this.f111481n = aVar2.k(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f111482o = aVar2.k(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f111483p = aVar2.k(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f111484q = aVar2.k(intValue);
                        zArr[24] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
