package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes10.dex */
public final class s1 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return "未知类型";
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        rt0.e eVar = (aVar == null || (qVar = aVar.f509490a) == null) ? null : (rt0.e) qVar.y(rt0.e.class);
        if (eVar != null) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f480913e, "content", null);
            android.widget.TextView textView = aVar.f509501l;
            if (d17 == null || (str = (java.lang.String) d17.get(".msg.appmsg.title")) == null) {
                str = "";
            }
            textView.setText(str);
        }
    }
}
