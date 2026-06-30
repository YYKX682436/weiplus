package bw5;

/* loaded from: classes2.dex */
public class ef extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108406e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108407f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108408g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108409h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f108410i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f108411m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108412n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108413o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f108414p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f108415q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f108416r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f108417s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f108418t = new boolean[14];

    static {
        new bw5.ef();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ef mo11468x92b714fd(byte[] bArr) {
        return (bw5.ef) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ef)) {
            return false;
        }
        bw5.ef efVar = (bw5.ef) fVar;
        return n51.f.a(this.f108405d, efVar.f108405d) && n51.f.a(this.f108406e, efVar.f108406e) && n51.f.a(this.f108407f, efVar.f108407f) && n51.f.a(this.f108408g, efVar.f108408g) && n51.f.a(this.f108409h, efVar.f108409h) && n51.f.a(java.lang.Boolean.valueOf(this.f108410i), java.lang.Boolean.valueOf(efVar.f108410i)) && n51.f.a(java.lang.Boolean.valueOf(this.f108411m), java.lang.Boolean.valueOf(efVar.f108411m)) && n51.f.a(this.f108412n, efVar.f108412n) && n51.f.a(this.f108413o, efVar.f108413o) && n51.f.a(this.f108414p, efVar.f108414p) && n51.f.a(this.f108415q, efVar.f108415q) && n51.f.a(this.f108416r, efVar.f108416r) && n51.f.a(this.f108417s, efVar.f108417s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ef();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108418t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108405d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108406e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108407f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108408g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f108409h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.a(6, this.f108410i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f108411m);
            }
            java.lang.String str6 = this.f108412n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f108413o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f108414p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f108415q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f108416r;
            if (str10 != null && zArr[12]) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f108417s;
            if (str11 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f108405d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f108406e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f108407f;
            if (str14 != null && zArr[3]) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f108408g;
            if (str15 != null && zArr[4]) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f108409h;
            if (str16 != null && zArr[5]) {
                j17 += b36.f.j(5, str16);
            }
            if (zArr[6]) {
                j17 += b36.f.a(6, this.f108410i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f108411m);
            }
            java.lang.String str17 = this.f108412n;
            if (str17 != null && zArr[8]) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f108413o;
            if (str18 != null && zArr[9]) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f108414p;
            if (str19 != null && zArr[10]) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f108415q;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f108416r;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f108417s;
            return (str22 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str22);
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
                this.f108405d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108406e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108407f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108408g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108409h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108410i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108411m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108412n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108413o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108414p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108415q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108416r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108417s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
