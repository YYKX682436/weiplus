package bw5;

/* loaded from: classes2.dex */
public class pe extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f113121d;

    /* renamed from: e, reason: collision with root package name */
    public float f113122e;

    /* renamed from: f, reason: collision with root package name */
    public float f113123f;

    /* renamed from: g, reason: collision with root package name */
    public float f113124g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113125h = new boolean[5];

    static {
        new bw5.pe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pe mo11468x92b714fd(byte[] bArr) {
        return (bw5.pe) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pe)) {
            return false;
        }
        bw5.pe peVar = (bw5.pe) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f113121d), java.lang.Float.valueOf(peVar.f113121d)) && n51.f.a(java.lang.Float.valueOf(this.f113122e), java.lang.Float.valueOf(peVar.f113122e)) && n51.f.a(java.lang.Float.valueOf(this.f113123f), java.lang.Float.valueOf(peVar.f113123f)) && n51.f.a(java.lang.Float.valueOf(this.f113124g), java.lang.Float.valueOf(peVar.f113124g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113125h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f113121d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f113122e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f113123f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f113124g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f113121d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f113122e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f113123f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f113124g) : d17;
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
            this.f113121d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113122e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113123f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f113124g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
