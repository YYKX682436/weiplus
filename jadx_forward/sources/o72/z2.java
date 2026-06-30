package o72;

/* loaded from: classes12.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f425068a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f425069b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f425070c = "";

    /* renamed from: d, reason: collision with root package name */
    public static long f425071d;

    public static void a(java.lang.String str) {
        b(str, "");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f425069b)) {
            c(f425069b, f425070c);
        }
        f425069b = str;
        f425070c = str2;
        f425071d = java.lang.System.currentTimeMillis();
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(f425069b)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = f425071d;
        int i17 = (int) (currentTimeMillis - j17);
        f425071d = j17 / 1000;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "-1";
        }
        long j18 = f425071d;
        if (f425068a != null) {
            o72.y2 y2Var = new o72.y2(null);
            y2Var.f425059a = str;
            y2Var.f425060b = j18;
            y2Var.f425061c = i17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                y2Var.f425062d = "-1";
            } else {
                y2Var.f425062d = str2;
            }
            java.util.List list = f425068a;
            if (list != null) {
                ((java.util.Vector) list).add(y2Var);
            }
        }
        f425069b = "";
        f425070c = "";
        f425071d = 0L;
    }
}
