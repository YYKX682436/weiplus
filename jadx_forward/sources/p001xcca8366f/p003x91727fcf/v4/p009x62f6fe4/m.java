package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f90469b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.e f90470a;

    static {
        android.util.Log.isLoggable("MediaBrowserCompat", 3);
    }

    public m(android.content.Context context, android.content.ComponentName componentName, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f90470a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.i(context, componentName, dVar, bundle);
        } else {
            this.f90470a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.h(context, componentName, dVar, bundle);
        }
    }

    public void a() {
        android.os.Messenger messenger;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g gVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) this.f90470a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.l lVar = gVar.f90464f;
        if (lVar != null && (messenger = gVar.f90465g) != null) {
            try {
                lVar.a(7, null, messenger);
            } catch (android.os.RemoteException unused) {
            }
        }
        gVar.f90460b.disconnect();
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g gVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) this.f90470a;
        if (gVar.f90466h == null) {
            android.media.session.MediaSession.Token sessionToken = gVar.f90460b.getSessionToken();
            gVar.f90466h = sessionToken != null ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989(sessionToken, null, null) : null;
        }
        return gVar.f90466h;
    }
}
