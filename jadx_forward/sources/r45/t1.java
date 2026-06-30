package r45;

/* loaded from: classes7.dex */
public class t1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f467586d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f467587e;

    /* renamed from: f, reason: collision with root package name */
    public int f467588f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f467589g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f467590h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t1)) {
            return false;
        }
        r45.t1 t1Var = (r45.t1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f467586d), java.lang.Boolean.valueOf(t1Var.f467586d)) && n51.f.a(java.lang.Boolean.valueOf(this.f467587e), java.lang.Boolean.valueOf(t1Var.f467587e)) && n51.f.a(java.lang.Integer.valueOf(this.f467588f), java.lang.Integer.valueOf(t1Var.f467588f)) && n51.f.a(java.lang.Boolean.valueOf(this.f467589g), java.lang.Boolean.valueOf(t1Var.f467589g)) && n51.f.a(this.f467590h, t1Var.f467590h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f467586d);
            fVar.a(2, this.f467587e);
            fVar.e(3, this.f467588f);
            fVar.a(4, this.f467589g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f467590h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f467586d) + 0 + b36.f.a(2, this.f467587e) + b36.f.e(3, this.f467588f) + b36.f.a(4, this.f467589g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f467590h;
            return gVar2 != null ? a17 + b36.f.b(5, gVar2) : a17;
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
        r45.t1 t1Var = (r45.t1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t1Var.f467586d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            t1Var.f467587e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            t1Var.f467588f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            t1Var.f467589g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        t1Var.f467590h = aVar2.d(intValue);
        return 0;
    }
}
