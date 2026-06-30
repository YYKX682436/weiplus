package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j f268706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268707f;

    public e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j jVar, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f268705d = str;
        this.f268706e = jVar;
        this.f268707f = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j jVar = this.f268706e;
        g0Var.d(11683, this.f268705d, 1, java.lang.Integer.valueOf(jVar.f268868d));
        this.f268707f.a();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm cancel and finish %d", java.lang.Integer.valueOf(jVar.f268868d));
        android.app.Activity s17 = jVar.s();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
        s17.finish();
    }
}
