package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes7.dex */
public final class u extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x {
    public u(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t tVar) {
        super(tVar);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    public boolean b(long j17) {
        return super.b(j17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x
    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v g(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.t tVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t tVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d;
        tVar2.getClass();
        java.lang.String b17 = tVar2.b();
        java.lang.String str = tVar2.f271169m;
        if (tVar2.f271171o) {
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(tVar2.b());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (p17 == null) {
                p17 = "";
            }
            if (p17.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "file already cached and valid, send complete status");
                return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(tVar2, 2, o35.a.g(b17), (java.lang.String) null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).f271170n) && o35.a.k(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).b(), ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).f271170n)) {
            java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).b());
            if ((p18 != null ? p18 : "").equals(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).f271169m)) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar = this.f271221d;
                return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) kVar, 2, o35.a.g(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) kVar).b()), (java.lang.String) null);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v g17 = super.g(tVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: network get over, received response = " + g17, tVar2.f271245a);
        if (g17 == null) {
            return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v("CheckResUpdate", f(), a(), e(), 0L, "", 3, new n35.e());
        }
        if (g17.f271262g == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).f271169m) || !((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) this.f271221d).f271169m.equals(com.p314xaae8f345.mm.vfs.w6.p(e()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: file invalid, md5 not match", tVar2.f271245a);
                return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v("CheckResUpdate", f(), a(), e(), g17.f271259d, g17.f271260e, 3, new n35.c());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: file valid, md5 ok", tVar2.f271245a);
        }
        return g17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    /* renamed from: getGroupId */
    public java.lang.String mo49249x4f4a97c4() {
        return "CheckResUpdate";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i
    /* renamed from: retry */
    public boolean mo49250x67622a8() {
        boolean mo49250x67622a8 = super.mo49250x67622a8();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar = this.f271221d;
        if (mo49250x67622a8) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) kVar).f271168l, 12L);
            return true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.t) kVar).f271168l, 27L);
        return false;
    }
}
