package r45;

/* loaded from: classes9.dex */
public class x57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471336d;

    /* renamed from: e, reason: collision with root package name */
    public int f471337e;

    /* renamed from: f, reason: collision with root package name */
    public int f471338f;

    /* renamed from: g, reason: collision with root package name */
    public int f471339g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x57)) {
            return false;
        }
        r45.x57 x57Var = (r45.x57) fVar;
        return n51.f.a(this.f471336d, x57Var.f471336d) && n51.f.a(java.lang.Integer.valueOf(this.f471337e), java.lang.Integer.valueOf(x57Var.f471337e)) && n51.f.a(java.lang.Integer.valueOf(this.f471338f), java.lang.Integer.valueOf(x57Var.f471338f)) && n51.f.a(java.lang.Integer.valueOf(this.f471339g), java.lang.Integer.valueOf(x57Var.f471339g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471336d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471337e);
            fVar.e(3, this.f471338f);
            fVar.e(4, this.f471339g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f471336d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f471337e) + b36.f.e(3, this.f471338f) + b36.f.e(4, this.f471339g);
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
        r45.x57 x57Var = (r45.x57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x57Var.f471336d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x57Var.f471337e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            x57Var.f471338f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x57Var.f471339g = aVar2.g(intValue);
        return 0;
    }
}
