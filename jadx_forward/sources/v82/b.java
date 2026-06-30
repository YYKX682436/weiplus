package v82;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f515600a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f515601b;

    /* renamed from: c, reason: collision with root package name */
    public int f515602c;

    /* renamed from: d, reason: collision with root package name */
    public int f515603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f515604e;

    /* renamed from: f, reason: collision with root package name */
    public int f515605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f515606g;

    /* renamed from: h, reason: collision with root package name */
    public int f515607h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f515608i;

    /* renamed from: j, reason: collision with root package name */
    public int f515609j;

    /* renamed from: k, reason: collision with root package name */
    public long f515610k;

    /* renamed from: l, reason: collision with root package name */
    public long f515611l;

    public static java.lang.String a() {
        return java.lang.String.format("%s_%s", c01.z1.r(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static int c(int i17) {
        if (i17 == 3) {
            return 6;
        }
        if (i17 == 5) {
            return 2;
        }
        if (i17 == 6) {
            return 8;
        }
        if (i17 == 7) {
            return 4;
        }
        if (i17 == 8) {
            return 3;
        }
        if (i17 == 17) {
            return 5;
        }
        if (i17 == 18) {
            return 7;
        }
        switch (i17) {
            case 20:
                return 10;
            case 21:
                return 1;
            case 22:
                return 9;
            default:
                return 0;
        }
    }

    public void b() {
        java.lang.String.format("zst, 15488 on report, actionType %s, subScene %s, scene %s, actionTime %s, query %s, tabId %s, searchId:%s, searchCost:%s, localPosition %s, localResultCount %s", java.lang.Integer.valueOf(this.f515600a), java.lang.Integer.valueOf(this.f515601b), java.lang.Integer.valueOf(this.f515602c), java.lang.Integer.valueOf(this.f515603d), this.f515604e, java.lang.Integer.valueOf(this.f515605f), this.f515606g, java.lang.Integer.valueOf(this.f515607h), this.f515608i, java.lang.Integer.valueOf(this.f515609j));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15488, java.lang.Integer.valueOf(this.f515600a), java.lang.Integer.valueOf(this.f515601b), java.lang.Integer.valueOf(this.f515602c), 0, java.lang.Integer.valueOf(this.f515603d), this.f515604e, 0L, java.lang.Integer.valueOf(this.f515605f), this.f515606g, java.lang.Integer.valueOf(this.f515607h), "0", this.f515608i, 0, java.lang.Integer.valueOf(this.f515609j), "0");
    }

    public boolean d(r45.fq0 fq0Var) {
        if (fq0Var == null) {
            return false;
        }
        this.f515605f = fq0Var.f456074f;
        this.f515602c = fq0Var.f456072d;
        this.f515601b = fq0Var.f456073e;
        this.f515608i = fq0Var.f456075g;
        this.f515609j = fq0Var.f456076h;
        this.f515604e = fq0Var.f456077i;
        return true;
    }

    public boolean e(r45.fq0 fq0Var) {
        if (fq0Var == null) {
            return false;
        }
        fq0Var.f456074f = this.f515605f;
        fq0Var.f456072d = this.f515602c;
        fq0Var.f456073e = this.f515601b;
        fq0Var.f456075g = this.f515608i;
        fq0Var.f456076h = this.f515609j;
        fq0Var.f456077i = this.f515604e;
        return true;
    }
}
