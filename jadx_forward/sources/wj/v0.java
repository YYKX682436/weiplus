package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: e, reason: collision with root package name */
    public static final wj.v0 f528069e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.v0 f528070f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wj.v0[] f528071g;

    /* renamed from: d, reason: collision with root package name */
    public final int f528072d;

    static {
        wj.v0 v0Var = new wj.v0("Show", 0, 0);
        wj.v0 v0Var2 = new wj.v0("Installed", 1, 1);
        f528069e = v0Var2;
        wj.v0 v0Var3 = new wj.v0("NotInstalled", 2, 2);
        f528070f = v0Var3;
        wj.v0[] v0VarArr = {v0Var, v0Var2, v0Var3, new wj.v0("LowVersion", 3, 3), new wj.v0("Else", 4, 100)};
        f528071g = v0VarArr;
        rz5.b.a(v0VarArr);
    }

    public v0(java.lang.String str, int i17, int i18) {
        this.f528072d = i18;
    }

    /* renamed from: valueOf */
    public static wj.v0 m173928xdce0328(java.lang.String str) {
        return (wj.v0) java.lang.Enum.valueOf(wj.v0.class, str);
    }

    /* renamed from: values */
    public static wj.v0[] m173929xcee59d22() {
        return (wj.v0[]) f528071g.clone();
    }
}
