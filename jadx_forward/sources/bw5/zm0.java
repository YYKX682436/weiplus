package bw5;

/* loaded from: classes2.dex */
public class zm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.zm0 f117592i = new bw5.zm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f117593d;

    /* renamed from: e, reason: collision with root package name */
    public int f117594e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117595f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xm0 f117596g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117597h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zm0)) {
            return false;
        }
        bw5.zm0 zm0Var = (bw5.zm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f117593d), java.lang.Boolean.valueOf(zm0Var.f117593d)) && n51.f.a(java.lang.Integer.valueOf(this.f117594e), java.lang.Integer.valueOf(zm0Var.f117594e)) && n51.f.a(this.f117595f, zm0Var.f117595f) && n51.f.a(this.f117596g, zm0Var.f117596g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117597h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f117593d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117594e);
            }
            java.lang.String str = this.f117595f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.xm0 xm0Var = this.f117596g;
            if (xm0Var != null && zArr[4]) {
                fVar.i(4, xm0Var.mo75928xcd1e8d8());
                this.f117596g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f117593d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f117594e);
            }
            java.lang.String str2 = this.f117595f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.xm0 xm0Var2 = this.f117596g;
            return (xm0Var2 == null || !zArr[4]) ? a17 : a17 + b36.f.i(4, xm0Var2.mo75928xcd1e8d8());
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
            this.f117593d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117594e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117595f = aVar2.k(intValue);
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
            bw5.xm0 xm0Var3 = new bw5.xm0();
            if (bArr != null && bArr.length > 0) {
                xm0Var3.mo11468x92b714fd(bArr);
            }
            this.f117596g = xm0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.zm0) super.mo11468x92b714fd(bArr);
    }
}
