package c4;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f38292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38293g;

    public f0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.support.v4.os.ResultReceiver resultReceiver) {
        this.f38293g = k0Var;
        this.f38290d = l0Var;
        this.f38291e = str;
        this.f38292f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38290d).a();
        c4.k0 k0Var = this.f38293g;
        if (((c4.n) k0Var.f38317a.f11705g.getOrDefault(a17, null)) == null) {
            return;
        }
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = k0Var.f38317a;
        mediaBrowserServiceCompat.getClass();
        java.lang.String str = this.f38291e;
        c4.j jVar = new c4.j(mediaBrowserServiceCompat, str, this.f38292f);
        jVar.f38352d = 2;
        jVar.d(null);
        if (jVar.b()) {
            return;
        }
        throw new java.lang.IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }
}
