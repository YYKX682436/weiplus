package gm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.d2 f354892e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm2.e2[] f354893f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm2.e2 f354894g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm2.e2 f354895h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ gm2.e2[] f354896i;

    /* renamed from: d, reason: collision with root package name */
    public final int f354897d;

    static {
        gm2.e2 e2Var = new gm2.e2("SIZE_NORMAL", 0, 0);
        f354894g = e2Var;
        gm2.e2 e2Var2 = new gm2.e2("SIZE_LARGE", 1, 1);
        f354895h = e2Var2;
        gm2.e2[] e2VarArr = {e2Var, e2Var2, new gm2.e2("SIZE_SMALL", 2, 2)};
        f354896i = e2VarArr;
        rz5.b.a(e2VarArr);
        f354892e = new gm2.d2(null);
        f354893f = m131811xcee59d22();
    }

    public e2(java.lang.String str, int i17, int i18) {
        this.f354897d = i18;
    }

    /* renamed from: valueOf */
    public static gm2.e2 m131810xdce0328(java.lang.String str) {
        return (gm2.e2) java.lang.Enum.valueOf(gm2.e2.class, str);
    }

    /* renamed from: values */
    public static gm2.e2[] m131811xcee59d22() {
        return (gm2.e2[]) f354896i.clone();
    }
}
