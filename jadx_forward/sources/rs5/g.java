package rs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final rs5.g f480887e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rs5.g[] f480888f;

    /* renamed from: d, reason: collision with root package name */
    public final int f480889d;

    static {
        rs5.g gVar = new rs5.g("UNKNOWN", 0, -1);
        rs5.g gVar2 = new rs5.g("NO_ERROR", 1, 0);
        f480887e = gVar2;
        rs5.g[] gVarArr = {gVar, gVar2, new rs5.g("ENGINE_LOAD_ERROR", 2, 1), new rs5.g("JS_EXCEPTION", 3, 10), new rs5.g("RUNTIME_ERROR", 4, 11), new rs5.g("BINDER_ERROR", 5, 20)};
        f480888f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f480889d = i18;
    }

    /* renamed from: valueOf */
    public static rs5.g m162976xdce0328(java.lang.String str) {
        return (rs5.g) java.lang.Enum.valueOf(rs5.g.class, str);
    }

    /* renamed from: values */
    public static rs5.g[] m162977xcee59d22() {
        return (rs5.g[]) f480888f.clone();
    }
}
