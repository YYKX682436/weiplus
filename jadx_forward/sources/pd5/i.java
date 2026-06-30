package pd5;

/* loaded from: classes.dex */
public final class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.List list = pd5.l.f435115d;
        am.k3 k3Var = event.f135605g;
        if (!((java.util.ArrayList) list).contains(k3Var.f88659a)) {
            return false;
        }
        java.util.Map map = pd5.l.f435116e;
        java.lang.String configName = k3Var.f88659a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configName, "configName");
        map.put(configName, java.lang.Integer.valueOf(j62.e.g().i(k3Var.f88659a, 0, true, true)));
        return true;
    }
}
