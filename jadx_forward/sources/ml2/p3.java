package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p3 {

    /* renamed from: d, reason: collision with root package name */
    public static final ml2.p3 f409321d;

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.p3 f409322e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.p3 f409323f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.p3 f409324g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.p3 f409325h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.p3[] f409326i;

    static {
        ml2.p3 p3Var = new ml2.p3("UNKNOWN", 0, 0);
        f409321d = p3Var;
        ml2.p3 p3Var2 = new ml2.p3("NORMAL", 1, 1);
        f409322e = p3Var2;
        ml2.p3 p3Var3 = new ml2.p3("DUAL", 2, 2);
        f409323f = p3Var3;
        ml2.p3 p3Var4 = new ml2.p3("GRAB", 3, 3);
        f409324g = p3Var4;
        ml2.p3 p3Var5 = new ml2.p3("PK", 4, 4);
        f409325h = p3Var5;
        ml2.p3[] p3VarArr = {p3Var, p3Var2, p3Var3, p3Var4, p3Var5};
        f409326i = p3VarArr;
        rz5.b.a(p3VarArr);
    }

    public p3(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static ml2.p3 m147676xdce0328(java.lang.String str) {
        return (ml2.p3) java.lang.Enum.valueOf(ml2.p3.class, str);
    }

    /* renamed from: values */
    public static ml2.p3[] m147677xcee59d22() {
        return (ml2.p3[]) f409326i.clone();
    }
}
