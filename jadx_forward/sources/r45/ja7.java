package r45;

/* loaded from: classes8.dex */
public class ja7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459212d;

    /* renamed from: e, reason: collision with root package name */
    public int f459213e;

    /* renamed from: f, reason: collision with root package name */
    public int f459214f;

    /* renamed from: g, reason: collision with root package name */
    public int f459215g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f459216h = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ja7)) {
            return false;
        }
        r45.ja7 ja7Var = (r45.ja7) fVar;
        return n51.f.a(this.f459212d, ja7Var.f459212d) && n51.f.a(java.lang.Integer.valueOf(this.f459213e), java.lang.Integer.valueOf(ja7Var.f459213e)) && n51.f.a(java.lang.Integer.valueOf(this.f459214f), java.lang.Integer.valueOf(ja7Var.f459214f)) && n51.f.a(java.lang.Integer.valueOf(this.f459215g), java.lang.Integer.valueOf(ja7Var.f459215g)) && n51.f.a(java.lang.Boolean.valueOf(this.f459216h), java.lang.Boolean.valueOf(ja7Var.f459216h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459212d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459213e);
            fVar.e(3, this.f459214f);
            fVar.e(4, this.f459215g);
            fVar.a(5, this.f459216h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459212d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f459213e) + b36.f.e(3, this.f459214f) + b36.f.e(4, this.f459215g) + b36.f.a(5, this.f459216h);
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
        r45.ja7 ja7Var = (r45.ja7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ja7Var.f459212d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ja7Var.f459213e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ja7Var.f459214f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ja7Var.f459215g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ja7Var.f459216h = aVar2.c(intValue);
        return 0;
    }
}
