package a21;

/* loaded from: classes7.dex */
public abstract class a {
    public static final boolean a() {
        try {
            java.lang.reflect.Method method = android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]);
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            java.lang.Object invoke = method.invoke((android.os.PowerManager) systemService, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 45L, 1L, false);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", bool, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return true;
        }
    }
}
