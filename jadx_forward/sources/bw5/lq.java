package bw5;

/* loaded from: classes2.dex */
public class lq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f111439d;

    /* renamed from: e, reason: collision with root package name */
    public float f111440e;

    /* renamed from: f, reason: collision with root package name */
    public float f111441f;

    /* renamed from: g, reason: collision with root package name */
    public float f111442g;

    /* renamed from: h, reason: collision with root package name */
    public float f111443h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111444i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f111445m;

    /* renamed from: n, reason: collision with root package name */
    public float f111446n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111447o = new boolean[9];

    static {
        new bw5.lq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lq mo11468x92b714fd(byte[] bArr) {
        return (bw5.lq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lq)) {
            return false;
        }
        bw5.lq lqVar = (bw5.lq) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f111439d), java.lang.Float.valueOf(lqVar.f111439d)) && n51.f.a(java.lang.Float.valueOf(this.f111440e), java.lang.Float.valueOf(lqVar.f111440e)) && n51.f.a(java.lang.Float.valueOf(this.f111441f), java.lang.Float.valueOf(lqVar.f111441f)) && n51.f.a(java.lang.Float.valueOf(this.f111442g), java.lang.Float.valueOf(lqVar.f111442g)) && n51.f.a(java.lang.Float.valueOf(this.f111443h), java.lang.Float.valueOf(lqVar.f111443h)) && n51.f.a(java.lang.Boolean.valueOf(this.f111444i), java.lang.Boolean.valueOf(lqVar.f111444i)) && n51.f.a(java.lang.Boolean.valueOf(this.f111445m), java.lang.Boolean.valueOf(lqVar.f111445m)) && n51.f.a(java.lang.Float.valueOf(this.f111446n), java.lang.Float.valueOf(lqVar.f111446n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111447o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f111439d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f111440e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f111441f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f111442g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f111443h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f111444i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f111445m);
            }
            if (zArr[8]) {
                fVar.d(8, this.f111446n);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f111439d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f111440e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f111441f);
            }
            if (zArr[4]) {
                d17 += b36.f.d(4, this.f111442g);
            }
            if (zArr[5]) {
                d17 += b36.f.d(5, this.f111443h);
            }
            if (zArr[6]) {
                d17 += b36.f.a(6, this.f111444i);
            }
            if (zArr[7]) {
                d17 += b36.f.a(7, this.f111445m);
            }
            return zArr[8] ? d17 + b36.f.d(8, this.f111446n) : d17;
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
                this.f111439d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111440e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111441f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111442g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111443h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111444i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111445m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111446n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
