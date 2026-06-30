package gk4;

/* loaded from: classes10.dex */
public final /* synthetic */ class d extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public d(java.lang.Object obj) {
        super(1, obj, gk4.r.class, "onFrameRender", "onFrameRender(J)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        gk4.r rVar = (gk4.r) this.f72685xcfcbe9ef;
        if (rVar.f354132d != null) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = rVar.f354139k;
            if (concurrentLinkedDeque.size() > 0 && ((hk4.a) concurrentLinkedDeque.getFirst()).f363464j && rVar.f354153y != null) {
                pm0.v.X(new gk4.g(rVar));
            }
        }
        if (!rVar.f354154z && rVar.A > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first frame render cost:");
            long j17 = rVar.A;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, sb6.toString());
            rVar.f354154z = true;
        }
        return jz5.f0.f384359a;
    }
}
