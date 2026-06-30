package pd5;

/* loaded from: classes.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Class cls;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        int i17 = 0;
        if (uqVar.f89658a != 1) {
            return false;
        }
        java.lang.Class[] clsArr = pd5.l.f435114c;
        while (true) {
            if (i17 >= 8) {
                cls = null;
                break;
            }
            cls = clsArr[i17];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((q55.e) cls.newInstance()).l(), uqVar.f89659b)) {
                break;
            }
            i17++;
        }
        if (cls == null) {
            return true;
        }
        pd5.l.f435116e.put(((q55.e) cls.newInstance()).k(), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(uqVar.f89660c)));
        return true;
    }
}
