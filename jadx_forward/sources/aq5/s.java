package aq5;

/* loaded from: classes5.dex */
public final class s implements gz.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq5.y f94826a;

    public s(aq5.y yVar) {
        this.f94826a = yVar;
    }

    @Override // gz.k
    public void a(java.lang.String toIp, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toIp, "toIp");
        aq5.y yVar = this.f94826a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "sender onConnected() called with: toIp = " + toIp + ", toPort = " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "doSenderNegotiation() called");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new aq5.p(yVar, null), 2, null);
        }
    }

    @Override // gz.k
    public void b(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        aq5.y yVar = this.f94826a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(yVar.f94870a, "sender onDisconnected() called with: reason = " + i17 + ", errMsg = " + errMsg);
        yVar.f94875f.mo146xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
    }

    @Override // gz.k
    public void c(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        aq5.y yVar = this.f94826a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f94870a, "sender onConnectFailed() called with: reason = " + i17 + ", errMsg = " + errMsg);
        yVar.f94875f.mo146xb9724478(10001);
    }
}
