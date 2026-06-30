package r75;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474785d;

    public b(android.content.Context context) {
        this.f474785d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final android.content.Context context = this.f474785d;
        context.registerReceiver(new android.content.BroadcastReceiver() { // from class: com.tencent.mm.sdk.systemservicecache.NetworkCache$initCache$1$1$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                ((ku5.t0) ku5.t0.f394148d).h(new r75.a(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            }
        }, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be));
    }
}
