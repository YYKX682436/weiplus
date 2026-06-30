package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mv.f0 f413034d;

    /* renamed from: e, reason: collision with root package name */
    public static final mv.f0 f413035e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.f0 f413036f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.f0 f413037g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.f0 f413038h;

    /* renamed from: i, reason: collision with root package name */
    public static final mv.f0 f413039i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mv.f0[] f413040m;

    static {
        mv.f0 f0Var = new mv.f0("STATUS_NORMAL", 0, 0);
        f413034d = f0Var;
        mv.f0 f0Var2 = new mv.f0("STATUS_ERROR", 1, 1);
        f413035e = f0Var2;
        mv.f0 f0Var3 = new mv.f0("STATUS_PREPARING", 2, 2);
        f413036f = f0Var3;
        mv.f0 f0Var4 = new mv.f0("STATUS_RUNNING", 3, 3);
        f413037g = f0Var4;
        mv.f0 f0Var5 = new mv.f0("STATUS_IMPORTING", 4, 4);
        f413038h = f0Var5;
        mv.f0 f0Var6 = new mv.f0("STATUS_DELETING", 5, 5);
        f413039i = f0Var6;
        mv.f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6};
        f413040m = f0VarArr;
        rz5.b.a(f0VarArr);
    }

    public f0(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static mv.f0 m148423xdce0328(java.lang.String str) {
        return (mv.f0) java.lang.Enum.valueOf(mv.f0.class, str);
    }

    /* renamed from: values */
    public static mv.f0[] m148424xcee59d22() {
        return (mv.f0[]) f413040m.clone();
    }
}
