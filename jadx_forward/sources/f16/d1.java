package f16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final f16.d1 f340248d;

    /* renamed from: e, reason: collision with root package name */
    public static final f16.d1 f340249e;

    /* renamed from: f, reason: collision with root package name */
    public static final f16.d1 f340250f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f16.d1[] f340251g;

    static {
        f16.d1 d1Var = new f16.d1("FLEXIBLE_LOWER", 0);
        f340248d = d1Var;
        f16.d1 d1Var2 = new f16.d1("FLEXIBLE_UPPER", 1);
        f340249e = d1Var2;
        f16.d1 d1Var3 = new f16.d1("INFLEXIBLE", 2);
        f340250f = d1Var3;
        f16.d1[] d1VarArr = {d1Var, d1Var2, d1Var3};
        f340251g = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static f16.d1 m128717xdce0328(java.lang.String str) {
        return (f16.d1) java.lang.Enum.valueOf(f16.d1.class, str);
    }

    /* renamed from: values */
    public static f16.d1[] m128718xcee59d22() {
        return (f16.d1[]) f340251g.clone();
    }
}
