package com.tencent.mm.modelstat;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes12.dex */
public class t0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final pq5.i f71585d = new pq5.i(new com.tencent.mm.modelstat.l0(this));

    /* renamed from: e, reason: collision with root package name */
    public final pq5.i f71586e = new pq5.i(new com.tencent.mm.modelstat.m0(this));

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f71587f = new com.tencent.mm.modelstat.o0(this);

    public static com.tencent.mm.modelstat.a0 Ai() {
        gm0.j1.b().c();
        return (com.tencent.mm.modelstat.a0) ((com.tencent.mm.modelstat.t0) i95.n0.c(com.tencent.mm.modelstat.t0.class)).f71585d.a();
    }

    public static com.tencent.mm.modelstat.p wi() {
        gm0.j1.b().c();
        return (com.tencent.mm.modelstat.p) ((com.tencent.mm.modelstat.t0) i95.n0.c(com.tencent.mm.modelstat.t0.class)).f71586e.a();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        u17.f273149b.v(new com.tencent.mm.modelstat.q0(this));
        gm0.j1.n().a(this.f71587f);
        c01.n8.f37348a = new com.tencent.mm.modelstat.s0(this);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        gm0.j1.n().d(this.f71587f);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        gm0.j1.i();
        gm0.y n17 = gm0.j1.n();
        n17.f273287a.v(new com.tencent.mm.modelstat.p0(this));
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.HashMap hashMap = com.tencent.mm.modelstat.i0.f71511a;
        try {
            if (context2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "registerReceiver ctx == null");
            } else {
                com.tencent.mm.modelstat.h0 h0Var = new com.tencent.mm.modelstat.h0(null);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
                context2.registerReceiver(h0Var, intentFilter);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "registerReceiver finish");
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "registerReceiver : %s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
    }
}
