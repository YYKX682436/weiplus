package r45;

/* loaded from: classes9.dex */
public class dz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454403d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454404e;

    /* renamed from: f, reason: collision with root package name */
    public int f454405f;

    /* renamed from: g, reason: collision with root package name */
    public int f454406g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454407h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dz4)) {
            return false;
        }
        r45.dz4 dz4Var = (r45.dz4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454403d), java.lang.Integer.valueOf(dz4Var.f454403d)) && n51.f.a(this.f454404e, dz4Var.f454404e) && n51.f.a(java.lang.Integer.valueOf(this.f454405f), java.lang.Integer.valueOf(dz4Var.f454405f)) && n51.f.a(java.lang.Integer.valueOf(this.f454406g), java.lang.Integer.valueOf(dz4Var.f454406g)) && n51.f.a(this.f454407h, dz4Var.f454407h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454403d);
            java.lang.String str = this.f454404e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f454405f);
            fVar.e(5, this.f454406g);
            java.lang.String str2 = this.f454407h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454403d) + 0;
            java.lang.String str3 = this.f454404e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int e18 = e17 + b36.f.e(4, this.f454405f) + b36.f.e(5, this.f454406g);
            java.lang.String str4 = this.f454407h;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.dz4 dz4Var = (r45.dz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dz4Var.f454403d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dz4Var.f454404e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            dz4Var.f454405f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            dz4Var.f454406g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        dz4Var.f454407h = aVar2.k(intValue);
        return 0;
    }
}
