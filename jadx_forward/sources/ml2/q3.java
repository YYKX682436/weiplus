package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.q3 f409379e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.q3 f409380f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.q3 f409381g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.q3 f409382h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.q3[] f409383i;

    /* renamed from: d, reason: collision with root package name */
    public final int f409384d;

    static {
        ml2.q3 q3Var = new ml2.q3("HORIZONTAL_BY_CLICK_BTN", 0, 1);
        f409379e = q3Var;
        ml2.q3 q3Var2 = new ml2.q3("HORIZONTAL_BY_ROTATE_PHONE", 1, 2);
        f409380f = q3Var2;
        ml2.q3 q3Var3 = new ml2.q3("PORTRAIT_BY_CLICK_BTN", 2, 3);
        f409381g = q3Var3;
        ml2.q3 q3Var4 = new ml2.q3("PORTRAIT_BY_ROTATE_PHONE", 3, 4);
        f409382h = q3Var4;
        ml2.q3[] q3VarArr = {q3Var, q3Var2, q3Var3, q3Var4};
        f409383i = q3VarArr;
        rz5.b.a(q3VarArr);
    }

    public q3(java.lang.String str, int i17, int i18) {
        this.f409384d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.q3 m147689xdce0328(java.lang.String str) {
        return (ml2.q3) java.lang.Enum.valueOf(ml2.q3.class, str);
    }

    /* renamed from: values */
    public static ml2.q3[] m147690xcee59d22() {
        return (ml2.q3[]) f409383i.clone();
    }
}
