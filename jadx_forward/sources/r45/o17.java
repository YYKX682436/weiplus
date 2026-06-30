package r45;

/* loaded from: classes11.dex */
public class o17 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463361d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463362e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463363f;

    /* renamed from: g, reason: collision with root package name */
    public int f463364g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463365h;

    /* renamed from: i, reason: collision with root package name */
    public int f463366i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f463367m;

    /* renamed from: n, reason: collision with root package name */
    public int f463368n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463369o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o17)) {
            return false;
        }
        r45.o17 o17Var = (r45.o17) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463361d), java.lang.Integer.valueOf(o17Var.f463361d)) && n51.f.a(this.f463362e, o17Var.f463362e) && n51.f.a(this.f463363f, o17Var.f463363f) && n51.f.a(java.lang.Integer.valueOf(this.f463364g), java.lang.Integer.valueOf(o17Var.f463364g)) && n51.f.a(this.f463365h, o17Var.f463365h) && n51.f.a(java.lang.Integer.valueOf(this.f463366i), java.lang.Integer.valueOf(o17Var.f463366i)) && n51.f.a(java.lang.Boolean.valueOf(this.f463367m), java.lang.Boolean.valueOf(o17Var.f463367m)) && n51.f.a(java.lang.Integer.valueOf(this.f463368n), java.lang.Integer.valueOf(o17Var.f463368n)) && n51.f.a(this.f463369o, o17Var.f463369o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463361d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f463362e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f463363f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f463364g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f463365h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.e(6, this.f463366i);
            fVar.a(7, this.f463367m);
            fVar.e(8, this.f463368n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f463369o;
            if (gVar3 != null) {
                fVar.b(9, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463361d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f463362e;
            if (gVar4 != null) {
                e17 += b36.f.b(2, gVar4);
            }
            java.lang.String str2 = this.f463363f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            int e18 = e17 + b36.f.e(4, this.f463364g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f463365h;
            if (gVar5 != null) {
                e18 += b36.f.b(5, gVar5);
            }
            int e19 = e18 + b36.f.e(6, this.f463366i) + b36.f.a(7, this.f463367m) + b36.f.e(8, this.f463368n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f463369o;
            return gVar6 != null ? e19 + b36.f.b(9, gVar6) : e19;
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
        r45.o17 o17Var = (r45.o17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o17Var.f463361d = aVar2.g(intValue);
                return 0;
            case 2:
                o17Var.f463362e = aVar2.d(intValue);
                return 0;
            case 3:
                o17Var.f463363f = aVar2.k(intValue);
                return 0;
            case 4:
                o17Var.f463364g = aVar2.g(intValue);
                return 0;
            case 5:
                o17Var.f463365h = aVar2.d(intValue);
                return 0;
            case 6:
                o17Var.f463366i = aVar2.g(intValue);
                return 0;
            case 7:
                o17Var.f463367m = aVar2.c(intValue);
                return 0;
            case 8:
                o17Var.f463368n = aVar2.g(intValue);
                return 0;
            case 9:
                o17Var.f463369o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
