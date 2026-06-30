package kc5;

/* loaded from: classes5.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        java.lang.String str = uqVar != null ? uqVar.f89659b : null;
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20089x72a09e8f();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerConfig_MediaGroup_ClearUnreadDB")) {
            return false;
        }
        c95.d.f121280a.c().m107087x90df30e9();
        android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Clear", 0).show();
        return true;
    }
}
