package g31;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final g31.s f349645d;

    /* renamed from: e, reason: collision with root package name */
    public static final g31.s f349646e;

    /* renamed from: f, reason: collision with root package name */
    public static final g31.s f349647f;

    /* renamed from: g, reason: collision with root package name */
    public static final g31.s f349648g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g31.s[] f349649h;

    static {
        g31.s sVar = new g31.s("UNKNOWN", 0);
        f349645d = sVar;
        g31.s sVar2 = new g31.s("RUNNING", 1);
        f349646e = sVar2;
        g31.s sVar3 = new g31.s("FAILED", 2);
        f349647f = sVar3;
        g31.s sVar4 = new g31.s("SUCCESS", 3);
        f349648g = sVar4;
        g31.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f349649h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static g31.s m130788xdce0328(java.lang.String str) {
        return (g31.s) java.lang.Enum.valueOf(g31.s.class, str);
    }

    /* renamed from: values */
    public static g31.s[] m130789xcee59d22() {
        return (g31.s[]) f349649h.clone();
    }
}
