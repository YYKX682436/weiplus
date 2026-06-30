package m06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final m06.d f404134d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m06.e[] f404135e;

    static {
        m06.e[] eVarArr = {new m06.e("Function", 0), new m06.e("SuspendFunction", 1), new m06.e("KFunction", 2), new m06.e("KSuspendFunction", 3), new m06.e("UNKNOWN", 4)};
        f404135e = eVarArr;
        rz5.b.a(eVarArr);
        f404134d = new m06.d(null);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static m06.e m146600xdce0328(java.lang.String str) {
        return (m06.e) java.lang.Enum.valueOf(m06.e.class, str);
    }

    /* renamed from: values */
    public static m06.e[] m146601xcee59d22() {
        return (m06.e[]) f404135e.clone();
    }
}
