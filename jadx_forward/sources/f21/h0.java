package f21;

/* loaded from: classes11.dex */
public class h0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f340439d;

    /* renamed from: e, reason: collision with root package name */
    public int f340440e;

    /* renamed from: f, reason: collision with root package name */
    public int f340441f;

    /* renamed from: g, reason: collision with root package name */
    public int f340442g;

    /* renamed from: h, reason: collision with root package name */
    public int f340443h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.h0)) {
            return false;
        }
        f21.h0 h0Var = (f21.h0) fVar;
        return n51.f.a(this.f340439d, h0Var.f340439d) && n51.f.a(java.lang.Integer.valueOf(this.f340440e), java.lang.Integer.valueOf(h0Var.f340440e)) && n51.f.a(java.lang.Integer.valueOf(this.f340441f), java.lang.Integer.valueOf(h0Var.f340441f)) && n51.f.a(java.lang.Integer.valueOf(this.f340442g), java.lang.Integer.valueOf(h0Var.f340442g)) && n51.f.a(java.lang.Integer.valueOf(this.f340443h), java.lang.Integer.valueOf(h0Var.f340443h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f340439d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f340440e);
            fVar.e(3, this.f340441f);
            fVar.e(4, this.f340442g);
            fVar.e(5, this.f340443h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f340439d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f340440e) + b36.f.e(3, this.f340441f) + b36.f.e(4, this.f340442g) + b36.f.e(5, this.f340443h);
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
        f21.h0 h0Var = (f21.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f340439d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h0Var.f340440e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h0Var.f340441f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h0Var.f340442g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h0Var.f340443h = aVar2.g(intValue);
        return 0;
    }
}
