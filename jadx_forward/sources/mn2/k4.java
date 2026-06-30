package mn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class k4 {

    /* renamed from: e, reason: collision with root package name */
    public static final mn2.k4 f411569e;

    /* renamed from: f, reason: collision with root package name */
    public static final mn2.k4 f411570f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mn2.k4[] f411571g;

    /* renamed from: d, reason: collision with root package name */
    public final int f411572d;

    static {
        mn2.k4 k4Var = new mn2.k4("SMALL", 0, 30);
        f411569e = k4Var;
        mn2.k4 k4Var2 = new mn2.k4("BIG", 1, 100);
        f411570f = k4Var2;
        mn2.k4[] k4VarArr = {k4Var, k4Var2};
        f411571g = k4VarArr;
        rz5.b.a(k4VarArr);
    }

    public k4(java.lang.String str, int i17, int i18) {
        this.f411572d = i18;
    }

    /* renamed from: valueOf */
    public static mn2.k4 m148105xdce0328(java.lang.String str) {
        return (mn2.k4) java.lang.Enum.valueOf(mn2.k4.class, str);
    }

    /* renamed from: values */
    public static mn2.k4[] m148106xcee59d22() {
        return (mn2.k4[]) f411571g.clone();
    }
}
