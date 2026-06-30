package r45;

/* loaded from: classes4.dex */
public class zt3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473898d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f473899e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zt3)) {
            return false;
        }
        r45.zt3 zt3Var = (r45.zt3) fVar;
        return n51.f.a(this.f473898d, zt3Var.f473898d) && n51.f.a(this.f473899e, zt3Var.f473899e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473898d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f473899e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f473898d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.f473899e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473899e.clear();
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
        r45.zt3 zt3Var = (r45.zt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zt3Var.f473898d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.jj4 jj4Var = new r45.jj4();
            if (bArr2 != null && bArr2.length > 0) {
                jj4Var.mo11468x92b714fd(bArr2);
            }
            zt3Var.f473899e.add(jj4Var);
        }
        return 0;
    }
}
