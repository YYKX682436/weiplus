package wu3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final wu3.z1 f531368d;

    /* renamed from: e, reason: collision with root package name */
    public static final wu3.z1 f531369e;

    /* renamed from: f, reason: collision with root package name */
    public static final wu3.z1 f531370f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wu3.z1[] f531371g;

    static {
        wu3.z1 z1Var = new wu3.z1("STOP", 0);
        f531368d = z1Var;
        wu3.z1 z1Var2 = new wu3.z1("PLAYING", 1);
        f531369e = z1Var2;
        wu3.z1 z1Var3 = new wu3.z1("PAUSE", 2);
        f531370f = z1Var3;
        wu3.z1[] z1VarArr = {z1Var, z1Var2, z1Var3};
        f531371g = z1VarArr;
        rz5.b.a(z1VarArr);
    }

    public z1(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static wu3.z1 m174478xdce0328(java.lang.String str) {
        return (wu3.z1) java.lang.Enum.valueOf(wu3.z1.class, str);
    }

    /* renamed from: values */
    public static wu3.z1[] m174479xcee59d22() {
        return (wu3.z1[]) f531371g.clone();
    }
}
