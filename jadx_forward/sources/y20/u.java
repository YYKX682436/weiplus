package y20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final y20.u f540564d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y20.u[] f540565e;

    static {
        y20.u uVar = new y20.u("MATCH_PARENT", 0);
        f540564d = uVar;
        y20.u[] uVarArr = {uVar, new y20.u("FIXED_200", 1), new y20.u("FIXED_300", 2), new y20.u("FIXED_400", 3), new y20.u("RANDOM", 4)};
        f540565e = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static y20.u m176414xdce0328(java.lang.String str) {
        return (y20.u) java.lang.Enum.valueOf(y20.u.class, str);
    }

    /* renamed from: values */
    public static y20.u[] m176415xcee59d22() {
        return (y20.u[]) f540565e.clone();
    }
}
