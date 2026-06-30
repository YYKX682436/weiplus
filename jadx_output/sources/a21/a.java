package a21;

/* loaded from: classes7.dex */
public abstract class a {
    public static final boolean a() {
        try {
            java.lang.reflect.Method method = android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]);
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            java.lang.Object invoke = method.invoke((android.os.PowerManager) systemService, new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(99L, 45L, 1L, false);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", bool, com.tencent.mm.sdk.platformtools.z3.c(e17));
            return true;
        }
    }
}
