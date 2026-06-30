package bw5;

/* loaded from: classes9.dex */
public class cq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f107727d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107728e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107729f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.dq0 f107730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f107731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107732i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107733m = new boolean[7];

    static {
        new bw5.cq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cq0)) {
            return false;
        }
        bw5.cq0 cq0Var = (bw5.cq0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f107727d), java.lang.Boolean.valueOf(cq0Var.f107727d)) && n51.f.a(this.f107728e, cq0Var.f107728e) && n51.f.a(java.lang.Boolean.valueOf(this.f107729f), java.lang.Boolean.valueOf(cq0Var.f107729f)) && n51.f.a(this.f107730g, cq0Var.f107730g) && n51.f.a(java.lang.Boolean.valueOf(this.f107731h), java.lang.Boolean.valueOf(cq0Var.f107731h)) && n51.f.a(java.lang.Boolean.valueOf(this.f107732i), java.lang.Boolean.valueOf(cq0Var.f107732i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107733m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f107727d);
            }
            java.lang.String str = this.f107728e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f107729f);
            }
            bw5.dq0 dq0Var = this.f107730g;
            if (dq0Var != null && zArr[4]) {
                fVar.e(4, dq0Var.f108122d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f107731h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f107732i);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f107727d) : 0;
            java.lang.String str2 = this.f107728e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f107729f);
            }
            bw5.dq0 dq0Var2 = this.f107730g;
            if (dq0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, dq0Var2.f108122d);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f107731h);
            }
            return zArr[6] ? a17 + b36.f.a(6, this.f107732i) : a17;
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
                this.f107727d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107728e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107729f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f107730g = g17 != 0 ? g17 != 1 ? null : bw5.dq0.FloatBallTypeAudio : bw5.dq0.FloatBallTypeMusic;
                zArr[4] = true;
                return 0;
            case 5:
                this.f107731h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107732i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.cq0) super.mo11468x92b714fd(bArr);
    }
}
