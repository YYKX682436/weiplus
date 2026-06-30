package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f218455b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f218456c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f218457d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b f218458e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void b(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        java.lang.Runnable runnable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        super.b(i17, reqUrl, i18, i19, errMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WebViewController", "reason:" + i17 + " reqUrl:" + reqUrl + " errType:" + i18 + " errCode:" + i19 + " :" + errMsg + ": String) ");
        java.lang.ref.WeakReference weakReference = this.f218457d;
        if (weakReference == null || (runnable = (java.lang.Runnable) weakReference.get()) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        zg0.q2 q2Var;
        zg0.q2 q2Var2;
        try {
            java.lang.ref.WeakReference weakReference = this.f218456c;
            if (weakReference == null || (q2Var = (zg0.q2) weakReference.get()) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).e0();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b bVar = this.f218458e;
            java.lang.ref.WeakReference weakReference2 = this.f218456c;
            e07.rg(bVar, (weakReference2 == null || (q2Var2 = (zg0.q2) weakReference2.get()) == null) ? 0 : ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var2).U());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.WebViewController", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}
