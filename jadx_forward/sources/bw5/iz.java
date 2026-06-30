package bw5;

/* loaded from: classes2.dex */
public class iz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f110260d;

    /* renamed from: e, reason: collision with root package name */
    public float f110261e;

    /* renamed from: f, reason: collision with root package name */
    public float f110262f;

    /* renamed from: g, reason: collision with root package name */
    public float f110263g;

    /* renamed from: h, reason: collision with root package name */
    public float f110264h;

    /* renamed from: i, reason: collision with root package name */
    public float f110265i;

    /* renamed from: m, reason: collision with root package name */
    public float f110266m;

    /* renamed from: n, reason: collision with root package name */
    public float f110267n;

    /* renamed from: o, reason: collision with root package name */
    public float f110268o;

    /* renamed from: p, reason: collision with root package name */
    public float f110269p;

    /* renamed from: q, reason: collision with root package name */
    public float f110270q;

    /* renamed from: r, reason: collision with root package name */
    public float f110271r;

    /* renamed from: s, reason: collision with root package name */
    public float f110272s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f110273t = new boolean[14];

    static {
        new bw5.iz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iz mo11468x92b714fd(byte[] bArr) {
        return (bw5.iz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iz)) {
            return false;
        }
        bw5.iz izVar = (bw5.iz) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f110260d), java.lang.Float.valueOf(izVar.f110260d)) && n51.f.a(java.lang.Float.valueOf(this.f110261e), java.lang.Float.valueOf(izVar.f110261e)) && n51.f.a(java.lang.Float.valueOf(this.f110262f), java.lang.Float.valueOf(izVar.f110262f)) && n51.f.a(java.lang.Float.valueOf(this.f110263g), java.lang.Float.valueOf(izVar.f110263g)) && n51.f.a(java.lang.Float.valueOf(this.f110264h), java.lang.Float.valueOf(izVar.f110264h)) && n51.f.a(java.lang.Float.valueOf(this.f110265i), java.lang.Float.valueOf(izVar.f110265i)) && n51.f.a(java.lang.Float.valueOf(this.f110266m), java.lang.Float.valueOf(izVar.f110266m)) && n51.f.a(java.lang.Float.valueOf(this.f110267n), java.lang.Float.valueOf(izVar.f110267n)) && n51.f.a(java.lang.Float.valueOf(this.f110268o), java.lang.Float.valueOf(izVar.f110268o)) && n51.f.a(java.lang.Float.valueOf(this.f110269p), java.lang.Float.valueOf(izVar.f110269p)) && n51.f.a(java.lang.Float.valueOf(this.f110270q), java.lang.Float.valueOf(izVar.f110270q)) && n51.f.a(java.lang.Float.valueOf(this.f110271r), java.lang.Float.valueOf(izVar.f110271r)) && n51.f.a(java.lang.Float.valueOf(this.f110272s), java.lang.Float.valueOf(izVar.f110272s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.iz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110273t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f110260d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f110261e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f110262f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f110263g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f110264h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f110265i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f110266m);
            }
            if (zArr[8]) {
                fVar.d(8, this.f110267n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f110268o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f110269p);
            }
            if (zArr[11]) {
                fVar.d(11, this.f110270q);
            }
            if (zArr[12]) {
                fVar.d(12, this.f110271r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.d(13, this.f110272s);
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f110260d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f110261e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f110262f);
            }
            if (zArr[4]) {
                d17 += b36.f.d(4, this.f110263g);
            }
            if (zArr[5]) {
                d17 += b36.f.d(5, this.f110264h);
            }
            if (zArr[6]) {
                d17 += b36.f.d(6, this.f110265i);
            }
            if (zArr[7]) {
                d17 += b36.f.d(7, this.f110266m);
            }
            if (zArr[8]) {
                d17 += b36.f.d(8, this.f110267n);
            }
            if (zArr[9]) {
                d17 += b36.f.d(9, this.f110268o);
            }
            if (zArr[10]) {
                d17 += b36.f.d(10, this.f110269p);
            }
            if (zArr[11]) {
                d17 += b36.f.d(11, this.f110270q);
            }
            if (zArr[12]) {
                d17 += b36.f.d(12, this.f110271r);
            }
            return zArr[13] ? d17 + b36.f.d(13, this.f110272s) : d17;
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
                this.f110260d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110261e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110262f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110263g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110264h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110265i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110266m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110267n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110268o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110269p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110270q = aVar2.f(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110271r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f110272s = aVar2.f(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
