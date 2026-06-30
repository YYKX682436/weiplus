package r45;

/* loaded from: classes12.dex */
public class rc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f466242d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466243e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466244f;

    /* renamed from: g, reason: collision with root package name */
    public int f466245g;

    /* renamed from: h, reason: collision with root package name */
    public long f466246h;

    /* renamed from: i, reason: collision with root package name */
    public int f466247i;

    /* renamed from: m, reason: collision with root package name */
    public int f466248m;

    /* renamed from: n, reason: collision with root package name */
    public long f466249n;

    /* renamed from: o, reason: collision with root package name */
    public long f466250o;

    /* renamed from: p, reason: collision with root package name */
    public int f466251p;

    /* renamed from: q, reason: collision with root package name */
    public long f466252q;

    /* renamed from: r, reason: collision with root package name */
    public double f466253r;

    /* renamed from: s, reason: collision with root package name */
    public int f466254s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rc)) {
            return false;
        }
        r45.rc rcVar = (r45.rc) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f466242d), java.lang.Long.valueOf(rcVar.f466242d)) && n51.f.a(this.f466243e, rcVar.f466243e) && n51.f.a(this.f466244f, rcVar.f466244f) && n51.f.a(java.lang.Integer.valueOf(this.f466245g), java.lang.Integer.valueOf(rcVar.f466245g)) && n51.f.a(java.lang.Long.valueOf(this.f466246h), java.lang.Long.valueOf(rcVar.f466246h)) && n51.f.a(java.lang.Integer.valueOf(this.f466247i), java.lang.Integer.valueOf(rcVar.f466247i)) && n51.f.a(java.lang.Integer.valueOf(this.f466248m), java.lang.Integer.valueOf(rcVar.f466248m)) && n51.f.a(java.lang.Long.valueOf(this.f466249n), java.lang.Long.valueOf(rcVar.f466249n)) && n51.f.a(java.lang.Long.valueOf(this.f466250o), java.lang.Long.valueOf(rcVar.f466250o)) && n51.f.a(java.lang.Integer.valueOf(this.f466251p), java.lang.Integer.valueOf(rcVar.f466251p)) && n51.f.a(java.lang.Long.valueOf(this.f466252q), java.lang.Long.valueOf(rcVar.f466252q)) && n51.f.a(java.lang.Double.valueOf(this.f466253r), java.lang.Double.valueOf(rcVar.f466253r)) && n51.f.a(java.lang.Integer.valueOf(this.f466254s), java.lang.Integer.valueOf(rcVar.f466254s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f466242d);
            java.lang.String str = this.f466243e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466244f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f466245g);
            fVar.h(5, this.f466246h);
            fVar.e(6, this.f466247i);
            fVar.e(7, this.f466248m);
            fVar.h(8, this.f466249n);
            fVar.h(9, this.f466250o);
            fVar.e(10, this.f466251p);
            fVar.h(11, this.f466252q);
            fVar.c(12, this.f466253r);
            fVar.e(13, this.f466254s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f466242d) + 0;
            java.lang.String str3 = this.f466243e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f466244f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            return h17 + b36.f.e(4, this.f466245g) + b36.f.h(5, this.f466246h) + b36.f.e(6, this.f466247i) + b36.f.e(7, this.f466248m) + b36.f.h(8, this.f466249n) + b36.f.h(9, this.f466250o) + b36.f.e(10, this.f466251p) + b36.f.h(11, this.f466252q) + b36.f.c(12, this.f466253r) + b36.f.e(13, this.f466254s);
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
        r45.rc rcVar = (r45.rc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rcVar.f466242d = aVar2.i(intValue);
                return 0;
            case 2:
                rcVar.f466243e = aVar2.k(intValue);
                return 0;
            case 3:
                rcVar.f466244f = aVar2.k(intValue);
                return 0;
            case 4:
                rcVar.f466245g = aVar2.g(intValue);
                return 0;
            case 5:
                rcVar.f466246h = aVar2.i(intValue);
                return 0;
            case 6:
                rcVar.f466247i = aVar2.g(intValue);
                return 0;
            case 7:
                rcVar.f466248m = aVar2.g(intValue);
                return 0;
            case 8:
                rcVar.f466249n = aVar2.i(intValue);
                return 0;
            case 9:
                rcVar.f466250o = aVar2.i(intValue);
                return 0;
            case 10:
                rcVar.f466251p = aVar2.g(intValue);
                return 0;
            case 11:
                rcVar.f466252q = aVar2.i(intValue);
                return 0;
            case 12:
                rcVar.f466253r = aVar2.e(intValue);
                return 0;
            case 13:
                rcVar.f466254s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
