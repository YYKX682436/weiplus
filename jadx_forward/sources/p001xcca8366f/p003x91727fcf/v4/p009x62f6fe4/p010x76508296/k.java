package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes11.dex */
public class k implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaController f90509a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f90510b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f90511c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f90512d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 f90513e;

    public k(android.content.Context context, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar;
        this.f90513e = c0047xab30f989;
        android.media.session.MediaController mediaController = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) c0047xab30f989.f90477e);
        this.f90509a = mediaController;
        synchronized (c0047xab30f989.f90476d) {
            fVar = c0047xab30f989.f90478f;
        }
        if (fVar == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new android.os.ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.ref.WeakReference f90472d;

                {
                    super(null);
                    this.f90472d = new java.lang.ref.WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k kVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k) this.f90472d.get();
                    if (kVar == null || bundle == null) {
                        return;
                    }
                    synchronized (kVar.f90510b) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f9892 = kVar.f90513e;
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f d17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.d(j3.e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        synchronized (c0047xab30f9892.f90476d) {
                            c0047xab30f9892.f90478f = d17;
                        }
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f9893 = kVar.f90513e;
                        w4.e eVar = null;
                        try {
                            android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(w4.b.class.getClassLoader());
                                android.os.Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof p012xc85e97e9.p113x8afc139a.C1187xee9e85e9)) {
                                    throw new java.lang.IllegalArgumentException("Invalid parcel");
                                }
                                eVar = ((p012xc85e97e9.p113x8afc139a.C1187xee9e85e9) parcelable).f93934d;
                            }
                        } catch (java.lang.RuntimeException unused) {
                        }
                        synchronized (c0047xab30f9893.f90476d) {
                            c0047xab30f9893.f90479g = eVar;
                        }
                        kVar.a();
                    }
                }
            });
        }
    }

    public void a() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = this.f90513e;
        synchronized (c0047xab30f989.f90476d) {
            fVar = c0047xab30f989.f90478f;
        }
        if (fVar == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f90511c;
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        this.f90512d.put(null, new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j(null));
        throw null;
    }
}
