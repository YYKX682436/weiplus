package android.support.v4.media;

/* loaded from: classes11.dex */
public abstract class g implements android.support.v4.media.e, android.support.v4.media.j, android.support.v4.media.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.browse.MediaBrowser f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f8928c;

    /* renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.a f8929d = new android.support.v4.media.a(this);

    /* renamed from: e, reason: collision with root package name */
    public final x.b f8930e = new x.b();

    /* renamed from: f, reason: collision with root package name */
    public android.support.v4.media.l f8931f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Messenger f8932g;

    /* renamed from: h, reason: collision with root package name */
    public android.support.v4.media.session.MediaSessionCompat$Token f8933h;

    public g(android.content.Context context, android.content.ComponentName componentName, android.support.v4.media.d dVar, android.os.Bundle bundle) {
        this.f8926a = context;
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        this.f8928c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", android.os.Process.myPid());
        dVar.f8925b = this;
        this.f8927b = new android.media.browse.MediaBrowser(context, componentName, dVar.f8924a, bundle2);
    }
}
