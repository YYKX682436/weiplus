package r45;

/* loaded from: classes9.dex */
public class zo extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.k6 f473779d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473780e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zo)) {
            return false;
        }
        r45.zo zoVar = (r45.zo) fVar;
        return n51.f.a(this.f76494x2de60e5e, zoVar.f76494x2de60e5e) && n51.f.a(this.f473779d, zoVar.f473779d) && n51.f.a(this.f473780e, zoVar.f473780e);
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
            r45.k6 k6Var = this.f473779d;
            if (k6Var != null) {
                fVar.i(2, k6Var.mo75928xcd1e8d8());
                this.f473779d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f473780e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.k6 k6Var2 = this.f473779d;
            if (k6Var2 != null) {
                i18 += b36.f.i(2, k6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f473780e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.zo zoVar = (r45.zo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                zoVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            zoVar.f473780e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.k6 k6Var3 = new r45.k6();
            if (bArr2 != null && bArr2.length > 0) {
                k6Var3.mo11468x92b714fd(bArr2);
            }
            zoVar.f473779d = k6Var3;
        }
        return 0;
    }
}
