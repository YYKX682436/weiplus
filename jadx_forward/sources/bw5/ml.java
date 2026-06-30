package bw5;

/* loaded from: classes2.dex */
public class ml extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.e3 f111809d;

    /* renamed from: e, reason: collision with root package name */
    public int f111810e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111812g = new boolean[4];

    static {
        new bw5.ml();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ml mo11468x92b714fd(byte[] bArr) {
        return (bw5.ml) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ml)) {
            return false;
        }
        bw5.ml mlVar = (bw5.ml) fVar;
        return n51.f.a(this.f111809d, mlVar.f111809d) && n51.f.a(java.lang.Integer.valueOf(this.f111810e), java.lang.Integer.valueOf(mlVar.f111810e)) && n51.f.a(this.f111811f, mlVar.f111811f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ml();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111812g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.e3 e3Var = this.f111809d;
            if (e3Var != null && zArr[1]) {
                fVar.i(1, e3Var.mo75928xcd1e8d8());
                this.f111809d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111810e);
            }
            java.lang.String str = this.f111811f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.e3 e3Var2 = this.f111809d;
            if (e3Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, e3Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111810e);
            }
            java.lang.String str2 = this.f111811f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f111810e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f111811f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.e3 e3Var3 = new bw5.e3();
            if (bArr != null && bArr.length > 0) {
                e3Var3.mo11468x92b714fd(bArr);
            }
            this.f111809d = e3Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
