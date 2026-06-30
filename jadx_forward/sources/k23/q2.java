package k23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class q2 {

    /* renamed from: e, reason: collision with root package name */
    public static final k23.q2 f385203e;

    /* renamed from: f, reason: collision with root package name */
    public static final k23.q2 f385204f;

    /* renamed from: g, reason: collision with root package name */
    public static final k23.q2 f385205g;

    /* renamed from: h, reason: collision with root package name */
    public static final k23.q2 f385206h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k23.q2[] f385207i;

    /* renamed from: d, reason: collision with root package name */
    public final int f385208d;

    static {
        k23.q2 q2Var = new k23.q2("Ok", 0, 0);
        f385203e = q2Var;
        k23.q2 q2Var2 = new k23.q2("OccupiedError", 1, -1);
        f385204f = q2Var2;
        k23.q2 q2Var3 = new k23.q2("NetworkError", 2, -2);
        f385205g = q2Var3;
        k23.q2 q2Var4 = new k23.q2("PermissionError", 3, -3);
        f385206h = q2Var4;
        k23.q2[] q2VarArr = {q2Var, q2Var2, q2Var3, q2Var4};
        f385207i = q2VarArr;
        rz5.b.a(q2VarArr);
    }

    public q2(java.lang.String str, int i17, int i18) {
        this.f385208d = i18;
    }

    /* renamed from: valueOf */
    public static k23.q2 m141843xdce0328(java.lang.String str) {
        return (k23.q2) java.lang.Enum.valueOf(k23.q2.class, str);
    }

    /* renamed from: values */
    public static k23.q2[] m141844xcee59d22() {
        return (k23.q2[]) f385207i.clone();
    }
}
