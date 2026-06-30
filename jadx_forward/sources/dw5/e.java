package dw5;

/* loaded from: classes15.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f325871d;

    /* renamed from: e, reason: collision with root package name */
    public int f325872e;

    /* renamed from: f, reason: collision with root package name */
    public int f325873f;

    /* renamed from: g, reason: collision with root package name */
    public long f325874g;

    /* renamed from: h, reason: collision with root package name */
    public int f325875h;

    /* renamed from: i, reason: collision with root package name */
    public int f325876i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f325877m = new boolean[7];

    static {
        new dw5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.e mo11468x92b714fd(byte[] bArr) {
        return (dw5.e) super.mo11468x92b714fd(bArr);
    }

    public dw5.e c(int i17) {
        this.f325872e = i17;
        this.f325877m[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.e)) {
            return false;
        }
        dw5.e eVar = (dw5.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f325871d), java.lang.Integer.valueOf(eVar.f325871d)) && n51.f.a(java.lang.Integer.valueOf(this.f325872e), java.lang.Integer.valueOf(eVar.f325872e)) && n51.f.a(java.lang.Integer.valueOf(this.f325873f), java.lang.Integer.valueOf(eVar.f325873f)) && n51.f.a(java.lang.Long.valueOf(this.f325874g), java.lang.Long.valueOf(eVar.f325874g)) && n51.f.a(java.lang.Integer.valueOf(this.f325875h), java.lang.Integer.valueOf(eVar.f325875h)) && n51.f.a(java.lang.Integer.valueOf(this.f325876i), java.lang.Integer.valueOf(eVar.f325876i));
    }

    public dw5.e d(int i17) {
        this.f325873f = i17;
        this.f325877m[3] = true;
        return this;
    }

    public dw5.e e(int i17) {
        this.f325871d = i17;
        this.f325877m[1] = true;
        return this;
    }

    public dw5.e f(long j17) {
        this.f325874g = j17;
        this.f325877m[4] = true;
        return this;
    }

    public dw5.e g(int i17) {
        this.f325875h = i17;
        this.f325877m[5] = true;
        return this;
    }

    public dw5.e i(int i17) {
        this.f325876i = i17;
        this.f325877m[6] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325877m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f325871d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f325872e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f325873f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f325874g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f325875h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f325876i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f325871d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f325872e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f325873f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f325874g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f325875h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f325876i) : e17;
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
                this.f325871d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f325872e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f325873f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f325874g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f325875h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f325876i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
