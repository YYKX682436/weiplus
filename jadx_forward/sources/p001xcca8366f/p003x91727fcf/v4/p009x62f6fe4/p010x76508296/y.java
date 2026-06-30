package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public abstract class y implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.session.MediaSession f90532a;

    /* renamed from: b, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 f90533b;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f90535d;

    /* renamed from: g, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 f90538g;

    /* renamed from: h, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 f90539h;

    /* renamed from: i, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v f90540i;

    /* renamed from: j, reason: collision with root package name */
    public c4.o0 f90541j;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f90534c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f90536e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.RemoteCallbackList f90537f = new android.os.RemoteCallbackList();

    public y(android.content.Context context, java.lang.String str, w4.e eVar, android.os.Bundle bundle) {
        android.media.session.MediaSession e17 = e(context, str, bundle);
        this.f90532a = e17;
        this.f90533b = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989(e17.getSessionToken(), new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.x(this), eVar);
        this.f90535d = bundle;
        e17.setFlags(3);
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    public void a(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar, android.os.Handler handler) {
        synchronized (this.f90534c) {
            this.f90540i = vVar;
            this.f90532a.setCallback(vVar == null ? null : vVar.f90527b, handler);
            if (vVar != null) {
                vVar.k(this, handler);
            }
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    public void b(c4.o0 o0Var) {
        synchronized (this.f90534c) {
            this.f90541j = o0Var;
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c() {
        return this.f90533b;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    public c4.o0 d() {
        c4.o0 o0Var;
        synchronized (this.f90534c) {
            o0Var = this.f90541j;
        }
        return o0Var;
    }

    public android.media.session.MediaSession e(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return new android.media.session.MediaSession(context, str);
    }

    public void f(android.app.PendingIntent pendingIntent) {
        this.f90532a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    /* renamed from: getCallback */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v mo2492x71965dbb() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar;
        synchronized (this.f90534c) {
            vVar = this.f90540i;
        }
        return vVar;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    /* renamed from: getCallingPackage */
    public java.lang.String mo2493x9cad5bd8() {
        android.media.session.MediaSession mediaSession = this.f90532a;
        try {
            return (java.lang.String) mediaSession.getClass().getMethod("getCallingPackage", new java.lang.Class[0]).invoke(mediaSession, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 t() {
        return this.f90538g;
    }
}
