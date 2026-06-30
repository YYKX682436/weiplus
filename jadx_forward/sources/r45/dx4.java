package r45;

/* loaded from: classes8.dex */
public class dx4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454359d;

    /* renamed from: e, reason: collision with root package name */
    public int f454360e;

    /* renamed from: f, reason: collision with root package name */
    public int f454361f;

    /* renamed from: g, reason: collision with root package name */
    public int f454362g;

    /* renamed from: h, reason: collision with root package name */
    public int f454363h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dx4)) {
            return false;
        }
        r45.dx4 dx4Var = (r45.dx4) fVar;
        return n51.f.a(this.f454359d, dx4Var.f454359d) && n51.f.a(java.lang.Integer.valueOf(this.f454360e), java.lang.Integer.valueOf(dx4Var.f454360e)) && n51.f.a(java.lang.Integer.valueOf(this.f454361f), java.lang.Integer.valueOf(dx4Var.f454361f)) && n51.f.a(java.lang.Integer.valueOf(this.f454362g), java.lang.Integer.valueOf(dx4Var.f454362g)) && n51.f.a(java.lang.Integer.valueOf(this.f454363h), java.lang.Integer.valueOf(dx4Var.f454363h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454359d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f454360e);
            fVar.e(3, this.f454361f);
            fVar.e(4, this.f454362g);
            fVar.e(5, this.f454363h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f454359d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f454360e) + b36.f.e(3, this.f454361f) + b36.f.e(4, this.f454362g) + b36.f.e(5, this.f454363h);
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
        r45.dx4 dx4Var = (r45.dx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dx4Var.f454359d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dx4Var.f454360e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dx4Var.f454361f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dx4Var.f454362g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dx4Var.f454363h = aVar2.g(intValue);
        return 0;
    }
}
