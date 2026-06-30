package ih0;

/* loaded from: classes12.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements o72.h4 {

    /* renamed from: d, reason: collision with root package name */
    public static ih0.m f373014d;

    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        o72.g4 zj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (f373014d == null) {
            synchronized (s72.r0.class) {
                if (f373014d == null) {
                    f373014d = new ih0.m();
                }
            }
        }
        ih0.m cbs = f373014d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cbs, "cbs");
        ((s72.p0) zj6).f485663p = cbs;
        return true;
    }
}
