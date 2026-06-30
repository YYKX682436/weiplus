package r45;

/* loaded from: classes12.dex */
public class j07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459010d;

    /* renamed from: e, reason: collision with root package name */
    public int f459011e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f459012f;

    /* renamed from: g, reason: collision with root package name */
    public long f459013g;

    /* renamed from: h, reason: collision with root package name */
    public long f459014h;

    /* renamed from: i, reason: collision with root package name */
    public long f459015i;

    /* renamed from: m, reason: collision with root package name */
    public int f459016m;

    /* renamed from: n, reason: collision with root package name */
    public long f459017n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459018o;

    /* renamed from: p, reason: collision with root package name */
    public int f459019p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j07)) {
            return false;
        }
        r45.j07 j07Var = (r45.j07) fVar;
        return n51.f.a(this.f459010d, j07Var.f459010d) && n51.f.a(java.lang.Integer.valueOf(this.f459011e), java.lang.Integer.valueOf(j07Var.f459011e)) && n51.f.a(java.lang.Boolean.valueOf(this.f459012f), java.lang.Boolean.valueOf(j07Var.f459012f)) && n51.f.a(java.lang.Long.valueOf(this.f459013g), java.lang.Long.valueOf(j07Var.f459013g)) && n51.f.a(java.lang.Long.valueOf(this.f459014h), java.lang.Long.valueOf(j07Var.f459014h)) && n51.f.a(java.lang.Long.valueOf(this.f459015i), java.lang.Long.valueOf(j07Var.f459015i)) && n51.f.a(java.lang.Integer.valueOf(this.f459016m), java.lang.Integer.valueOf(j07Var.f459016m)) && n51.f.a(java.lang.Long.valueOf(this.f459017n), java.lang.Long.valueOf(j07Var.f459017n)) && n51.f.a(this.f459018o, j07Var.f459018o) && n51.f.a(java.lang.Integer.valueOf(this.f459019p), java.lang.Integer.valueOf(j07Var.f459019p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459010d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459011e);
            fVar.a(3, this.f459012f);
            fVar.h(4, this.f459013g);
            fVar.h(5, this.f459014h);
            fVar.h(6, this.f459015i);
            fVar.e(7, this.f459016m);
            fVar.h(8, this.f459017n);
            java.lang.String str2 = this.f459018o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f459019p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459010d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f459011e) + b36.f.a(3, this.f459012f) + b36.f.h(4, this.f459013g) + b36.f.h(5, this.f459014h) + b36.f.h(6, this.f459015i) + b36.f.e(7, this.f459016m) + b36.f.h(8, this.f459017n);
            java.lang.String str4 = this.f459018o;
            if (str4 != null) {
                j17 += b36.f.j(9, str4);
            }
            return j17 + b36.f.e(10, this.f459019p);
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
        r45.j07 j07Var = (r45.j07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j07Var.f459010d = aVar2.k(intValue);
                return 0;
            case 2:
                j07Var.f459011e = aVar2.g(intValue);
                return 0;
            case 3:
                j07Var.f459012f = aVar2.c(intValue);
                return 0;
            case 4:
                j07Var.f459013g = aVar2.i(intValue);
                return 0;
            case 5:
                j07Var.f459014h = aVar2.i(intValue);
                return 0;
            case 6:
                j07Var.f459015i = aVar2.i(intValue);
                return 0;
            case 7:
                j07Var.f459016m = aVar2.g(intValue);
                return 0;
            case 8:
                j07Var.f459017n = aVar2.i(intValue);
                return 0;
            case 9:
                j07Var.f459018o = aVar2.k(intValue);
                return 0;
            case 10:
                j07Var.f459019p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
