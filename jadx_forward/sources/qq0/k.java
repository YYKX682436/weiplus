package qq0;

/* loaded from: classes7.dex */
public final class k extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq0.m f447430b;

    public k(qq0.m mVar) {
        this.f447430b = mVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "onEnterBackground");
        qq0.m mVar = this.f447430b;
        mVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = mVar.f447435g;
        long q17 = o4Var.q("lastCheckFileTimeMagicWxGameDynamicCard", 0L);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (java.lang.System.currentTimeMillis() - q17 < 604800000) {
            return;
        }
        o4Var.B("lastCheckFileTimeMagicWxGameDynamicCard", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "deleteOldFile realStart, " + q17);
        com.p314xaae8f345.mm.vfs.r6[] G2 = new com.p314xaae8f345.mm.vfs.r6(mVar.f447433e.a("MagicWxGameDynamicCard").concat("/MagicWxGameDynamicCard")).G();
        if (G2 != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G2) {
                if (r6Var.y() && (G = r6Var.G()) != null) {
                    for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                        if (r6Var2.A()) {
                            java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                            if (!r26.n0.B(m82467xfb82e301, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, false)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "deleteOldFile, unmatched, path: " + r6Var2.m82467xfb82e301() + ", ret: " + r6Var2.l());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
    }
}
