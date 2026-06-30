package wg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final wg1.b f527244d;

    /* renamed from: e, reason: collision with root package name */
    public static final wg1.b f527245e;

    /* renamed from: f, reason: collision with root package name */
    public static final wg1.b f527246f;

    /* renamed from: g, reason: collision with root package name */
    public static final wg1.b f527247g;

    /* renamed from: h, reason: collision with root package name */
    public static final wg1.b f527248h;

    /* renamed from: i, reason: collision with root package name */
    public static final wg1.b f527249i;

    /* renamed from: m, reason: collision with root package name */
    public static final wg1.b f527250m;

    /* renamed from: n, reason: collision with root package name */
    public static final wg1.b f527251n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wg1.b[] f527252o;

    static {
        wg1.b bVar = new wg1.b("NeedLatestVersion", 0);
        f527244d = bVar;
        wg1.b bVar2 = new wg1.b("LocalVersionFallback", 1);
        f527245e = bVar2;
        wg1.b bVar3 = new wg1.b("UpdateApp", 2);
        f527246f = bVar3;
        wg1.b bVar4 = new wg1.b("WxaMigrate", 3);
        f527247g = bVar4;
        wg1.b bVar5 = new wg1.b("WeakNetReload", 4);
        f527248h = bVar5;
        wg1.b bVar6 = new wg1.b("FallbackErrorReload", 5);
        f527249i = bVar6;
        wg1.b bVar7 = new wg1.b("NeedLatestVersionByLaunchParams", 6);
        f527250m = bVar7;
        wg1.b bVar8 = new wg1.b("JsApiNavigateToMiniProgram", 7);
        f527251n = bVar8;
        wg1.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f527252o = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static wg1.b m173748xdce0328(java.lang.String str) {
        return (wg1.b) java.lang.Enum.valueOf(wg1.b.class, str);
    }

    /* renamed from: values */
    public static wg1.b[] m173749xcee59d22() {
        return (wg1.b[]) f527252o.clone();
    }

    public final java.lang.String h() {
        return wg1.a.f527243a[ordinal()] == 1 ? ne1.f.f72992x24728b : name();
    }
}
