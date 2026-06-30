package r45;

/* loaded from: classes8.dex */
public class rv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f466757d;

    /* renamed from: e, reason: collision with root package name */
    public int f466758e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f466759f;

    /* renamed from: g, reason: collision with root package name */
    public int f466760g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rv3)) {
            return false;
        }
        r45.rv3 rv3Var = (r45.rv3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f466757d), java.lang.Long.valueOf(rv3Var.f466757d)) && n51.f.a(java.lang.Integer.valueOf(this.f466758e), java.lang.Integer.valueOf(rv3Var.f466758e)) && n51.f.a(this.f466759f, rv3Var.f466759f) && n51.f.a(java.lang.Integer.valueOf(this.f466760g), java.lang.Integer.valueOf(rv3Var.f466760g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f466757d);
            fVar.e(2, this.f466758e);
            r45.cu5 cu5Var = this.f466759f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f466759f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f466760g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f466757d) + 0 + b36.f.e(2, this.f466758e);
            r45.cu5 cu5Var2 = this.f466759f;
            if (cu5Var2 != null) {
                h17 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(4, this.f466760g);
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
        r45.rv3 rv3Var = (r45.rv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rv3Var.f466757d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rv3Var.f466758e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            rv3Var.f466760g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            rv3Var.f466759f = cu5Var3;
        }
        return 0;
    }
}
