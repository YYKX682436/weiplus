package r45;

/* loaded from: classes2.dex */
public class gx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457130d;

    /* renamed from: e, reason: collision with root package name */
    public int f457131e;

    /* renamed from: f, reason: collision with root package name */
    public int f457132f;

    /* renamed from: g, reason: collision with root package name */
    public int f457133g;

    /* renamed from: h, reason: collision with root package name */
    public int f457134h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457135i;

    /* renamed from: m, reason: collision with root package name */
    public int f457136m;

    /* renamed from: n, reason: collision with root package name */
    public int f457137n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457138o;

    /* renamed from: p, reason: collision with root package name */
    public int f457139p;

    /* renamed from: q, reason: collision with root package name */
    public int f457140q;

    /* renamed from: r, reason: collision with root package name */
    public int f457141r;

    /* renamed from: s, reason: collision with root package name */
    public int f457142s;

    /* renamed from: t, reason: collision with root package name */
    public int f457143t;

    /* renamed from: u, reason: collision with root package name */
    public int f457144u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f457145v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f457146w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx3)) {
            return false;
        }
        r45.gx3 gx3Var = (r45.gx3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457130d), java.lang.Integer.valueOf(gx3Var.f457130d)) && n51.f.a(java.lang.Integer.valueOf(this.f457131e), java.lang.Integer.valueOf(gx3Var.f457131e)) && n51.f.a(java.lang.Integer.valueOf(this.f457132f), java.lang.Integer.valueOf(gx3Var.f457132f)) && n51.f.a(java.lang.Integer.valueOf(this.f457133g), java.lang.Integer.valueOf(gx3Var.f457133g)) && n51.f.a(java.lang.Integer.valueOf(this.f457134h), java.lang.Integer.valueOf(gx3Var.f457134h)) && n51.f.a(this.f457135i, gx3Var.f457135i) && n51.f.a(java.lang.Integer.valueOf(this.f457136m), java.lang.Integer.valueOf(gx3Var.f457136m)) && n51.f.a(java.lang.Integer.valueOf(this.f457137n), java.lang.Integer.valueOf(gx3Var.f457137n)) && n51.f.a(this.f457138o, gx3Var.f457138o) && n51.f.a(java.lang.Integer.valueOf(this.f457139p), java.lang.Integer.valueOf(gx3Var.f457139p)) && n51.f.a(java.lang.Integer.valueOf(this.f457140q), java.lang.Integer.valueOf(gx3Var.f457140q)) && n51.f.a(java.lang.Integer.valueOf(this.f457141r), java.lang.Integer.valueOf(gx3Var.f457141r)) && n51.f.a(java.lang.Integer.valueOf(this.f457142s), java.lang.Integer.valueOf(gx3Var.f457142s)) && n51.f.a(java.lang.Integer.valueOf(this.f457143t), java.lang.Integer.valueOf(gx3Var.f457143t)) && n51.f.a(java.lang.Integer.valueOf(this.f457144u), java.lang.Integer.valueOf(gx3Var.f457144u)) && n51.f.a(this.f457145v, gx3Var.f457145v) && n51.f.a(this.f457146w, gx3Var.f457146w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457130d);
            fVar.e(2, this.f457131e);
            fVar.e(3, this.f457132f);
            fVar.e(4, this.f457133g);
            fVar.e(6, this.f457134h);
            java.lang.String str = this.f457135i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f457136m);
            fVar.e(9, this.f457137n);
            java.lang.String str2 = this.f457138o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f457139p);
            fVar.e(12, this.f457140q);
            fVar.e(13, this.f457141r);
            fVar.e(14, this.f457142s);
            fVar.e(15, this.f457143t);
            fVar.e(16, this.f457144u);
            java.lang.String str3 = this.f457145v;
            if (str3 != null) {
                fVar.j(17, str3);
            }
            java.lang.String str4 = this.f457146w;
            if (str4 != null) {
                fVar.j(18, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457130d) + 0 + b36.f.e(2, this.f457131e) + b36.f.e(3, this.f457132f) + b36.f.e(4, this.f457133g) + b36.f.e(6, this.f457134h);
            java.lang.String str5 = this.f457135i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            int e18 = e17 + b36.f.e(8, this.f457136m) + b36.f.e(9, this.f457137n);
            java.lang.String str6 = this.f457138o;
            if (str6 != null) {
                e18 += b36.f.j(10, str6);
            }
            int e19 = e18 + b36.f.e(11, this.f457139p) + b36.f.e(12, this.f457140q) + b36.f.e(13, this.f457141r) + b36.f.e(14, this.f457142s) + b36.f.e(15, this.f457143t) + b36.f.e(16, this.f457144u);
            java.lang.String str7 = this.f457145v;
            if (str7 != null) {
                e19 += b36.f.j(17, str7);
            }
            java.lang.String str8 = this.f457146w;
            return str8 != null ? e19 + b36.f.j(18, str8) : e19;
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
        r45.gx3 gx3Var = (r45.gx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gx3Var.f457130d = aVar2.g(intValue);
                return 0;
            case 2:
                gx3Var.f457131e = aVar2.g(intValue);
                return 0;
            case 3:
                gx3Var.f457132f = aVar2.g(intValue);
                return 0;
            case 4:
                gx3Var.f457133g = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                gx3Var.f457134h = aVar2.g(intValue);
                return 0;
            case 7:
                gx3Var.f457135i = aVar2.k(intValue);
                return 0;
            case 8:
                gx3Var.f457136m = aVar2.g(intValue);
                return 0;
            case 9:
                gx3Var.f457137n = aVar2.g(intValue);
                return 0;
            case 10:
                gx3Var.f457138o = aVar2.k(intValue);
                return 0;
            case 11:
                gx3Var.f457139p = aVar2.g(intValue);
                return 0;
            case 12:
                gx3Var.f457140q = aVar2.g(intValue);
                return 0;
            case 13:
                gx3Var.f457141r = aVar2.g(intValue);
                return 0;
            case 14:
                gx3Var.f457142s = aVar2.g(intValue);
                return 0;
            case 15:
                gx3Var.f457143t = aVar2.g(intValue);
                return 0;
            case 16:
                gx3Var.f457144u = aVar2.g(intValue);
                return 0;
            case 17:
                gx3Var.f457145v = aVar2.k(intValue);
                return 0;
            case 18:
                gx3Var.f457146w = aVar2.k(intValue);
                return 0;
        }
    }
}
