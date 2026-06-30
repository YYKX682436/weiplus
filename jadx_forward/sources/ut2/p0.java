package ut2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ut2.p0 f512579d;

    /* renamed from: e, reason: collision with root package name */
    public static final ut2.p0 f512580e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ut2.p0[] f512581f;

    static {
        ut2.p0 p0Var = new ut2.p0("Coupon", 0);
        f512579d = p0Var;
        ut2.p0 p0Var2 = new ut2.p0("Goods", 1);
        f512580e = p0Var2;
        ut2.p0[] p0VarArr = {p0Var, p0Var2, new ut2.p0("Detail", 2)};
        f512581f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ut2.p0 m170515xdce0328(java.lang.String str) {
        return (ut2.p0) java.lang.Enum.valueOf(ut2.p0.class, str);
    }

    /* renamed from: values */
    public static ut2.p0[] m170516xcee59d22() {
        return (ut2.p0[]) f512581f.clone();
    }
}
