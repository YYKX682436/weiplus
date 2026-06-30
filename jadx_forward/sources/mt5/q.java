package mt5;

/* loaded from: classes8.dex */
public class q implements lt5.a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Object f412861c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Class f412862d;

    /* renamed from: a, reason: collision with root package name */
    public int f412863a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f412864b = "";

    @Override // lt5.a
    public synchronized lt5.f a(android.content.Context context) {
        this.f412863a = 0;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.id.impl.IdProviderImpl");
            f412862d = cls;
            try {
                f412861c = cls.newInstance();
                try {
                    java.lang.reflect.Method method = f412862d.getMethod(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, android.content.Context.class);
                    java.lang.Object obj = f412861c;
                    if (obj != null && method != null) {
                        try {
                            java.lang.Object invoke = method.invoke(obj, context);
                            if (invoke != null) {
                                this.f412864b = (java.lang.String) invoke;
                            } else {
                                this.f412863a = -305;
                            }
                        } catch (java.lang.Throwable unused) {
                            this.f412863a = -306;
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                    return lt5.f.a(-304);
                }
            } catch (java.lang.IllegalAccessException unused3) {
                return lt5.f.a(org.p3343x72743996.net.InterfaceC29524x4f65168b.f74009xff6d24fe);
            } catch (java.lang.InstantiationException unused4) {
                return lt5.f.a(org.p3343x72743996.net.InterfaceC29524x4f65168b.f74106x1ce5b704);
            }
        } catch (java.lang.Throwable unused5) {
            return lt5.f.a(org.p3343x72743996.net.InterfaceC29524x4f65168b.f73946xa652ff20);
        }
        return new lt5.f(this.f412864b, this.f412863a);
    }
}
