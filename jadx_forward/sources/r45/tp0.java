package r45;

/* loaded from: classes12.dex */
public class tp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468171d;

    /* renamed from: e, reason: collision with root package name */
    public int f468172e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468173f;

    /* renamed from: g, reason: collision with root package name */
    public int f468174g;

    /* renamed from: h, reason: collision with root package name */
    public int f468175h;

    /* renamed from: i, reason: collision with root package name */
    public int f468176i;

    /* renamed from: m, reason: collision with root package name */
    public int f468177m;

    /* renamed from: n, reason: collision with root package name */
    public int f468178n;

    /* renamed from: o, reason: collision with root package name */
    public int f468179o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp0)) {
            return false;
        }
        r45.tp0 tp0Var = (r45.tp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468171d), java.lang.Integer.valueOf(tp0Var.f468171d)) && n51.f.a(java.lang.Integer.valueOf(this.f468172e), java.lang.Integer.valueOf(tp0Var.f468172e)) && n51.f.a(this.f468173f, tp0Var.f468173f) && n51.f.a(java.lang.Integer.valueOf(this.f468174g), java.lang.Integer.valueOf(tp0Var.f468174g)) && n51.f.a(java.lang.Integer.valueOf(this.f468175h), java.lang.Integer.valueOf(tp0Var.f468175h)) && n51.f.a(java.lang.Integer.valueOf(this.f468176i), java.lang.Integer.valueOf(tp0Var.f468176i)) && n51.f.a(java.lang.Integer.valueOf(this.f468177m), java.lang.Integer.valueOf(tp0Var.f468177m)) && n51.f.a(java.lang.Integer.valueOf(this.f468178n), java.lang.Integer.valueOf(tp0Var.f468178n)) && n51.f.a(java.lang.Integer.valueOf(this.f468179o), java.lang.Integer.valueOf(tp0Var.f468179o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468171d);
            fVar.e(2, this.f468172e);
            java.lang.String str = this.f468173f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f468174g);
            fVar.e(5, this.f468175h);
            fVar.e(6, this.f468176i);
            fVar.e(7, this.f468177m);
            fVar.e(8, this.f468178n);
            fVar.e(9, this.f468179o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468171d) + 0 + b36.f.e(2, this.f468172e);
            java.lang.String str2 = this.f468173f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f468174g) + b36.f.e(5, this.f468175h) + b36.f.e(6, this.f468176i) + b36.f.e(7, this.f468177m) + b36.f.e(8, this.f468178n) + b36.f.e(9, this.f468179o);
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
        r45.tp0 tp0Var = (r45.tp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tp0Var.f468171d = aVar2.g(intValue);
                return 0;
            case 2:
                tp0Var.f468172e = aVar2.g(intValue);
                return 0;
            case 3:
                tp0Var.f468173f = aVar2.k(intValue);
                return 0;
            case 4:
                tp0Var.f468174g = aVar2.g(intValue);
                return 0;
            case 5:
                tp0Var.f468175h = aVar2.g(intValue);
                return 0;
            case 6:
                tp0Var.f468176i = aVar2.g(intValue);
                return 0;
            case 7:
                tp0Var.f468177m = aVar2.g(intValue);
                return 0;
            case 8:
                tp0Var.f468178n = aVar2.g(intValue);
                return 0;
            case 9:
                tp0Var.f468179o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
