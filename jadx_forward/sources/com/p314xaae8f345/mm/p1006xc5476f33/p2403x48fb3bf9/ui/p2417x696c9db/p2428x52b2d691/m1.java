package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class m1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m1 f267885d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) systemService).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
            java.lang.CharSequence text = itemAt.getText();
            if (text != null) {
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, text);
            }
            java.lang.String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                hashMap.put("htmlText", htmlText);
            }
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l1(env));
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 404;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return be1.r.f4231x24728b;
    }
}
