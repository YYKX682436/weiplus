package ty;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ty.t0 f504296e;

    /* renamed from: f, reason: collision with root package name */
    public static final ty.t0 f504297f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ty.t0[] f504298g;

    /* renamed from: d, reason: collision with root package name */
    public final long f504299d;

    static {
        ty.t0 t0Var = new ty.t0("SELF_MESSAGE", 0, 1L);
        f504296e = t0Var;
        ty.t0 t0Var2 = new ty.t0("OTHERS_MESSAGE", 1, 2L);
        f504297f = t0Var2;
        ty.t0[] t0VarArr = {t0Var, t0Var2};
        f504298g = t0VarArr;
        rz5.b.a(t0VarArr);
    }

    public t0(java.lang.String str, int i17, long j17) {
        this.f504299d = j17;
    }

    /* renamed from: valueOf */
    public static ty.t0 m167183xdce0328(java.lang.String str) {
        return (ty.t0) java.lang.Enum.valueOf(ty.t0.class, str);
    }

    /* renamed from: values */
    public static ty.t0[] m167184xcee59d22() {
        return (ty.t0[]) f504298g.clone();
    }
}
