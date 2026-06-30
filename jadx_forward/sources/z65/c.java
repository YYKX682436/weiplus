package z65;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f551988a = false;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f551989b = "unknow";

    /* renamed from: c, reason: collision with root package name */
    public static z65.d f551990c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f551991d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f551992e = false;

    /* renamed from: f, reason: collision with root package name */
    public static long f551993f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f551994g = "";

    /* renamed from: h, reason: collision with root package name */
    public static volatile z65.b f551995h;

    public static boolean a() {
        if (f551995h == null) {
            return false;
        }
        com.p314xaae8f345.mm.p642xad8b531f.r rVar = (com.p314xaae8f345.mm.p642xad8b531f.r) f551995h;
        rVar.getClass();
        try {
            return rVar.f145090a.f145097c.get() != null;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        z65.d dVar = f551990c;
        if (dVar != null) {
            dVar.b(str, str2);
        }
    }
}
