package v11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final v11.b f513862d;

    /* renamed from: e, reason: collision with root package name */
    public static final v11.b f513863e;

    /* renamed from: f, reason: collision with root package name */
    public static final v11.b f513864f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v11.b[] f513865g;

    static {
        v11.b bVar = new v11.b("NORMAL", 0);
        f513862d = bVar;
        v11.b bVar2 = new v11.b("LOADING", 1);
        f513863e = bVar2;
        v11.b bVar3 = new v11.b("DISABLED", 2);
        f513864f = bVar3;
        v11.b[] bVarArr = {bVar, bVar2, bVar3};
        f513865g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static v11.b m170864xdce0328(java.lang.String str) {
        return (v11.b) java.lang.Enum.valueOf(v11.b.class, str);
    }

    /* renamed from: values */
    public static v11.b[] m170865xcee59d22() {
        return (v11.b[]) f513865g.clone();
    }
}
