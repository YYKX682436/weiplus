package os3;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429708a;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, os3.d0 d0Var) {
        this.f429708a = activityC16931x24037f86;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "console, consoleMessage: %s", consoleMessage);
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429708a;
        if (wi6.startsWith(activityC16931x24037f86.U)) {
            activityC16931x24037f86.mo48674x36654fab();
            try {
                java.lang.String[] split = java.net.URLDecoder.decode(wi6.substring(activityC16931x24037f86.U.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6).split("@@");
                java.lang.String[] split2 = split[0].split(":");
                java.lang.String str = split2[0];
                java.lang.String str2 = split2[1];
                java.lang.String str3 = split2[2];
                java.lang.String str4 = split2[3];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "img onclick, thumbFileName: %s, src: %s, msgLocalId: %s, msgSvrId: %s, msgTalker: %s", str, split[1], str2, str3, str4);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str4, java.lang.Integer.valueOf(str2).intValue());
                android.content.Intent intent = new android.content.Intent(activityC16931x24037f86, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16938x88721600.class);
                intent.putExtra("img_msg_id", Li.m124847x74d37ac6());
                intent.putExtra("img_server_id", Li.I0());
                intent.putExtra("img_download_compress_type", 0);
                intent.putExtra("img_download_username", Li.Q0());
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f862 = this.f429708a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC16931x24037f862, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16931x24037f862.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC16931x24037f862, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage IMG_ONCLICK, ex = %s", e17.getMessage());
            }
        } else {
            if (wi6.startsWith(activityC16931x24037f86.T)) {
                try {
                    activityC16931x24037f86.P = java.net.URLDecoder.decode(wi6.substring(activityC16931x24037f86.T.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_MAIL_CONTENT, ex = %s", e18.getMessage());
                }
                activityC16931x24037f86.getClass();
                return true;
            }
            if (wi6.startsWith(activityC16931x24037f86.S)) {
                ((java.util.HashMap) activityC16931x24037f86.N).clear();
                try {
                    for (java.lang.String str5 : java.net.URLDecoder.decode(wi6.substring(activityC16931x24037f86.S.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6).split("&&")) {
                        java.lang.String[] split3 = str5.split("@@");
                        if (split3.length >= 2) {
                            java.lang.String str6 = split3[0];
                            java.lang.String str7 = split3[1];
                            if (str7.startsWith("file://")) {
                                str7 = str7.replaceFirst("file://", "");
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str6, str7);
                            ((java.util.HashMap) activityC16931x24037f86.N).put(str6, str7);
                        }
                    }
                    activityC16931x24037f86.getClass();
                    return true;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_IMG_INFO, ex = %s", e19.getMessage());
                    return true;
                }
            }
        }
        return false;
    }
}
