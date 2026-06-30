package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class s5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268048a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f268049b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f268050c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268051d;

    public s5(java.lang.ref.WeakReference contextReference, java.lang.String callbackId, android.net.Uri schemeUri, java.lang.ref.WeakReference jsApiHandlerReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReference, "contextReference");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(schemeUri, "schemeUri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandlerReference, "jsApiHandlerReference");
        this.f268048a = contextReference;
        this.f268049b = callbackId;
        this.f268050c = schemeUri;
        this.f268051d = jsApiHandlerReference;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        nw4.g gVar = (nw4.g) this.f268051d.get();
        android.content.Context context = (android.content.Context) this.f268048a.get();
        if (gVar == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchAppByScheme", "context or jsApiHandler is recycled ");
            return;
        }
        java.lang.String str2 = this.f268049b;
        if (i17 != 0 || i18 != 0) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("err_desc", "check cgi fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap);
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.zg4 zg4Var = fVar instanceof r45.zg4 ? (r45.zg4) fVar : null;
        if (zg4Var == null || zg4Var.mo11484xe92ab0a8() == null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("err_desc", "check base resp fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap2);
            return;
        }
        if (zg4Var.mo11484xe92ab0a8().f458492d != 0) {
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("err_desc", "check resp fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap3);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("call doLaunchByScheme:");
        android.net.Uri uri = this.f268050c;
        sb6.append(uri);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchAppByScheme", sb6.toString());
        java.lang.String str3 = zg4Var.f473540d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r5(gVar, this);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, str3, r5Var, null);
    }
}
