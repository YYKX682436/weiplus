package k35;

/* loaded from: classes11.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f385475a = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String a(android.content.Context context) {
        uk.b b17;
        uk.c cVar;
        java.lang.String b18 = b(context);
        java.lang.String str = null;
        if (b18 == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b18);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            return null;
        }
        java.util.Map map = f385475a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
        if (concurrentHashMap.containsKey(b18)) {
            return (java.lang.String) concurrentHashMap.get(b18);
        }
        synchronized (map) {
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(b18)) {
                return (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(b18);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion <= 29 && (b17 = uk.b.b(b18)) != null && (cVar = b17.f510015b) != null) {
                str = cVar.f510016d;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str = com.p314xaae8f345.mm.vfs.w6.p(b18);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(b18, str);
            }
            return str;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
