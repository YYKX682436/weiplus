package x03;

/* loaded from: classes15.dex */
public final class k extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        x03.x0 a17 = x03.x0.f532694d.a();
        a17.f532697b.f532574g.clear();
        java.util.HashMap hashMap = a17.f532698c.f532593d;
        if (hashMap == null) {
            return true;
        }
        hashMap.clear();
        return true;
    }
}
