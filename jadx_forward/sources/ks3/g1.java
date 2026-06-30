package ks3;

/* loaded from: classes4.dex */
public class g1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public ks3.y0 f393211d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.m1 f393212e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.g1)) {
            return false;
        }
        ks3.g1 g1Var = (ks3.g1) fVar;
        return n51.f.a(this.f76492x92037252, g1Var.f76492x92037252) && n51.f.a(this.f393211d, g1Var.f393211d) && n51.f.a(this.f393212e, g1Var.f393212e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            ks3.y0 y0Var = this.f393211d;
            if (y0Var != null) {
                fVar.i(2, y0Var.mo75928xcd1e8d8());
                this.f393211d.mo75956x3d5d1f78(fVar);
            }
            ks3.m1 m1Var = this.f393212e;
            if (m1Var != null) {
                fVar.i(3, m1Var.mo75928xcd1e8d8());
                this.f393212e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            ks3.y0 y0Var2 = this.f393211d;
            if (y0Var2 != null) {
                i18 += b36.f.i(2, y0Var2.mo75928xcd1e8d8());
            }
            ks3.m1 m1Var2 = this.f393212e;
            return m1Var2 != null ? i18 + b36.f.i(3, m1Var2.mo75928xcd1e8d8()) : i18;
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
        ks3.g1 g1Var = (ks3.g1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                g1Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                ks3.y0 y0Var3 = new ks3.y0();
                if (bArr2 != null && bArr2.length > 0) {
                    y0Var3.mo11468x92b714fd(bArr2);
                }
                g1Var.f393211d = y0Var3;
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
            ks3.m1 m1Var3 = new ks3.m1();
            if (bArr3 != null && bArr3.length > 0) {
                m1Var3.mo11468x92b714fd(bArr3);
            }
            g1Var.f393212e = m1Var3;
        }
        return 0;
    }
}
