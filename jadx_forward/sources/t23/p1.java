package t23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final t23.p1 f496780d;

    /* renamed from: e, reason: collision with root package name */
    public static final t23.p1 f496781e;

    /* renamed from: f, reason: collision with root package name */
    public static final t23.p1 f496782f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t23.p1[] f496783g;

    static {
        t23.p1 p1Var = new t23.p1("IDLE", 0);
        f496780d = p1Var;
        t23.p1 p1Var2 = new t23.p1("UP", 1);
        f496781e = p1Var2;
        t23.p1 p1Var3 = new t23.p1("DOWN", 2);
        f496782f = p1Var3;
        t23.p1[] p1VarArr = {p1Var, p1Var2, p1Var3};
        f496783g = p1VarArr;
        rz5.b.a(p1VarArr);
    }

    public p1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static t23.p1 m165760xdce0328(java.lang.String str) {
        return (t23.p1) java.lang.Enum.valueOf(t23.p1.class, str);
    }

    /* renamed from: values */
    public static t23.p1[] m165761xcee59d22() {
        return (t23.p1[]) f496783g.clone();
    }
}
