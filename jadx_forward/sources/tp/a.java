package tp;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.view.WindowManager a(android.view.WindowManager windowManager) {
        android.view.WindowManager windowManager2 = (android.view.WindowManager) java.lang.reflect.Proxy.newProxyInstance(windowManager.getClass().getClassLoader(), windowManager.getClass().getInterfaces(), new tp.b(windowManager));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SafeWindowManager", "proxy");
        return windowManager2;
    }
}
