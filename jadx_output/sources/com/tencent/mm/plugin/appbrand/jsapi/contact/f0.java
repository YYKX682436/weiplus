package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class f0 implements com.tencent.mm.plugin.appbrand.jsapi.contact.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.n0 f80548c;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f80548c = n0Var;
        this.f80546a = lVar;
        this.f80547b = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map] */
    public void a(boolean z17, java.lang.String str, android.content.Intent intent) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact page enterChatting isSuccess:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var = this.f80548c;
        int i17 = this.f80547b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80546a;
        if (!z17) {
            lVar.a(i17, n0Var.o(str));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        str2 = "";
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("keyOutPagePath");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str2 = stringExtra != null ? stringExtra : "";
            java.lang.String a17 = nf.z.a(str2);
            ?? c17 = nf.z.c(str2);
            str2 = a17;
            hashMap2 = c17;
        }
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        hashMap.put("query", hashMap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "onBackFromContact path:%s, query:%s", str2, hashMap2.toString());
        lVar.a(i17, n0Var.p("ok", hashMap));
    }
}
