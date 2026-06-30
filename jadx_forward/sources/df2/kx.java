package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kx {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.kx f312140d;

    /* renamed from: e, reason: collision with root package name */
    public static final df2.kx f312141e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.kx f312142f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ df2.kx[] f312143g;

    static {
        df2.kx kxVar = new df2.kx("CAN_ENTER_FOCUS", 0);
        f312140d = kxVar;
        df2.kx kxVar2 = new df2.kx("CAN_EXIT_FOCUS", 1);
        f312141e = kxVar2;
        df2.kx kxVar3 = new df2.kx("NONE", 2);
        f312142f = kxVar3;
        df2.kx[] kxVarArr = {kxVar, kxVar2, kxVar3};
        f312143g = kxVarArr;
        rz5.b.a(kxVarArr);
    }

    public kx(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static df2.kx m124221xdce0328(java.lang.String str) {
        return (df2.kx) java.lang.Enum.valueOf(df2.kx.class, str);
    }

    /* renamed from: values */
    public static df2.kx[] m124222xcee59d22() {
        return (df2.kx[]) f312143g.clone();
    }
}
