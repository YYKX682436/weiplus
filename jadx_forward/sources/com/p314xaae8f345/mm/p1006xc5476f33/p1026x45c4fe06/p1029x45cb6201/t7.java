package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class t7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    private t7() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo8834xb9724478(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke(), process[%s], pkgInfo[%s]", bm5.f1.a(), interfaceC11702x4ae7c33);
        if (interfaceC11702x4ae7c33 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.this;
                final cf.d dVar = new cf.d(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.this).run();
                    }
                }, 2);
                pq5.g gVar = (pq5.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE);
                gVar.n(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$c
                    @Override // gm5.a
                    /* renamed from: call */
                    public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                        cf.d.this.a();
                        return null;
                    }
                });
                gVar.B();
                pq5.g gVar2 = (pq5.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME);
                gVar2.n(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$d
                    @Override // gm5.a
                    /* renamed from: call */
                    public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                        cf.d.this.a();
                        return null;
                    }
                });
                gVar2.B();
            }
        });
    }
}
