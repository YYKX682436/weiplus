package bw5;

/* loaded from: classes2.dex */
public class qo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113736d;

    /* renamed from: e, reason: collision with root package name */
    public int f113737e;

    /* renamed from: f, reason: collision with root package name */
    public int f113738f;

    /* renamed from: g, reason: collision with root package name */
    public int f113739g;

    /* renamed from: h, reason: collision with root package name */
    public int f113740h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f113741i = new boolean[6];

    static {
        new bw5.qo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qo mo11468x92b714fd(byte[] bArr) {
        return (bw5.qo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qo)) {
            return false;
        }
        bw5.qo qoVar = (bw5.qo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113736d), java.lang.Integer.valueOf(qoVar.f113736d)) && n51.f.a(java.lang.Integer.valueOf(this.f113737e), java.lang.Integer.valueOf(qoVar.f113737e)) && n51.f.a(java.lang.Integer.valueOf(this.f113738f), java.lang.Integer.valueOf(qoVar.f113738f)) && n51.f.a(java.lang.Integer.valueOf(this.f113739g), java.lang.Integer.valueOf(qoVar.f113739g)) && n51.f.a(java.lang.Integer.valueOf(this.f113740h), java.lang.Integer.valueOf(qoVar.f113740h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113741i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113736d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113737e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113738f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113739g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113740h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113736d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113737e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113738f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f113739g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f113740h) : e17;
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
            this.f113736d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113737e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113738f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f113739g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f113740h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
