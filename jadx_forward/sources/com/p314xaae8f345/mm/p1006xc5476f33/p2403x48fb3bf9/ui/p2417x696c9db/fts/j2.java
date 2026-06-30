package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.k2 f265983d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.k2 k2Var) {
        this.f265983d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f265983d.f266026e.f266100n.f265377p0;
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, not ready");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onFocusSearchInput success, ready");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.h1(nVar, nw4.x2.c("onFocusSearchInput", null, nVar.f422436q, nVar.f422437r)));
        }
    }
}
