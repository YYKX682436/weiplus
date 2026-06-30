package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j f268772e;

    public h(com.p314xaae8f345.p3210x3857dc.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j jVar) {
        this.f268771d = zVar;
        this.f268772e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f268771d.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm cancel %d", java.lang.Integer.valueOf(this.f268772e.f268868d));
    }
}
