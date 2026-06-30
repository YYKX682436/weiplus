package im1;

/* loaded from: classes11.dex */
public final class j extends im1.c {

    /* renamed from: b, reason: collision with root package name */
    public static final im1.j f373730b = new im1.j();

    public final com.p314xaae8f345.mm.vfs.r6 b(com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.vfs.r6 r6Var2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var, r6Var2.m82467xfb82e301());
        r6Var2.m82469x9616526c();
        r6Var3.m82469x9616526c();
        xf1.h hVar = xf1.h.f535769a;
        if (hVar.a(r6Var3)) {
            return r6Var3;
        }
        if (!r6Var2.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, originFile not exist");
            return null;
        }
        if (0 > com.p314xaae8f345.mm.vfs.w6.d(r6Var2.o(), r6Var3.o(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, copy fail");
            return null;
        }
        if (hVar.b(r6Var3)) {
            return r6Var3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, record newFile fail");
        return null;
    }

    public final java.lang.String c(yf.k kVar) {
        byte[] bytes = kVar.a().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return by5.x.d(bytes);
    }
}
