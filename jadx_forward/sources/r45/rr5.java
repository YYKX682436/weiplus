package r45;

/* loaded from: classes12.dex */
public class rr5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466676e;

    /* renamed from: f, reason: collision with root package name */
    public long f466677f;

    /* renamed from: g, reason: collision with root package name */
    public int f466678g;

    /* renamed from: h, reason: collision with root package name */
    public int f466679h;

    /* renamed from: i, reason: collision with root package name */
    public int f466680i;

    /* renamed from: m, reason: collision with root package name */
    public int f466681m;

    /* renamed from: n, reason: collision with root package name */
    public int f466682n;

    /* renamed from: o, reason: collision with root package name */
    public int f466683o;

    /* renamed from: p, reason: collision with root package name */
    public float f466684p;

    /* renamed from: q, reason: collision with root package name */
    public float f466685q;

    /* renamed from: r, reason: collision with root package name */
    public float f466686r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr5)) {
            return false;
        }
        r45.rr5 rr5Var = (r45.rr5) fVar;
        return n51.f.a(this.f466675d, rr5Var.f466675d) && n51.f.a(this.f466676e, rr5Var.f466676e) && n51.f.a(java.lang.Long.valueOf(this.f466677f), java.lang.Long.valueOf(rr5Var.f466677f)) && n51.f.a(java.lang.Integer.valueOf(this.f466678g), java.lang.Integer.valueOf(rr5Var.f466678g)) && n51.f.a(java.lang.Integer.valueOf(this.f466679h), java.lang.Integer.valueOf(rr5Var.f466679h)) && n51.f.a(java.lang.Integer.valueOf(this.f466680i), java.lang.Integer.valueOf(rr5Var.f466680i)) && n51.f.a(java.lang.Integer.valueOf(this.f466681m), java.lang.Integer.valueOf(rr5Var.f466681m)) && n51.f.a(java.lang.Integer.valueOf(this.f466682n), java.lang.Integer.valueOf(rr5Var.f466682n)) && n51.f.a(java.lang.Integer.valueOf(this.f466683o), java.lang.Integer.valueOf(rr5Var.f466683o)) && n51.f.a(java.lang.Float.valueOf(this.f466684p), java.lang.Float.valueOf(rr5Var.f466684p)) && n51.f.a(java.lang.Float.valueOf(this.f466685q), java.lang.Float.valueOf(rr5Var.f466685q)) && n51.f.a(java.lang.Float.valueOf(this.f466686r), java.lang.Float.valueOf(rr5Var.f466686r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466675d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466676e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f466677f);
            fVar.e(4, this.f466678g);
            fVar.e(5, this.f466679h);
            fVar.e(6, this.f466680i);
            fVar.e(7, this.f466681m);
            fVar.e(8, this.f466682n);
            fVar.e(9, this.f466683o);
            fVar.d(10, this.f466684p);
            fVar.d(11, this.f466685q);
            fVar.d(12, this.f466686r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f466675d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f466676e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f466677f) + b36.f.e(4, this.f466678g) + b36.f.e(5, this.f466679h) + b36.f.e(6, this.f466680i) + b36.f.e(7, this.f466681m) + b36.f.e(8, this.f466682n) + b36.f.e(9, this.f466683o) + b36.f.d(10, this.f466684p) + b36.f.d(11, this.f466685q) + b36.f.d(12, this.f466686r);
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
        r45.rr5 rr5Var = (r45.rr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rr5Var.f466675d = aVar2.k(intValue);
                return 0;
            case 2:
                rr5Var.f466676e = aVar2.k(intValue);
                return 0;
            case 3:
                rr5Var.f466677f = aVar2.i(intValue);
                return 0;
            case 4:
                rr5Var.f466678g = aVar2.g(intValue);
                return 0;
            case 5:
                rr5Var.f466679h = aVar2.g(intValue);
                return 0;
            case 6:
                rr5Var.f466680i = aVar2.g(intValue);
                return 0;
            case 7:
                rr5Var.f466681m = aVar2.g(intValue);
                return 0;
            case 8:
                rr5Var.f466682n = aVar2.g(intValue);
                return 0;
            case 9:
                rr5Var.f466683o = aVar2.g(intValue);
                return 0;
            case 10:
                rr5Var.f466684p = aVar2.f(intValue);
                return 0;
            case 11:
                rr5Var.f466685q = aVar2.f(intValue);
                return 0;
            case 12:
                rr5Var.f466686r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
