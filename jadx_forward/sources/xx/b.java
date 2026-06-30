package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.b f539303e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.b f539304f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.b[] f539305g;

    /* renamed from: d, reason: collision with root package name */
    public final int f539306d;

    static {
        xx.b bVar = new xx.b("AICommentTypePerson", 0, 1);
        f539303e = bVar;
        xx.b bVar2 = new xx.b("AICommentTypeBot", 1, 2);
        f539304f = bVar2;
        xx.b[] bVarArr = {bVar, bVar2};
        f539305g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f539306d = i18;
    }

    /* renamed from: valueOf */
    public static xx.b m176130xdce0328(java.lang.String str) {
        return (xx.b) java.lang.Enum.valueOf(xx.b.class, str);
    }

    /* renamed from: values */
    public static xx.b[] m176131xcee59d22() {
        return (xx.b[]) f539305g.clone();
    }
}
