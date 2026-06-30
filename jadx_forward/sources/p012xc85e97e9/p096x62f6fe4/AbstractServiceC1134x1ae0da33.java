package p012xc85e97e9.p096x62f6fe4;

/* renamed from: androidx.media.MediaBrowserServiceCompat */
/* loaded from: classes15.dex */
public abstract class AbstractServiceC1134x1ae0da33 extends android.app.Service {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93234m = 0;

    /* renamed from: d, reason: collision with root package name */
    public c4.o f93235d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.n f93236e = new c4.n(this, "android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f93237f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final x.b f93238g = new x.b();

    /* renamed from: h, reason: collision with root package name */
    public final c4.n0 f93239h = new c4.n0(this);

    /* renamed from: i, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 f93240i;

    static {
        android.util.Log.isLoggable("MBServiceCompat", 3);
    }

    public java.util.List a(java.util.List list, android.os.Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i17 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i18 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i17 == -1 && i18 == -1) {
            return list;
        }
        int i19 = i18 * i17;
        int i27 = i19 + i18;
        if (i17 < 0 || i18 < 1 || i19 >= list.size()) {
            return java.util.Collections.emptyList();
        }
        if (i27 > list.size()) {
            i27 = list.size();
        }
        return list.subList(i19, i27);
    }

    public abstract c4.l b(java.lang.String str, int i17, android.os.Bundle bundle);

    public abstract void c(java.lang.String str, c4.z zVar);

    public void d(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989) {
        if (c0047xab30f989 == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.f93240i != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.f93240i = c0047xab30f989;
        c4.s sVar = (c4.s) this.f93235d;
        sVar.f119874d.f93239h.a(new c4.p(sVar, c0047xab30f989));
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return ((c4.s) this.f93235d).f119872b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            this.f93235d = new c4.y(this);
        } else if (i17 >= 26) {
            this.f93235d = new c4.x(this);
        } else {
            this.f93235d = new c4.u(this);
        }
        this.f93235d.mo14111x3e5a77bb();
    }
}
