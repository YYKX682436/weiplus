package android.support.v4.media;

/* loaded from: classes11.dex */
public class b extends android.media.browse.MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.d f8923a;

    public b(android.support.v4.media.d dVar) {
        this.f8923a = dVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        android.support.v4.media.d dVar = this.f8923a;
        android.support.v4.media.c cVar = dVar.f8925b;
        if (cVar != null) {
            android.support.v4.media.g gVar = (android.support.v4.media.g) cVar;
            android.media.browse.MediaBrowser mediaBrowser = gVar.f8927b;
            try {
                android.os.Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    android.os.IBinder a17 = j3.e.a(extras, "extra_messenger");
                    if (a17 != null) {
                        gVar.f8931f = new android.support.v4.media.l(a17, gVar.f8928c);
                        android.support.v4.media.a aVar = gVar.f8929d;
                        android.os.Messenger messenger = new android.os.Messenger(aVar);
                        gVar.f8932g = messenger;
                        aVar.getClass();
                        aVar.f8922b = new java.lang.ref.WeakReference(messenger);
                        try {
                            android.support.v4.media.l lVar = gVar.f8931f;
                            android.content.Context context = gVar.f8926a;
                            android.os.Messenger messenger2 = gVar.f8932g;
                            lVar.getClass();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", android.os.Process.myPid());
                            bundle.putBundle("data_root_hints", lVar.f8935b);
                            lVar.a(6, bundle, messenger2);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    android.support.v4.media.session.f d17 = android.support.v4.media.session.e.d(j3.e.a(extras, "extra_session_binder"));
                    if (d17 != null) {
                        android.media.session.MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        gVar.f8933h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, d17, null) : null;
                    }
                }
            } catch (java.lang.IllegalStateException unused2) {
            }
        }
        dVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        android.support.v4.media.d dVar = this.f8923a;
        android.support.v4.media.c cVar = dVar.f8925b;
        if (cVar != null) {
            cVar.getClass();
        }
        dVar.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        android.support.v4.media.d dVar = this.f8923a;
        android.support.v4.media.c cVar = dVar.f8925b;
        if (cVar != null) {
            android.support.v4.media.g gVar = (android.support.v4.media.g) cVar;
            gVar.f8931f = null;
            gVar.f8932g = null;
            gVar.f8933h = null;
            android.support.v4.media.a aVar = gVar.f8929d;
            aVar.getClass();
            aVar.f8922b = new java.lang.ref.WeakReference(null);
        }
        dVar.c();
    }
}
