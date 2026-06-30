package r45;

/* loaded from: classes4.dex */
public class gf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456727d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456728e;

    /* renamed from: f, reason: collision with root package name */
    public int f456729f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456730g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf4)) {
            return false;
        }
        r45.gf4 gf4Var = (r45.gf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456727d), java.lang.Integer.valueOf(gf4Var.f456727d)) && n51.f.a(this.f456728e, gf4Var.f456728e) && n51.f.a(java.lang.Integer.valueOf(this.f456729f), java.lang.Integer.valueOf(gf4Var.f456729f)) && n51.f.a(this.f456730g, gf4Var.f456730g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456727d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456728e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f456729f);
            java.lang.String str = this.f456730g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456727d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456728e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f456729f);
            java.lang.String str2 = this.f456730g;
            return str2 != null ? e18 + b36.f.j(4, str2) : e18;
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
        r45.gf4 gf4Var = (r45.gf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gf4Var.f456727d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gf4Var.f456728e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gf4Var.f456729f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gf4Var.f456730g = aVar2.k(intValue);
        return 0;
    }
}
