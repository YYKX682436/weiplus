package ap1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ap1.p0 f12716d;

    /* renamed from: e, reason: collision with root package name */
    public static final ap1.p0 f12717e;

    /* renamed from: f, reason: collision with root package name */
    public static final ap1.p0 f12718f;

    /* renamed from: g, reason: collision with root package name */
    public static final ap1.p0 f12719g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ap1.p0[] f12720h;

    static {
        ap1.p0 p0Var = new ap1.p0("New2Old", 0);
        f12716d = p0Var;
        ap1.p0 p0Var2 = new ap1.p0("Old2New", 1);
        f12717e = p0Var2;
        ap1.p0 p0Var3 = new ap1.p0("Big2Small", 2);
        f12718f = p0Var3;
        ap1.p0 p0Var4 = new ap1.p0("Small2Big", 3);
        f12719g = p0Var4;
        ap1.p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        f12720h = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static ap1.p0 valueOf(java.lang.String str) {
        return (ap1.p0) java.lang.Enum.valueOf(ap1.p0.class, str);
    }

    public static ap1.p0[] values() {
        return (ap1.p0[]) f12720h.clone();
    }
}
