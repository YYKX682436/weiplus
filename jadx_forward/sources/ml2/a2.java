package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.a2 f408731e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.a2 f408732f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.a2 f408733g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.a2[] f408734h;

    /* renamed from: d, reason: collision with root package name */
    public final int f408735d;

    static {
        ml2.a2 a2Var = new ml2.a2("EXPOSE", 0, 1);
        f408731e = a2Var;
        ml2.a2 a2Var2 = new ml2.a2("CLICK_2_FOLLOW", 1, 2);
        f408732f = a2Var2;
        ml2.a2 a2Var3 = new ml2.a2("CLICK_2_PROFILE", 2, 3);
        ml2.a2 a2Var4 = new ml2.a2("CLICK_2_AD_PROFILE", 3, 5);
        f408733g = a2Var4;
        ml2.a2[] a2VarArr = {a2Var, a2Var2, a2Var3, a2Var4, new ml2.a2("CLICK_2_FOLLOW_AND_AUDIENCE", 4, 6)};
        f408734h = a2VarArr;
        rz5.b.a(a2VarArr);
    }

    public a2(java.lang.String str, int i17, int i18) {
        this.f408735d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.a2 m147426xdce0328(java.lang.String str) {
        return (ml2.a2) java.lang.Enum.valueOf(ml2.a2.class, str);
    }

    /* renamed from: values */
    public static ml2.a2[] m147427xcee59d22() {
        return (ml2.a2[]) f408734h.clone();
    }
}
