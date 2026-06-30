package bw5;

/* loaded from: classes8.dex */
public class a40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.a40 f106540h = new bw5.a40();

    /* renamed from: d, reason: collision with root package name */
    public bw5.bl0 f106541d;

    /* renamed from: e, reason: collision with root package name */
    public int f106542e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106543f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f106544g = new boolean[4];

    public bw5.bl0 b() {
        return this.f106544g[1] ? this.f106541d : new bw5.bl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a40)) {
            return false;
        }
        bw5.a40 a40Var = (bw5.a40) fVar;
        return n51.f.a(this.f106541d, a40Var.f106541d) && n51.f.a(java.lang.Integer.valueOf(this.f106542e), java.lang.Integer.valueOf(a40Var.f106542e)) && n51.f.a(this.f106543f, a40Var.f106543f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106544g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bl0 bl0Var = this.f106541d;
            if (bl0Var != null && zArr[1]) {
                fVar.i(1, bl0Var.mo75928xcd1e8d8());
                this.f106541d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f106542e);
            }
            java.lang.String str = this.f106543f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bl0 bl0Var2 = this.f106541d;
            if (bl0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, bl0Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f106542e);
            }
            java.lang.String str2 = this.f106543f;
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
                this.f106542e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f106543f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.bl0 bl0Var3 = new bw5.bl0();
            if (bArr != null && bArr.length > 0) {
                bl0Var3.mo11468x92b714fd(bArr);
            }
            this.f106541d = bl0Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.a40) super.mo11468x92b714fd(bArr);
    }
}
