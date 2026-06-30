package m53;

/* loaded from: classes8.dex */
public class z5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405771e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405772f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405773g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z5)) {
            return false;
        }
        m53.z5 z5Var = (m53.z5) fVar;
        return n51.f.a(this.f405770d, z5Var.f405770d) && n51.f.a(this.f405771e, z5Var.f405771e) && n51.f.a(this.f405772f, z5Var.f405772f) && n51.f.a(this.f405773g, z5Var.f405773g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405770d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405771e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405772f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405773g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f405770d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f405771e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f405772f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f405773g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        m53.z5 z5Var = (m53.z5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z5Var.f405770d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z5Var.f405771e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z5Var.f405772f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        z5Var.f405773g = aVar2.k(intValue);
        return 0;
    }
}
