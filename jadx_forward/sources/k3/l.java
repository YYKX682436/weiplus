package k3;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final x.g f385330a = new x.g(16);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f385331b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f385332c;

    /* renamed from: d, reason: collision with root package name */
    public static final x.n f385333d;

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new k3.q("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f385331b = threadPoolExecutor;
        f385332c = new java.lang.Object();
        f385333d = new x.n();
    }

    public static k3.k a(java.lang.String str, android.content.Context context, k3.f fVar, int i17) {
        int i18;
        x.g gVar = f385330a;
        android.graphics.Typeface typeface = (android.graphics.Typeface) gVar.get(str);
        if (typeface != null) {
            return new k3.k(typeface);
        }
        try {
            k3.m a17 = k3.d.a(context, fVar, null);
            int i19 = 1;
            k3.n[] nVarArr = a17.f385335b;
            int i27 = a17.f385334a;
            if (i27 != 0) {
                if (i27 == 1) {
                    i18 = -2;
                }
                i18 = -3;
            } else {
                if (nVarArr != null && nVarArr.length != 0) {
                    i19 = 0;
                    for (k3.n nVar : nVarArr) {
                        int i28 = nVar.f385340e;
                        if (i28 != 0) {
                            if (i28 >= 0) {
                                i18 = i28;
                            }
                            i18 = -3;
                        }
                    }
                }
                i18 = i19;
            }
            if (i18 != 0) {
                return new k3.k(i18);
            }
            android.graphics.Typeface b17 = e3.h.f328584a.b(context, null, nVarArr, i17);
            if (b17 == null) {
                return new k3.k(-3);
            }
            gVar.put(str, b17);
            return new k3.k(b17);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new k3.k(-1);
        }
    }
}
