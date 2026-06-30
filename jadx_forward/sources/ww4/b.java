package ww4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f531922a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f531923b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f531924c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webViewUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUI, "webViewUI");
        this.f531922a = webViewUI;
        this.f531923b = webViewUI.mo55332x76847179();
        this.f531924c = kz5.c0.d("tenpay.com", "pay.weixin.qq.com", "payapp.weixin.qq.com", "wx.tenpay.com", "support.weixin.qq.com", "action.weixin.qq.com", "log.weixin.qq.com", "api.mch.weixin.qq.com", "act.weixin.qq.com", "res.wx.qq.com", "res2.wx.qq.com", "pingjs.qq.com", "badjs.weixinbridge.com", "mmbiz.qpic.cn", "wx.qlogo.cn", "wx.gtimg.com", "weixin110.qq.com", "security.wechat.com", "shminorshort.weixin.qq.com", "kf.qq.com", "act.wechatpay.cn", "gtimg.wechatpay.cn", "tenpay.wechatpay.cn", "reswx.wechatpay.cn", "pay.wechatpay.cn", "payapp.wechatpay.cn", "reswx2.wechatpay.cn");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_fts_quick_h5_domain_block_list_1, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        for (java.lang.String str : r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null)) {
            if (str.length() > 0) {
                java.util.ArrayList arrayList = this.f531924c;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "block domain list: ".concat(kz5.n0.g0(this.f531924c, ", ", null, null, 0, null, null, 62, null)));
    }

    public final boolean a(boolean z17, java.lang.String url) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, isShow " + z17);
        java.lang.String host = android.net.Uri.parse(url).getHost();
        if (!(host == null || host.length() == 0)) {
            for (java.lang.String str : this.f531924c) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(host, str)) {
                    if (r26.i0.o(host, "." + str, false, 2, null)) {
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "in block list, false!");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "canShowFtsQuickEntry yes!");
            z18 = true;
            boolean z19 = !z17 && z18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, finalRes " + z19);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f531922a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            viewOnCreateContextMenuListenerC19337x37f3384d.mo78514x143f1b92().L0(false, 101, z19);
            return z19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "host is empty!");
        z18 = false;
        if (z17) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, finalRes " + z19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = this.f531922a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        viewOnCreateContextMenuListenerC19337x37f3384d2.mo78514x143f1b92().L0(false, 101, z19);
        return z19;
    }
}
