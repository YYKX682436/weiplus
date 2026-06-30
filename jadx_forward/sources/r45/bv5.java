package r45;

/* loaded from: classes4.dex */
public class bv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f452617d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f452618e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vi f452619f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bv5)) {
            return false;
        }
        r45.bv5 bv5Var = (r45.bv5) fVar;
        return n51.f.a(this.f76494x2de60e5e, bv5Var.f76494x2de60e5e) && n51.f.a(this.f452617d, bv5Var.f452617d) && n51.f.a(java.lang.Boolean.valueOf(this.f452618e), java.lang.Boolean.valueOf(bv5Var.f452618e)) && n51.f.a(this.f452619f, bv5Var.f452619f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452617d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f452618e);
            r45.vi viVar = this.f452619f;
            if (viVar != null) {
                fVar.i(4, viVar.mo75928xcd1e8d8());
                this.f452619f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f452618e);
            r45.vi viVar2 = this.f452619f;
            return viVar2 != null ? i18 + b36.f.i(4, viVar2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.bv5 bv5Var = (r45.bv5) objArr[1];
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
                bv5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bv5Var.f452617d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            bv5Var.f452618e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.vi viVar3 = new r45.vi();
            if (bArr3 != null && bArr3.length > 0) {
                viVar3.mo11468x92b714fd(bArr3);
            }
            bv5Var.f452619f = viVar3;
        }
        return 0;
    }
}
