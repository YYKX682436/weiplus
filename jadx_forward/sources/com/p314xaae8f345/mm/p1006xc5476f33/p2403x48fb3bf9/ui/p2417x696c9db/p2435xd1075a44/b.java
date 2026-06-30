package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f268639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268640e;

    public b(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f268639d = c19762x487075a;
        this.f268640e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert, onConfirm");
        this.f268639d.f38859x6ac9171 = true;
        this.f268640e.b();
    }
}
