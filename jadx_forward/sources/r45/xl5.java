package r45;

/* loaded from: classes8.dex */
public class xl5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471748d;

    /* renamed from: e, reason: collision with root package name */
    public long f471749e;

    /* renamed from: f, reason: collision with root package name */
    public int f471750f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471751g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471752h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xl5)) {
            return false;
        }
        r45.xl5 xl5Var = (r45.xl5) fVar;
        return n51.f.a(this.f471748d, xl5Var.f471748d) && n51.f.a(java.lang.Long.valueOf(this.f471749e), java.lang.Long.valueOf(xl5Var.f471749e)) && n51.f.a(java.lang.Integer.valueOf(this.f471750f), java.lang.Integer.valueOf(xl5Var.f471750f)) && n51.f.a(this.f471751g, xl5Var.f471751g) && n51.f.a(this.f471752h, xl5Var.f471752h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471748d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f471749e);
            fVar.e(3, this.f471750f);
            java.lang.String str2 = this.f471751g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f471752h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f471748d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f471749e) + b36.f.e(3, this.f471750f);
            java.lang.String str5 = this.f471751g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f471752h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.xl5 xl5Var = (r45.xl5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xl5Var.f471748d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xl5Var.f471749e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            xl5Var.f471750f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            xl5Var.f471751g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        xl5Var.f471752h = aVar2.k(intValue);
        return 0;
    }
}
