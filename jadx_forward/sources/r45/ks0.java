package r45;

/* loaded from: classes4.dex */
public class ks0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460448d;

    /* renamed from: e, reason: collision with root package name */
    public int f460449e;

    /* renamed from: f, reason: collision with root package name */
    public int f460450f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460451g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ks0)) {
            return false;
        }
        r45.ks0 ks0Var = (r45.ks0) fVar;
        return n51.f.a(this.f460448d, ks0Var.f460448d) && n51.f.a(java.lang.Integer.valueOf(this.f460449e), java.lang.Integer.valueOf(ks0Var.f460449e)) && n51.f.a(java.lang.Integer.valueOf(this.f460450f), java.lang.Integer.valueOf(ks0Var.f460450f)) && n51.f.a(this.f460451g, ks0Var.f460451g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460448d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f460449e);
            fVar.e(3, this.f460450f);
            java.lang.String str2 = this.f460451g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f460448d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f460449e) + b36.f.e(3, this.f460450f);
            java.lang.String str4 = this.f460451g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.ks0 ks0Var = (r45.ks0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ks0Var.f460448d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ks0Var.f460449e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ks0Var.f460450f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ks0Var.f460451g = aVar2.k(intValue);
        return 0;
    }
}
