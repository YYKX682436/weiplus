package mt5;

/* loaded from: classes8.dex */
public class r implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f412865a = new java.util.concurrent.atomic.AtomicReference();

    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        java.lang.String str;
        synchronized (this.f412865a) {
            if (this.f412865a.get() == null) {
                try {
                    java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName("android.app.ZteDeviceIdentifyManager").getDeclaredConstructor(android.content.Context.class);
                    declaredConstructor.setAccessible(true);
                    this.f412865a.set(declaredConstructor.newInstance(context));
                } catch (java.lang.Throwable unused) {
                    return new lt5.f(null, -10);
                }
            }
        }
        java.lang.Object obj = this.f412865a.get();
        if (obj == null) {
            return new lt5.f(null, -10);
        }
        try {
            str = (java.lang.String) obj.getClass().getMethod(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused2) {
            str = null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            return new lt5.f(str, 0);
        }
        try {
            str = (java.lang.String) obj.getClass().getMethod(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, android.content.Context.class).invoke(obj, context);
        } catch (java.lang.Throwable unused3) {
        }
        return !android.text.TextUtils.isEmpty(str) ? new lt5.f(str, 0) : new lt5.f(null, -10);
    }
}
