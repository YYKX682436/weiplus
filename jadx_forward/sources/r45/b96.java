package r45;

/* loaded from: classes4.dex */
public class b96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452172d;

    /* renamed from: e, reason: collision with root package name */
    public int f452173e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f452174f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b96)) {
            return false;
        }
        r45.b96 b96Var = (r45.b96) fVar;
        return n51.f.a(this.f452172d, b96Var.f452172d) && n51.f.a(java.lang.Integer.valueOf(this.f452173e), java.lang.Integer.valueOf(b96Var.f452173e)) && n51.f.a(this.f452174f, b96Var.f452174f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452172d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f452173e);
            r45.cu5 cu5Var = this.f452174f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f452174f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f452172d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f452173e);
            r45.cu5 cu5Var2 = this.f452174f;
            return cu5Var2 != null ? j17 + b36.f.i(3, cu5Var2.mo75928xcd1e8d8()) : j17;
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
        r45.b96 b96Var = (r45.b96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b96Var.f452172d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            b96Var.f452173e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            b96Var.f452174f = cu5Var3;
        }
        return 0;
    }
}
