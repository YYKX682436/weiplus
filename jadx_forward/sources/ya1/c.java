package ya1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f541951a;

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
        f541951a = (java.lang.String[]) linkedList.toArray(new java.lang.String[linkedList.size()]);
    }

    public static void a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e92) {
        if (c1098xe10e35e9 == null || c1098xe10e35e92 == null) {
            return;
        }
        for (java.lang.String str : f541951a) {
            java.lang.String m7340x351be6 = c1098xe10e35e9.m7340x351be6(str);
            if (m7340x351be6 != null) {
                c1098xe10e35e92.m7364x5c88dc5a(str, m7340x351be6);
            }
        }
        c1098xe10e35e92.m7362xaf634eb4();
    }
}
