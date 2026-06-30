package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(3);
        this.f282622d = f9Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String filename = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filename, "filename");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.C2COriginVideoDownloaderCache", "downloader[" + longValue + "] download end, filename=" + filename + ",result=" + booleanValue);
        xf0.u uVar = (xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282622d;
        if (!uVar.bj(f9Var)) {
            ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).getClass();
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20549x23ec82e0()) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.C2COriginVideoDownloaderCache", "try to download compressed video filename= {" + filename + '}');
                gm0.b bVar = gm0.j1.b().f354778h;
                if (bVar != null && (c20976x6ba6452a = bVar.f354678e) != null) {
                    v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h(f9Var, null), 1, null);
                }
            }
        }
        if (booleanValue && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.b(longValue)) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i iVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i(filename, f9Var, longValue);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j jVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j.f282572a;
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, iVar, jVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l lVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282698c.remove(java.lang.Long.valueOf(longValue));
        return jz5.f0.f384359a;
    }
}
