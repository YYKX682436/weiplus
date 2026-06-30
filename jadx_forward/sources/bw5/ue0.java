package bw5;

/* loaded from: classes8.dex */
public class ue0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115404d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v5 f115405e;

    /* renamed from: f, reason: collision with root package name */
    public int f115406f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115407g = new boolean[4];

    static {
        new bw5.ue0();
    }

    public java.lang.String b() {
        return this.f115407g[1] ? this.f115404d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ue0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ue0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ue0)) {
            return false;
        }
        bw5.ue0 ue0Var = (bw5.ue0) fVar;
        return n51.f.a(this.f115404d, ue0Var.f115404d) && n51.f.a(this.f115405e, ue0Var.f115405e) && n51.f.a(java.lang.Integer.valueOf(this.f115406f), java.lang.Integer.valueOf(ue0Var.f115406f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ue0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115407g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115404d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v5 v5Var = this.f115405e;
            if (v5Var != null && zArr[2]) {
                fVar.i(2, v5Var.mo75928xcd1e8d8());
                this.f115405e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115406f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f115404d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v5 v5Var2 = this.f115405e;
            if (v5Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v5Var2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f115406f) : i18;
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
            this.f115404d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f115406f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v5 v5Var3 = new bw5.v5();
            if (bArr != null && bArr.length > 0) {
                v5Var3.mo11468x92b714fd(bArr);
            }
            this.f115405e = v5Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
