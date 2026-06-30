package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.t3 f409548e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.t3 f409549f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.t3[] f409550g;

    /* renamed from: d, reason: collision with root package name */
    public final int f409551d;

    static {
        ml2.t3 t3Var = new ml2.t3("LIVE_SCREEN_PORTRAIT", 0, 1);
        f409548e = t3Var;
        ml2.t3 t3Var2 = new ml2.t3("LIVE_SCREEN_HORIZONTAL", 1, 2);
        f409549f = t3Var2;
        ml2.t3[] t3VarArr = {t3Var, t3Var2};
        f409550g = t3VarArr;
        rz5.b.a(t3VarArr);
    }

    public t3(java.lang.String str, int i17, int i18) {
        this.f409551d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.t3 m147734xdce0328(java.lang.String str) {
        return (ml2.t3) java.lang.Enum.valueOf(ml2.t3.class, str);
    }

    /* renamed from: values */
    public static ml2.t3[] m147735xcee59d22() {
        return (ml2.t3[]) f409550g.clone();
    }
}
