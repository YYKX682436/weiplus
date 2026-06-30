package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ae1.v1 f3417d;

    /* renamed from: e, reason: collision with root package name */
    public static final ae1.v1 f3418e;

    /* renamed from: f, reason: collision with root package name */
    public static final ae1.v1 f3419f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ae1.v1[] f3420g;

    static {
        ae1.v1 v1Var = new ae1.v1("Default", 0);
        f3417d = v1Var;
        ae1.v1 v1Var2 = new ae1.v1("Sensitive", 1);
        f3418e = v1Var2;
        ae1.v1 v1Var3 = new ae1.v1("SmStorage", 2);
        f3419f = v1Var3;
        ae1.v1[] v1VarArr = {v1Var, v1Var2, v1Var3};
        f3420g = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17) {
    }

    public static ae1.v1 valueOf(java.lang.String str) {
        return (ae1.v1) java.lang.Enum.valueOf(ae1.v1.class, str);
    }

    public static ae1.v1[] values() {
        return (ae1.v1[]) f3420g.clone();
    }
}
