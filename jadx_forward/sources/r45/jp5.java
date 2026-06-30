package r45;

/* loaded from: classes11.dex */
public class jp5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459542d;

    /* renamed from: e, reason: collision with root package name */
    public long f459543e;

    /* renamed from: f, reason: collision with root package name */
    public int f459544f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f459545g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f459546h;

    /* renamed from: i, reason: collision with root package name */
    public int f459547i;

    /* renamed from: m, reason: collision with root package name */
    public int f459548m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f459549n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp5)) {
            return false;
        }
        r45.jp5 jp5Var = (r45.jp5) fVar;
        return n51.f.a(this.f459542d, jp5Var.f459542d) && n51.f.a(java.lang.Long.valueOf(this.f459543e), java.lang.Long.valueOf(jp5Var.f459543e)) && n51.f.a(java.lang.Integer.valueOf(this.f459544f), java.lang.Integer.valueOf(jp5Var.f459544f)) && n51.f.a(java.lang.Boolean.valueOf(this.f459545g), java.lang.Boolean.valueOf(jp5Var.f459545g)) && n51.f.a(java.lang.Boolean.valueOf(this.f459546h), java.lang.Boolean.valueOf(jp5Var.f459546h)) && n51.f.a(java.lang.Integer.valueOf(this.f459547i), java.lang.Integer.valueOf(jp5Var.f459547i)) && n51.f.a(java.lang.Integer.valueOf(this.f459548m), java.lang.Integer.valueOf(jp5Var.f459548m)) && n51.f.a(java.lang.Boolean.valueOf(this.f459549n), java.lang.Boolean.valueOf(jp5Var.f459549n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459542d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f459543e);
            fVar.e(3, this.f459544f);
            fVar.a(4, this.f459545g);
            fVar.a(5, this.f459546h);
            fVar.e(6, this.f459547i);
            fVar.e(7, this.f459548m);
            fVar.a(8, this.f459549n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459542d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f459543e) + b36.f.e(3, this.f459544f) + b36.f.a(4, this.f459545g) + b36.f.a(5, this.f459546h) + b36.f.e(6, this.f459547i) + b36.f.e(7, this.f459548m) + b36.f.a(8, this.f459549n);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.jp5 jp5Var = (r45.jp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jp5Var.f459542d = aVar2.k(intValue);
                return 0;
            case 2:
                jp5Var.f459543e = aVar2.i(intValue);
                return 0;
            case 3:
                jp5Var.f459544f = aVar2.g(intValue);
                return 0;
            case 4:
                jp5Var.f459545g = aVar2.c(intValue);
                return 0;
            case 5:
                jp5Var.f459546h = aVar2.c(intValue);
                return 0;
            case 6:
                jp5Var.f459547i = aVar2.g(intValue);
                return 0;
            case 7:
                jp5Var.f459548m = aVar2.g(intValue);
                return 0;
            case 8:
                jp5Var.f459549n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
