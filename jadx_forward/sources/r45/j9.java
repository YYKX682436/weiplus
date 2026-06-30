package r45;

/* loaded from: classes11.dex */
public class j9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f459188d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f459189e;

    /* renamed from: f, reason: collision with root package name */
    public int f459190f;

    /* renamed from: g, reason: collision with root package name */
    public int f459191g;

    /* renamed from: h, reason: collision with root package name */
    public int f459192h;

    /* renamed from: i, reason: collision with root package name */
    public int f459193i;

    /* renamed from: m, reason: collision with root package name */
    public int f459194m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f459195n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f459196o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f459197p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j9)) {
            return false;
        }
        r45.j9 j9Var = (r45.j9) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f459188d), java.lang.Boolean.valueOf(j9Var.f459188d)) && n51.f.a(java.lang.Boolean.valueOf(this.f459189e), java.lang.Boolean.valueOf(j9Var.f459189e)) && n51.f.a(java.lang.Integer.valueOf(this.f459190f), java.lang.Integer.valueOf(j9Var.f459190f)) && n51.f.a(java.lang.Integer.valueOf(this.f459191g), java.lang.Integer.valueOf(j9Var.f459191g)) && n51.f.a(java.lang.Integer.valueOf(this.f459192h), java.lang.Integer.valueOf(j9Var.f459192h)) && n51.f.a(java.lang.Integer.valueOf(this.f459193i), java.lang.Integer.valueOf(j9Var.f459193i)) && n51.f.a(java.lang.Integer.valueOf(this.f459194m), java.lang.Integer.valueOf(j9Var.f459194m)) && n51.f.a(java.lang.Boolean.valueOf(this.f459195n), java.lang.Boolean.valueOf(j9Var.f459195n)) && n51.f.a(java.lang.Boolean.valueOf(this.f459196o), java.lang.Boolean.valueOf(j9Var.f459196o)) && n51.f.a(java.lang.Boolean.valueOf(this.f459197p), java.lang.Boolean.valueOf(j9Var.f459197p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f459188d);
            fVar.a(2, this.f459189e);
            fVar.e(3, this.f459190f);
            fVar.e(4, this.f459191g);
            fVar.e(5, this.f459192h);
            fVar.e(6, this.f459193i);
            fVar.e(7, this.f459194m);
            fVar.a(8, this.f459195n);
            fVar.a(9, this.f459196o);
            fVar.a(10, this.f459197p);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f459188d) + 0 + b36.f.a(2, this.f459189e) + b36.f.e(3, this.f459190f) + b36.f.e(4, this.f459191g) + b36.f.e(5, this.f459192h) + b36.f.e(6, this.f459193i) + b36.f.e(7, this.f459194m) + b36.f.a(8, this.f459195n) + b36.f.a(9, this.f459196o) + b36.f.a(10, this.f459197p);
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
        r45.j9 j9Var = (r45.j9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j9Var.f459188d = aVar2.c(intValue);
                return 0;
            case 2:
                j9Var.f459189e = aVar2.c(intValue);
                return 0;
            case 3:
                j9Var.f459190f = aVar2.g(intValue);
                return 0;
            case 4:
                j9Var.f459191g = aVar2.g(intValue);
                return 0;
            case 5:
                j9Var.f459192h = aVar2.g(intValue);
                return 0;
            case 6:
                j9Var.f459193i = aVar2.g(intValue);
                return 0;
            case 7:
                j9Var.f459194m = aVar2.g(intValue);
                return 0;
            case 8:
                j9Var.f459195n = aVar2.c(intValue);
                return 0;
            case 9:
                j9Var.f459196o = aVar2.c(intValue);
                return 0;
            case 10:
                j9Var.f459197p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
