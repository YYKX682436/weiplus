package r45;

/* loaded from: classes7.dex */
public class hd7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457602d;

    /* renamed from: e, reason: collision with root package name */
    public int f457603e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457604f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457607i;

    /* renamed from: m, reason: collision with root package name */
    public int f457608m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hd7)) {
            return false;
        }
        r45.hd7 hd7Var = (r45.hd7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457602d), java.lang.Integer.valueOf(hd7Var.f457602d)) && n51.f.a(java.lang.Integer.valueOf(this.f457603e), java.lang.Integer.valueOf(hd7Var.f457603e)) && n51.f.a(this.f457604f, hd7Var.f457604f) && n51.f.a(this.f457605g, hd7Var.f457605g) && n51.f.a(this.f457606h, hd7Var.f457606h) && n51.f.a(this.f457607i, hd7Var.f457607i) && n51.f.a(java.lang.Integer.valueOf(this.f457608m), java.lang.Integer.valueOf(hd7Var.f457608m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457602d);
            fVar.e(2, this.f457603e);
            java.lang.String str = this.f457604f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f457605g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f457606h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f457607i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f457608m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457602d) + 0 + b36.f.e(2, this.f457603e);
            java.lang.String str5 = this.f457604f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f457605g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f457606h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f457607i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f457608m);
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
        r45.hd7 hd7Var = (r45.hd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hd7Var.f457602d = aVar2.g(intValue);
                return 0;
            case 2:
                hd7Var.f457603e = aVar2.g(intValue);
                return 0;
            case 3:
                hd7Var.f457604f = aVar2.k(intValue);
                return 0;
            case 4:
                hd7Var.f457605g = aVar2.k(intValue);
                return 0;
            case 5:
                hd7Var.f457606h = aVar2.k(intValue);
                return 0;
            case 6:
                hd7Var.f457607i = aVar2.k(intValue);
                return 0;
            case 7:
                hd7Var.f457608m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
