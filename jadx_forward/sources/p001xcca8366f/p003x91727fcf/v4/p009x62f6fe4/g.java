package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public abstract class g implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.j, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f90459a;

    /* renamed from: b, reason: collision with root package name */
    public final android.media.browse.MediaBrowser f90460b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f90461c;

    /* renamed from: d, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.a f90462d = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.a(this);

    /* renamed from: e, reason: collision with root package name */
    public final x.b f90463e = new x.b();

    /* renamed from: f, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.l f90464f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Messenger f90465g;

    /* renamed from: h, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 f90466h;

    public g(android.content.Context context, android.content.ComponentName componentName, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d dVar, android.os.Bundle bundle) {
        this.f90459a = context;
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        this.f90461c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", android.os.Process.myPid());
        dVar.f90458b = this;
        this.f90460b = new android.media.browse.MediaBrowser(context, componentName, dVar.f90457a, bundle2);
    }
}
