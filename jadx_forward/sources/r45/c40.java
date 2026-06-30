package r45;

/* loaded from: classes9.dex */
public class c40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452794d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452796f;

    /* renamed from: g, reason: collision with root package name */
    public int f452797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452798h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c40)) {
            return false;
        }
        r45.c40 c40Var = (r45.c40) fVar;
        return n51.f.a(this.f452794d, c40Var.f452794d) && n51.f.a(this.f452795e, c40Var.f452795e) && n51.f.a(this.f452796f, c40Var.f452796f) && n51.f.a(java.lang.Integer.valueOf(this.f452797g), java.lang.Integer.valueOf(c40Var.f452797g)) && n51.f.a(this.f452798h, c40Var.f452798h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452794d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452795e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            java.lang.String str = this.f452796f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452797g);
            java.lang.String str2 = this.f452798h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f452794d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f452795e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            java.lang.String str3 = this.f452796f;
            if (str3 != null) {
                b17 += b36.f.j(3, str3);
            }
            int e17 = b17 + b36.f.e(4, this.f452797g);
            java.lang.String str4 = this.f452798h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.c40 c40Var = (r45.c40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c40Var.f452794d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            c40Var.f452795e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            c40Var.f452796f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            c40Var.f452797g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c40Var.f452798h = aVar2.k(intValue);
        return 0;
    }
}
