package androidx.media;

/* loaded from: classes15.dex */
public abstract class MediaBrowserServiceCompat extends android.app.Service {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11701m = 0;

    /* renamed from: d, reason: collision with root package name */
    public c4.o f11702d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.n f11703e = new c4.n(this, "android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f11704f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final x.b f11705g = new x.b();

    /* renamed from: h, reason: collision with root package name */
    public final c4.n0 f11706h = new c4.n0(this);

    /* renamed from: i, reason: collision with root package name */
    public android.support.v4.media.session.MediaSessionCompat$Token f11707i;

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

    public void d(android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.f11707i != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.f11707i = mediaSessionCompat$Token;
        c4.s sVar = (c4.s) this.f11702d;
        sVar.f38341d.f11706h.a(new c4.p(sVar, mediaSessionCompat$Token));
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return ((c4.s) this.f11702d).f38339b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            this.f11702d = new c4.y(this);
        } else if (i17 >= 26) {
            this.f11702d = new c4.x(this);
        } else {
            this.f11702d = new c4.u(this);
        }
        this.f11702d.onCreate();
    }
}
