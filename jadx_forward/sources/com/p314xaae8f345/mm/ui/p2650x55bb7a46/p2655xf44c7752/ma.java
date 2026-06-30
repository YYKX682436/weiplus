package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class ma implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282735d;

    public ma(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        this.f282735d = taVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282735d;
        taVar.f282961f.mo69330x68ac462();
        taVar.f282965j.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.la(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282735d;
        taVar.f282961f.mo69303x360802();
        java.lang.String str = (java.lang.String) ((android.view.View) taVar.f282961f).getTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.b());
        sb6.append("[ImageGallery] on play sight error, what=");
        sb6.append(i17);
        sb6.append(", extra=");
        sb6.append(i18);
        sb6.append(", path=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(str == null ? "" : str);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ka(this, str));
        taVar.f282959d.put(str, java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
