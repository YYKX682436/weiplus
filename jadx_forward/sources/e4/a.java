package e4;

/* loaded from: classes11.dex */
public class a extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f329131c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f329132d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.BroadcastReceiver.PendingResult f329133e;

    /* renamed from: f, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m f329134f;

    public a(android.content.Context context, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f329131c = context;
        this.f329132d = intent;
        this.f329133e = pendingResult;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void a() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17 = this.f329134f.b();
        new java.util.concurrent.ConcurrentHashMap();
        if (b17 == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k kVar = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k(this.f329131c, b17);
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) this.f329132d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
        }
        kVar.f90509a.dispatchMediaButtonEvent(keyEvent);
        this.f329134f.a();
        this.f329133e.finish();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void b() {
        this.f329134f.a();
        this.f329133e.finish();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.d
    public void c() {
        this.f329134f.a();
        this.f329133e.finish();
    }
}
