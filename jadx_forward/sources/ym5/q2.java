package ym5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.q2 f545011d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ym5.q2[] f545012e;

    static {
        ym5.q2 q2Var = new ym5.q2("BOTTOM", 0);
        f545011d = q2Var;
        ym5.q2[] q2VarArr = {q2Var, new ym5.q2("INSIDE", 1), new ym5.q2("NONE", 2)};
        f545012e = q2VarArr;
        rz5.b.a(q2VarArr);
    }

    public q2(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ym5.q2 m177345xdce0328(java.lang.String str) {
        return (ym5.q2) java.lang.Enum.valueOf(ym5.q2.class, str);
    }

    /* renamed from: values */
    public static ym5.q2[] m177346xcee59d22() {
        return (ym5.q2[]) f545012e.clone();
    }
}
