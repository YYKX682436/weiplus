package r45;

/* loaded from: classes9.dex */
public class vq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f469966d;

    /* renamed from: e, reason: collision with root package name */
    public long f469967e;

    /* renamed from: f, reason: collision with root package name */
    public long f469968f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469969g;

    /* renamed from: h, reason: collision with root package name */
    public long f469970h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469971i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469972m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469973n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469974o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469975p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469976q;

    /* renamed from: r, reason: collision with root package name */
    public int f469977r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f469978s;

    /* renamed from: t, reason: collision with root package name */
    public int f469979t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f469980u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vq0)) {
            return false;
        }
        r45.vq0 vq0Var = (r45.vq0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f469966d), java.lang.Long.valueOf(vq0Var.f469966d)) && n51.f.a(java.lang.Long.valueOf(this.f469967e), java.lang.Long.valueOf(vq0Var.f469967e)) && n51.f.a(java.lang.Long.valueOf(this.f469968f), java.lang.Long.valueOf(vq0Var.f469968f)) && n51.f.a(this.f469969g, vq0Var.f469969g) && n51.f.a(java.lang.Long.valueOf(this.f469970h), java.lang.Long.valueOf(vq0Var.f469970h)) && n51.f.a(this.f469971i, vq0Var.f469971i) && n51.f.a(this.f469972m, vq0Var.f469972m) && n51.f.a(this.f469973n, vq0Var.f469973n) && n51.f.a(this.f469974o, vq0Var.f469974o) && n51.f.a(this.f469975p, vq0Var.f469975p) && n51.f.a(this.f469976q, vq0Var.f469976q) && n51.f.a(java.lang.Integer.valueOf(this.f469977r), java.lang.Integer.valueOf(vq0Var.f469977r)) && n51.f.a(this.f469978s, vq0Var.f469978s) && n51.f.a(java.lang.Integer.valueOf(this.f469979t), java.lang.Integer.valueOf(vq0Var.f469979t)) && n51.f.a(this.f469980u, vq0Var.f469980u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f469966d);
            fVar.h(2, this.f469967e);
            fVar.h(3, this.f469968f);
            java.lang.String str = this.f469969g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f469970h);
            java.lang.String str2 = this.f469971i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f469972m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f469973n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f469974o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f469975p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f469976q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f469977r);
            java.lang.String str8 = this.f469978s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f469979t);
            java.lang.String str9 = this.f469980u;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f469966d) + 0 + b36.f.h(2, this.f469967e) + b36.f.h(3, this.f469968f);
            java.lang.String str10 = this.f469969g;
            if (str10 != null) {
                h17 += b36.f.j(4, str10);
            }
            int h18 = h17 + b36.f.h(5, this.f469970h);
            java.lang.String str11 = this.f469971i;
            if (str11 != null) {
                h18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f469972m;
            if (str12 != null) {
                h18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f469973n;
            if (str13 != null) {
                h18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f469974o;
            if (str14 != null) {
                h18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f469975p;
            if (str15 != null) {
                h18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f469976q;
            if (str16 != null) {
                h18 += b36.f.j(11, str16);
            }
            int e17 = h18 + b36.f.e(12, this.f469977r);
            java.lang.String str17 = this.f469978s;
            if (str17 != null) {
                e17 += b36.f.j(13, str17);
            }
            int e18 = e17 + b36.f.e(14, this.f469979t);
            java.lang.String str18 = this.f469980u;
            return str18 != null ? e18 + b36.f.j(15, str18) : e18;
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
        r45.vq0 vq0Var = (r45.vq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vq0Var.f469966d = aVar2.i(intValue);
                return 0;
            case 2:
                vq0Var.f469967e = aVar2.i(intValue);
                return 0;
            case 3:
                vq0Var.f469968f = aVar2.i(intValue);
                return 0;
            case 4:
                vq0Var.f469969g = aVar2.k(intValue);
                return 0;
            case 5:
                vq0Var.f469970h = aVar2.i(intValue);
                return 0;
            case 6:
                vq0Var.f469971i = aVar2.k(intValue);
                return 0;
            case 7:
                vq0Var.f469972m = aVar2.k(intValue);
                return 0;
            case 8:
                vq0Var.f469973n = aVar2.k(intValue);
                return 0;
            case 9:
                vq0Var.f469974o = aVar2.k(intValue);
                return 0;
            case 10:
                vq0Var.f469975p = aVar2.k(intValue);
                return 0;
            case 11:
                vq0Var.f469976q = aVar2.k(intValue);
                return 0;
            case 12:
                vq0Var.f469977r = aVar2.g(intValue);
                return 0;
            case 13:
                vq0Var.f469978s = aVar2.k(intValue);
                return 0;
            case 14:
                vq0Var.f469979t = aVar2.g(intValue);
                return 0;
            case 15:
                vq0Var.f469980u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
