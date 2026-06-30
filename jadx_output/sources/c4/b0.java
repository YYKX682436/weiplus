package c4;

/* loaded from: classes15.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38268h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38269i;

    public b0(c4.k0 k0Var, c4.l0 l0Var, java.lang.String str, int i17, int i18, android.os.Bundle bundle) {
        this.f38269i = k0Var;
        this.f38264d = l0Var;
        this.f38265e = str;
        this.f38266f = i17;
        this.f38267g = i18;
        this.f38268h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.l0 l0Var = this.f38264d;
        android.os.IBinder a17 = ((c4.m0) l0Var).a();
        c4.k0 k0Var = this.f38269i;
        k0Var.f38317a.f11705g.remove(a17);
        c4.n nVar = new c4.n(k0Var.f38317a, this.f38265e, this.f38266f, this.f38267g, this.f38268h, this.f38264d);
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = k0Var.f38317a;
        mediaBrowserServiceCompat.getClass();
        nVar.f38327i = mediaBrowserServiceCompat.b(this.f38265e, this.f38267g, this.f38268h);
        mediaBrowserServiceCompat.getClass();
        if (nVar.f38327i == null) {
            try {
                ((c4.m0) l0Var).c(2, null);
                return;
            } catch (android.os.RemoteException unused) {
                return;
            }
        }
        try {
            mediaBrowserServiceCompat.f11705g.put(a17, nVar);
            a17.linkToDeath(nVar, 0);
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = mediaBrowserServiceCompat.f11707i;
            if (mediaSessionCompat$Token != null) {
                c4.l lVar = nVar.f38327i;
                java.lang.String str = lVar.f38318a;
                android.os.Bundle bundle = lVar.f38319b;
                c4.m0 m0Var = (c4.m0) l0Var;
                m0Var.getClass();
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("data_media_item_id", str);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                m0Var.c(1, bundle2);
            }
        } catch (android.os.RemoteException unused2) {
            mediaBrowserServiceCompat.f11705g.remove(a17);
        }
    }
}
