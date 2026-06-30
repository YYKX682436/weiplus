package zw;

/* loaded from: classes7.dex */
public final class a0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5158xe0676aba event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5158xe0676aba) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.n nVar = event.f135507g;
        if (nVar.f88916b != 36) {
            return false;
        }
        zw.v vVar = zw.v.f558076a;
        java.lang.String imagePath = nVar.f88915a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null) {
            return true;
        }
        v65.i.b(c20976x6ba6452a, null, new zw.u(imagePath, null), 1, null);
        return true;
    }
}
