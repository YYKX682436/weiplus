package ni3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ni3.l1 f419160d;

    /* renamed from: e, reason: collision with root package name */
    public static final ni3.l1 f419161e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ni3.l1[] f419162f;

    static {
        ni3.l1 l1Var = new ni3.l1("IDLE", 0);
        ni3.l1 l1Var2 = new ni3.l1("ONE", 1);
        f419160d = l1Var2;
        ni3.l1 l1Var3 = new ni3.l1("TWO", 2);
        f419161e = l1Var3;
        ni3.l1[] l1VarArr = {l1Var, l1Var2, l1Var3, new ni3.l1("PRERENDER", 3)};
        f419162f = l1VarArr;
        rz5.b.a(l1VarArr);
    }

    public l1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ni3.l1 m149653xdce0328(java.lang.String str) {
        return (ni3.l1) java.lang.Enum.valueOf(ni3.l1.class, str);
    }

    /* renamed from: values */
    public static ni3.l1[] m149654xcee59d22() {
        return (ni3.l1[]) f419162f.clone();
    }
}
