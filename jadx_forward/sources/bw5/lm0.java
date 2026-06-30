package bw5;

/* loaded from: classes2.dex */
public class lm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.lm0 f111393i = new bw5.lm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f111394d;

    /* renamed from: e, reason: collision with root package name */
    public int f111395e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111396f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.km0 f111397g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111398h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lm0)) {
            return false;
        }
        bw5.lm0 lm0Var = (bw5.lm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f111394d), java.lang.Boolean.valueOf(lm0Var.f111394d)) && n51.f.a(java.lang.Integer.valueOf(this.f111395e), java.lang.Integer.valueOf(lm0Var.f111395e)) && n51.f.a(this.f111396f, lm0Var.f111396f) && n51.f.a(this.f111397g, lm0Var.f111397g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111398h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f111394d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111395e);
            }
            java.lang.String str = this.f111396f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.km0 km0Var = this.f111397g;
            if (km0Var != null && zArr[4]) {
                fVar.i(4, km0Var.mo75928xcd1e8d8());
                this.f111397g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f111394d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f111395e);
            }
            java.lang.String str2 = this.f111396f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.km0 km0Var2 = this.f111397g;
            return (km0Var2 == null || !zArr[4]) ? a17 : a17 + b36.f.i(4, km0Var2.mo75928xcd1e8d8());
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
            this.f111394d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111395e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111396f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.km0 km0Var3 = new bw5.km0();
            if (bArr != null && bArr.length > 0) {
                km0Var3.mo11468x92b714fd(bArr);
            }
            this.f111397g = km0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.lm0) super.mo11468x92b714fd(bArr);
    }
}
