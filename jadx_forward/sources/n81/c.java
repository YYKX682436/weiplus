package n81;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f417137a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f417138b;

    public static final boolean a(java.lang.String[] args) {
        java.lang.String str;
        java.lang.String obj;
        java.lang.Integer h17;
        java.lang.String str2;
        java.lang.String obj2;
        java.lang.Long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if ((args.length == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(args[0], "//appbrand_clean") || args.length < 2) {
            return false;
        }
        java.lang.String str3 = args[1];
        int hashCode = str3.hashCode();
        if (hashCode == -1298848381) {
            if (str3.equals("enable") && (str = (java.lang.String) kz5.z.U(args, 2)) != null && (obj = r26.n0.u0(str).toString()) != null && (h17 = r26.h0.h(obj)) != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h17.intValue() > 0);
                f417137a = valueOf;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override: enable=%b", valueOf);
                return true;
            }
            return false;
        }
        if (hashCode == 94746189) {
            if (str3.equals("clear")) {
                f417137a = null;
                f417138b = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override cleared");
                return true;
            }
            return false;
        }
        if (hashCode != 1883284325 || !str3.equals("expired_seconds") || (str2 = (java.lang.String) kz5.z.U(args, 2)) == null || (obj2 = r26.n0.u0(str2).toString()) == null || (j17 = r26.h0.j(obj2)) == null) {
            return false;
        }
        long longValue = j17.longValue();
        if (longValue < 1) {
            longValue = 1;
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue);
        f417138b = valueOf2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override: expiredSeconds=%d", valueOf2);
        return true;
    }
}
