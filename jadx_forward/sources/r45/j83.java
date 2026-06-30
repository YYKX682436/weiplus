package r45;

/* loaded from: classes8.dex */
public class j83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f459171d;

    /* renamed from: e, reason: collision with root package name */
    public int f459172e;

    /* renamed from: f, reason: collision with root package name */
    public int f459173f;

    /* renamed from: g, reason: collision with root package name */
    public int f459174g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459175h;

    /* renamed from: i, reason: collision with root package name */
    public int f459176i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459177m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459178n;

    /* renamed from: o, reason: collision with root package name */
    public long f459179o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f459180p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j83)) {
            return false;
        }
        r45.j83 j83Var = (r45.j83) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f459171d), java.lang.Long.valueOf(j83Var.f459171d)) && n51.f.a(java.lang.Integer.valueOf(this.f459172e), java.lang.Integer.valueOf(j83Var.f459172e)) && n51.f.a(java.lang.Integer.valueOf(this.f459173f), java.lang.Integer.valueOf(j83Var.f459173f)) && n51.f.a(java.lang.Integer.valueOf(this.f459174g), java.lang.Integer.valueOf(j83Var.f459174g)) && n51.f.a(this.f459175h, j83Var.f459175h) && n51.f.a(java.lang.Integer.valueOf(this.f459176i), java.lang.Integer.valueOf(j83Var.f459176i)) && n51.f.a(this.f459177m, j83Var.f459177m) && n51.f.a(this.f459178n, j83Var.f459178n) && n51.f.a(java.lang.Long.valueOf(this.f459179o), java.lang.Long.valueOf(j83Var.f459179o)) && n51.f.a(this.f459180p, j83Var.f459180p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f459171d);
            fVar.e(2, this.f459172e);
            fVar.e(5, this.f459173f);
            fVar.e(6, this.f459174g);
            java.lang.String str = this.f459175h;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f459176i);
            java.lang.String str2 = this.f459177m;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f459178n;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.h(11, this.f459179o);
            java.lang.String str4 = this.f459180p;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f459171d) + 0 + b36.f.e(2, this.f459172e) + b36.f.e(5, this.f459173f) + b36.f.e(6, this.f459174g);
            java.lang.String str5 = this.f459175h;
            if (str5 != null) {
                h17 += b36.f.j(7, str5);
            }
            int e17 = h17 + b36.f.e(8, this.f459176i);
            java.lang.String str6 = this.f459177m;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            java.lang.String str7 = this.f459178n;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            int h18 = e17 + b36.f.h(11, this.f459179o);
            java.lang.String str8 = this.f459180p;
            return str8 != null ? h18 + b36.f.j(12, str8) : h18;
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
        r45.j83 j83Var = (r45.j83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j83Var.f459171d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            j83Var.f459172e = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                j83Var.f459173f = aVar2.g(intValue);
                return 0;
            case 6:
                j83Var.f459174g = aVar2.g(intValue);
                return 0;
            case 7:
                j83Var.f459175h = aVar2.k(intValue);
                return 0;
            case 8:
                j83Var.f459176i = aVar2.g(intValue);
                return 0;
            case 9:
                j83Var.f459177m = aVar2.k(intValue);
                return 0;
            case 10:
                j83Var.f459178n = aVar2.k(intValue);
                return 0;
            case 11:
                j83Var.f459179o = aVar2.i(intValue);
                return 0;
            case 12:
                j83Var.f459180p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
