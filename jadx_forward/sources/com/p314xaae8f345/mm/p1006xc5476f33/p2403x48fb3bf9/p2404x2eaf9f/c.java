package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String uri;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        try {
            str = intent.getStringExtra("rawUrl");
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewController", "getRawUrl exception:%s", e17.getMessage());
            if (e17 instanceof java.lang.ClassNotFoundException) {
                throw e17;
            }
            str = null;
        }
        if (!(str == null || r26.n0.N(str))) {
            return str;
        }
        android.net.Uri data = intent.getData();
        return (data == null || (uri = data.toString()) == null) ? "" : uri;
    }
}
