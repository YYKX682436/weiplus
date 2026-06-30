package bw5;

/* loaded from: classes2.dex */
public class qv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113824g;

    /* renamed from: h, reason: collision with root package name */
    public int f113825h;

    /* renamed from: i, reason: collision with root package name */
    public int f113826i;

    /* renamed from: m, reason: collision with root package name */
    public int f113827m;

    /* renamed from: n, reason: collision with root package name */
    public int f113828n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f113829o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f113830p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113831q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113832r;

    /* renamed from: s, reason: collision with root package name */
    public int f113833s;

    /* renamed from: t, reason: collision with root package name */
    public int f113834t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f113835u = new boolean[15];

    static {
        new bw5.qv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qv mo11468x92b714fd(byte[] bArr) {
        return (bw5.qv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qv)) {
            return false;
        }
        bw5.qv qvVar = (bw5.qv) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113821d), java.lang.Long.valueOf(qvVar.f113821d)) && n51.f.a(this.f113822e, qvVar.f113822e) && n51.f.a(this.f113823f, qvVar.f113823f) && n51.f.a(this.f113824g, qvVar.f113824g) && n51.f.a(java.lang.Integer.valueOf(this.f113825h), java.lang.Integer.valueOf(qvVar.f113825h)) && n51.f.a(java.lang.Integer.valueOf(this.f113826i), java.lang.Integer.valueOf(qvVar.f113826i)) && n51.f.a(java.lang.Integer.valueOf(this.f113827m), java.lang.Integer.valueOf(qvVar.f113827m)) && n51.f.a(java.lang.Integer.valueOf(this.f113828n), java.lang.Integer.valueOf(qvVar.f113828n)) && n51.f.a(this.f113829o, qvVar.f113829o) && n51.f.a(this.f113830p, qvVar.f113830p) && n51.f.a(this.f113831q, qvVar.f113831q) && n51.f.a(this.f113832r, qvVar.f113832r) && n51.f.a(java.lang.Integer.valueOf(this.f113833s), java.lang.Integer.valueOf(qvVar.f113833s)) && n51.f.a(java.lang.Integer.valueOf(this.f113834t), java.lang.Integer.valueOf(qvVar.f113834t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113835u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113821d);
            }
            java.lang.String str = this.f113822e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f113823f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f113824g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113825h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113826i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113827m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f113828n);
            }
            java.lang.String str4 = this.f113829o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f113830p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f113831q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f113832r;
            if (str7 != null && zArr[12]) {
                fVar.j(12, str7);
            }
            if (zArr[13]) {
                fVar.e(13, this.f113833s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f113834t);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113821d) : 0;
            java.lang.String str8 = this.f113822e;
            if (str8 != null && zArr[2]) {
                h17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f113823f;
            if (str9 != null && zArr[3]) {
                h17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f113824g;
            if (str10 != null && zArr[4]) {
                h17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f113825h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f113826i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f113827m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f113828n);
            }
            java.lang.String str11 = this.f113829o;
            if (str11 != null && zArr[9]) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f113830p;
            if (str12 != null && zArr[10]) {
                h17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f113831q;
            if (str13 != null && zArr[11]) {
                h17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f113832r;
            if (str14 != null && zArr[12]) {
                h17 += b36.f.j(12, str14);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f113833s);
            }
            return zArr[14] ? h17 + b36.f.e(14, this.f113834t) : h17;
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
                this.f113821d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113822e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113823f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113824g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113825h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113826i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113827m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113828n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113829o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113830p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113831q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113832r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113833s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113834t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
