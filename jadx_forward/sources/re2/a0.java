package re2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final re2.a0 f475888d;

    /* renamed from: e, reason: collision with root package name */
    public static final re2.a0 f475889e;

    /* renamed from: f, reason: collision with root package name */
    public static final re2.a0 f475890f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ re2.a0[] f475891g;

    static {
        re2.a0 a0Var = new re2.a0("IDLE", 0);
        f475888d = a0Var;
        re2.a0 a0Var2 = new re2.a0("POLLING", 1);
        f475889e = a0Var2;
        re2.a0 a0Var3 = new re2.a0("DEAD", 2);
        f475890f = a0Var3;
        re2.a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        f475891g = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static re2.a0 m162213xdce0328(java.lang.String str) {
        return (re2.a0) java.lang.Enum.valueOf(re2.a0.class, str);
    }

    /* renamed from: values */
    public static re2.a0[] m162214xcee59d22() {
        return (re2.a0[]) f475891g.clone();
    }
}
