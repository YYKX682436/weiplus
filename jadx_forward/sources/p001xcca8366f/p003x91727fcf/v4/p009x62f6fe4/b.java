package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public class b extends android.media.browse.MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d f90456a;

    public b(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar) {
        this.f90456a = dVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar = this.f90456a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.c cVar = dVar.f90458b;
        if (cVar != null) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g gVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) cVar;
            android.media.browse.MediaBrowser mediaBrowser = gVar.f90460b;
            try {
                android.os.Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    android.os.IBinder a17 = j3.e.a(extras, "extra_messenger");
                    if (a17 != null) {
                        gVar.f90464f = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.l(a17, gVar.f90461c);
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.a aVar = gVar.f90462d;
                        android.os.Messenger messenger = new android.os.Messenger(aVar);
                        gVar.f90465g = messenger;
                        aVar.getClass();
                        aVar.f90455b = new java.lang.ref.WeakReference(messenger);
                        try {
                            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.l lVar = gVar.f90464f;
                            android.content.Context context = gVar.f90459a;
                            android.os.Messenger messenger2 = gVar.f90465g;
                            lVar.getClass();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", android.os.Process.myPid());
                            bundle.putBundle("data_root_hints", lVar.f90468b);
                            lVar.a(6, bundle, messenger2);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f d17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.d(j3.e.a(extras, "extra_session_binder"));
                    if (d17 != null) {
                        android.media.session.MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        gVar.f90466h = sessionToken != null ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989(sessionToken, d17, null) : null;
                    }
                }
            } catch (java.lang.IllegalStateException unused2) {
            }
        }
        dVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar = this.f90456a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.c cVar = dVar.f90458b;
        if (cVar != null) {
            cVar.getClass();
        }
        dVar.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar = this.f90456a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.c cVar = dVar.f90458b;
        if (cVar != null) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g gVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) cVar;
            gVar.f90464f = null;
            gVar.f90465g = null;
            gVar.f90466h = null;
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.a aVar = gVar.f90462d;
            aVar.getClass();
            aVar.f90455b = new java.lang.ref.WeakReference(null);
        }
        dVar.c();
    }
}
