package zy4;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 f559209d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824) {
        this.f559209d = activityC19511xc9358824;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824 = this.f559209d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            int h17 = gm0.j1.b().h();
            java.lang.String encode = java.net.URLEncoder.encode(o45.wf.f424559d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode2 = java.net.URLEncoder.encode("" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode3 = java.net.URLEncoder.encode(wo.w0.g(true), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode4 = java.net.URLEncoder.encode(o45.wf.f424557b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode5 = java.net.URLEncoder.encode(o45.wf.f424558c, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode6 = java.net.URLEncoder.encode(wo.q.f529317e, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            gm0.j1.b();
            java.lang.String encode7 = java.net.URLEncoder.encode(gm0.m.e(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.String encode8 = java.net.URLEncoder.encode(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("&uin=");
            sb6.append(h17);
            sb6.append("&deviceName=");
            sb6.append(encode);
            sb6.append("&timeZone=");
            sb6.append(encode2);
            sb6.append("&imei=");
            sb6.append(encode3);
            sb6.append("&deviceBrand=");
            sb6.append(encode4);
            sb6.append("&deviceModel=");
            sb6.append(encode5);
            sb6.append("&ostype=");
            sb6.append(encode6);
            sb6.append("&clientSeqID=");
            sb6.append(encode7);
            sb6.append("&signature=");
            sb6.append(encode8);
            sb6.append("&scene=");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? 0 : 1);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = (("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index") + "&from=" + java.net.URLEncoder.encode(activityC19511xc9358824.f269616e.f66653x29106093 + "|" + activityC19511xc9358824.f269615d) + "&version=" + o45.wf.f424562g + "&rev=" + java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e).trim() + "&lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + "&" + sb7) + "#/comment/4134";
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", str);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "意见反馈");
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
            intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
            j45.l.j(activityC19511xc9358824, "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WelabAppInfoUI", "[oneliang]UnsupportedEncodingException:%s", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
