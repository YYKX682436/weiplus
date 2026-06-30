package zh1;

/* loaded from: classes8.dex */
public abstract class w {
    public static final boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static final void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!a(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.OpenMaterial.Commons", "notifyChangeFixed, context is invalid, why?");
            return;
        }
        try {
            k0Var.j();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.OpenMaterial.Commons", e17, "notifyChangeFixed, fail", new java.lang.Object[0]);
        }
    }
}
