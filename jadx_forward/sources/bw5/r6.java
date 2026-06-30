package bw5;

/* loaded from: classes9.dex */
public class r6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113946d;

    /* renamed from: e, reason: collision with root package name */
    public float f113947e;

    /* renamed from: f, reason: collision with root package name */
    public float f113948f;

    /* renamed from: g, reason: collision with root package name */
    public long f113949g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113950h = new boolean[5];

    static {
        new bw5.r6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r6)) {
            return false;
        }
        bw5.r6 r6Var = (bw5.r6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113946d), java.lang.Integer.valueOf(r6Var.f113946d)) && n51.f.a(java.lang.Float.valueOf(this.f113947e), java.lang.Float.valueOf(r6Var.f113947e)) && n51.f.a(java.lang.Float.valueOf(this.f113948f), java.lang.Float.valueOf(r6Var.f113948f)) && n51.f.a(java.lang.Long.valueOf(this.f113949g), java.lang.Long.valueOf(r6Var.f113949g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113950h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113946d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f113947e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f113948f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f113949g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113946d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f113947e);
            }
            if (zArr[3]) {
                e17 += b36.f.d(3, this.f113948f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f113949g) : e17;
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
            this.f113946d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113947e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113948f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f113949g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.r6) super.mo11468x92b714fd(bArr);
    }
}
