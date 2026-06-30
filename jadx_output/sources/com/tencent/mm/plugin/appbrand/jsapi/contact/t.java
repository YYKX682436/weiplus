package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes12.dex */
public class t implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.v f80611c;

    public t(com.tencent.mm.plugin.appbrand.jsapi.contact.v vVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f80611c = vVar;
        this.f80609a = e9Var;
        this.f80610b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.v vVar = this.f80611c;
        int i19 = vVar.f80615g;
        int i27 = this.f80610b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80609a;
        if (i19 != i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact requestCode not equal, requestCode = %d", java.lang.Integer.valueOf(i17));
            e9Var.a(i27, vVar.o("fail"));
            return false;
        }
        if (i18 == 0 || i18 == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact user cancel, resultCode = %d", java.lang.Integer.valueOf(i17));
            e9Var.a(i27, vVar.o("cancel"));
            return true;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseWeChatContact", "mmOnActivityResult, selectSingleContact fail, user is null");
                e9Var.a(i27, vVar.o("fail"));
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask jsApiChooseWeChatContact$GetUserDataTask = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask(stringExtra);
                jsApiChooseWeChatContact$GetUserDataTask.s();
                java.lang.String str = jsApiChooseWeChatContact$GetUserDataTask.f80491h;
                java.lang.String str2 = jsApiChooseWeChatContact$GetUserDataTask.f80492i;
                java.lang.String str3 = jsApiChooseWeChatContact$GetUserDataTask.f80493m;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("avatarUrl", str3);
                hashMap.put("userName", stringExtra);
                hashMap.put("nickName", str);
                hashMap.put("remarkName", str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact: nickName:%s, remarkName:%s", str, str2);
                e9Var.a(i27, vVar.p("ok", hashMap));
            }
        }
        return true;
    }
}
