package bw5;

/* loaded from: classes8.dex */
public class mq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111893d;

    /* renamed from: e, reason: collision with root package name */
    public int f111894e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ap0 f111895f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111896g = new boolean[4];

    static {
        new bw5.mq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mq0)) {
            return false;
        }
        bw5.mq0 mq0Var = (bw5.mq0) fVar;
        return n51.f.a(this.f111893d, mq0Var.f111893d) && n51.f.a(java.lang.Integer.valueOf(this.f111894e), java.lang.Integer.valueOf(mq0Var.f111894e)) && n51.f.a(this.f111895f, mq0Var.f111895f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111896g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111893d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111894e);
            }
            bw5.ap0 ap0Var = this.f111895f;
            if (ap0Var != null && zArr[3]) {
                fVar.i(3, ap0Var.mo75928xcd1e8d8());
                this.f111895f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f111893d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111894e);
            }
            bw5.ap0 ap0Var2 = this.f111895f;
            return (ap0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, ap0Var2.mo75928xcd1e8d8());
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
            this.f111893d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111894e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ap0 ap0Var3 = new bw5.ap0();
            if (bArr != null && bArr.length > 0) {
                ap0Var3.mo11468x92b714fd(bArr);
            }
            this.f111895f = ap0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.mq0) super.mo11468x92b714fd(bArr);
    }
}
