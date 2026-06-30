package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/g;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "shouldOverrideExitAnimation", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/emoji/c", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.c f162377d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f162378e = "MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12085xf29f6486 c12085xf29f6486 = abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12085xf29f6486 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12085xf29f6486) abstractC11887x3610e10c : null;
        if (c12085xf29f6486 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162378e, "handleRequest, request type illegal: " + abstractC11887x3610e10c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46 c12086xa4bbbb46 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46();
            c12086xa4bbbb46.f162346d = false;
            m50420x7b736e5c(c12086xa4bbbb46);
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
        if (q6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162378e, "handleRequest, unable to get emoticon page feature service");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46 c12086xa4bbbb462 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46();
            c12086xa4bbbb462.f162346d = false;
            m50420x7b736e5c(c12086xa4bbbb462);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m50421x3c6fed6a, m50421x3c6fed6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f162378e, "handleRequest, show loading and start fetch designer info");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).Ai(m50421x3c6fed6a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.f162387g.a(c12085xf29f6486.getPageExternalContext()), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.e(this, f17));
        f17.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.f(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: shouldOverrideExitAnimation */
    public boolean mo50431x33f85ba7() {
        return true;
    }
}
