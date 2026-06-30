package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0 f267319a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0();

    public final void a(java.lang.String toUser, r45.ee msgInfo, java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5 c19429x834b7ec5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5();
        c19429x834b7ec5.f267262d = toUser;
        c19429x834b7ec5.f267264f = str;
        c19429x834b7ec5.f267266h = msgInfo;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19429x834b7ec5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h0.class, callback);
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        hashMap.put("img_url", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("desc", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str3);
        java.lang.String str5 = com.p314xaae8f345.mm.ui.w2.f292721a;
        if (str4 != null) {
            str5 = str4;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "nullAs(...)");
        hashMap.put("url", str5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoTransmit", "transmitMpVideoMsg, img_url=%s, desc=%s, title=%s, url=%s", hashMap.get("img_url"), hashMap.get("desc"), hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), str4);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", i17);
        intent.putExtra("is_mp_video", true);
        intent.putExtra("Retr_Msg_Type", 1);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        j45.l.v(context, ".ui.transmit.SelectConversationUI", intent, 203);
    }
}
