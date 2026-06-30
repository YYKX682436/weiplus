package v11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final v11.c f513882e;

    /* renamed from: f, reason: collision with root package name */
    public static final v11.d f513883f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v11.d[] f513884g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f513885h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f513886d;

    static {
        v11.d dVar = new v11.d("CALLBACK", 0, "callback");
        v11.d dVar2 = new v11.d("URL", 1, "url");
        f513883f = dVar2;
        v11.d[] dVarArr = {dVar, dVar2};
        f513884g = dVarArr;
        f513885h = rz5.b.a(dVarArr);
        f513882e = new v11.c(null);
    }

    public d(java.lang.String str, int i17, java.lang.String str2) {
        this.f513886d = str2;
    }

    /* renamed from: valueOf */
    public static v11.d m170873xdce0328(java.lang.String str) {
        return (v11.d) java.lang.Enum.valueOf(v11.d.class, str);
    }

    /* renamed from: values */
    public static v11.d[] m170874xcee59d22() {
        return (v11.d[]) f513884g.clone();
    }
}
