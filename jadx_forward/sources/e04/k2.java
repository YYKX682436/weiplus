package e04;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class k2 {

    /* renamed from: e, reason: collision with root package name */
    public static final e04.k2 f327533e;

    /* renamed from: f, reason: collision with root package name */
    public static final e04.k2 f327534f;

    /* renamed from: g, reason: collision with root package name */
    public static final e04.k2 f327535g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e04.k2[] f327536h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327537d;

    static {
        e04.k2 k2Var = new e04.k2("NOT_RETRY", 0, 1);
        f327533e = k2Var;
        e04.k2 k2Var2 = new e04.k2("RETRY_BY_PREVIEW_TIMEOUT", 1, 2);
        f327534f = k2Var2;
        e04.k2 k2Var3 = new e04.k2("RETRY_BY_STAY_TIMEOUT", 2, 3);
        f327535g = k2Var3;
        e04.k2[] k2VarArr = {k2Var, k2Var2, k2Var3};
        f327536h = k2VarArr;
        rz5.b.a(k2VarArr);
    }

    public k2(java.lang.String str, int i17, int i18) {
        this.f327537d = i18;
    }

    /* renamed from: valueOf */
    public static e04.k2 m126581xdce0328(java.lang.String str) {
        return (e04.k2) java.lang.Enum.valueOf(e04.k2.class, str);
    }

    /* renamed from: values */
    public static e04.k2[] m126582xcee59d22() {
        return (e04.k2[]) f327536h.clone();
    }
}
