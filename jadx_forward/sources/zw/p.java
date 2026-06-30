package zw;

/* loaded from: classes7.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f558071a;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.reflect.Field field : p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.class.getDeclaredFields()) {
            try {
                if (java.lang.reflect.Modifier.isFinal(field.getModifiers()) && java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("TAG_")) {
                    linkedList.add((java.lang.String) field.get(null));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        f558071a = (java.lang.String[]) linkedList.toArray(new java.lang.String[linkedList.size()]);
    }
}
