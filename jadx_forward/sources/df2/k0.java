package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final df2.k0 f312064e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.k0 f312065f;

    /* renamed from: g, reason: collision with root package name */
    public static final df2.k0 f312066g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ df2.k0[] f312067h;

    /* renamed from: d, reason: collision with root package name */
    public final int f312068d;

    static {
        df2.k0 k0Var = new df2.k0("ACTION_SHEET_SHOOT", 0, 1);
        df2.k0 k0Var2 = new df2.k0("ACTION_SHEET_ALBUM", 1, 2);
        f312064e = k0Var2;
        df2.k0 k0Var3 = new df2.k0("ACTION_SHEET_AVATAR", 2, 3);
        f312065f = k0Var3;
        df2.k0 k0Var4 = new df2.k0("ACTION_SHEET_CANCEL", 3, 4);
        f312066g = k0Var4;
        df2.k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4};
        f312067h = k0VarArr;
        rz5.b.a(k0VarArr);
    }

    public k0(java.lang.String str, int i17, int i18) {
        this.f312068d = i18;
    }

    /* renamed from: valueOf */
    public static df2.k0 m124215xdce0328(java.lang.String str) {
        return (df2.k0) java.lang.Enum.valueOf(df2.k0.class, str);
    }

    /* renamed from: values */
    public static df2.k0[] m124216xcee59d22() {
        return (df2.k0[]) f312067h.clone();
    }
}
