package r45;

/* loaded from: classes4.dex */
public class xa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471437d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471438e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f471439f;

    /* renamed from: g, reason: collision with root package name */
    public int f471440g;

    /* renamed from: h, reason: collision with root package name */
    public int f471441h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f471442i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f471443m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f471444n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471445o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f471446p;

    /* renamed from: q, reason: collision with root package name */
    public int f471447q;

    /* renamed from: r, reason: collision with root package name */
    public float f471448r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xa)) {
            return false;
        }
        r45.xa xaVar = (r45.xa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471437d), java.lang.Integer.valueOf(xaVar.f471437d)) && n51.f.a(java.lang.Boolean.valueOf(this.f471438e), java.lang.Boolean.valueOf(xaVar.f471438e)) && n51.f.a(java.lang.Boolean.valueOf(this.f471439f), java.lang.Boolean.valueOf(xaVar.f471439f)) && n51.f.a(java.lang.Integer.valueOf(this.f471440g), java.lang.Integer.valueOf(xaVar.f471440g)) && n51.f.a(java.lang.Integer.valueOf(this.f471441h), java.lang.Integer.valueOf(xaVar.f471441h)) && n51.f.a(java.lang.Boolean.valueOf(this.f471442i), java.lang.Boolean.valueOf(xaVar.f471442i)) && n51.f.a(java.lang.Boolean.valueOf(this.f471443m), java.lang.Boolean.valueOf(xaVar.f471443m)) && n51.f.a(java.lang.Boolean.valueOf(this.f471444n), java.lang.Boolean.valueOf(xaVar.f471444n)) && n51.f.a(this.f471445o, xaVar.f471445o) && n51.f.a(java.lang.Boolean.valueOf(this.f471446p), java.lang.Boolean.valueOf(xaVar.f471446p)) && n51.f.a(java.lang.Integer.valueOf(this.f471447q), java.lang.Integer.valueOf(xaVar.f471447q)) && n51.f.a(java.lang.Float.valueOf(this.f471448r), java.lang.Float.valueOf(xaVar.f471448r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471437d);
            fVar.a(2, this.f471438e);
            fVar.a(3, this.f471439f);
            fVar.e(4, this.f471440g);
            fVar.e(5, this.f471441h);
            fVar.a(6, this.f471442i);
            fVar.a(7, this.f471443m);
            fVar.a(8, this.f471444n);
            java.lang.String str = this.f471445o;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.a(10, this.f471446p);
            fVar.e(11, this.f471447q);
            fVar.d(12, this.f471448r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471437d) + 0 + b36.f.a(2, this.f471438e) + b36.f.a(3, this.f471439f) + b36.f.e(4, this.f471440g) + b36.f.e(5, this.f471441h) + b36.f.a(6, this.f471442i) + b36.f.a(7, this.f471443m) + b36.f.a(8, this.f471444n);
            java.lang.String str2 = this.f471445o;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            return e17 + b36.f.a(10, this.f471446p) + b36.f.e(11, this.f471447q) + b36.f.d(12, this.f471448r);
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
        r45.xa xaVar = (r45.xa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xaVar.f471437d = aVar2.g(intValue);
                return 0;
            case 2:
                xaVar.f471438e = aVar2.c(intValue);
                return 0;
            case 3:
                xaVar.f471439f = aVar2.c(intValue);
                return 0;
            case 4:
                xaVar.f471440g = aVar2.g(intValue);
                return 0;
            case 5:
                xaVar.f471441h = aVar2.g(intValue);
                return 0;
            case 6:
                xaVar.f471442i = aVar2.c(intValue);
                return 0;
            case 7:
                xaVar.f471443m = aVar2.c(intValue);
                return 0;
            case 8:
                xaVar.f471444n = aVar2.c(intValue);
                return 0;
            case 9:
                xaVar.f471445o = aVar2.k(intValue);
                return 0;
            case 10:
                xaVar.f471446p = aVar2.c(intValue);
                return 0;
            case 11:
                xaVar.f471447q = aVar2.g(intValue);
                return 0;
            case 12:
                xaVar.f471448r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
