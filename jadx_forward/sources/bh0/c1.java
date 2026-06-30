package bh0;

/* loaded from: classes7.dex */
public final class c1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6285xbc305464 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6285xbc305464) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.c30 c30Var = event.f136534g;
        java.lang.String str = c30Var.f87843a;
        if (c30Var.f87847e != 0) {
            return true;
        }
        ku4.i iVar = ku4.i.f394047a;
        if (((java.util.LinkedList) ((jz5.n) ku4.i.f394048b).mo141623x754a37bb()).contains(str)) {
            jx3.f.INSTANCE.w(1454L, 55L, 1L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            iVar.b(str, c30Var.f87846d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebCanvasDownPkgUpdateEventListener", "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str, java.lang.Integer.valueOf(c30Var.f87846d), c30Var.f87845c);
        }
        return false;
    }
}
