package ad5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ad5.p0 f3291d;

    /* renamed from: e, reason: collision with root package name */
    public static final ad5.p0 f3292e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ad5.p0[] f3293f;

    static {
        ad5.p0 p0Var = new ad5.p0("SINGLE_ITEM_LONG_PRESS", 0);
        f3291d = p0Var;
        ad5.p0 p0Var2 = new ad5.p0("TOOLBAR", 1);
        f3292e = p0Var2;
        ad5.p0[] p0VarArr = {p0Var, p0Var2};
        f3293f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static ad5.p0 valueOf(java.lang.String str) {
        return (ad5.p0) java.lang.Enum.valueOf(ad5.p0.class, str);
    }

    public static ad5.p0[] values() {
        return (ad5.p0[]) f3293f.clone();
    }
}
