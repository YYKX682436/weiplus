package gm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.b2 f354879e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm2.c2[] f354880f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm2.c2 f354881g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm2.c2 f354882h;

    /* renamed from: i, reason: collision with root package name */
    public static final gm2.c2 f354883i;

    /* renamed from: m, reason: collision with root package name */
    public static final gm2.c2 f354884m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ gm2.c2[] f354885n;

    /* renamed from: d, reason: collision with root package name */
    public final int f354886d;

    static {
        gm2.c2 c2Var = new gm2.c2("MODE_DARK", 0, 0);
        f354881g = c2Var;
        gm2.c2 c2Var2 = new gm2.c2("MODE_LIGHT", 1, 1);
        f354882h = c2Var2;
        gm2.c2 c2Var3 = new gm2.c2("MODE_AUTO", 2, 2);
        f354883i = c2Var3;
        gm2.c2 c2Var4 = new gm2.c2("MODE_LIGHT_BG", 3, 3);
        f354884m = c2Var4;
        gm2.c2[] c2VarArr = {c2Var, c2Var2, c2Var3, c2Var4};
        f354885n = c2VarArr;
        rz5.b.a(c2VarArr);
        f354879e = new gm2.b2(null);
        f354880f = m131805xcee59d22();
    }

    public c2(java.lang.String str, int i17, int i18) {
        this.f354886d = i18;
    }

    /* renamed from: valueOf */
    public static gm2.c2 m131804xdce0328(java.lang.String str) {
        return (gm2.c2) java.lang.Enum.valueOf(gm2.c2.class, str);
    }

    /* renamed from: values */
    public static gm2.c2[] m131805xcee59d22() {
        return (gm2.c2[]) f354885n.clone();
    }
}
