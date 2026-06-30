package y13;

/* loaded from: classes5.dex */
public final class p extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.C20834xd36a592b();
        am.uq uqVar = event.f136212g;
        if (uqVar.f89658a != 2 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, "RepairerConfig_YuanBaoClearRecommendRecord")) {
            return false;
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) jz5.h.b(y13.o.f540431d)).mo141623x754a37bb()).clear();
        android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "已清除", 0).show();
        return true;
    }
}
