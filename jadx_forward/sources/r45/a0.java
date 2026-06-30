package r45;

/* loaded from: classes9.dex */
public class a0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451105d;

    /* renamed from: e, reason: collision with root package name */
    public long f451106e;

    /* renamed from: f, reason: collision with root package name */
    public long f451107f;

    /* renamed from: g, reason: collision with root package name */
    public int f451108g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451109h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451110i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a0)) {
            return false;
        }
        r45.a0 a0Var = (r45.a0) fVar;
        return n51.f.a(this.f451105d, a0Var.f451105d) && n51.f.a(java.lang.Long.valueOf(this.f451106e), java.lang.Long.valueOf(a0Var.f451106e)) && n51.f.a(java.lang.Long.valueOf(this.f451107f), java.lang.Long.valueOf(a0Var.f451107f)) && n51.f.a(java.lang.Integer.valueOf(this.f451108g), java.lang.Integer.valueOf(a0Var.f451108g)) && n51.f.a(this.f451109h, a0Var.f451109h) && n51.f.a(this.f451110i, a0Var.f451110i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451105d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f451106e);
            fVar.h(3, this.f451107f);
            fVar.e(4, this.f451108g);
            java.lang.String str2 = this.f451109h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451110i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f451105d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f451106e) + b36.f.h(3, this.f451107f) + b36.f.e(4, this.f451108g);
            java.lang.String str5 = this.f451109h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f451110i;
            return str6 != null ? j17 + b36.f.j(6, str6) : j17;
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
        r45.a0 a0Var = (r45.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a0Var.f451105d = aVar2.k(intValue);
                return 0;
            case 2:
                a0Var.f451106e = aVar2.i(intValue);
                return 0;
            case 3:
                a0Var.f451107f = aVar2.i(intValue);
                return 0;
            case 4:
                a0Var.f451108g = aVar2.g(intValue);
                return 0;
            case 5:
                a0Var.f451109h = aVar2.k(intValue);
                return 0;
            case 6:
                a0Var.f451110i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
