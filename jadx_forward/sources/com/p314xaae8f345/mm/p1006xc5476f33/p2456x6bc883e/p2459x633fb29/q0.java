package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f269988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 f269990d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var, boolean z17, java.lang.String str) {
        this.f269990d = p0Var;
        this.f269988b = z17;
        this.f269989c = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 abstractC19538xebb9e287) {
        java.lang.Object obj = this.f269927a;
        boolean z17 = obj instanceof java.lang.String;
        boolean z18 = this.f269988b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var = this.f269990d;
        if (!z17) {
            p0Var.f(z18, this.f269989c, 2);
            return;
        }
        final java.lang.String str = (java.lang.String) obj;
        boolean z19 = abstractC19538xebb9e287.f269866f;
        boolean z27 = !abstractC19538xebb9e287.f269867g;
        p0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "notifyBigPkgDownloadComplete: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19534xa57d6e76(str, z19, z27), null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "updateLiteApp, pkgId : %s, success : %b, haveDownloadAction : %b", str, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z19 && z27) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.u0.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.wepkg.model.p0$$a
                @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                public final void a(java.lang.Object obj2) {
                    if (((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj2).f149933d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19536xae4f4bc7(str), null);
                    }
                }
            });
        }
        p0Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p0Var.f(z18, str, 3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "update preload files. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z18));
        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.b(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgUpdater", "pkgid:%s, %s preload files need to download", str, java.lang.Integer.valueOf(b17.size()));
        }
        p0Var.c(str, b17, z18);
    }
}
