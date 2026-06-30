package xh1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final xh1.i f536048e;

    /* renamed from: f, reason: collision with root package name */
    public static final xh1.j f536049f;

    /* renamed from: g, reason: collision with root package name */
    public static final xh1.j f536050g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xh1.j[] f536051h;

    /* renamed from: d, reason: collision with root package name */
    public final int f536052d;

    static {
        xh1.j jVar = new xh1.j("Offline", 0, 0);
        f536049f = jVar;
        xh1.j jVar2 = new xh1.j("Guest", 1, 1);
        f536050g = jVar2;
        xh1.j[] jVarArr = {jVar, jVar2};
        f536051h = jVarArr;
        rz5.b.a(jVarArr);
        f536048e = new xh1.i(null);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f536052d = i18;
    }

    /* renamed from: valueOf */
    public static xh1.j m175531xdce0328(java.lang.String str) {
        return (xh1.j) java.lang.Enum.valueOf(xh1.j.class, str);
    }

    /* renamed from: values */
    public static xh1.j[] m175532xcee59d22() {
        return (xh1.j[]) f536051h.clone();
    }
}
