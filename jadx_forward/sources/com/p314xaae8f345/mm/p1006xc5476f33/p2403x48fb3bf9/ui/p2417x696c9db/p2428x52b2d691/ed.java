package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ed extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ed f267601d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ed();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f267602e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f267602e = msg.f422546c;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("placeholder");
        java.lang.Object obj = msg.f422323a.get("maxLength");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.Object obj2 = msg.f422323a.get("showRemindWordCount");
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null, 0);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) msg.f422323a.get("hidden"), false);
        java.lang.String str3 = (java.lang.String) msg.f422323a.get("customParams");
        bundle.putString("show_kb_placeholder", str2);
        bundle.putInt("show_kb_max_length", D1);
        bundle.putInt("show_kb_show_remind_word_count", D12);
        bundle.putString("show_kb_text", str);
        bundle.putBoolean("show_kb_to_show", z17);
        bundle.putString("key_show_kb_custom_params", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowKeyBoard", "showKeyboard text=" + str + ", placeholder=" + str2 + ", maxLength=" + D1 + ", showRemindWordCount=" + D12 + ", toShow=" + z17 + ", customParamsString=" + str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
        if (b17 != null) {
            b17.i(37, bundle);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 187;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return qc1.v.f76446x24728b;
    }
}
