package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f265083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o f265084h;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o oVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f265084h = oVar;
        this.f265080d = str;
        this.f265081e = str2;
        this.f265082f = bundle;
        this.f265083g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o oVar = this.f265084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(oVar.f265090d.f265005g).W6(null, null, null);
        oVar.f265090d.finish();
        try {
            oVar.f265090d.f265003e.aj(this.f265080d, this.f265081e, this.f265082f, this.f265083g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.callbackerWrapper", "wrapper onHandleEnd, ex = " + e17.getMessage());
        }
    }
}
