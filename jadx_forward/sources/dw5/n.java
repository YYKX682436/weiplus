package dw5;

/* loaded from: classes15.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f325923d;

    /* renamed from: e, reason: collision with root package name */
    public int f325924e;

    /* renamed from: f, reason: collision with root package name */
    public int f325925f;

    /* renamed from: g, reason: collision with root package name */
    public int f325926g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f325927h = new boolean[5];

    static {
        new dw5.n();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.n mo11468x92b714fd(byte[] bArr) {
        return (dw5.n) super.mo11468x92b714fd(bArr);
    }

    public dw5.n c(int i17) {
        this.f325926g = i17;
        this.f325927h[4] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.n)) {
            return false;
        }
        dw5.n nVar = (dw5.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f325923d), java.lang.Integer.valueOf(nVar.f325923d)) && n51.f.a(java.lang.Integer.valueOf(this.f325924e), java.lang.Integer.valueOf(nVar.f325924e)) && n51.f.a(java.lang.Integer.valueOf(this.f325925f), java.lang.Integer.valueOf(nVar.f325925f)) && n51.f.a(java.lang.Integer.valueOf(this.f325926g), java.lang.Integer.valueOf(nVar.f325926g));
    }

    public dw5.n d(int i17) {
        this.f325923d = i17;
        this.f325927h[1] = true;
        return this;
    }

    public dw5.n e(int i17) {
        this.f325924e = i17;
        this.f325927h[2] = true;
        return this;
    }

    public dw5.n f(int i17) {
        this.f325925f = i17;
        this.f325927h[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.n();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f325927h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f325923d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f325924e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f325925f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f325926g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f325923d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f325924e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f325925f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f325926g) : e17;
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
        if (intValue == 1) {
            this.f325923d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f325924e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f325925f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f325926g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
