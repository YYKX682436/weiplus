package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83338g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams f83339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yz5.l lVar, java.lang.String str, java.lang.String str2, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        super(2);
        this.f83335d = lVar;
        this.f83336e = str;
        this.f83337f = str2;
        this.f83338g = activity;
        this.f83339h = chatToolParams;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.appbrand.jsapi.share.v2 v2Var = (com.tencent.mm.plugin.appbrand.jsapi.share.v2) obj2;
        yz5.l lVar = this.f83335d;
        if (booleanValue) {
            java.lang.String str = this.f83336e;
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsapi.xf.a(str, this.f83337f);
            if (a17 == null || a17.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, thumbPath is empty");
                lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            } else {
                android.app.Activity activity = this.f83338g;
                nf.g.a(activity).f(new com.tencent.mm.plugin.appbrand.jsapi.share.x2(this.f83335d, v2Var, this.f83338g, this.f83336e, a17, this.f83339h));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, SHARE_VIDEO_REQUEST_CODE: ");
                int i17 = com.tencent.mm.plugin.appbrand.jsapi.share.d3.f83128a;
                sb6.append(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb6.toString());
                int i18 = v2Var != null ? v2Var.f83290a : 0;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("image_path", a17);
                intent.putExtra("Retr_Msg_Type", 1);
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("Retr_File_Name", str);
                intent.putExtra("Retr_length", i18);
                intent.putExtra("content_type_forward_to_wework", 3);
                intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.VideoData(str));
                com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams = this.f83339h;
                if (chatToolParams.f80351m) {
                    intent.putExtra("Select_Conv_User", chatToolParams.f80352n);
                }
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                jd5.c cVar = new jd5.c();
                cVar.r(str);
                cVar.o(a17);
                cVar.q(v2Var != null ? v2Var.f83290a : 0);
                if (chatToolParams.f80351m) {
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                    com.tencent.mm.plugin.appbrand.jsapi.share.y2 y2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.y2(intent, activity);
                    n13.t tVar = new n13.t();
                    tVar.f334133a = y2Var;
                    ((dk5.y) a0Var).wi(activity, cVar, stringExtra, tVar);
                } else {
                    n13.r rVar = new n13.r();
                    rVar.f334118b = i17;
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, cVar, rVar);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since video illegal");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
        }
        return jz5.f0.f302826a;
    }
}
