package bw5;

/* loaded from: classes2.dex */
public class oe extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f112604d;

    /* renamed from: e, reason: collision with root package name */
    public float f112605e;

    /* renamed from: f, reason: collision with root package name */
    public int f112606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112607g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112608h;

    /* renamed from: i, reason: collision with root package name */
    public float f112609i;

    /* renamed from: m, reason: collision with root package name */
    public int f112610m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112611n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f112612o = new boolean[9];

    static {
        new bw5.oe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oe mo11468x92b714fd(byte[] bArr) {
        return (bw5.oe) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oe)) {
            return false;
        }
        bw5.oe oeVar = (bw5.oe) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f112604d), java.lang.Float.valueOf(oeVar.f112604d)) && n51.f.a(java.lang.Float.valueOf(this.f112605e), java.lang.Float.valueOf(oeVar.f112605e)) && n51.f.a(java.lang.Integer.valueOf(this.f112606f), java.lang.Integer.valueOf(oeVar.f112606f)) && n51.f.a(this.f112607g, oeVar.f112607g) && n51.f.a(this.f112608h, oeVar.f112608h) && n51.f.a(java.lang.Float.valueOf(this.f112609i), java.lang.Float.valueOf(oeVar.f112609i)) && n51.f.a(java.lang.Integer.valueOf(this.f112610m), java.lang.Integer.valueOf(oeVar.f112610m)) && n51.f.a(this.f112611n, oeVar.f112611n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112612o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f112604d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f112605e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112606f);
            }
            java.lang.String str = this.f112607g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f112608h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.d(6, this.f112609i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112610m);
            }
            java.lang.String str3 = this.f112611n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f112604d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f112605e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f112606f);
            }
            java.lang.String str4 = this.f112607g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f112608h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                d17 += b36.f.d(6, this.f112609i);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f112610m);
            }
            java.lang.String str6 = this.f112611n;
            return (str6 == null || !zArr[8]) ? d17 : d17 + b36.f.j(8, str6);
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
                this.f112604d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112605e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112606f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112607g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112608h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112609i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112610m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112611n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
