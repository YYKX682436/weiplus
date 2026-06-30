package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes14.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf f268542d;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf) {
        this.f268542d = c19330x7ca5b1cf;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = this.f268542d;
        if (c19330x7ca5b1cf.getRootView() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewKeyboardLinearLayout", "initKbListenerByApi30 rootView null");
        } else {
            c19330x7ca5b1cf.getRootView().setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v4(this));
        }
    }
}
