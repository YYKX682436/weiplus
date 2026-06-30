package bw5;

/* loaded from: classes2.dex */
public class rp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114180d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dp0 f114181e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.sp0 f114182f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114183g = new boolean[4];

    static {
        new bw5.rp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rp0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.rp0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rp0)) {
            return false;
        }
        bw5.rp0 rp0Var = (bw5.rp0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114180d), java.lang.Boolean.valueOf(rp0Var.f114180d)) && n51.f.a(this.f114181e, rp0Var.f114181e) && n51.f.a(this.f114182f, rp0Var.f114182f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114183g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114180d);
            }
            bw5.dp0 dp0Var = this.f114181e;
            if (dp0Var != null && zArr[2]) {
                fVar.i(2, dp0Var.mo75928xcd1e8d8());
                this.f114181e.mo75956x3d5d1f78(fVar);
            }
            bw5.sp0 sp0Var = this.f114182f;
            if (sp0Var != null && zArr[3]) {
                fVar.i(3, sp0Var.mo75928xcd1e8d8());
                this.f114182f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114180d) : 0;
            bw5.dp0 dp0Var2 = this.f114181e;
            if (dp0Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, dp0Var2.mo75928xcd1e8d8());
            }
            bw5.sp0 sp0Var2 = this.f114182f;
            return (sp0Var2 == null || !zArr[3]) ? a17 : a17 + b36.f.i(3, sp0Var2.mo75928xcd1e8d8());
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
            this.f114180d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.dp0 dp0Var3 = new bw5.dp0();
                if (bArr != null && bArr.length > 0) {
                    dp0Var3.mo11468x92b714fd(bArr);
                }
                this.f114181e = dp0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.sp0 sp0Var3 = new bw5.sp0();
            if (bArr2 != null && bArr2.length > 0) {
                sp0Var3.mo11468x92b714fd(bArr2);
            }
            this.f114182f = sp0Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
