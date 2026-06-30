package r45;

/* loaded from: classes8.dex */
public class gv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457069d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457070e;

    /* renamed from: f, reason: collision with root package name */
    public int f457071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457072g;

    /* renamed from: h, reason: collision with root package name */
    public int f457073h;

    /* renamed from: i, reason: collision with root package name */
    public int f457074i;

    /* renamed from: m, reason: collision with root package name */
    public int f457075m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457076n;

    /* renamed from: o, reason: collision with root package name */
    public int f457077o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457078p;

    /* renamed from: q, reason: collision with root package name */
    public int f457079q;

    /* renamed from: r, reason: collision with root package name */
    public int f457080r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f457081s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gv)) {
            return false;
        }
        r45.gv gvVar = (r45.gv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457069d), java.lang.Integer.valueOf(gvVar.f457069d)) && n51.f.a(this.f457070e, gvVar.f457070e) && n51.f.a(java.lang.Integer.valueOf(this.f457071f), java.lang.Integer.valueOf(gvVar.f457071f)) && n51.f.a(this.f457072g, gvVar.f457072g) && n51.f.a(java.lang.Integer.valueOf(this.f457073h), java.lang.Integer.valueOf(gvVar.f457073h)) && n51.f.a(java.lang.Integer.valueOf(this.f457074i), java.lang.Integer.valueOf(gvVar.f457074i)) && n51.f.a(java.lang.Integer.valueOf(this.f457075m), java.lang.Integer.valueOf(gvVar.f457075m)) && n51.f.a(this.f457076n, gvVar.f457076n) && n51.f.a(java.lang.Integer.valueOf(this.f457077o), java.lang.Integer.valueOf(gvVar.f457077o)) && n51.f.a(this.f457078p, gvVar.f457078p) && n51.f.a(java.lang.Integer.valueOf(this.f457079q), java.lang.Integer.valueOf(gvVar.f457079q)) && n51.f.a(java.lang.Integer.valueOf(this.f457080r), java.lang.Integer.valueOf(gvVar.f457080r)) && n51.f.a(this.f457081s, gvVar.f457081s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457069d);
            java.lang.String str = this.f457070e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457071f);
            java.lang.String str2 = this.f457072g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f457073h);
            fVar.e(6, this.f457074i);
            fVar.e(7, this.f457075m);
            java.lang.String str3 = this.f457076n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(10, this.f457077o);
            java.lang.String str4 = this.f457078p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.e(12, this.f457079q);
            fVar.e(13, this.f457080r);
            java.lang.String str5 = this.f457081s;
            if (str5 == null) {
                return 0;
            }
            fVar.j(14, str5);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457069d) + 0;
            java.lang.String str6 = this.f457070e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f457071f);
            java.lang.String str7 = this.f457072g;
            if (str7 != null) {
                e18 += b36.f.j(4, str7);
            }
            int e19 = e18 + b36.f.e(5, this.f457073h) + b36.f.e(6, this.f457074i) + b36.f.e(7, this.f457075m);
            java.lang.String str8 = this.f457076n;
            if (str8 != null) {
                e19 += b36.f.j(8, str8);
            }
            int e27 = e19 + b36.f.e(10, this.f457077o);
            java.lang.String str9 = this.f457078p;
            if (str9 != null) {
                e27 += b36.f.j(11, str9);
            }
            int e28 = e27 + b36.f.e(12, this.f457079q) + b36.f.e(13, this.f457080r);
            java.lang.String str10 = this.f457081s;
            return str10 != null ? e28 + b36.f.j(14, str10) : e28;
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
        r45.gv gvVar = (r45.gv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gvVar.f457069d = aVar2.g(intValue);
                return 0;
            case 2:
                gvVar.f457070e = aVar2.k(intValue);
                return 0;
            case 3:
                gvVar.f457071f = aVar2.g(intValue);
                return 0;
            case 4:
                gvVar.f457072g = aVar2.k(intValue);
                return 0;
            case 5:
                gvVar.f457073h = aVar2.g(intValue);
                return 0;
            case 6:
                gvVar.f457074i = aVar2.g(intValue);
                return 0;
            case 7:
                gvVar.f457075m = aVar2.g(intValue);
                return 0;
            case 8:
                gvVar.f457076n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                gvVar.f457077o = aVar2.g(intValue);
                return 0;
            case 11:
                gvVar.f457078p = aVar2.k(intValue);
                return 0;
            case 12:
                gvVar.f457079q = aVar2.g(intValue);
                return 0;
            case 13:
                gvVar.f457080r = aVar2.g(intValue);
                return 0;
            case 14:
                gvVar.f457081s = aVar2.k(intValue);
                return 0;
        }
    }
}
