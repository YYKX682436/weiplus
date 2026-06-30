package fp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fp.p0 f346759d;

    /* renamed from: e, reason: collision with root package name */
    public static final fp.p0 f346760e;

    /* renamed from: f, reason: collision with root package name */
    public static final fp.p0 f346761f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fp.p0[] f346762g;

    static {
        fp.p0 p0Var = new fp.p0("STATUS_OK", 0);
        f346759d = p0Var;
        fp.p0 p0Var2 = new fp.p0("STATUS_LOW", 1);
        f346760e = p0Var2;
        fp.p0 p0Var3 = new fp.p0("STATUS_DISABLE", 2);
        f346761f = p0Var3;
        fp.p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f346762g = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fp.p0 m129977xdce0328(java.lang.String str) {
        return (fp.p0) java.lang.Enum.valueOf(fp.p0.class, str);
    }

    /* renamed from: values */
    public static fp.p0[] m129978xcee59d22() {
        return (fp.p0[]) f346762g.clone();
    }
}
