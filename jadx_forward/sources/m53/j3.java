package m53;

/* loaded from: classes8.dex */
public class j3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.u5 f405351d;

    /* renamed from: e, reason: collision with root package name */
    public m53.g4 f405352e;

    /* renamed from: f, reason: collision with root package name */
    public m53.j0 f405353f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j3)) {
            return false;
        }
        m53.j3 j3Var = (m53.j3) fVar;
        return n51.f.a(this.f405351d, j3Var.f405351d) && n51.f.a(this.f405352e, j3Var.f405352e) && n51.f.a(this.f405353f, j3Var.f405353f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.u5 u5Var = this.f405351d;
            if (u5Var != null) {
                fVar.i(1, u5Var.mo75928xcd1e8d8());
                this.f405351d.mo75956x3d5d1f78(fVar);
            }
            m53.g4 g4Var = this.f405352e;
            if (g4Var != null) {
                fVar.i(2, g4Var.mo75928xcd1e8d8());
                this.f405352e.mo75956x3d5d1f78(fVar);
            }
            m53.j0 j0Var = this.f405353f;
            if (j0Var != null) {
                fVar.i(3, j0Var.mo75928xcd1e8d8());
                this.f405353f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.u5 u5Var2 = this.f405351d;
            int i18 = u5Var2 != null ? 0 + b36.f.i(1, u5Var2.mo75928xcd1e8d8()) : 0;
            m53.g4 g4Var2 = this.f405352e;
            if (g4Var2 != null) {
                i18 += b36.f.i(2, g4Var2.mo75928xcd1e8d8());
            }
            m53.j0 j0Var2 = this.f405353f;
            return j0Var2 != null ? i18 + b36.f.i(3, j0Var2.mo75928xcd1e8d8()) : i18;
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
        m53.j3 j3Var = (m53.j3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                m53.u5 u5Var3 = new m53.u5();
                if (bArr != null && bArr.length > 0) {
                    u5Var3.mo11468x92b714fd(bArr);
                }
                j3Var.f405351d = u5Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                m53.g4 g4Var3 = new m53.g4();
                if (bArr2 != null && bArr2.length > 0) {
                    g4Var3.mo11468x92b714fd(bArr2);
                }
                j3Var.f405352e = g4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            m53.j0 j0Var3 = new m53.j0();
            if (bArr3 != null && bArr3.length > 0) {
                j0Var3.mo11468x92b714fd(bArr3);
            }
            j3Var.f405353f = j0Var3;
        }
        return 0;
    }
}
