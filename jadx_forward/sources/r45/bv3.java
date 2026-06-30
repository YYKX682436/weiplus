package r45;

/* loaded from: classes9.dex */
public class bv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452612d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452613e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452614f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452615g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452616h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bv3)) {
            return false;
        }
        r45.bv3 bv3Var = (r45.bv3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452612d), java.lang.Integer.valueOf(bv3Var.f452612d)) && n51.f.a(this.f452613e, bv3Var.f452613e) && n51.f.a(this.f452614f, bv3Var.f452614f) && n51.f.a(this.f452615g, bv3Var.f452615g) && n51.f.a(this.f452616h, bv3Var.f452616h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452612d);
            java.lang.String str = this.f452613e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f452614f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f452615g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f452616h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452612d) + 0;
            java.lang.String str5 = this.f452613e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f452614f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f452615g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f452616h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.bv3 bv3Var = (r45.bv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bv3Var.f452612d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bv3Var.f452613e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bv3Var.f452614f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bv3Var.f452615g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bv3Var.f452616h = aVar2.k(intValue);
        return 0;
    }
}
