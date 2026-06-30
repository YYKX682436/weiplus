package l34;

/* loaded from: classes12.dex */
public final class f implements l34.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.f f396965a = new l34.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f396966b;

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method = null;
        try {
            cls = java.lang.Class.forName("android.hsm.HwSystemManager");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiShortcutInstallAdapter", e17, "reflect hwSystemManagerClass fail", new java.lang.Object[0]);
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("allowOp", java.lang.Integer.TYPE);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiShortcutInstallAdapter", e18, "reflect allowOpMethod fail", new java.lang.Object[0]);
            }
        }
        f396966b = method;
    }

    @Override // l34.b
    public int a() {
        java.lang.Boolean bool = null;
        try {
            java.lang.reflect.Method method = f396966b;
            java.lang.Object invoke = method != null ? method.invoke(null, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) : null;
            if (invoke instanceof java.lang.Boolean) {
                bool = (java.lang.Boolean) invoke;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiShortcutInstallAdapter", e17, "reflect call allowOp fail", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiShortcutInstallAdapter", "checkPermissionStatus, isAllowed: " + bool);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            return 1;
        }
        if (bool == null) {
            return -1;
        }
        throw new jz5.j();
    }

    @Override // l34.b
    public boolean b() {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().queryIntentActivities(new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)), 0);
        return !nf.c.a(queryIntentActivities) && queryIntentActivities.get(0).activityInfo.exported;
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        l34.e.f396964a.b(context);
    }
}
