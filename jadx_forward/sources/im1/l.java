package im1;

/* loaded from: classes5.dex */
public final class l implements com.p314xaae8f345.mm.vfs.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e06.k f373732a;

    public l(e06.k kVar) {
        this.f373732a = kVar;
    }

    @Override // com.p314xaae8f345.mm.vfs.b7
    public final boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.List e07 = r26.n0.e0(name, new char[]{'.'}, false, 0, 6, null);
        if (2 > e07.size() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("png", kz5.n0.i0(e07))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.StickerApplyAdapterCoreLogic", "copyStickerItemResourcesIfNeed, invalid res: ".concat(name));
            return false;
        }
        java.util.List e08 = r26.n0.e0((java.lang.CharSequence) e07.get(0), new char[]{'_'}, false, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(e08.toArray(new java.lang.String[0])), "toString(...)");
        if (2 > e08.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.StickerApplyAdapterCoreLogic", "copyStickerItemResourcesIfNeed, invalid res: ".concat(name));
            return false;
        }
        java.lang.Integer h17 = r26.h0.h((java.lang.String) kz5.n0.i0(e08));
        return h17 != null && this.f373732a.m(h17.intValue());
    }
}
