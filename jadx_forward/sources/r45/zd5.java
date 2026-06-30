package r45;

/* loaded from: classes9.dex */
public class zd5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473470d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473471e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473472f;

    /* renamed from: g, reason: collision with root package name */
    public int f473473g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd5)) {
            return false;
        }
        r45.zd5 zd5Var = (r45.zd5) fVar;
        return n51.f.a(this.f473470d, zd5Var.f473470d) && n51.f.a(this.f473471e, zd5Var.f473471e) && n51.f.a(this.f473472f, zd5Var.f473472f) && n51.f.a(java.lang.Integer.valueOf(this.f473473g), java.lang.Integer.valueOf(zd5Var.f473473g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473470d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473471e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473472f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f473473g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f473470d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f473471e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f473472f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f473473g);
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
        r45.zd5 zd5Var = (r45.zd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd5Var.f473470d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zd5Var.f473471e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zd5Var.f473472f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zd5Var.f473473g = aVar2.g(intValue);
        return 0;
    }
}
