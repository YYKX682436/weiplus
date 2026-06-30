package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class xc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268199d;

    public xc(nw4.k kVar) {
        this.f268199d = kVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.CharSequence title = menuItem.getTitle();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(title);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, title);
        hashMap.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(menuItem.getItemId()));
        nw4.g gVar = this.f268199d.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onShareCustomMenuItemClick", hashMap);
    }
}
