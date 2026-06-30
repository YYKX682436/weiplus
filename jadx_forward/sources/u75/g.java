package u75;

/* loaded from: classes7.dex */
public abstract class g {
    public static boolean a(android.content.Context context) {
        try {
            if (context == null) {
                return false;
            }
            try {
                try {
                    java.lang.Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                    return ((java.lang.Boolean) loadClass.getMethod("isFeatureSupport", java.lang.Integer.TYPE).invoke(loadClass, 32)).booleanValue();
                } catch (java.lang.ClassNotFoundException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Vendor.Vivo", "hasCutOut, ClassNotFoundException!!");
                    return false;
                } catch (java.lang.NoSuchMethodException unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Vendor.Vivo", "hasCutOut, NoSuchMethodException!!");
                    return false;
                }
            } catch (java.lang.IllegalAccessException unused3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Vendor.Vivo", "hasCutOut, IllegalAccessException!!");
                return false;
            } catch (java.lang.reflect.InvocationTargetException unused4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Vendor.Vivo", "hasCutOut, InvocationTargetException!!");
                return false;
            }
        } catch (java.lang.Throwable unused5) {
        }
    }
}
