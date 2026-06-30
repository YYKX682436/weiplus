package ln0;

/* loaded from: classes10.dex */
public final class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401184d;

    public h(ln0.p pVar) {
        this.f401184d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        ln0.p pVar = this.f401184d;
        java.util.Map p2pParamsMap = pVar.f401205a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            java.util.Map p2pParamsMap2 = pVar.f401205a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p2pParamsMap2, "p2pParamsMap");
            java.util.Iterator it = p2pParamsMap2.entrySet().iterator();
            while (true) {
                boolean z17 = true;
                if (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    ln0.q qVar = (ln0.q) entry.getValue();
                    if (qVar.f401217a == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport warning! p2pSwitch=" + qVar.f401217a + " streamId=" + str);
                    } else {
                        java.lang.String m21224xed96f0e5 = com.p307xc6797c64.qvb.C2852x293225.m21224xed96f0e5(pVar.f401207c);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m21224xed96f0e5, "proxyOf(...)");
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m21224xed96f0e5, pVar.f401207c)) {
                            if (m21224xed96f0e5.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                                pVar.f(m21224xed96f0e5 + ("stat?xresid=" + str), str);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport proxy " + m21224xed96f0e5);
                    }
                }
            }
        }
        return true;
    }
}
