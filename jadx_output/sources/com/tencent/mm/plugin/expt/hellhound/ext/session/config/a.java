package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes11.dex */
public abstract class a {
    public static boolean a(android.app.Activity activity, r45.y06 y06Var) {
        if (activity != null && y06Var != null) {
            java.lang.Class<?> cls = java.lang.Class.forName(y06Var.f390686d);
            java.lang.String str = y06Var.f390687e;
            if (str != null && !str.isEmpty()) {
                java.lang.String[] split = y06Var.f390687e.split(",");
                if (split.length <= 0) {
                    return false;
                }
                java.lang.String[] split2 = split[0].split("\\|");
                java.lang.reflect.Field declaredField = cls.getDeclaredField(split2[0]);
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(activity);
                if (split.length == 1) {
                    return y06Var.f390688f.equals(obj);
                }
                int i17 = 1;
                while (i17 < split.length) {
                    java.lang.Class<?> cls2 = java.lang.Class.forName(split2[1]);
                    java.lang.String[] split3 = split[i17].split("\\|");
                    java.lang.reflect.Field declaredField2 = cls2.getDeclaredField(split3[0]);
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(obj);
                    i17++;
                    split2 = split3;
                }
                return y06Var.f390688f.equals(obj);
            }
        }
        return false;
    }
}
