package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class ae implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f78778a;

    public ae(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f78778a = mdVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "sendToFriend path:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.c(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.zd(this, str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "sendToFriend as emoji");
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest();
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest.f78649d = str;
        android.content.Context context = this.f78778a.f81606c.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest, null, null);
    }
}
