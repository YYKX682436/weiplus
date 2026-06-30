package bw5;

/* loaded from: classes2.dex */
public class gh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109379g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109380h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109381i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109382m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109383n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109384o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f109385p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109386q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109387r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f109388s = new boolean[16];

    static {
        new bw5.gh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gh mo11468x92b714fd(byte[] bArr) {
        return (bw5.gh) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gh)) {
            return false;
        }
        bw5.gh ghVar = (bw5.gh) fVar;
        return n51.f.a(this.f109376d, ghVar.f109376d) && n51.f.a(this.f109377e, ghVar.f109377e) && n51.f.a(this.f109378f, ghVar.f109378f) && n51.f.a(this.f109379g, ghVar.f109379g) && n51.f.a(this.f109380h, ghVar.f109380h) && n51.f.a(this.f109381i, ghVar.f109381i) && n51.f.a(this.f109382m, ghVar.f109382m) && n51.f.a(this.f109383n, ghVar.f109383n) && n51.f.a(this.f109384o, ghVar.f109384o) && n51.f.a(this.f109385p, ghVar.f109385p) && n51.f.a(this.f109386q, ghVar.f109386q) && n51.f.a(this.f109387r, ghVar.f109387r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109388s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109376d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109377e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109378f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f109379g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f109380h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f109381i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f109382m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f109383n;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f109384o;
            if (str9 != null && zArr[12]) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f109385p;
            if (str10 != null && zArr[13]) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f109386q;
            if (str11 != null && zArr[14]) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f109387r;
            if (str12 == null || !zArr[15]) {
                return 0;
            }
            fVar.j(15, str12);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f109376d;
            int j17 = (str13 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str13);
            java.lang.String str14 = this.f109377e;
            if (str14 != null && zArr[2]) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f109378f;
            if (str15 != null && zArr[3]) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f109379g;
            if (str16 != null && zArr[4]) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f109380h;
            if (str17 != null && zArr[5]) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f109381i;
            if (str18 != null && zArr[6]) {
                j17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f109382m;
            if (str19 != null && zArr[7]) {
                j17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f109383n;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f109384o;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f109385p;
            if (str22 != null && zArr[13]) {
                j17 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.f109386q;
            if (str23 != null && zArr[14]) {
                j17 += b36.f.j(14, str23);
            }
            java.lang.String str24 = this.f109387r;
            return (str24 == null || !zArr[15]) ? j17 : j17 + b36.f.j(15, str24);
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
                this.f109376d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109377e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109378f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109379g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109380h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109381i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109382m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                this.f109383n = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109384o = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109385p = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109386q = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109387r = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
