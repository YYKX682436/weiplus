package bw5;

/* loaded from: classes2.dex */
public class r5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113938d;

    /* renamed from: e, reason: collision with root package name */
    public int f113939e;

    /* renamed from: f, reason: collision with root package name */
    public int f113940f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113941g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113942h = new boolean[5];

    static {
        new bw5.r5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r5)) {
            return false;
        }
        bw5.r5 r5Var = (bw5.r5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113938d), java.lang.Integer.valueOf(r5Var.f113938d)) && n51.f.a(java.lang.Integer.valueOf(this.f113939e), java.lang.Integer.valueOf(r5Var.f113939e)) && n51.f.a(java.lang.Integer.valueOf(this.f113940f), java.lang.Integer.valueOf(r5Var.f113940f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113941g), java.lang.Boolean.valueOf(r5Var.f113941g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113942h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113938d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113939e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113940f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113941g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113938d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113939e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113940f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f113941g) : e17;
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
            this.f113938d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113939e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113940f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f113941g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
