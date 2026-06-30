package r45;

/* loaded from: classes8.dex */
public class pk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464665d;

    /* renamed from: e, reason: collision with root package name */
    public int f464666e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464667f;

    /* renamed from: g, reason: collision with root package name */
    public int f464668g;

    /* renamed from: h, reason: collision with root package name */
    public int f464669h;

    /* renamed from: i, reason: collision with root package name */
    public int f464670i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464671m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464672n;

    /* renamed from: o, reason: collision with root package name */
    public int f464673o;

    /* renamed from: p, reason: collision with root package name */
    public int f464674p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464675q;

    /* renamed from: r, reason: collision with root package name */
    public long f464676r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pk5)) {
            return false;
        }
        r45.pk5 pk5Var = (r45.pk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464665d), java.lang.Integer.valueOf(pk5Var.f464665d)) && n51.f.a(java.lang.Integer.valueOf(this.f464666e), java.lang.Integer.valueOf(pk5Var.f464666e)) && n51.f.a(this.f464667f, pk5Var.f464667f) && n51.f.a(java.lang.Integer.valueOf(this.f464668g), java.lang.Integer.valueOf(pk5Var.f464668g)) && n51.f.a(java.lang.Integer.valueOf(this.f464669h), java.lang.Integer.valueOf(pk5Var.f464669h)) && n51.f.a(java.lang.Integer.valueOf(this.f464670i), java.lang.Integer.valueOf(pk5Var.f464670i)) && n51.f.a(this.f464671m, pk5Var.f464671m) && n51.f.a(this.f464672n, pk5Var.f464672n) && n51.f.a(java.lang.Integer.valueOf(this.f464673o), java.lang.Integer.valueOf(pk5Var.f464673o)) && n51.f.a(java.lang.Integer.valueOf(this.f464674p), java.lang.Integer.valueOf(pk5Var.f464674p)) && n51.f.a(this.f464675q, pk5Var.f464675q) && n51.f.a(java.lang.Long.valueOf(this.f464676r), java.lang.Long.valueOf(pk5Var.f464676r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464665d);
            fVar.e(2, this.f464666e);
            java.lang.String str = this.f464667f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f464668g);
            fVar.e(5, this.f464669h);
            fVar.e(6, this.f464670i);
            java.lang.String str2 = this.f464671m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f464672n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f464673o);
            fVar.e(10, this.f464674p);
            java.lang.String str4 = this.f464675q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.h(12, this.f464676r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464665d) + 0 + b36.f.e(2, this.f464666e);
            java.lang.String str5 = this.f464667f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f464668g) + b36.f.e(5, this.f464669h) + b36.f.e(6, this.f464670i);
            java.lang.String str6 = this.f464671m;
            if (str6 != null) {
                e18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f464672n;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            int e19 = e18 + b36.f.e(9, this.f464673o) + b36.f.e(10, this.f464674p);
            java.lang.String str8 = this.f464675q;
            if (str8 != null) {
                e19 += b36.f.j(11, str8);
            }
            return e19 + b36.f.h(12, this.f464676r);
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
        r45.pk5 pk5Var = (r45.pk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pk5Var.f464665d = aVar2.g(intValue);
                return 0;
            case 2:
                pk5Var.f464666e = aVar2.g(intValue);
                return 0;
            case 3:
                pk5Var.f464667f = aVar2.k(intValue);
                return 0;
            case 4:
                pk5Var.f464668g = aVar2.g(intValue);
                return 0;
            case 5:
                pk5Var.f464669h = aVar2.g(intValue);
                return 0;
            case 6:
                pk5Var.f464670i = aVar2.g(intValue);
                return 0;
            case 7:
                pk5Var.f464671m = aVar2.k(intValue);
                return 0;
            case 8:
                pk5Var.f464672n = aVar2.k(intValue);
                return 0;
            case 9:
                pk5Var.f464673o = aVar2.g(intValue);
                return 0;
            case 10:
                pk5Var.f464674p = aVar2.g(intValue);
                return 0;
            case 11:
                pk5Var.f464675q = aVar2.k(intValue);
                return 0;
            case 12:
                pk5Var.f464676r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
