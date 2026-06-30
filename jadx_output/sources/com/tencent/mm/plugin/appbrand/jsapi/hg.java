package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/hg;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class hg implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", 2);
        hashMap.put("fav_source", 40);
        hashMap.put("general_msg_type", 4);
        hashMap.put("fav_tips_clk_type", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_succ_tips", "view_clk", hashMap, 32903);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "reportSuccessSnackBar, params: " + hashMap);
    }
}
