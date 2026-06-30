package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.n2 f409265e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.n2 f409266f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.n2[] f409267g;

    /* renamed from: d, reason: collision with root package name */
    public final int f409268d;

    static {
        ml2.n2 n2Var = new ml2.n2("YES", 0, 1);
        f409265e = n2Var;
        ml2.n2 n2Var2 = new ml2.n2("NO", 1, 2);
        f409266f = n2Var2;
        ml2.n2[] n2VarArr = {n2Var, n2Var2};
        f409267g = n2VarArr;
        rz5.b.a(n2VarArr);
    }

    public n2(java.lang.String str, int i17, int i18) {
        this.f409268d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.n2 m147645xdce0328(java.lang.String str) {
        return (ml2.n2) java.lang.Enum.valueOf(ml2.n2.class, str);
    }

    /* renamed from: values */
    public static ml2.n2[] m147646xcee59d22() {
        return (ml2.n2[]) f409267g.clone();
    }
}
