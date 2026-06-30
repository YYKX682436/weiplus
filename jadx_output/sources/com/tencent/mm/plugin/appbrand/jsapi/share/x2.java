package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public final class x2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f83306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.v2 f83307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams f83311f;

    public x2(yz5.l lVar, com.tencent.mm.plugin.appbrand.jsapi.share.v2 v2Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        this.f83306a = lVar;
        this.f83307b = v2Var;
        this.f83308c = activity;
        this.f83309d = str;
        this.f83310e = str2;
        this.f83311f = chatToolParams;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        r45.xz6 xz6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data exists: ");
        boolean z17 = false;
        sb6.append(intent != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb6.toString());
        if (com.tencent.mm.plugin.appbrand.jsapi.share.d3.f83128a != i17) {
            return false;
        }
        yz5.l lVar = this.f83306a;
        if (i18 != -1) {
            if (intent != null && true == intent.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, share to wework");
                lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83249f);
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, cancel");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83250g);
            return true;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since data is null");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 1");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",");
        if (O1 == null || O1.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 2");
            lVar.invoke(com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h);
            return true;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.appbrand.jsapi.share.v2 v2Var = this.f83307b;
        kotlin.jvm.internal.o.d(v2Var);
        int i19 = v2Var.f83290a;
        int i27 = com.tencent.mm.plugin.appbrand.jsapi.share.d3.f83128a;
        android.app.Activity activity = this.f83308c;
        java.lang.String str = this.f83309d;
        java.lang.String str2 = this.f83310e;
        kotlin.jvm.internal.o.d(O1);
        com.tencent.mm.plugin.appbrand.jsapi.share.w2 w2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.w2(lVar);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = O1.size();
        boolean z18 = true ^ (stringExtra2 == null || stringExtra2.length() == 0);
        for (java.lang.String str3 : O1) {
            tg3.a1 a17 = tg3.t1.a();
            com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams = this.f83311f;
            if (chatToolParams.f80345d) {
                xz6Var = new r45.xz6();
                xz6Var.f390633d = chatToolParams.f80346e;
                xz6Var.f390634e = chatToolParams.f80350i;
                xz6Var.f390635f = chatToolParams.f80349h;
                xz6Var.f390636g = chatToolParams.f80347f;
                xz6Var.f390638i = java.lang.String.valueOf(chatToolParams.f80348g);
                xz6Var.f390639m = chatToolParams.f80354p;
            } else {
                xz6Var = null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.share.w2 w2Var2 = w2Var;
            java.lang.String str4 = str2;
            java.lang.String str5 = str;
            android.app.Activity activity2 = activity;
            ((dk5.s5) a17).oj(activity, str3, str, str2, 1, i19, false, false, "", "", xz6Var, chatToolParams.f80351m ? chatToolParams.f80353o : "", new com.tencent.mm.plugin.appbrand.jsapi.share.a3(str3, f0Var, w2Var));
            if (z18) {
                ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra2, c01.e2.C(str3), 0);
            }
            w2Var = w2Var2;
            str2 = str4;
            str = str5;
            activity = activity2;
        }
        return true;
    }
}
