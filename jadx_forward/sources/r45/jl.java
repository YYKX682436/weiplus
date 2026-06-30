package r45;

/* loaded from: classes9.dex */
public class jl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459439d;

    /* renamed from: e, reason: collision with root package name */
    public int f459440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459441f;

    /* renamed from: g, reason: collision with root package name */
    public int f459442g;

    /* renamed from: h, reason: collision with root package name */
    public long f459443h;

    /* renamed from: i, reason: collision with root package name */
    public int f459444i;

    /* renamed from: m, reason: collision with root package name */
    public int f459445m;

    /* renamed from: n, reason: collision with root package name */
    public int f459446n;

    /* renamed from: o, reason: collision with root package name */
    public int f459447o;

    /* renamed from: p, reason: collision with root package name */
    public int f459448p;

    /* renamed from: q, reason: collision with root package name */
    public int f459449q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jl)) {
            return false;
        }
        r45.jl jlVar = (r45.jl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459439d), java.lang.Integer.valueOf(jlVar.f459439d)) && n51.f.a(java.lang.Integer.valueOf(this.f459440e), java.lang.Integer.valueOf(jlVar.f459440e)) && n51.f.a(this.f459441f, jlVar.f459441f) && n51.f.a(java.lang.Integer.valueOf(this.f459442g), java.lang.Integer.valueOf(jlVar.f459442g)) && n51.f.a(java.lang.Long.valueOf(this.f459443h), java.lang.Long.valueOf(jlVar.f459443h)) && n51.f.a(java.lang.Integer.valueOf(this.f459444i), java.lang.Integer.valueOf(jlVar.f459444i)) && n51.f.a(java.lang.Integer.valueOf(this.f459445m), java.lang.Integer.valueOf(jlVar.f459445m)) && n51.f.a(java.lang.Integer.valueOf(this.f459446n), java.lang.Integer.valueOf(jlVar.f459446n)) && n51.f.a(java.lang.Integer.valueOf(this.f459447o), java.lang.Integer.valueOf(jlVar.f459447o)) && n51.f.a(java.lang.Integer.valueOf(this.f459448p), java.lang.Integer.valueOf(jlVar.f459448p)) && n51.f.a(java.lang.Integer.valueOf(this.f459449q), java.lang.Integer.valueOf(jlVar.f459449q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459439d);
            fVar.e(5, this.f459440e);
            java.lang.String str = this.f459441f;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f459442g);
            fVar.h(8, this.f459443h);
            fVar.e(9, this.f459444i);
            fVar.e(10, this.f459445m);
            fVar.e(11, this.f459446n);
            fVar.e(12, this.f459447o);
            fVar.e(13, this.f459448p);
            fVar.e(14, this.f459449q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459439d) + 0 + b36.f.e(5, this.f459440e);
            java.lang.String str2 = this.f459441f;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            return e17 + b36.f.e(7, this.f459442g) + b36.f.h(8, this.f459443h) + b36.f.e(9, this.f459444i) + b36.f.e(10, this.f459445m) + b36.f.e(11, this.f459446n) + b36.f.e(12, this.f459447o) + b36.f.e(13, this.f459448p) + b36.f.e(14, this.f459449q);
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
        r45.jl jlVar = (r45.jl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jlVar.f459439d = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                jlVar.f459440e = aVar2.g(intValue);
                return 0;
            case 6:
                jlVar.f459441f = aVar2.k(intValue);
                return 0;
            case 7:
                jlVar.f459442g = aVar2.g(intValue);
                return 0;
            case 8:
                jlVar.f459443h = aVar2.i(intValue);
                return 0;
            case 9:
                jlVar.f459444i = aVar2.g(intValue);
                return 0;
            case 10:
                jlVar.f459445m = aVar2.g(intValue);
                return 0;
            case 11:
                jlVar.f459446n = aVar2.g(intValue);
                return 0;
            case 12:
                jlVar.f459447o = aVar2.g(intValue);
                return 0;
            case 13:
                jlVar.f459448p = aVar2.g(intValue);
                return 0;
            case 14:
                jlVar.f459449q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
