package ld0;

/* loaded from: classes.dex */
public final class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        am.r2 r2Var = event.f135586g;
        if (r2Var.f89292a != 97) {
            return false;
        }
        wz3.h hVar = (wz3.h) i95.n0.c(wz3.h.class);
        hVar.getClass();
        if (r2Var.f89292a != 97 || r2Var.f89293b != 1) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductModelResLogic", "download res finish, path: " + r2Var.f89294c + ", fileVersion: " + r2Var.f89295d + ", fileUpdated: " + r2Var.f89296e);
        gm0.j1.e().j(new wz3.g(hVar, event));
        hVar.f532318d.a(4);
        return false;
    }
}
