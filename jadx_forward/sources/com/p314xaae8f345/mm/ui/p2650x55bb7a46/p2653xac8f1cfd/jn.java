package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public abstract class jn {
    public static final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String talker, java.lang.String langCode, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langCode, "langCode");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(msg.m124847x74d37ac6()));
        hashMap.put("chat_username", talker);
        hashMap.put("current_language_code", langCode);
        hashMap.put("clk_language_popup_btn", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("same_language_popup", "view_clk", hashMap, 35268);
    }
}
