package tk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final tk.t f501404e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk.u f501405f;

    /* renamed from: g, reason: collision with root package name */
    public static final tk.u f501406g;

    /* renamed from: h, reason: collision with root package name */
    public static final tk.u f501407h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tk.u[] f501408i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f501409m;

    /* renamed from: d, reason: collision with root package name */
    public final int f501410d;

    static {
        tk.u uVar = new tk.u("OPEN_IMAGE", 0, 1);
        f501405f = uVar;
        tk.u uVar2 = new tk.u("OPEN_MP_PUBLISH", 1, 2);
        tk.u uVar3 = new tk.u("OPEN_MP_ARTICLE", 2, 3);
        f501406g = uVar3;
        tk.u uVar4 = new tk.u("OPEN_REGISTER_PAGE", 3, 4);
        f501407h = uVar4;
        tk.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, new tk.u("OPEN_WEAPP", 4, 5)};
        f501408i = uVarArr;
        f501409m = rz5.b.a(uVarArr);
        f501404e = new tk.t(null);
    }

    public u(java.lang.String str, int i17, int i18) {
        this.f501410d = i18;
    }

    /* renamed from: valueOf */
    public static tk.u m166700xdce0328(java.lang.String str) {
        return (tk.u) java.lang.Enum.valueOf(tk.u.class, str);
    }

    /* renamed from: values */
    public static tk.u[] m166701xcee59d22() {
        return (tk.u[]) f501408i.clone();
    }
}
