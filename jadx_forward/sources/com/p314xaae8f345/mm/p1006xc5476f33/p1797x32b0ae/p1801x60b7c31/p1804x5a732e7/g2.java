package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/g2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225115g = "";

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("pid") : null;
        if (optString == null || optString.length() == 0) {
            this.f224976f.a("emoticonUsePackInChat:fail_missing arguments");
            return;
        }
        this.f225115g = optString;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("callback_id", m93.j.a(this));
        intent.putExtra("webview_params", new java.util.HashMap());
        intent.putExtra("Select_Conv_Type", com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonUsePackInChat", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonUsePackInChat", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        java.lang.String member = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        if (member == null || member.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        java.lang.String pid = this.f225115g;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
        c4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pid, "pid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f147740d, "usePackInChat, pid=".concat(pid));
        if (c17 instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) c17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(member)) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", member);
            intent2.putExtra("smiley_product_id", pid);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, activity);
        }
    }
}
