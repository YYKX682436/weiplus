package rk1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rk1.f[] f477944d;

    static {
        rk1.f[] fVarArr = {new rk1.f("COMPILE_FINISHED", 0, 1), new rk1.f("COMPILE_INTERRUPTED", 1, 2), new rk1.f("COMPILE_TIMEOUT", 2, 3)};
        f477944d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static rk1.f m162546xdce0328(java.lang.String str) {
        return (rk1.f) java.lang.Enum.valueOf(rk1.f.class, str);
    }

    /* renamed from: values */
    public static rk1.f[] m162547xcee59d22() {
        return (rk1.f[]) f477944d.clone();
    }
}
