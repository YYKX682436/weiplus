package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class o5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f157234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 f157236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 f157237d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 e5Var, boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 p5Var) {
        this.f157237d = e5Var;
        this.f157234a = z17;
        this.f157235b = i17;
        this.f157236c = p5Var;
    }

    @Override // m81.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 c11660xa0d206d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa waVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa) obj;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.PkgDownloadService", "ENABLE_COMM_LIB_DOWNLOAD_PKG_WEAKNET_MOCK");
            try {
                java.lang.Thread.sleep(60000L);
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        if (!this.f157234a) {
            this.f157237d.f157045h = null;
        }
        if (m81.c.OK != cVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Failed()));
            if (!this.f157234a && !this.f157237d.f157043f) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.RunnableC11677x634d47c());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 p5Var = this.f157236c;
            if (p5Var != null) {
                p5Var.a(false, 0);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v7.a();
        try {
            java.lang.Object mo32082xb9724478 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c8().mo32082xb9724478(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult, IPC_ReadLib returns %s", mo32082xb9724478);
            if (mo32082xb9724478 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) {
                c11660xa0d206d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) mo32082xb9724478;
            } else {
                if (!(mo32082xb9724478 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Failed()));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 p5Var2 = this.f157236c;
                    if (p5Var2 != null) {
                        p5Var2.a(false, 0);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) mo32082xb9724478;
                c11660xa0d206d = c11667xc7e59dd6.f156934f ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11660xa0d206d(c11667xc7e59dd6);
            }
            java.util.Objects.requireNonNull(c11660xa0d206d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Succeed(c11660xa0d206d)));
            if (!this.f157234a && !this.f157237d.f157043f) {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.o5$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.a0g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.this.Y0()), 0).show();
                    }
                });
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult download(version: %d) succeed, publish get exception %s", java.lang.Integer.valueOf(waVar.f157567b), e18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 p5Var3 = this.f157236c;
        if (p5Var3 != null) {
            p5Var3.a(true, this.f157235b);
        }
    }
}
