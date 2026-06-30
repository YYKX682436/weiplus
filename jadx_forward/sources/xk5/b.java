package xk5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f536600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f536602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f536603d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f536604e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f536605f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f536606g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f536607h;

    /* renamed from: i, reason: collision with root package name */
    public final xk5.a f536608i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f536609j;

    public b(int i17, int i18, int i19, int i27, java.lang.Integer num, boolean z17, boolean z18, java.lang.Integer num2, xk5.a aVar, java.lang.String str) {
        this.f536600a = i17;
        this.f536601b = i18;
        this.f536602c = i19;
        this.f536603d = i27;
        this.f536604e = num;
        this.f536605f = z17;
        this.f536606g = z18;
        this.f536607h = num2;
        this.f536608i = aVar;
        this.f536609j = str;
    }

    /* renamed from: toString */
    public java.lang.String m175650x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WSI(systemUIVisibility=");
        sb6.append((java.lang.Object) jz5.u.a(this.f536600a));
        sb6.append(", windowFlags=");
        sb6.append((java.lang.Object) jz5.u.a(this.f536601b));
        sb6.append(", statusBarColor=");
        sb6.append((java.lang.Object) jz5.u.a(this.f536602c));
        sb6.append(", navigationBarColor=");
        sb6.append((java.lang.Object) jz5.u.a(this.f536603d));
        sb6.append(", systemBarsAppearance=");
        java.lang.Integer num = this.f536604e;
        sb6.append(num != null ? new jz5.u(num.intValue()) : null);
        sb6.append(" isAppearanceLightStatusBars:");
        sb6.append(this.f536605f);
        sb6.append(" isAppearanceLightNavigationBars:");
        sb6.append(this.f536606g);
        sb6.append(" colorMode:");
        sb6.append(this.f536607h);
        sb6.append(" viewRootImplWindowInfo:");
        sb6.append(this.f536608i);
        sb6.append(" viewRootImplWAInfoStr:");
        sb6.append(this.f536609j);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ b(int i17, int i18, int i19, int i27, java.lang.Integer num, boolean z17, boolean z18, java.lang.Integer num2, xk5.a aVar, java.lang.String str, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i28 & 1) != 0 ? 0 : i17, (i28 & 2) != 0 ? 0 : i18, (i28 & 4) != 0 ? 0 : i19, (i28 & 8) != 0 ? 0 : i27, (i28 & 16) != 0 ? null : num, (i28 & 32) != 0 ? false : z17, (i28 & 64) == 0 ? z18 : false, (i28 & 128) != 0 ? null : num2, (i28 & 256) != 0 ? null : aVar, (i28 & 512) == 0 ? str : null);
    }
}
