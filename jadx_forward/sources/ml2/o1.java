package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.o1 f409300e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.o1 f409301f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.o1 f409302g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.o1[] f409303h;

    /* renamed from: d, reason: collision with root package name */
    public final int f409304d;

    static {
        ml2.o1 o1Var = new ml2.o1("CLICK_CLEAR_SCREEN", 0, 1);
        f409300e = o1Var;
        ml2.o1 o1Var2 = new ml2.o1("CLICK_CLEAR_SCREEN_CANCEL", 1, 2);
        f409301f = o1Var2;
        ml2.o1 o1Var3 = new ml2.o1("CLICK_CLEAR_SCREEN_MENU", 2, 3);
        f409302g = o1Var3;
        ml2.o1[] o1VarArr = {o1Var, o1Var2, o1Var3};
        f409303h = o1VarArr;
        rz5.b.a(o1VarArr);
    }

    public o1(java.lang.String str, int i17, int i18) {
        this.f409304d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.o1 m147655xdce0328(java.lang.String str) {
        return (ml2.o1) java.lang.Enum.valueOf(ml2.o1.class, str);
    }

    /* renamed from: values */
    public static ml2.o1[] m147656xcee59d22() {
        return (ml2.o1[]) f409303h.clone();
    }
}
