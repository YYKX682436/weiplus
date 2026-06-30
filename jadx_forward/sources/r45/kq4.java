package r45;

/* loaded from: classes4.dex */
public class kq4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460435d;

    /* renamed from: e, reason: collision with root package name */
    public int f460436e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460437f;

    /* renamed from: g, reason: collision with root package name */
    public int f460438g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kq4)) {
            return false;
        }
        r45.kq4 kq4Var = (r45.kq4) fVar;
        return n51.f.a(this.f460435d, kq4Var.f460435d) && n51.f.a(java.lang.Integer.valueOf(this.f460436e), java.lang.Integer.valueOf(kq4Var.f460436e)) && n51.f.a(this.f460437f, kq4Var.f460437f) && n51.f.a(java.lang.Integer.valueOf(this.f460438g), java.lang.Integer.valueOf(kq4Var.f460438g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460435d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f460436e);
            java.lang.String str2 = this.f460437f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f460438g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f460435d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f460436e);
            java.lang.String str4 = this.f460437f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f460438g);
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
        r45.kq4 kq4Var = (r45.kq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kq4Var.f460435d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kq4Var.f460436e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kq4Var.f460437f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        kq4Var.f460438g = aVar2.g(intValue);
        return 0;
    }
}
