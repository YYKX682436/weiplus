package ad3;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6 service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBOnScreenShotEventImpl", "onStartListen");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).wi(context, this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBOnScreenShotEventImpl", "setScreenShotCallback fail e:%s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4
    public void b() {
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).Bi(context, this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBOnScreenShotEventImpl", "onScreenShot");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) this.f229700d).Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229753e, "");
    }
}
