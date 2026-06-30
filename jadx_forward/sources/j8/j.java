package j8;

/* loaded from: classes15.dex */
public class j implements j8.b {

    /* renamed from: f, reason: collision with root package name */
    public static final android.content.IntentFilter f379645f = new android.content.IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a, reason: collision with root package name */
    public final j8.k f379646a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f379647b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.a f379648c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.BroadcastReceiver f379649d;

    /* renamed from: e, reason: collision with root package name */
    public j8.h f379650e = null;

    public j(j8.k kVar, android.content.Context context, j8.a aVar) {
        this.f379646a = kVar;
        this.f379647b = context;
        this.f379648c = aVar;
    }

    @Override // j8.b
    public void a() {
        if (this.f379649d != null) {
            return;
        }
        j8.i iVar = new j8.i(this);
        this.f379649d = iVar;
        this.f379647b.registerReceiver(iVar, f379645f);
        j8.h a17 = this.f379646a.a();
        this.f379650e = a17;
        this.f379648c.a(a17);
    }

    @Override // j8.b
    public void b() {
        android.content.BroadcastReceiver broadcastReceiver = this.f379649d;
        if (broadcastReceiver == null) {
            return;
        }
        this.f379647b.unregisterReceiver(broadcastReceiver);
        this.f379649d = null;
    }
}
