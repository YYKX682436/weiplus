package c4;

/* loaded from: classes15.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f38309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38310g;

    public i0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, android.os.Bundle bundle, android.support.v4.os.ResultReceiver resultReceiver) {
        this.f38310g = k0Var;
        this.f38307d = l0Var;
        this.f38308e = str;
        this.f38309f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38307d).a();
        c4.k0 k0Var = this.f38310g;
        if (((c4.n) k0Var.f38317a.f11705g.getOrDefault(a17, null)) == null) {
            return;
        }
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = k0Var.f38317a;
        mediaBrowserServiceCompat.getClass();
        java.lang.String str = this.f38308e;
        c4.k kVar = new c4.k(mediaBrowserServiceCompat, str, this.f38309f);
        kVar.f38352d = 4;
        kVar.d(null);
        if (kVar.b()) {
            return;
        }
        throw new java.lang.IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }
}
