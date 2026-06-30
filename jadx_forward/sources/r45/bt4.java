package r45;

/* loaded from: classes10.dex */
public class bt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452570e;

    /* renamed from: f, reason: collision with root package name */
    public int f452571f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452572g;

    /* renamed from: h, reason: collision with root package name */
    public int f452573h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452574i;

    /* renamed from: m, reason: collision with root package name */
    public int f452575m;

    /* renamed from: n, reason: collision with root package name */
    public int f452576n;

    /* renamed from: o, reason: collision with root package name */
    public long f452577o;

    /* renamed from: p, reason: collision with root package name */
    public long f452578p;

    /* renamed from: q, reason: collision with root package name */
    public long f452579q;

    /* renamed from: r, reason: collision with root package name */
    public int f452580r;

    /* renamed from: s, reason: collision with root package name */
    public int f452581s;

    /* renamed from: t, reason: collision with root package name */
    public int f452582t;

    /* renamed from: u, reason: collision with root package name */
    public int f452583u;

    /* renamed from: v, reason: collision with root package name */
    public long f452584v;

    /* renamed from: w, reason: collision with root package name */
    public int f452585w;

    /* renamed from: x, reason: collision with root package name */
    public int f452586x;

    /* renamed from: y, reason: collision with root package name */
    public int f452587y;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bt4)) {
            return false;
        }
        r45.bt4 bt4Var = (r45.bt4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452569d), java.lang.Integer.valueOf(bt4Var.f452569d)) && n51.f.a(this.f452570e, bt4Var.f452570e) && n51.f.a(java.lang.Integer.valueOf(this.f452571f), java.lang.Integer.valueOf(bt4Var.f452571f)) && n51.f.a(this.f452572g, bt4Var.f452572g) && n51.f.a(java.lang.Integer.valueOf(this.f452573h), java.lang.Integer.valueOf(bt4Var.f452573h)) && n51.f.a(this.f452574i, bt4Var.f452574i) && n51.f.a(java.lang.Integer.valueOf(this.f452575m), java.lang.Integer.valueOf(bt4Var.f452575m)) && n51.f.a(java.lang.Integer.valueOf(this.f452576n), java.lang.Integer.valueOf(bt4Var.f452576n)) && n51.f.a(java.lang.Long.valueOf(this.f452577o), java.lang.Long.valueOf(bt4Var.f452577o)) && n51.f.a(java.lang.Long.valueOf(this.f452578p), java.lang.Long.valueOf(bt4Var.f452578p)) && n51.f.a(java.lang.Long.valueOf(this.f452579q), java.lang.Long.valueOf(bt4Var.f452579q)) && n51.f.a(java.lang.Integer.valueOf(this.f452580r), java.lang.Integer.valueOf(bt4Var.f452580r)) && n51.f.a(java.lang.Integer.valueOf(this.f452581s), java.lang.Integer.valueOf(bt4Var.f452581s)) && n51.f.a(java.lang.Integer.valueOf(this.f452582t), java.lang.Integer.valueOf(bt4Var.f452582t)) && n51.f.a(java.lang.Integer.valueOf(this.f452583u), java.lang.Integer.valueOf(bt4Var.f452583u)) && n51.f.a(java.lang.Long.valueOf(this.f452584v), java.lang.Long.valueOf(bt4Var.f452584v)) && n51.f.a(java.lang.Integer.valueOf(this.f452585w), java.lang.Integer.valueOf(bt4Var.f452585w)) && n51.f.a(java.lang.Integer.valueOf(this.f452586x), java.lang.Integer.valueOf(bt4Var.f452586x)) && n51.f.a(java.lang.Integer.valueOf(this.f452587y), java.lang.Integer.valueOf(bt4Var.f452587y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452569d);
            java.lang.String str = this.f452570e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f452571f);
            java.lang.String str2 = this.f452572g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f452573h);
            java.lang.String str3 = this.f452574i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f452575m);
            fVar.e(8, this.f452576n);
            fVar.h(9, this.f452577o);
            fVar.h(10, this.f452578p);
            fVar.h(11, this.f452579q);
            fVar.e(12, this.f452580r);
            fVar.e(13, this.f452581s);
            fVar.e(14, this.f452582t);
            fVar.e(15, this.f452583u);
            fVar.h(16, this.f452584v);
            fVar.e(17, this.f452585w);
            fVar.e(18, this.f452586x);
            fVar.e(19, this.f452587y);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452569d) + 0;
            java.lang.String str4 = this.f452570e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f452571f);
            java.lang.String str5 = this.f452572g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            int e19 = e18 + b36.f.e(5, this.f452573h);
            java.lang.String str6 = this.f452574i;
            if (str6 != null) {
                e19 += b36.f.j(6, str6);
            }
            return e19 + b36.f.e(7, this.f452575m) + b36.f.e(8, this.f452576n) + b36.f.h(9, this.f452577o) + b36.f.h(10, this.f452578p) + b36.f.h(11, this.f452579q) + b36.f.e(12, this.f452580r) + b36.f.e(13, this.f452581s) + b36.f.e(14, this.f452582t) + b36.f.e(15, this.f452583u) + b36.f.h(16, this.f452584v) + b36.f.e(17, this.f452585w) + b36.f.e(18, this.f452586x) + b36.f.e(19, this.f452587y);
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
        r45.bt4 bt4Var = (r45.bt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bt4Var.f452569d = aVar2.g(intValue);
                return 0;
            case 2:
                bt4Var.f452570e = aVar2.k(intValue);
                return 0;
            case 3:
                bt4Var.f452571f = aVar2.g(intValue);
                return 0;
            case 4:
                bt4Var.f452572g = aVar2.k(intValue);
                return 0;
            case 5:
                bt4Var.f452573h = aVar2.g(intValue);
                return 0;
            case 6:
                bt4Var.f452574i = aVar2.k(intValue);
                return 0;
            case 7:
                bt4Var.f452575m = aVar2.g(intValue);
                return 0;
            case 8:
                bt4Var.f452576n = aVar2.g(intValue);
                return 0;
            case 9:
                bt4Var.f452577o = aVar2.i(intValue);
                return 0;
            case 10:
                bt4Var.f452578p = aVar2.i(intValue);
                return 0;
            case 11:
                bt4Var.f452579q = aVar2.i(intValue);
                return 0;
            case 12:
                bt4Var.f452580r = aVar2.g(intValue);
                return 0;
            case 13:
                bt4Var.f452581s = aVar2.g(intValue);
                return 0;
            case 14:
                bt4Var.f452582t = aVar2.g(intValue);
                return 0;
            case 15:
                bt4Var.f452583u = aVar2.g(intValue);
                return 0;
            case 16:
                bt4Var.f452584v = aVar2.i(intValue);
                return 0;
            case 17:
                bt4Var.f452585w = aVar2.g(intValue);
                return 0;
            case 18:
                bt4Var.f452586x = aVar2.g(intValue);
                return 0;
            case 19:
                bt4Var.f452587y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
