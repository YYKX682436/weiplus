package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.v1 f409673e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.v1 f409674f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.v1 f409675g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.v1 f409676h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.v1 f409677i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ml2.v1[] f409678m;

    /* renamed from: d, reason: collision with root package name */
    public final long f409679d;

    static {
        ml2.v1 v1Var = new ml2.v1("LIVE_LIVING", 0, 1L);
        f409673e = v1Var;
        ml2.v1 v1Var2 = new ml2.v1("LIVE_STOPPED", 1, 2L);
        f409674f = v1Var2;
        ml2.v1 v1Var3 = new ml2.v1("LIVE_FORBIDDEN", 2, 3L);
        f409675g = v1Var3;
        ml2.v1 v1Var4 = new ml2.v1("LIVE_IN_BLACK_LIST", 3, 5L);
        f409676h = v1Var4;
        ml2.v1 v1Var5 = new ml2.v1("LIVE_NO_ACCESS_PERMISSION", 4, 6L);
        f409677i = v1Var5;
        ml2.v1[] v1VarArr = {v1Var, v1Var2, v1Var3, v1Var4, v1Var5, new ml2.v1("LIVE_OVERLOAD", 5, 7L)};
        f409678m = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17, long j17) {
        this.f409679d = j17;
    }

    /* renamed from: valueOf */
    public static ml2.v1 m147763xdce0328(java.lang.String str) {
        return (ml2.v1) java.lang.Enum.valueOf(ml2.v1.class, str);
    }

    /* renamed from: values */
    public static ml2.v1[] m147764xcee59d22() {
        return (ml2.v1[]) f409678m.clone();
    }
}
