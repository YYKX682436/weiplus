package d85;

/* loaded from: classes12.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308763a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308764b;

    /* renamed from: c, reason: collision with root package name */
    public final d85.m1 f308765c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.IBinder f308766d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.IBinder f308767e;

    /* renamed from: f, reason: collision with root package name */
    public d85.l1 f308768f;

    public o1(java.lang.String str, java.lang.String str2, d85.m1 m1Var) {
        this.f308763a = str;
        this.f308764b = str2;
        this.f308765c = m1Var;
    }

    public final jz5.l a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doHook: serviceName:");
        java.lang.String str = this.f308763a;
        sb6.append(str);
        sb6.append(", serviceClsName:");
        java.lang.String str2 = this.f308764b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SystemServiceBinderHooker", sb6.toString());
        try {
            d85.l1 l1Var = new d85.l1(str, str2, this.f308765c);
            this.f308768f = l1Var;
            if (l1Var.f308748a != null) {
                d85.l1 l1Var2 = this.f308768f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var2);
                if (l1Var2.f308749b != null) {
                    d85.l1 l1Var3 = this.f308768f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var3);
                    android.os.IBinder a17 = l1Var3.a();
                    java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
                    declaredField.setAccessible(true);
                    java.lang.Object obj = declaredField.get(null);
                    java.util.Map map = p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(obj) ? (java.util.Map) obj : null;
                    if (map != null) {
                        map.remove(str);
                        map.put(str, a17);
                    }
                    this.f308767e = a17;
                    d85.l1 l1Var4 = this.f308768f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var4);
                    this.f308766d = l1Var4.f308748a;
                    return new jz5.l(java.lang.Boolean.TRUE, "");
                }
            }
            return new jz5.l(java.lang.Boolean.FALSE, "get origin binder failed");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SystemServiceBinderHooker", "#doHook exp: " + th6.getMessage(), new java.lang.Object[0]);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.String message = th6.getMessage();
            return new jz5.l(bool, message != null ? message : "");
        }
    }
}
