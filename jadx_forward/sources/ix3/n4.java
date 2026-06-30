package ix3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n4 {

    /* renamed from: d, reason: collision with root package name */
    public static final ix3.n4 f377038d;

    /* renamed from: e, reason: collision with root package name */
    public static final ix3.n4 f377039e;

    /* renamed from: f, reason: collision with root package name */
    public static final ix3.n4 f377040f;

    /* renamed from: g, reason: collision with root package name */
    public static final ix3.n4 f377041g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ix3.n4[] f377042h;

    static {
        ix3.n4 n4Var = new ix3.n4("COMPLETED", 0);
        f377038d = n4Var;
        ix3.n4 n4Var2 = new ix3.n4("NOT_DOWNLOADED", 1);
        f377039e = n4Var2;
        ix3.n4 n4Var3 = new ix3.n4("PROGRESSING", 2);
        f377040f = n4Var3;
        ix3.n4 n4Var4 = new ix3.n4("ANOMALY", 3);
        f377041g = n4Var4;
        ix3.n4[] n4VarArr = {n4Var, n4Var2, n4Var3, n4Var4};
        f377042h = n4VarArr;
        rz5.b.a(n4VarArr);
    }

    public n4(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ix3.n4 m139931xdce0328(java.lang.String str) {
        return (ix3.n4) java.lang.Enum.valueOf(ix3.n4.class, str);
    }

    /* renamed from: values */
    public static ix3.n4[] m139932xcee59d22() {
        return (ix3.n4[]) f377042h.clone();
    }
}
