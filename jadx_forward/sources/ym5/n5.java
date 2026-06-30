package ym5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class n5 {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.n5 f544978d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym5.n5 f544979e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym5.n5 f544980f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ym5.n5[] f544981g;

    static {
        ym5.n5 n5Var = new ym5.n5("MODE_NONE", 0);
        f544978d = n5Var;
        ym5.n5 n5Var2 = new ym5.n5("MODE_EDIT", 1);
        f544979e = n5Var2;
        ym5.n5 n5Var3 = new ym5.n5("MODE_BOTTOM_DELETE", 2);
        f544980f = n5Var3;
        ym5.n5[] n5VarArr = {n5Var, n5Var2, n5Var3};
        f544981g = n5VarArr;
        rz5.b.a(n5VarArr);
    }

    public n5(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ym5.n5 m177340xdce0328(java.lang.String str) {
        return (ym5.n5) java.lang.Enum.valueOf(ym5.n5.class, str);
    }

    /* renamed from: values */
    public static ym5.n5[] m177341xcee59d22() {
        return (ym5.n5[]) f544981g.clone();
    }
}
