package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class n4 {
    public n4(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        try {
            if (!androidx.compose.ui.platform.p4.f10687w) {
                androidx.compose.ui.platform.p4.f10687w = true;
                if (android.os.Build.VERSION.SDK_INT < 28) {
                    androidx.compose.ui.platform.p4.f10685u = android.view.View.class.getDeclaredMethod("updateDisplayListIfDirty", new java.lang.Class[0]);
                    androidx.compose.ui.platform.p4.f10686v = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    androidx.compose.ui.platform.p4.f10685u = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(android.view.View.class, "updateDisplayListIfDirty", new java.lang.Class[0]);
                    androidx.compose.ui.platform.p4.f10686v = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.view.View.class, "mRecreateDisplayList");
                }
                java.lang.reflect.Method method = androidx.compose.ui.platform.p4.f10685u;
                if (method != null) {
                    method.setAccessible(true);
                }
                java.lang.reflect.Field field = androidx.compose.ui.platform.p4.f10686v;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            java.lang.reflect.Field field2 = androidx.compose.ui.platform.p4.f10686v;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            java.lang.reflect.Method method2 = androidx.compose.ui.platform.p4.f10685u;
            if (method2 != null) {
                method2.invoke(view, new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable unused) {
            androidx.compose.ui.platform.p4.f10688x = true;
        }
    }
}
