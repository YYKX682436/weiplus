package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams f83326h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(yz5.l lVar, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        super(2);
        this.f83322d = lVar;
        this.f83323e = activity;
        this.f83324f = str;
        this.f83325g = str2;
        this.f83326h = chatToolParams;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.Long l17 = (java.lang.Long) obj2;
        yz5.l lVar = this.f83322d;
        if (booleanValue) {
            android.app.Activity activity = this.f83323e;
            nf.g a17 = nf.g.a(activity);
            java.lang.String str2 = this.f83325g;
            java.lang.String str3 = this.f83324f;
            com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams = this.f83326h;
            a17.f(new com.tencent.mm.plugin.appbrand.jsapi.share.w1(lVar, str2, str3, chatToolParams));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, SHARE_VIDEO_REQUEST_CODE: ");
            int i17 = com.tencent.mm.plugin.appbrand.jsapi.share.b2.f83117a;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("desc_title", str3);
            intent.putExtra("Retr_Msg_Type", 3);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("from_scene_forward_to_wework", 6);
            intent.putExtra("content_type_forward_to_wework", 4);
            intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.FileData(str2, l17, str3));
            if (chatToolParams.f80351m) {
                intent.putExtra("Select_Conv_User", chatToolParams.f80352n);
            }
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            int O = r26.n0.O(this.f83324f, '.', 0, false, 6, null);
            if (O < 0 || O == str3.length() - 1) {
                str = "";
            } else {
                str = str3.substring(O + 1);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            ec5.a aVar = new ec5.a();
            aVar.l(str2);
            aVar.k(n13.v.f334140a.b(str3, str, l17 != null ? l17.longValue() : 0L));
            if (chatToolParams.f80351m) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                com.tencent.mm.plugin.appbrand.jsapi.share.x1 x1Var = new com.tencent.mm.plugin.appbrand.jsapi.share.x1(intent, activity);
                n13.t tVar = new n13.t();
                tVar.f334133a = x1Var;
                ((dk5.y) a0Var).wi(activity, aVar, stringExtra, tVar);
            } else {
                n13.r rVar = new n13.r();
                rVar.f334118b = i17;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, rVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since file illegal");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
        }
        return jz5.f0.f302826a;
    }
}
