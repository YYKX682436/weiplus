package xj5;

/* loaded from: classes5.dex */
public abstract class a implements xj5.e {

    /* renamed from: g, reason: collision with root package name */
    public static final int f536418g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f536419h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f536420i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f536421m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f536422n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f536423o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f536424p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f536425q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f536426r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f536427s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f536428t;

    /* renamed from: d, reason: collision with root package name */
    public int f536429d;

    /* renamed from: e, reason: collision with root package name */
    public int f536430e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f536431f;

    static {
        int i17 = f536418g;
        int i18 = i17 + 1;
        f536418g = i18;
        f536419h = i17;
        int i19 = i18 + 1;
        f536418g = i19;
        f536420i = i18;
        int i27 = i19 + 1;
        f536418g = i27;
        f536421m = i19;
        int i28 = i27 + 1;
        f536418g = i28;
        f536422n = i27;
        int i29 = i28 + 1;
        f536418g = i29;
        f536423o = i28;
        int i37 = i29 + 1;
        f536418g = i37;
        f536424p = i29;
        int i38 = i37 + 1;
        f536418g = i38;
        f536425q = i37;
        int i39 = i38 + 1;
        f536418g = i39;
        f536426r = i38;
        int i47 = i39 + 1;
        f536418g = i47;
        f536427s = i39;
        f536418g = i47 + 1;
        f536428t = i47;
    }

    public java.util.Map a() {
        return null;
    }

    public final java.util.Map b() {
        java.util.Map a17 = a();
        java.util.Map k17 = kz5.c1.k(new jz5.l("group_bar_position_index", java.lang.Integer.valueOf(this.f536429d)), new jz5.l("group_bar_item_type", java.lang.Integer.valueOf(c())));
        if (a17 != null) {
            k17 = kz5.c1.m(k17, a17);
        }
        java.util.Map map = this.f536431f;
        return map != null ? kz5.c1.m(k17, map) : k17;
    }

    public abstract int c();

    public boolean d(xj5.a other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return false;
    }
}
