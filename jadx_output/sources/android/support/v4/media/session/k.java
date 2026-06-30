package android.support.v4.media.session;

/* loaded from: classes11.dex */
public class k implements android.support.v4.media.session.i {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaController f8976a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f8977b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f8978c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f8979d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.support.v4.media.session.MediaSessionCompat$Token f8980e;

    public k(android.content.Context context, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        android.support.v4.media.session.f fVar;
        this.f8980e = mediaSessionCompat$Token;
        android.media.session.MediaController mediaController = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) mediaSessionCompat$Token.f8944e);
        this.f8976a = mediaController;
        synchronized (mediaSessionCompat$Token.f8943d) {
            fVar = mediaSessionCompat$Token.f8945f;
        }
        if (fVar == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new android.os.ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.ref.WeakReference f8939d;

                {
                    super(null);
                    this.f8939d = new java.lang.ref.WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    android.support.v4.media.session.k kVar = (android.support.v4.media.session.k) this.f8939d.get();
                    if (kVar == null || bundle == null) {
                        return;
                    }
                    synchronized (kVar.f8977b) {
                        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token2 = kVar.f8980e;
                        android.support.v4.media.session.f d17 = android.support.v4.media.session.e.d(j3.e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        synchronized (mediaSessionCompat$Token2.f8943d) {
                            mediaSessionCompat$Token2.f8945f = d17;
                        }
                        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token3 = kVar.f8980e;
                        w4.e eVar = null;
                        try {
                            android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(w4.b.class.getClassLoader());
                                android.os.Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof androidx.versionedparcelable.ParcelImpl)) {
                                    throw new java.lang.IllegalArgumentException("Invalid parcel");
                                }
                                eVar = ((androidx.versionedparcelable.ParcelImpl) parcelable).f12401d;
                            }
                        } catch (java.lang.RuntimeException unused) {
                        }
                        synchronized (mediaSessionCompat$Token3.f8943d) {
                            mediaSessionCompat$Token3.f8946g = eVar;
                        }
                        kVar.a();
                    }
                }
            });
        }
    }

    public void a() {
        android.support.v4.media.session.f fVar;
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = this.f8980e;
        synchronized (mediaSessionCompat$Token.f8943d) {
            fVar = mediaSessionCompat$Token.f8945f;
        }
        if (fVar == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f8978c;
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            return;
        }
        android.support.v4.media.f.a(it.next());
        this.f8979d.put(null, new android.support.v4.media.session.j(null));
        throw null;
    }
}
