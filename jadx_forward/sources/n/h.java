package n;

/* loaded from: classes7.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f414912f = {android.view.MenuItem.class};

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f414913d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f414914e;

    public h(java.lang.Object obj, java.lang.String str) {
        this.f414913d = obj;
        java.lang.Class<?> cls = obj.getClass();
        try {
            this.f414914e = cls.getMethod(str, f414912f);
        } catch (java.lang.Exception e17) {
            android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e17);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.reflect.Method method = this.f414914e;
        try {
            java.lang.Class<?> returnType = method.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.Object obj = this.f414913d;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
