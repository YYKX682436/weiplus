package r45;

/* loaded from: classes8.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463319d;

    /* renamed from: e, reason: collision with root package name */
    public int f463320e;

    /* renamed from: f, reason: collision with root package name */
    public int f463321f;

    /* renamed from: g, reason: collision with root package name */
    public int f463322g;

    /* renamed from: h, reason: collision with root package name */
    public int f463323h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o0)) {
            return false;
        }
        r45.o0 o0Var = (r45.o0) fVar;
        return n51.f.a(this.f463319d, o0Var.f463319d) && n51.f.a(java.lang.Integer.valueOf(this.f463320e), java.lang.Integer.valueOf(o0Var.f463320e)) && n51.f.a(java.lang.Integer.valueOf(this.f463321f), java.lang.Integer.valueOf(o0Var.f463321f)) && n51.f.a(java.lang.Integer.valueOf(this.f463322g), java.lang.Integer.valueOf(o0Var.f463322g)) && n51.f.a(java.lang.Integer.valueOf(this.f463323h), java.lang.Integer.valueOf(o0Var.f463323h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463319d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463320e);
            fVar.e(3, this.f463321f);
            fVar.e(4, this.f463322g);
            fVar.e(5, this.f463323h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f463319d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f463320e) + b36.f.e(3, this.f463321f) + b36.f.e(4, this.f463322g) + b36.f.e(5, this.f463323h);
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
        r45.o0 o0Var = (r45.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o0Var.f463319d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            o0Var.f463320e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            o0Var.f463321f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            o0Var.f463322g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        o0Var.f463323h = aVar2.g(intValue);
        return 0;
    }
}
