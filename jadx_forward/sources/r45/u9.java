package r45;

/* loaded from: classes8.dex */
public class u9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468679d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468680e;

    /* renamed from: f, reason: collision with root package name */
    public int f468681f;

    /* renamed from: g, reason: collision with root package name */
    public int f468682g;

    /* renamed from: h, reason: collision with root package name */
    public long f468683h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u9)) {
            return false;
        }
        r45.u9 u9Var = (r45.u9) fVar;
        return n51.f.a(this.f468679d, u9Var.f468679d) && n51.f.a(this.f468680e, u9Var.f468680e) && n51.f.a(java.lang.Integer.valueOf(this.f468681f), java.lang.Integer.valueOf(u9Var.f468681f)) && n51.f.a(java.lang.Integer.valueOf(this.f468682g), java.lang.Integer.valueOf(u9Var.f468682g)) && n51.f.a(java.lang.Long.valueOf(this.f468683h), java.lang.Long.valueOf(u9Var.f468683h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468679d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468680e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f468681f);
            fVar.e(4, this.f468682g);
            fVar.h(5, this.f468683h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468679d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f468680e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f468681f) + b36.f.e(4, this.f468682g) + b36.f.h(5, this.f468683h);
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
        r45.u9 u9Var = (r45.u9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u9Var.f468679d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            u9Var.f468680e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            u9Var.f468681f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            u9Var.f468682g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        u9Var.f468683h = aVar2.i(intValue);
        return 0;
    }
}
