package android.support.v4.media;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8936b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.e f8937a;

    static {
        android.util.Log.isLoggable("MediaBrowserCompat", 3);
    }

    public m(android.content.Context context, android.content.ComponentName componentName, android.support.v4.media.d dVar, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.f8937a = new android.support.v4.media.i(context, componentName, dVar, bundle);
        } else {
            this.f8937a = new android.support.v4.media.h(context, componentName, dVar, bundle);
        }
    }

    public void a() {
        android.os.Messenger messenger;
        android.support.v4.media.g gVar = (android.support.v4.media.g) this.f8937a;
        android.support.v4.media.l lVar = gVar.f8931f;
        if (lVar != null && (messenger = gVar.f8932g) != null) {
            try {
                lVar.a(7, null, messenger);
            } catch (android.os.RemoteException unused) {
            }
        }
        gVar.f8927b.disconnect();
    }

    public android.support.v4.media.session.MediaSessionCompat$Token b() {
        android.support.v4.media.g gVar = (android.support.v4.media.g) this.f8937a;
        if (gVar.f8933h == null) {
            android.media.session.MediaSession.Token sessionToken = gVar.f8927b.getSessionToken();
            gVar.f8933h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, null, null) : null;
        }
        return gVar.f8933h;
    }
}
