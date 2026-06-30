package m11;

/* loaded from: classes3.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f404300a = kz5.o1.c("mp.weixin.qq.com");

    public static final boolean a(java.lang.String str) {
        android.net.Uri uri;
        try {
            uri = android.net.Uri.parse(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgSourceUrlUtil", "checkForbidShowSource Uri.parse Exp:%s sourceUrl:%s", e17, str);
            uri = null;
        }
        if (uri == null) {
            return false;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(uri.getQueryParameter("forbidShowSource"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgSourceUrlUtil", "checkForbidShowSource " + P);
        return P == 1;
    }

    public static final void b(android.content.Context context, java.lang.String str, android.content.Intent intent, yz5.q qVar) {
        android.net.Uri uri;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        try {
            uri = android.net.Uri.parse(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl Uri.parse Exp:%s sourceUrl:%s", e17, str);
            uri = null;
        }
        if (!kz5.n0.O(f404300a, uri != null ? uri.getHost() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl not valid sourceUrl:%s", str);
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(uri != null ? uri.getQueryParameter("item_show_type") : null, -1);
        boolean booleanValue = qVar != null ? ((java.lang.Boolean) qVar.mo147xb9724478(context, str, java.lang.Integer.valueOf(P))).booleanValue() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl go : %s openDelegateRet:%b itemShowType:%d", str, java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(P));
        if (booleanValue) {
            return;
        }
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j())) {
            return null;
        }
        return d(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null));
    }

    public static final java.lang.String d(java.util.Map map) {
        if (map == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.img.$imgsourceurl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgSourceUrlUtil", "parseImageSourceUrl decodeExp:%s url:%s", e17, str);
            return null;
        }
    }
}
