package r45;

/* loaded from: classes4.dex */
public class r96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466193d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f466194e;

    /* renamed from: f, reason: collision with root package name */
    public int f466195f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r96)) {
            return false;
        }
        r45.r96 r96Var = (r45.r96) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466193d), java.lang.Integer.valueOf(r96Var.f466193d)) && n51.f.a(this.f466194e, r96Var.f466194e) && n51.f.a(java.lang.Integer.valueOf(this.f466195f), java.lang.Integer.valueOf(r96Var.f466195f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466193d);
            r45.du5 du5Var = this.f466194e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f466194e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f466195f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466193d) + 0;
            r45.du5 du5Var2 = this.f466194e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f466195f);
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
        r45.r96 r96Var = (r45.r96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r96Var.f466193d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            r96Var.f466195f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr != null && bArr.length > 0) {
                du5Var3.b(bArr);
            }
            r96Var.f466194e = du5Var3;
        }
        return 0;
    }
}
