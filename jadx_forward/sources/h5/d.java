package h5;

/* loaded from: classes13.dex */
public abstract class d extends h5.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f360515h = a5.a0.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final android.content.BroadcastReceiver f360516g;

    public d(android.content.Context context, m5.a aVar) {
        super(context, aVar);
        this.f360516g = new h5.c(this);
    }

    @Override // h5.f
    public void c() {
        a5.a0.c().a(f360515h, java.lang.String.format("%s: registering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.f360521b.registerReceiver(this.f360516g, e());
    }

    @Override // h5.f
    public void d() {
        a5.a0.c().a(f360515h, java.lang.String.format("%s: unregistering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.f360521b.unregisterReceiver(this.f360516g);
    }

    public abstract android.content.IntentFilter e();

    public abstract void f(android.content.Context context, android.content.Intent intent);
}
