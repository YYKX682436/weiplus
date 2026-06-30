package aq5;

/* loaded from: classes5.dex */
public final class m implements gz.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq5.o f94788a;

    public m(aq5.o oVar) {
        this.f94788a = oVar;
    }

    @Override // gz.k
    public void a(java.lang.String toIp, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toIp, "toIp");
        aq5.o oVar = this.f94788a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f94795a, "receiver onConnected() called1 with: toIp = " + toIp + ", toPort = " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f94795a, "doReceiverNegotiation() called");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new aq5.j(oVar, null), 2, null);
        }
    }

    @Override // gz.k
    public void b(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f94788a.f94795a, "receiver onDisconnected() called with: reason = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // gz.k
    public void c(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        aq5.o oVar = this.f94788a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f94795a, "receiver onConnectFailed() called with: reason = " + i17 + ", errMsg = " + errMsg);
        oVar.f94800f.mo146xb9724478(10001);
    }
}
