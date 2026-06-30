package r45;

/* loaded from: classes7.dex */
public class nc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f462786d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.qp5 f462787e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nc7)) {
            return false;
        }
        r45.nc7 nc7Var = (r45.nc7) fVar;
        return n51.f.a(this.f76494x2de60e5e, nc7Var.f76494x2de60e5e) && n51.f.a(this.f462786d, nc7Var.f462786d) && n51.f.a(this.f462787e, nc7Var.f462787e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f462786d);
            r45.qp5 qp5Var = this.f462787e;
            if (qp5Var != null) {
                fVar.i(3, qp5Var.mo75928xcd1e8d8());
                this.f462787e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f462786d);
            r45.qp5 qp5Var2 = this.f462787e;
            return qp5Var2 != null ? i18 + b36.f.i(3, qp5Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462786d.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.nc7 nc7Var = (r45.nc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                nc7Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.uc7 uc7Var = new r45.uc7();
                if (bArr3 != null && bArr3.length > 0) {
                    uc7Var.mo11468x92b714fd(bArr3);
                }
                nc7Var.f462786d.add(uc7Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.qp5 qp5Var3 = new r45.qp5();
            if (bArr4 != null && bArr4.length > 0) {
                qp5Var3.mo11468x92b714fd(bArr4);
            }
            nc7Var.f462787e = qp5Var3;
        }
        return 0;
    }
}
