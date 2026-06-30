package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public final class h1 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 f220988d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var) {
        this.f220988d = l1Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        wu5.c cVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "onAppBackground");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = this.f220988d;
        l1Var.f221004g = true;
        wu5.c cVar2 = l1Var.f221003f;
        if (cVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
            if (!cVar2.isDone() && (cVar = this.f220988d.f221003f) != null) {
                cVar.cancel(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var2 = this.f220988d;
        l1Var2.f221003f = ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.e1(l1Var2), 500L, "GameLiteAppStoreService.SerialQueue");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "onAppForeground ".concat(this.f220988d.f221005h ? "cool start" : "hot start"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = this.f220988d;
        l1Var.f221004g = false;
        if (!l1Var.f221005h) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g1(this.f220988d), "GameLiteAppStoreService.SerialQueue");
        } else {
            l1Var.f221005h = false;
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.f1(this.f220988d), "GameLiteAppStoreService.SerialQueue");
        }
    }
}
