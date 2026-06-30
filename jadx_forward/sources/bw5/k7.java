package bw5;

/* loaded from: classes8.dex */
public class k7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j7 f110800d;

    /* renamed from: e, reason: collision with root package name */
    public int f110801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110803g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110804h = new boolean[5];

    static {
        new bw5.k7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k7)) {
            return false;
        }
        bw5.k7 k7Var = (bw5.k7) fVar;
        return n51.f.a(this.f110800d, k7Var.f110800d) && n51.f.a(java.lang.Integer.valueOf(this.f110801e), java.lang.Integer.valueOf(k7Var.f110801e)) && n51.f.a(this.f110802f, k7Var.f110802f) && n51.f.a(this.f110803g, k7Var.f110803g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.k7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110804h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.j7 j7Var = this.f110800d;
            if (j7Var != null && zArr[1]) {
                fVar.i(1, j7Var.mo75928xcd1e8d8());
                this.f110800d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110801e);
            }
            java.lang.String str = this.f110802f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f110803g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.j7 j7Var2 = this.f110800d;
            if (j7Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, j7Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110801e);
            }
            java.lang.String str3 = this.f110802f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f110803g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
                this.f110801e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f110802f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f110803g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.j7 j7Var3 = new bw5.j7();
            if (bArr != null && bArr.length > 0) {
                j7Var3.mo11468x92b714fd(bArr);
            }
            this.f110800d = j7Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.k7) super.mo11468x92b714fd(bArr);
    }
}
