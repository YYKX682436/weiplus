package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public final class w1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams f83296d;

    public w1(yz5.l lVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        this.f83293a = lVar;
        this.f83294b = str;
        this.f83295c = str2;
        this.f83296d = chatToolParams;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data exists: ");
        boolean z17 = false;
        sb6.append(intent != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", sb6.toString());
        if (com.tencent.mm.plugin.appbrand.jsapi.share.b2.f83117a != i17) {
            return false;
        }
        yz5.l lVar = this.f83293a;
        if (i18 != -1) {
            if (intent != null && true == intent.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, share to wework");
                lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83249f);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, cancel");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83250g);
            return true;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since data is null");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 1");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",");
        if (O1 == null || O1.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 2");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.share.b2.f83117a;
        kotlin.jvm.internal.o.d(O1);
        java.lang.String filePath = this.f83294b;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String fileName = this.f83295c;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams params = this.f83296d;
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = new com.tencent.mm.opensdk.modelmsg.WXFileObject();
        wXFileObject.setFilePath(filePath);
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.title = fileName;
        wXMediaMessage.description = fileName;
        boolean z18 = !(stringExtra2 == null || stringExtra2.length() == 0);
        for (java.lang.String str : O1) {
            com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent appBrandSendAppMsgEvent = new com.tencent.mm.autogen.events.AppBrandSendAppMsgEvent();
            am.x xVar = appBrandSendAppMsgEvent.f53984g;
            xVar.f8330a = wXMediaMessage;
            xVar.f8331b = str;
            boolean z19 = params.f80345d;
            if (z19 || params.f80351m) {
                ot0.a aVar = new ot0.a();
                xVar.f8332c = aVar;
                if (z19) {
                    p15.x xVar2 = new p15.x();
                    xVar2.p(params.f80346e);
                    xVar2.q(params.f80347f);
                    xVar2.w(params.f80348g);
                    xVar2.t(params.f80349h);
                    xVar2.u(params.f80350i);
                    xVar2.x(params.f80354p);
                    aVar.P = xVar2;
                }
                xVar.f8332c.R = params.f80353o;
            }
            appBrandSendAppMsgEvent.e();
            if (z18) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
            }
        }
        lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83249f);
        return true;
    }
}
