package xx1;

/* loaded from: classes7.dex */
public class c implements vx1.f {
    public static java.lang.reflect.Field c(xx1.c cVar, java.lang.Class cls, java.lang.String str) {
        cVar.getClass();
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Field) declaredMethod.invoke(cls, str);
    }

    @Override // vx1.f
    public boolean a(int i17) {
        return (i17 == 29 || i17 == 30) && d();
    }

    @Override // vx1.f
    public boolean b() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "hook start");
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager.class.getDeclaredMethod("getInputContext", new java.lang.Class[0]).setAccessible(true);
            java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mService");
            declaredField.setAccessible(true);
            try {
                java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetTextBeforeCursorFix", e17.getMessage());
            }
            java.lang.Object obj = declaredField.get(inputMethodManager);
            declaredField.set(inputMethodManager, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new xx1.b(this, obj)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "hook succ");
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetTextBeforeCursorFix", "hook fail");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetTextBeforeCursorFix", e18, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean d() {
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "get clicfg_inputconnection_protect error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetTextBeforeCursorFix", e17, "", new java.lang.Object[0]);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_inputconnection_protect", "0", false, true), 0) > 0;
    }
}
