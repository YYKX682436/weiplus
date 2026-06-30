package zl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final zl2.r0 f555472e;

    /* renamed from: f, reason: collision with root package name */
    public static final zl2.r0 f555473f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zl2.r0[] f555474g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f555475d;

    static {
        zl2.r0 r0Var = new zl2.r0("AVC", 0, "avc");
        f555472e = r0Var;
        zl2.r0 r0Var2 = new zl2.r0("HEVC", 1, "hevc");
        f555473f = r0Var2;
        zl2.r0[] r0VarArr = {r0Var, r0Var2};
        f555474g = r0VarArr;
        rz5.b.a(r0VarArr);
    }

    public r0(java.lang.String str, int i17, java.lang.String str2) {
        this.f555475d = str2;
    }

    /* renamed from: valueOf */
    public static zl2.r0 m179131xdce0328(java.lang.String str) {
        return (zl2.r0) java.lang.Enum.valueOf(zl2.r0.class, str);
    }

    /* renamed from: values */
    public static zl2.r0[] m179132xcee59d22() {
        return (zl2.r0[]) f555474g.clone();
    }
}
