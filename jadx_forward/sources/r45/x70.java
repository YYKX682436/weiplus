package r45;

/* loaded from: classes8.dex */
public class x70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471370e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471371f;

    /* renamed from: g, reason: collision with root package name */
    public int f471372g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x70)) {
            return false;
        }
        r45.x70 x70Var = (r45.x70) fVar;
        return n51.f.a(this.f471369d, x70Var.f471369d) && n51.f.a(this.f471370e, x70Var.f471370e) && n51.f.a(this.f471371f, x70Var.f471371f) && n51.f.a(java.lang.Integer.valueOf(this.f471372g), java.lang.Integer.valueOf(x70Var.f471372g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471369d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471370e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471371f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f471372g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f471369d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f471370e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471371f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.e(4, this.f471372g);
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
        r45.x70 x70Var = (r45.x70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x70Var.f471369d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x70Var.f471370e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            x70Var.f471371f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x70Var.f471372g = aVar2.g(intValue);
        return 0;
    }
}
