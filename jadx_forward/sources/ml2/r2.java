package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.r2 f409429e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.r2 f409430f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.r2[] f409431g;

    /* renamed from: d, reason: collision with root package name */
    public final int f409432d;

    static {
        ml2.r2 r2Var = new ml2.r2("OPEN", 0, 1);
        f409429e = r2Var;
        ml2.r2 r2Var2 = new ml2.r2("CLOSE", 1, 2);
        f409430f = r2Var2;
        ml2.r2[] r2VarArr = {r2Var, r2Var2, new ml2.r2("MIC_SETTING_NO", 2, 3), new ml2.r2("MIC_SETTING_REWARD", 3, 4), new ml2.r2("MIC_SETTING_FOLLOW", 4, 5), new ml2.r2("MIC_SETTING_BUY_PRODUCT", 5, 7)};
        f409431g = r2VarArr;
        rz5.b.a(r2VarArr);
    }

    public r2(java.lang.String str, int i17, int i18) {
        this.f409432d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.r2 m147699xdce0328(java.lang.String str) {
        return (ml2.r2) java.lang.Enum.valueOf(ml2.r2.class, str);
    }

    /* renamed from: values */
    public static ml2.r2[] m147700xcee59d22() {
        return (ml2.r2[]) f409431g.clone();
    }
}
