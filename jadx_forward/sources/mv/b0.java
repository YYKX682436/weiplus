package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.b0 f413010e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.b0 f413011f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.b0 f413012g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.b0 f413013h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mv.b0[] f413014i;

    /* renamed from: d, reason: collision with root package name */
    public final int f413015d;

    static {
        mv.b0 b0Var = new mv.b0("NONE", 0, -1, "");
        mv.b0 b0Var2 = new mv.b0("HOME", 1, 0, "home");
        f413010e = b0Var2;
        mv.b0 b0Var3 = new mv.b0("DEVICE", 2, 1, "select_device");
        f413011f = b0Var3;
        mv.b0 b0Var4 = new mv.b0("DETAIL", 3, 2, "edit_package");
        f413012g = b0Var4;
        mv.b0 b0Var5 = new mv.b0("RESTORE", 4, 3, "import_package");
        f413013h = b0Var5;
        mv.b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
        f413014i = b0VarArr;
        rz5.b.a(b0VarArr);
    }

    public b0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f413015d = i18;
    }

    /* renamed from: valueOf */
    public static mv.b0 m148408xdce0328(java.lang.String str) {
        return (mv.b0) java.lang.Enum.valueOf(mv.b0.class, str);
    }

    /* renamed from: values */
    public static mv.b0[] m148409xcee59d22() {
        return (mv.b0[]) f413014i.clone();
    }
}
