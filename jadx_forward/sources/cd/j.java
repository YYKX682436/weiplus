package cd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final cd.i f122046e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd.j f122047f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd.j f122048g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cd.j[] f122049h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f122050i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f122051d;

    static {
        cd.j jVar = new cd.j("CN", 0, "cn");
        f122047f = jVar;
        cd.j jVar2 = new cd.j("HK", 1, "hk");
        f122048g = jVar2;
        cd.j[] jVarArr = {jVar, jVar2};
        f122049h = jVarArr;
        f122050i = rz5.b.a(jVarArr);
        f122046e = new cd.i(null);
    }

    public j(java.lang.String str, int i17, java.lang.String str2) {
        this.f122051d = str2;
    }

    /* renamed from: valueOf */
    public static cd.j m14637xdce0328(java.lang.String str) {
        return (cd.j) java.lang.Enum.valueOf(cd.j.class, str);
    }

    /* renamed from: values */
    public static cd.j[] m14638xcee59d22() {
        return (cd.j[]) f122049h.clone();
    }
}
