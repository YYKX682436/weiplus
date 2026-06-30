package os3;

/* loaded from: classes8.dex */
public class r0 extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f429715a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429716b;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, os3.d0 d0Var) {
        this.f429716b = activityC16931x24037f86;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429716b;
        if (str.startsWith(activityC16931x24037f86.U)) {
            activityC16931x24037f86.mo48674x36654fab();
            try {
                java.lang.String[] split = java.net.URLDecoder.decode(str.substring(activityC16931x24037f86.U.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6).split("@@");
                java.lang.String[] split2 = split[0].split(":");
                java.lang.String str2 = split2[0];
                java.lang.String str3 = split2[1];
                java.lang.String str4 = split2[2];
                java.lang.String str5 = split2[3];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "img onclick, thumbFileName: %s, src: %s, msgLocalId: %s, msgSvrId: %s, msgTalker: %s", str2, split[1], str3, str4, str5);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str5, java.lang.Integer.valueOf(str3).intValue());
                android.content.Intent intent = new android.content.Intent(activityC16931x24037f86, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16938x88721600.class);
                intent.putExtra("img_msg_id", Li.m124847x74d37ac6());
                intent.putExtra("img_server_id", Li.I0());
                intent.putExtra("img_download_compress_type", 0);
                intent.putExtra("img_download_username", Li.Q0());
                com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f862 = this.f429716b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC16931x24037f862, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16931x24037f862.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC16931x24037f862, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading IMG_ONCLICK, ex = %s", e17.getMessage());
            }
        } else {
            if (str.startsWith(activityC16931x24037f86.T)) {
                try {
                    activityC16931x24037f86.P = java.net.URLDecoder.decode(str.substring(activityC16931x24037f86.T.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_MAIL_CONTENT, ex = %s", e18.getMessage());
                }
                activityC16931x24037f86.getClass();
                return true;
            }
            if (str.startsWith(activityC16931x24037f86.S)) {
                ((java.util.HashMap) activityC16931x24037f86.N).clear();
                try {
                    for (java.lang.String str6 : java.net.URLDecoder.decode(str.substring(activityC16931x24037f86.S.length()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6).split("&&")) {
                        java.lang.String[] split3 = str6.split("@@");
                        if (split3.length >= 2) {
                            java.lang.String str7 = split3[0];
                            java.lang.String str8 = split3[1];
                            if (str8.startsWith("file://")) {
                                str8 = str8.replaceFirst("file://", "");
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str7, str8);
                            ((java.util.HashMap) activityC16931x24037f86.N).put(str7, str8);
                        }
                    }
                    activityC16931x24037f86.getClass();
                    return true;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_IMG_INFO, ex = %s", e19.getMessage());
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (this.f429715a) {
            return;
        }
        this.f429715a = true;
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429716b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC16931x24037f86.f236383w;
        java.lang.String str2 = activityC16931x24037f86.T;
        java.lang.String str3 = activityC16931x24037f86.I;
        ((yg0.s4) q3Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.i(c22633x83752a59, str2, str3, true);
        if (activityC16931x24037f86.getIntent().getBooleanExtra("mail_edit_mode", false)) {
            zg0.q3 q3Var2 = (zg0.q3) i95.n0.c(zg0.q3.class);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = activityC16931x24037f86.f236383w;
            java.lang.String str4 = activityC16931x24037f86.S;
            java.lang.String str5 = activityC16931x24037f86.H;
            ((yg0.s4) q3Var2).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.i(c22633x83752a592, str4, str5, true);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429716b;
        if (activityC16931x24037f86.V) {
            return;
        }
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC16931x24037f86.f236383w;
        ((yg0.s4) q3Var).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (c22633x83752a59 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w8(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v8(c22633x83752a59)));
        }
        activityC16931x24037f86.V = true;
    }
}
