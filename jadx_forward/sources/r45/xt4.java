package r45;

/* loaded from: classes4.dex */
public class xt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.g5 f471931d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h5 f471932e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt4)) {
            return false;
        }
        r45.xt4 xt4Var = (r45.xt4) fVar;
        return n51.f.a(this.f471931d, xt4Var.f471931d) && n51.f.a(this.f471932e, xt4Var.f471932e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.g5 g5Var = this.f471931d;
            if (g5Var != null) {
                fVar.i(1, g5Var.mo75928xcd1e8d8());
                this.f471931d.mo75956x3d5d1f78(fVar);
            }
            r45.h5 h5Var = this.f471932e;
            if (h5Var != null) {
                fVar.i(2, h5Var.mo75928xcd1e8d8());
                this.f471932e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.g5 g5Var2 = this.f471931d;
            int i18 = g5Var2 != null ? 0 + b36.f.i(1, g5Var2.mo75928xcd1e8d8()) : 0;
            r45.h5 h5Var2 = this.f471932e;
            return h5Var2 != null ? i18 + b36.f.i(2, h5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.xt4 xt4Var = (r45.xt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.g5 g5Var3 = new r45.g5();
                if (bArr != null && bArr.length > 0) {
                    g5Var3.mo11468x92b714fd(bArr);
                }
                xt4Var.f471931d = g5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.h5 h5Var3 = new r45.h5();
            if (bArr2 != null && bArr2.length > 0) {
                h5Var3.mo11468x92b714fd(bArr2);
            }
            xt4Var.f471932e = h5Var3;
        }
        return 0;
    }
}
