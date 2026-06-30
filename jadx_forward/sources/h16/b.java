package h16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final h16.a f359752e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f359753f;

    /* renamed from: g, reason: collision with root package name */
    public static final h16.b f359754g;

    /* renamed from: h, reason: collision with root package name */
    public static final h16.b f359755h;

    /* renamed from: i, reason: collision with root package name */
    public static final h16.b f359756i;

    /* renamed from: m, reason: collision with root package name */
    public static final h16.b f359757m;

    /* renamed from: n, reason: collision with root package name */
    public static final h16.b f359758n;

    /* renamed from: o, reason: collision with root package name */
    public static final h16.b f359759o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ h16.b[] f359760p;

    /* renamed from: d, reason: collision with root package name */
    public final int f359761d;

    static {
        h16.b bVar = new h16.b("UNKNOWN", 0, 0);
        f359754g = bVar;
        h16.b bVar2 = new h16.b("CLASS", 1, 1);
        f359755h = bVar2;
        h16.b bVar3 = new h16.b("FILE_FACADE", 2, 2);
        f359756i = bVar3;
        h16.b bVar4 = new h16.b("SYNTHETIC_CLASS", 3, 3);
        f359757m = bVar4;
        h16.b bVar5 = new h16.b("MULTIFILE_CLASS", 4, 4);
        f359758n = bVar5;
        h16.b bVar6 = new h16.b("MULTIFILE_CLASS_PART", 5, 5);
        f359759o = bVar6;
        h16.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f359760p = bVarArr;
        rz5.b.a(bVarArr);
        f359752e = new h16.a(null);
        h16.b[] m132772xcee59d22 = m132772xcee59d22();
        int d17 = kz5.b1.d(m132772xcee59d22.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (h16.b bVar7 : m132772xcee59d22) {
            linkedHashMap.put(java.lang.Integer.valueOf(bVar7.f359761d), bVar7);
        }
        f359753f = linkedHashMap;
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f359761d = i18;
    }

    /* renamed from: valueOf */
    public static h16.b m132771xdce0328(java.lang.String str) {
        return (h16.b) java.lang.Enum.valueOf(h16.b.class, str);
    }

    /* renamed from: values */
    public static h16.b[] m132772xcee59d22() {
        return (h16.b[]) f359760p.clone();
    }
}
