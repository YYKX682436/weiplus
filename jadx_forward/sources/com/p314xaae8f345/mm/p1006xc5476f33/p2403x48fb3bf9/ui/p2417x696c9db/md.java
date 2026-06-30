package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class md extends cy4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd f267237a;

    public md(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd pdVar) {
        this.f267237a = pdVar;
    }

    @Override // cy4.f
    public void a() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd pdVar = this.f267237a;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = pdVar.c();
            if (c17 != null && (nVar = c17.f265377p0) != null) {
                nVar.H();
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onEnterFullscreen fail", e17);
        }
        z41.c cVar = pdVar.f268295d;
        if (cVar != null) {
            cVar.enable();
        }
    }

    @Override // cy4.f
    public void b() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd pdVar = this.f267237a;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = pdVar.c();
            if (c17 != null && (nVar = c17.f265377p0) != null) {
                nVar.I();
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onExitFullscreen fail", e17);
        }
        z41.c cVar = pdVar.f268295d;
        if (cVar != null) {
            cVar.disable();
        }
    }
}
