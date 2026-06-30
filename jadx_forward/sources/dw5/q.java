package dw5;

/* loaded from: classes11.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f325941d;

    /* renamed from: e, reason: collision with root package name */
    public int f325942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f325943f;

    /* renamed from: g, reason: collision with root package name */
    public long f325944g;

    /* renamed from: h, reason: collision with root package name */
    public int f325945h;

    /* renamed from: i, reason: collision with root package name */
    public int f325946i;

    /* renamed from: m, reason: collision with root package name */
    public int f325947m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f325948n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f325949o = new boolean[9];

    static {
        new dw5.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.q)) {
            return false;
        }
        dw5.q qVar = (dw5.q) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f325941d), java.lang.Integer.valueOf(qVar.f325941d)) && n51.f.a(java.lang.Integer.valueOf(this.f325942e), java.lang.Integer.valueOf(qVar.f325942e)) && n51.f.a(this.f325943f, qVar.f325943f) && n51.f.a(java.lang.Long.valueOf(this.f325944g), java.lang.Long.valueOf(qVar.f325944g)) && n51.f.a(java.lang.Integer.valueOf(this.f325945h), java.lang.Integer.valueOf(qVar.f325945h)) && n51.f.a(java.lang.Integer.valueOf(this.f325946i), java.lang.Integer.valueOf(qVar.f325946i)) && n51.f.a(java.lang.Integer.valueOf(this.f325947m), java.lang.Integer.valueOf(qVar.f325947m)) && n51.f.a(java.lang.Boolean.valueOf(this.f325948n), java.lang.Boolean.valueOf(qVar.f325948n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.q();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325949o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f325941d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f325942e);
            }
            java.lang.String str = this.f325943f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f325944g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f325945h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f325946i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f325947m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f325948n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f325941d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f325942e);
            }
            java.lang.String str2 = this.f325943f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f325944g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f325945h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f325946i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f325947m);
            }
            return zArr[8] ? e17 + b36.f.a(8, this.f325948n) : e17;
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
                this.f325941d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f325942e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f325943f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f325944g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f325945h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f325946i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f325947m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f325948n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (dw5.q) super.mo11468x92b714fd(bArr);
    }
}
