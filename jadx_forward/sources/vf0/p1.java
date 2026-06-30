package vf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final vf0.p1 f517779d;

    /* renamed from: e, reason: collision with root package name */
    public static final vf0.p1 f517780e;

    /* renamed from: f, reason: collision with root package name */
    public static final vf0.p1 f517781f;

    /* renamed from: g, reason: collision with root package name */
    public static final vf0.p1 f517782g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vf0.p1[] f517783h;

    static {
        vf0.p1 p1Var = new vf0.p1("NO_NEED_COMPRESS", 0);
        f517779d = p1Var;
        vf0.p1 p1Var2 = new vf0.p1("COMPRESS_SUCCESS", 1);
        f517780e = p1Var2;
        vf0.p1 p1Var3 = new vf0.p1("COMPRESS_FAIL", 2);
        f517781f = p1Var3;
        vf0.p1 p1Var4 = new vf0.p1("COMPRESS_SKIP", 3);
        f517782g = p1Var4;
        vf0.p1[] p1VarArr = {p1Var, p1Var2, p1Var3, p1Var4};
        f517783h = p1VarArr;
        rz5.b.a(p1VarArr);
    }

    public p1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vf0.p1 m171791xdce0328(java.lang.String str) {
        return (vf0.p1) java.lang.Enum.valueOf(vf0.p1.class, str);
    }

    /* renamed from: values */
    public static vf0.p1[] m171792xcee59d22() {
        return (vf0.p1[]) f517783h.clone();
    }
}
