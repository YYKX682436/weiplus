package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.s2 f409452e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.s2 f409453f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.s2 f409454g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.s2[] f409455h;

    /* renamed from: d, reason: collision with root package name */
    public final int f409456d;

    static {
        ml2.s2 s2Var = new ml2.s2("INVALIDATE", 0, 0);
        f409452e = s2Var;
        ml2.s2 s2Var2 = new ml2.s2("AUDIO", 1, 1);
        f409453f = s2Var2;
        ml2.s2 s2Var3 = new ml2.s2("VIDEO", 2, 2);
        f409454g = s2Var3;
        ml2.s2[] s2VarArr = {s2Var, s2Var2, s2Var3};
        f409455h = s2VarArr;
        rz5.b.a(s2VarArr);
    }

    public s2(java.lang.String str, int i17, int i18) {
        this.f409456d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.s2 m147712xdce0328(java.lang.String str) {
        return (ml2.s2) java.lang.Enum.valueOf(ml2.s2.class, str);
    }

    /* renamed from: values */
    public static ml2.s2[] m147713xcee59d22() {
        return (ml2.s2[]) f409455h.clone();
    }
}
