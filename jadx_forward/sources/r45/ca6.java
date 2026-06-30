package r45;

/* loaded from: classes4.dex */
public class ca6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f452935d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f452936e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca6)) {
            return false;
        }
        r45.ca6 ca6Var = (r45.ca6) fVar;
        return n51.f.a(this.f452935d, ca6Var.f452935d) && n51.f.a(this.f452936e, ca6Var.f452936e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f452935d;
            if (c19806x4c372b7 != null) {
                fVar.i(1, c19806x4c372b7.mo75928xcd1e8d8());
                this.f452935d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f452936e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f452936e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f452935d;
            int i18 = c19806x4c372b72 != null ? 0 + b36.f.i(1, c19806x4c372b72.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var2 = this.f452936e;
            return du5Var2 != null ? i18 + b36.f.i(2, du5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.ca6 ca6Var = (r45.ca6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                if (bArr != null && bArr.length > 0) {
                    c19806x4c372b73.mo11468x92b714fd(bArr);
                }
                ca6Var.f452935d = c19806x4c372b73;
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
            r45.du5 du5Var3 = new r45.du5();
            if (bArr2 != null && bArr2.length > 0) {
                du5Var3.b(bArr2);
            }
            ca6Var.f452936e = du5Var3;
        }
        return 0;
    }
}
