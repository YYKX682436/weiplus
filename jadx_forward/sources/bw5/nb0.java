package bw5;

/* loaded from: classes2.dex */
public class nb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112132e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112133f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112134g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112135h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112136i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112137m;

    /* renamed from: n, reason: collision with root package name */
    public long f112138n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112139o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112140p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f112141q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f112142r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f112143s = new boolean[13];

    static {
        new bw5.nb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.nb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nb0)) {
            return false;
        }
        bw5.nb0 nb0Var = (bw5.nb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112131d), java.lang.Integer.valueOf(nb0Var.f112131d)) && n51.f.a(this.f112132e, nb0Var.f112132e) && n51.f.a(this.f112133f, nb0Var.f112133f) && n51.f.a(this.f112134g, nb0Var.f112134g) && n51.f.a(this.f112135h, nb0Var.f112135h) && n51.f.a(this.f112136i, nb0Var.f112136i) && n51.f.a(this.f112137m, nb0Var.f112137m) && n51.f.a(java.lang.Long.valueOf(this.f112138n), java.lang.Long.valueOf(nb0Var.f112138n)) && n51.f.a(this.f112139o, nb0Var.f112139o) && n51.f.a(this.f112140p, nb0Var.f112140p) && n51.f.a(this.f112141q, nb0Var.f112141q) && n51.f.a(this.f112142r, nb0Var.f112142r);
    }

    /* renamed from: getFinderUsername */
    public java.lang.String m12568x93d5ac12() {
        return this.f112143s[3] ? this.f112133f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112143s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112131d);
            }
            java.lang.String str = this.f112132e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f112133f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f112134g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f112135h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f112136i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f112137m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.h(8, this.f112138n);
            }
            java.lang.String str7 = this.f112139o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f112140p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f112141q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f112142r;
            if (str10 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str10);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112131d) : 0;
            java.lang.String str11 = this.f112132e;
            if (str11 != null && zArr[2]) {
                e17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f112133f;
            if (str12 != null && zArr[3]) {
                e17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f112134g;
            if (str13 != null && zArr[4]) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f112135h;
            if (str14 != null && zArr[5]) {
                e17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f112136i;
            if (str15 != null && zArr[6]) {
                e17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f112137m;
            if (str16 != null && zArr[7]) {
                e17 += b36.f.j(7, str16);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f112138n);
            }
            java.lang.String str17 = this.f112139o;
            if (str17 != null && zArr[9]) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f112140p;
            if (str18 != null && zArr[10]) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f112141q;
            if (str19 != null && zArr[11]) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f112142r;
            return (str20 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str20);
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
                this.f112131d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112132e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112133f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112134g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112135h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112136i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112137m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112138n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112139o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112140p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112141q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112142r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
