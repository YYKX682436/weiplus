package wu3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wu3.p0 f531323d;

    /* renamed from: e, reason: collision with root package name */
    public static final wu3.p0 f531324e;

    /* renamed from: f, reason: collision with root package name */
    public static final wu3.p0 f531325f;

    /* renamed from: g, reason: collision with root package name */
    public static final wu3.p0 f531326g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wu3.p0[] f531327h;

    static {
        wu3.p0 p0Var = new wu3.p0("POSITION_LEFT", 0, 0);
        f531323d = p0Var;
        wu3.p0 p0Var2 = new wu3.p0("POSITION_TOP", 1, 1);
        f531324e = p0Var2;
        wu3.p0 p0Var3 = new wu3.p0("POSITION_RIGHT", 2, 2);
        f531325f = p0Var3;
        wu3.p0 p0Var4 = new wu3.p0("POSITION_BOTTOM", 3, 3);
        f531326g = p0Var4;
        wu3.p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        f531327h = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static wu3.p0 m174475xdce0328(java.lang.String str) {
        return (wu3.p0) java.lang.Enum.valueOf(wu3.p0.class, str);
    }

    /* renamed from: values */
    public static wu3.p0[] m174476xcee59d22() {
        return (wu3.p0[]) f531327h.clone();
    }
}
