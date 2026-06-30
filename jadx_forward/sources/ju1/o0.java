package ju1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class o0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ju1.o0 f383308e;

    /* renamed from: f, reason: collision with root package name */
    public static final ju1.o0 f383309f;

    /* renamed from: g, reason: collision with root package name */
    public static final ju1.o0 f383310g;

    /* renamed from: h, reason: collision with root package name */
    public static final ju1.o0 f383311h;

    /* renamed from: i, reason: collision with root package name */
    public static final ju1.o0 f383312i;

    /* renamed from: m, reason: collision with root package name */
    public static final ju1.o0 f383313m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ju1.o0[] f383314n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383315d;

    static {
        ju1.o0 o0Var = new ju1.o0("IDLE", 0, "");
        f383308e = o0Var;
        ju1.o0 o0Var2 = new ju1.o0("LOADING", 1, "");
        f383309f = o0Var2;
        ju1.o0 o0Var3 = new ju1.o0("DELETING", 2, "");
        f383310g = o0Var3;
        ju1.o0 o0Var4 = new ju1.o0("INCOMPLETE", 3, "");
        f383311h = o0Var4;
        ju1.o0 o0Var5 = new ju1.o0("UP_TO_DATE", 4, "");
        f383312i = o0Var5;
        ju1.o0 o0Var6 = new ju1.o0("FAILED", 5, "");
        f383313m = o0Var6;
        ju1.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6};
        f383314n = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, java.lang.String str2) {
        this.f383315d = str2;
    }

    /* renamed from: valueOf */
    public static ju1.o0 m141392xdce0328(java.lang.String str) {
        return (ju1.o0) java.lang.Enum.valueOf(ju1.o0.class, str);
    }

    /* renamed from: values */
    public static ju1.o0[] m141393xcee59d22() {
        return (ju1.o0[]) f383314n.clone();
    }
}
