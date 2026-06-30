package o52;

/* loaded from: classes14.dex */
public final class f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5330x64981f7e event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5330x64981f7e) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.w4 w4Var = event.f135643g;
        if (w4Var == null) {
            return false;
        }
        v52.c g17 = v52.c.g();
        int i17 = w4Var.f89796b;
        int i18 = w4Var.f89797c;
        g17.f514844g = i17;
        g17.f514845h = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEnterFinderTaskTypeListener", "enterPage " + w4Var.f89795a + ", " + w4Var.f89796b + ' ' + w4Var.f89797c);
        return false;
    }
}
