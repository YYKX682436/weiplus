package bw5;

/* loaded from: classes2.dex */
public class ll extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111370d;

    /* renamed from: e, reason: collision with root package name */
    public int f111371e;

    /* renamed from: f, reason: collision with root package name */
    public int f111372f;

    /* renamed from: g, reason: collision with root package name */
    public int f111373g;

    /* renamed from: h, reason: collision with root package name */
    public int f111374h;

    /* renamed from: i, reason: collision with root package name */
    public int f111375i;

    /* renamed from: m, reason: collision with root package name */
    public int f111376m;

    /* renamed from: n, reason: collision with root package name */
    public int f111377n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111378o = new boolean[9];

    static {
        new bw5.ll();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ll mo11468x92b714fd(byte[] bArr) {
        return (bw5.ll) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ll)) {
            return false;
        }
        bw5.ll llVar = (bw5.ll) fVar;
        return n51.f.a(this.f111370d, llVar.f111370d) && n51.f.a(java.lang.Integer.valueOf(this.f111371e), java.lang.Integer.valueOf(llVar.f111371e)) && n51.f.a(java.lang.Integer.valueOf(this.f111372f), java.lang.Integer.valueOf(llVar.f111372f)) && n51.f.a(java.lang.Integer.valueOf(this.f111373g), java.lang.Integer.valueOf(llVar.f111373g)) && n51.f.a(java.lang.Integer.valueOf(this.f111374h), java.lang.Integer.valueOf(llVar.f111374h)) && n51.f.a(java.lang.Integer.valueOf(this.f111375i), java.lang.Integer.valueOf(llVar.f111375i)) && n51.f.a(java.lang.Integer.valueOf(this.f111376m), java.lang.Integer.valueOf(llVar.f111376m)) && n51.f.a(java.lang.Integer.valueOf(this.f111377n), java.lang.Integer.valueOf(llVar.f111377n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ll();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111378o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111370d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111371e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111372f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111373g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111374h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111375i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111376m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111377n);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111370d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111371e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111372f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111373g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f111374h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f111375i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f111376m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f111377n) : i18;
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
                this.f111370d = aVar2.d(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111371e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111372f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111373g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111374h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111375i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111376m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111377n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
