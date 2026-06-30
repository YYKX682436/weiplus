package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class n4 {
    public n4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        try {
            if (!p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92220w) {
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92220w = true;
                if (android.os.Build.VERSION.SDK_INT < 28) {
                    p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92218u = android.view.View.class.getDeclaredMethod("updateDisplayListIfDirty", new java.lang.Class[0]);
                    p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92219v = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92218u = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(android.view.View.class, "updateDisplayListIfDirty", new java.lang.Class[0]);
                    p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92219v = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.view.View.class, "mRecreateDisplayList");
                }
                java.lang.reflect.Method method = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92218u;
                if (method != null) {
                    method.setAccessible(true);
                }
                java.lang.reflect.Field field = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92219v;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            java.lang.reflect.Field field2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92219v;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            java.lang.reflect.Method method2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92218u;
            if (method2 != null) {
                method2.invoke(view, new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable unused) {
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4.f92221x = true;
        }
    }
}
