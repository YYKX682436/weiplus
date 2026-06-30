package r45;

/* loaded from: classes11.dex */
public class eq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455211d;

    /* renamed from: e, reason: collision with root package name */
    public int f455212e;

    /* renamed from: f, reason: collision with root package name */
    public int f455213f;

    /* renamed from: g, reason: collision with root package name */
    public int f455214g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455215h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455216i;

    /* renamed from: m, reason: collision with root package name */
    public int f455217m;

    /* renamed from: n, reason: collision with root package name */
    public int f455218n;

    /* renamed from: o, reason: collision with root package name */
    public int f455219o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eq6)) {
            return false;
        }
        r45.eq6 eq6Var = (r45.eq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455211d), java.lang.Integer.valueOf(eq6Var.f455211d)) && n51.f.a(java.lang.Integer.valueOf(this.f455212e), java.lang.Integer.valueOf(eq6Var.f455212e)) && n51.f.a(java.lang.Integer.valueOf(this.f455213f), java.lang.Integer.valueOf(eq6Var.f455213f)) && n51.f.a(java.lang.Integer.valueOf(this.f455214g), java.lang.Integer.valueOf(eq6Var.f455214g)) && n51.f.a(this.f455215h, eq6Var.f455215h) && n51.f.a(this.f455216i, eq6Var.f455216i) && n51.f.a(java.lang.Integer.valueOf(this.f455217m), java.lang.Integer.valueOf(eq6Var.f455217m)) && n51.f.a(java.lang.Integer.valueOf(this.f455218n), java.lang.Integer.valueOf(eq6Var.f455218n)) && n51.f.a(java.lang.Integer.valueOf(this.f455219o), java.lang.Integer.valueOf(eq6Var.f455219o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455211d);
            fVar.e(2, this.f455212e);
            fVar.e(3, this.f455213f);
            fVar.e(4, this.f455214g);
            java.lang.String str = this.f455215h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f455216i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f455217m);
            fVar.e(8, this.f455218n);
            fVar.e(9, this.f455219o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455211d) + 0 + b36.f.e(2, this.f455212e) + b36.f.e(3, this.f455213f) + b36.f.e(4, this.f455214g);
            java.lang.String str3 = this.f455215h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f455216i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f455217m) + b36.f.e(8, this.f455218n) + b36.f.e(9, this.f455219o);
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
        r45.eq6 eq6Var = (r45.eq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eq6Var.f455211d = aVar2.g(intValue);
                return 0;
            case 2:
                eq6Var.f455212e = aVar2.g(intValue);
                return 0;
            case 3:
                eq6Var.f455213f = aVar2.g(intValue);
                return 0;
            case 4:
                eq6Var.f455214g = aVar2.g(intValue);
                return 0;
            case 5:
                eq6Var.f455215h = aVar2.k(intValue);
                return 0;
            case 6:
                eq6Var.f455216i = aVar2.k(intValue);
                return 0;
            case 7:
                eq6Var.f455217m = aVar2.g(intValue);
                return 0;
            case 8:
                eq6Var.f455218n = aVar2.g(intValue);
                return 0;
            case 9:
                eq6Var.f455219o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
