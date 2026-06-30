package m53;

/* loaded from: classes8.dex */
public class f5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405214d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405215e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405216f;

    /* renamed from: g, reason: collision with root package name */
    public int f405217g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f5)) {
            return false;
        }
        m53.f5 f5Var = (m53.f5) fVar;
        return n51.f.a(this.f405214d, f5Var.f405214d) && n51.f.a(this.f405215e, f5Var.f405215e) && n51.f.a(this.f405216f, f5Var.f405216f) && n51.f.a(java.lang.Integer.valueOf(this.f405217g), java.lang.Integer.valueOf(f5Var.f405217g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405214d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405215e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405216f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f405217g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f405214d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f405215e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f405216f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f405217g);
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
        m53.f5 f5Var = (m53.f5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f5Var.f405214d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            f5Var.f405215e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            f5Var.f405216f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        f5Var.f405217g = aVar2.g(intValue);
        return 0;
    }
}
