package t26;

/* loaded from: classes14.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f496887a = 0;

    /* renamed from: choreographer */
    private static volatile android.view.Choreographer f76774x4f0c8689;

    static {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new t26.a(a(android.os.Looper.getMainLooper(), true), null, 2, null));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public static final android.os.Handler a(android.os.Looper looper, boolean z17) {
        if (!z17) {
            return new android.os.Handler(looper);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
            } catch (java.lang.NoSuchMethodException unused) {
                return new android.os.Handler(looper);
            }
        }
        java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (android.os.Handler) invoke;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }

    public static t26.d b(android.os.Handler handler, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        return new t26.a(handler, str, false);
    }
}
