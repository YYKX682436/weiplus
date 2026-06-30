package km4;

/* loaded from: classes9.dex */
public abstract class v {
    public static final boolean a(android.content.Context context, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        il4.d dVar = il4.d.f373635a;
        boolean m169461x21b05e74 = p3380x6a61f93.p3381xf512d0a5.C30509x21b9b069.m169461x21b05e74(i17);
        if (!m169461x21b05e74) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingSupportUtils", "checkSupportCategoryItem not support categoryType: " + i17);
            if (z17) {
                c(context, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport");
            }
        }
        return m169461x21b05e74;
    }

    public static final boolean b(android.content.Context context, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean m17 = il4.l.m(i17);
        if (!m17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingSupportUtils", "checkSupportListenItem not support listenType: " + i17);
            if (z17) {
                c(context, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport");
            }
        }
        return m17;
    }

    public static final void c(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSupportUtils", "gotoUpgradeWeb url: %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
