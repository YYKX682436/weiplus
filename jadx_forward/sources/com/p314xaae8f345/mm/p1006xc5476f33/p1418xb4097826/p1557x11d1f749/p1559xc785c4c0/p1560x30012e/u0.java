package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.w0 f202552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.w0 w0Var) {
        super(0);
        this.f202552d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.q0 f17 = this.f202552d.f();
        synchronized (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onEngineCreateDone isTabShow:" + f17.f202529i + ", queue size:" + ((java.util.ArrayList) f17.f202528h).size());
            f17.f202527g = true;
            if (((java.util.ArrayList) f17.f202528h).isEmpty()) {
                f17.f202526f.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
            } else {
                java.util.Iterator it = ((java.util.ArrayList) f17.f202528h).iterator();
                while (it.hasNext()) {
                    ((yz5.a) it.next()).mo152xb9724478();
                }
            }
            synchronized (f17) {
                ((java.util.ArrayList) f17.f202528h).clear();
            }
            return jz5.f0.f384359a;
        }
        return jz5.f0.f384359a;
    }
}
