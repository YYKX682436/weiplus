package ty0;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: j, reason: collision with root package name */
    public static final ty0.a1 f504307j;

    /* renamed from: k, reason: collision with root package name */
    public static final ty0.a1 f504308k;

    /* renamed from: a, reason: collision with root package name */
    public final long f504309a;

    /* renamed from: b, reason: collision with root package name */
    public final long f504310b;

    /* renamed from: c, reason: collision with root package name */
    public final long f504311c;

    /* renamed from: d, reason: collision with root package name */
    public final long f504312d;

    /* renamed from: e, reason: collision with root package name */
    public final long f504313e;

    /* renamed from: f, reason: collision with root package name */
    public final long f504314f;

    /* renamed from: g, reason: collision with root package name */
    public final float f504315g;

    /* renamed from: h, reason: collision with root package name */
    public final float f504316h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f504317i;

    static {
        float f17 = 8;
        float f18 = 2 * f17;
        f504307j = new ty0.a1(rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560942yg, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560942yg, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560942yg, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231, null, 1, null), com.p314xaae8f345.mm.R.raw.f79821x41d75e0d, 3 * f17, f18, true, null);
        f504308k = new ty0.a1(rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77665x8b2be3de, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560050z, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230, null, 1, null), rz0.a.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230, null, 1, null), com.p314xaae8f345.mm.R.raw.f79821x41d75e0d, f17 * 5, f18, false, null);
    }

    public a1(long j17, long j18, long j19, long j27, long j28, long j29, int i17, float f17, float f18, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f504309a = j17;
        this.f504310b = j18;
        this.f504311c = j19;
        this.f504312d = j27;
        this.f504313e = j28;
        this.f504314f = j29;
        this.f504315g = f17;
        this.f504316h = f18;
        this.f504317i = z17;
    }

    /* renamed from: equals */
    public boolean m167194xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.a1)) {
            return false;
        }
        ty0.a1 a1Var = (ty0.a1) obj;
        return e1.y.c(this.f504309a, a1Var.f504309a) && e1.y.c(this.f504310b, a1Var.f504310b) && e1.y.c(this.f504311c, a1Var.f504311c) && e1.y.c(this.f504312d, a1Var.f504312d) && e1.y.c(this.f504313e, a1Var.f504313e) && e1.y.c(this.f504314f, a1Var.f504314f) && p2.h.a(this.f504315g, a1Var.f504315g) && p2.h.a(this.f504316h, a1Var.f504316h) && this.f504317i == a1Var.f504317i;
    }

    /* renamed from: hashCode */
    public int m167195x8cdac1b() {
        int i17 = e1.y.f327854l;
        return (((((((((((((((((java.lang.Long.hashCode(this.f504309a) * 31) + java.lang.Long.hashCode(this.f504310b)) * 31) + java.lang.Long.hashCode(this.f504311c)) * 31) + java.lang.Long.hashCode(this.f504312d)) * 31) + java.lang.Long.hashCode(this.f504313e)) * 31) + java.lang.Long.hashCode(this.f504314f)) * 31) + java.lang.Integer.hashCode(com.p314xaae8f345.mm.R.raw.f79821x41d75e0d)) * 31) + java.lang.Float.hashCode(this.f504315g)) * 31) + java.lang.Float.hashCode(this.f504316h)) * 31) + java.lang.Boolean.hashCode(this.f504317i);
    }

    /* renamed from: toString */
    public java.lang.String m167196x9616526c() {
        return "MusicSelectorTheme(selectorBgColor=" + ((java.lang.Object) e1.y.i(this.f504309a)) + ", cardBgColor=" + ((java.lang.Object) e1.y.i(this.f504310b)) + ", cardSelectedBgColor=" + ((java.lang.Object) e1.y.i(this.f504311c)) + ", soundsAnimationColor=" + ((java.lang.Object) e1.y.i(this.f504312d)) + ", textColor=" + ((java.lang.Object) e1.y.i(this.f504313e)) + ", movieOptionColor=" + ((java.lang.Object) e1.y.i(this.f504314f)) + ", musicIconRes=2131690961, cardEdgePadding=" + ((java.lang.Object) p2.h.b(this.f504315g)) + ", cardDividerPadding=" + ((java.lang.Object) p2.h.b(this.f504316h)) + ", showLrc=" + this.f504317i + ')';
    }
}
