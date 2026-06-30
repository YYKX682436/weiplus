package fn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class v1 {

    /* renamed from: e, reason: collision with root package name */
    public static final fn2.v1 f345955e;

    /* renamed from: f, reason: collision with root package name */
    public static final fn2.v1 f345956f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fn2.v1[] f345957g;

    /* renamed from: d, reason: collision with root package name */
    public final int f345958d;

    static {
        fn2.v1 v1Var = new fn2.v1("REQUEST_SONG", 0, 0);
        f345955e = v1Var;
        fn2.v1 v1Var2 = new fn2.v1("PLAYLIST", 1, 1);
        f345956f = v1Var2;
        fn2.v1[] v1VarArr = {v1Var, v1Var2};
        f345957g = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17, int i18) {
        this.f345958d = i18;
    }

    /* renamed from: valueOf */
    public static fn2.v1 m129829xdce0328(java.lang.String str) {
        return (fn2.v1) java.lang.Enum.valueOf(fn2.v1.class, str);
    }

    /* renamed from: values */
    public static fn2.v1[] m129830xcee59d22() {
        return (fn2.v1[]) f345957g.clone();
    }
}
