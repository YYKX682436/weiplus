package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public final class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f167616f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.C12443x6e684fa8 f167617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1] */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        super(rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f167616f = "Luggage.WXA.NetworkServiceBySystemReceiver";
        this.f167617g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.f0.this.a();
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0, lm0.b
    public void b() {
        super.b();
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            context.unregisterReceiver(this.f167617g);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f167616f, "unregister network receiver, t=" + th6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0, lm0.b
    public void c() {
        super.c();
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.C12443x6e684fa8 c12443x6e684fa8 = this.f167617g;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
            context.registerReceiver(c12443x6e684fa8, intentFilter);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f167616f, "register network receiver, t=" + th6);
        }
    }
}
