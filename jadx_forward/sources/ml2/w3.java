package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.w3 f409715e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.w3 f409716f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.w3 f409717g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.w3[] f409718h;

    /* renamed from: d, reason: collision with root package name */
    public final int f409719d;

    static {
        ml2.w3 w3Var = new ml2.w3("LIVE_NO_SHOP_PERMIT", 0, 1);
        f409715e = w3Var;
        ml2.w3 w3Var2 = new ml2.w3("LIVE_SHOP_PERMIT_NO_SMALL_STORE", 1, 2);
        f409716f = w3Var2;
        ml2.w3 w3Var3 = new ml2.w3("LIVE_SHOP_PERMIT_SMALL_STORE", 2, 3);
        f409717g = w3Var3;
        ml2.w3[] w3VarArr = {w3Var, w3Var2, w3Var3};
        f409718h = w3VarArr;
        rz5.b.a(w3VarArr);
    }

    public w3(java.lang.String str, int i17, int i18) {
        this.f409719d = i18;
    }

    /* renamed from: valueOf */
    public static ml2.w3 m147785xdce0328(java.lang.String str) {
        return (ml2.w3) java.lang.Enum.valueOf(ml2.w3.class, str);
    }

    /* renamed from: values */
    public static ml2.w3[] m147786xcee59d22() {
        return (ml2.w3[]) f409718h.clone();
    }
}
