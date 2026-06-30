package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class f6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 120;
    private static final java.lang.String NAME = "getImageInfo";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Collection f81807g;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.tencent.mm.plugin.appbrand.jsapi.media.a6(null));
        linkedList.add(new com.tencent.mm.plugin.appbrand.jsapi.media.d6(null));
        f81807g = java.util.Collections.unmodifiableCollection(linkedList);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        e9Var.getAppId();
        java.lang.String optString = jSONObject.optString("src");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail:invalid data"));
        } else {
            s75.d.c(new com.tencent.mm.plugin.appbrand.jsapi.media.z5(this, e9Var, optString, new java.lang.ref.WeakReference(e9Var), i17), java.lang.String.format(java.util.Locale.US, "AppBrandJsApiGetImageInfo[%s]", optString), 10);
        }
    }
}
