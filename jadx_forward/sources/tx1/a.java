package tx1;

/* loaded from: classes8.dex */
public abstract class a {
    public static void a(java.lang.reflect.Field field) {
        try {
            java.lang.reflect.Field declaredField = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & (-17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HookUtils", e17.getMessage());
        }
    }
}
