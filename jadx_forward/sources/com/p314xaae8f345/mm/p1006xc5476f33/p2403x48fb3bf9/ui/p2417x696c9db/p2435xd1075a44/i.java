package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j f268788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f268789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268790f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j jVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f268788d = jVar;
        this.f268789e = c19762x487075a;
        this.f268790f = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f268788d.f268868d);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f268789e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm, onDismiss %d, %b", valueOf, java.lang.Boolean.valueOf(c19762x487075a.f38859x6ac9171));
        if (c19762x487075a.f38859x6ac9171) {
            return;
        }
        this.f268790f.a();
    }
}
