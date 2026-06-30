package bw5;

/* loaded from: classes9.dex */
public class s0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f114271d;

    /* renamed from: e, reason: collision with root package name */
    public double f114272e;

    /* renamed from: f, reason: collision with root package name */
    public double f114273f;

    /* renamed from: g, reason: collision with root package name */
    public long f114274g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f114275h = new boolean[5];

    static {
        new bw5.s0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s0)) {
            return false;
        }
        bw5.s0 s0Var = (bw5.s0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f114271d), java.lang.Double.valueOf(s0Var.f114271d)) && n51.f.a(java.lang.Double.valueOf(this.f114272e), java.lang.Double.valueOf(s0Var.f114272e)) && n51.f.a(java.lang.Double.valueOf(this.f114273f), java.lang.Double.valueOf(s0Var.f114273f)) && n51.f.a(java.lang.Long.valueOf(this.f114274g), java.lang.Long.valueOf(s0Var.f114274g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114275h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f114271d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f114272e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f114273f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f114274g);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f114271d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f114272e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f114273f);
            }
            return zArr[4] ? c17 + b36.f.h(4, this.f114274g) : c17;
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
            this.f114271d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114272e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114273f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f114274g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.s0) super.mo11468x92b714fd(bArr);
    }
}
