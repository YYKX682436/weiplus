package android.support.v4.media.session;

/* loaded from: classes15.dex */
public abstract class y implements android.support.v4.media.session.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaSession f8999a;

    /* renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.MediaSessionCompat$Token f9000b;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f9002d;

    /* renamed from: g, reason: collision with root package name */
    public android.support.v4.media.session.PlaybackStateCompat f9005g;

    /* renamed from: h, reason: collision with root package name */
    public android.support.v4.media.MediaMetadataCompat f9006h;

    /* renamed from: i, reason: collision with root package name */
    public android.support.v4.media.session.v f9007i;

    /* renamed from: j, reason: collision with root package name */
    public c4.o0 f9008j;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f9001c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f9003e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.RemoteCallbackList f9004f = new android.os.RemoteCallbackList();

    public y(android.content.Context context, java.lang.String str, w4.e eVar, android.os.Bundle bundle) {
        android.media.session.MediaSession e17 = e(context, str, bundle);
        this.f8999a = e17;
        this.f9000b = new android.support.v4.media.session.MediaSessionCompat$Token(e17.getSessionToken(), new android.support.v4.media.session.x(this), eVar);
        this.f9002d = bundle;
        e17.setFlags(3);
    }

    @Override // android.support.v4.media.session.w
    public void a(android.support.v4.media.session.v vVar, android.os.Handler handler) {
        synchronized (this.f9001c) {
            this.f9007i = vVar;
            this.f8999a.setCallback(vVar == null ? null : vVar.f8994b, handler);
            if (vVar != null) {
                vVar.k(this, handler);
            }
        }
    }

    @Override // android.support.v4.media.session.w
    public void b(c4.o0 o0Var) {
        synchronized (this.f9001c) {
            this.f9008j = o0Var;
        }
    }

    @Override // android.support.v4.media.session.w
    public android.support.v4.media.session.MediaSessionCompat$Token c() {
        return this.f9000b;
    }

    @Override // android.support.v4.media.session.w
    public c4.o0 d() {
        c4.o0 o0Var;
        synchronized (this.f9001c) {
            o0Var = this.f9008j;
        }
        return o0Var;
    }

    public android.media.session.MediaSession e(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return new android.media.session.MediaSession(context, str);
    }

    public void f(android.app.PendingIntent pendingIntent) {
        this.f8999a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // android.support.v4.media.session.w
    public android.support.v4.media.session.v getCallback() {
        android.support.v4.media.session.v vVar;
        synchronized (this.f9001c) {
            vVar = this.f9007i;
        }
        return vVar;
    }

    @Override // android.support.v4.media.session.w
    public java.lang.String getCallingPackage() {
        android.media.session.MediaSession mediaSession = this.f8999a;
        try {
            return (java.lang.String) mediaSession.getClass().getMethod("getCallingPackage", new java.lang.Class[0]).invoke(mediaSession, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.support.v4.media.session.w
    public android.support.v4.media.session.PlaybackStateCompat t() {
        return this.f9005g;
    }
}
