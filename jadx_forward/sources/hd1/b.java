package hd1;

/* loaded from: classes7.dex */
public abstract class b implements hd1.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m2 f361918a;

    /* renamed from: b, reason: collision with root package name */
    public volatile yz5.q f361919b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f361920c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f361921d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f361922e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.rw.p1100x625ef5e.C12195x56da078f f361923f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1, android.content.BroadcastReceiver] */
    public b(java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m2 activityProvider) {
        android.content.Context applicationContext;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityProvider, "activityProvider");
        this.f361918a = activityProvider;
        this.f361920c = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        this.f361921d = new java.util.concurrent.atomic.AtomicBoolean(false);
        ?? r07 = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is null");
                    return;
                }
                int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
                if (-1 == intExtra) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is invalid");
                    return;
                }
                boolean z17 = 3 == intExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, isNFCEnabled: " + z17);
                if (z17) {
                    return;
                }
                hd1.b bVar = hd1.b.this;
                bVar.f361921d.set(false);
                bVar.f361922e = false;
            }
        };
        this.f361923f = r07;
        android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) activityProvider).a();
        if (a17 != null && (applicationContext = a17.getApplicationContext()) != 0) {
            applicationContext.registerReceiver(r07, new android.content.IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(appId, new hd1.a(this));
    }
}
