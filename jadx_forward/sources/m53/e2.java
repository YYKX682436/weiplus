package m53;

/* loaded from: classes4.dex */
public class e2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.a0 f405181d;

    /* renamed from: e, reason: collision with root package name */
    public m53.n1 f405182e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e2)) {
            return false;
        }
        m53.e2 e2Var = (m53.e2) fVar;
        return n51.f.a(this.f76492x92037252, e2Var.f76492x92037252) && n51.f.a(this.f405181d, e2Var.f405181d) && n51.f.a(this.f405182e, e2Var.f405182e);
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
            m53.a0 a0Var = this.f405181d;
            if (a0Var != null) {
                fVar.i(2, a0Var.mo75928xcd1e8d8());
                this.f405181d.mo75956x3d5d1f78(fVar);
            }
            m53.n1 n1Var = this.f405182e;
            if (n1Var != null) {
                fVar.i(3, n1Var.mo75928xcd1e8d8());
                this.f405182e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            m53.a0 a0Var2 = this.f405181d;
            if (a0Var2 != null) {
                i18 += b36.f.i(2, a0Var2.mo75928xcd1e8d8());
            }
            m53.n1 n1Var2 = this.f405182e;
            return n1Var2 != null ? i18 + b36.f.i(3, n1Var2.mo75928xcd1e8d8()) : i18;
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
        m53.e2 e2Var = (m53.e2) objArr[1];
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
                e2Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                m53.a0 a0Var3 = new m53.a0();
                if (bArr2 != null && bArr2.length > 0) {
                    a0Var3.mo11468x92b714fd(bArr2);
                }
                e2Var.f405181d = a0Var3;
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
            m53.n1 n1Var3 = new m53.n1();
            if (bArr3 != null && bArr3.length > 0) {
                n1Var3.mo11468x92b714fd(bArr3);
            }
            e2Var.f405182e = n1Var3;
        }
        return 0;
    }
}
