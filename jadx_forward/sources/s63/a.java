package s63;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s63.b f484944d;

    public a(s63.b bVar) {
        this.f484944d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s63.b bVar = this.f484944d;
        bVar.getClass();
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
            java.lang.reflect.Method a17 = bVar.a(cls, "getInstance", new java.lang.Class[0]);
            a17.setAccessible(true);
            java.lang.Object invoke = a17.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Method a18 = bVar.a(cls, "trimMemory", new java.lang.Class[]{java.lang.Integer.TYPE});
            a18.setAccessible(true);
            a18.invoke(invoke, 80);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DangerousRelease", "clear succ!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DangerousRelease", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DangerousRelease", "clear fail!");
        }
        bVar.getClass();
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.Canvas");
            java.lang.reflect.Method a19 = bVar.a(cls2, "freeCaches", new java.lang.Class[0]);
            java.lang.reflect.Method a27 = bVar.a(cls2, "freeTextLayoutCaches", new java.lang.Class[0]);
            java.lang.reflect.Method a28 = bVar.a(java.lang.Class.forName("com.android.internal.os.BinderInternal"), "forceGc", new java.lang.Class[]{java.lang.String.class});
            a19.setAccessible(true);
            a27.setAccessible(true);
            a28.setAccessible(true);
            a19.invoke(null, new java.lang.Object[0]);
            a27.invoke(null, new java.lang.Object[0]);
            a28.invoke(null, "mem");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DangerousRelease", "triggerHandleLowMemory succ");
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DangerousRelease", e18, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DangerousRelease", "triggerHandleLowMemory fail!");
        }
    }
}
