package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class e6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f267590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267592f;

    public e6(java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f267590d = weakReference;
        this.f267591e = i17;
        this.f267592f = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        nw4.g gVar = (nw4.g) this.f267590d.get();
        boolean z17 = bundle.getBoolean("ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "WebPrefetchAsyncTask callback jsapi: %s, ret: %s", gVar, java.lang.Boolean.valueOf(z17));
        if (gVar != null) {
            if (this.f267591e == 0) {
                jx3.f.INSTANCE.w(1454L, 192L, 1L);
            }
            java.lang.String str = this.f267592f;
            if (!z17) {
                gVar.e(str, "onWebPageUrlExposed:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String string = bundle.getString("url_result");
            if (!(string == null || string.length() == 0)) {
                hashMap.put("result_list", string);
            }
            gVar.e(str, "onWebPageUrlExposed:ok", hashMap);
        }
    }
}
