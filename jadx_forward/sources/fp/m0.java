package fp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fp.m0 f346742d;

    /* renamed from: e, reason: collision with root package name */
    public static final fp.m0 f346743e;

    /* renamed from: f, reason: collision with root package name */
    public static final fp.m0 f346744f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fp.m0[] f346745g;

    static {
        fp.m0 m0Var = new fp.m0("STATUS_OK", 0);
        f346742d = m0Var;
        fp.m0 m0Var2 = new fp.m0("STATUS_LOW", 1);
        f346743e = m0Var2;
        fp.m0 m0Var3 = new fp.m0("STATUS_LOWER", 2);
        fp.m0 m0Var4 = new fp.m0("STATUS_LOWEST", 3);
        f346744f = m0Var4;
        fp.m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        f346745g = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fp.m0 m129969xdce0328(java.lang.String str) {
        return (fp.m0) java.lang.Enum.valueOf(fp.m0.class, str);
    }

    /* renamed from: values */
    public static fp.m0[] m129970xcee59d22() {
        return (fp.m0[]) f346745g.clone();
    }
}
