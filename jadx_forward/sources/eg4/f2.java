package eg4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: e, reason: collision with root package name */
    public static final eg4.e2 f334236e;

    /* renamed from: f, reason: collision with root package name */
    public static final eg4.f2 f334237f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ eg4.f2[] f334238g;

    /* renamed from: d, reason: collision with root package name */
    public final int f334239d;

    static {
        eg4.f2 f2Var = new eg4.f2("HEADER", 0, 1);
        eg4.f2 f2Var2 = new eg4.f2("NEW_DATA_ITEM", 1, 2);
        f334237f = f2Var2;
        eg4.f2[] f2VarArr = {f2Var, f2Var2, new eg4.f2("OLD_DATA_ITEM", 2, 3), new eg4.f2("LOADING_ITEM", 3, 4)};
        f334238g = f2VarArr;
        rz5.b.a(f2VarArr);
        f334236e = new eg4.e2(null);
    }

    public f2(java.lang.String str, int i17, int i18) {
        this.f334239d = i18;
    }

    /* renamed from: valueOf */
    public static eg4.f2 m127701xdce0328(java.lang.String str) {
        return (eg4.f2) java.lang.Enum.valueOf(eg4.f2.class, str);
    }

    /* renamed from: values */
    public static eg4.f2[] m127702xcee59d22() {
        return (eg4.f2[]) f334238g.clone();
    }
}
