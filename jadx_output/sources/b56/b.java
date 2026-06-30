package b56;

/* loaded from: classes13.dex */
public class b implements android.os.Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final b56.b f18114f = new b56.b();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f18116e = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f18115d = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        android.app.FragmentManager fragmentManager = (android.app.FragmentManager) message.obj;
        boolean isDestroyed = fragmentManager.isDestroyed();
        java.util.Map map = this.f18116e;
        if (!isDestroyed) {
            ((java.util.HashMap) map).get(fragmentManager);
        }
        ((java.util.HashMap) map).remove(fragmentManager);
        return true;
    }
}
