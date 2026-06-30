package r45;

/* loaded from: classes9.dex */
public class h37 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457343d;

    /* renamed from: e, reason: collision with root package name */
    public int f457344e;

    /* renamed from: f, reason: collision with root package name */
    public int f457345f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457346g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457347h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h37)) {
            return false;
        }
        r45.h37 h37Var = (r45.h37) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457343d), java.lang.Integer.valueOf(h37Var.f457343d)) && n51.f.a(java.lang.Integer.valueOf(this.f457344e), java.lang.Integer.valueOf(h37Var.f457344e)) && n51.f.a(java.lang.Integer.valueOf(this.f457345f), java.lang.Integer.valueOf(h37Var.f457345f)) && n51.f.a(this.f457346g, h37Var.f457346g) && n51.f.a(this.f457347h, h37Var.f457347h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457343d);
            fVar.e(2, this.f457344e);
            fVar.e(3, this.f457345f);
            java.lang.String str = this.f457346g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f457347h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457343d) + 0 + b36.f.e(2, this.f457344e) + b36.f.e(3, this.f457345f);
            java.lang.String str3 = this.f457346g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f457347h;
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
        r45.h37 h37Var = (r45.h37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h37Var.f457343d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h37Var.f457344e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h37Var.f457345f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h37Var.f457346g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h37Var.f457347h = aVar2.k(intValue);
        return 0;
    }
}
