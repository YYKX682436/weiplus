package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class bd {
    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sender_name", str);
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/transfertochange/jumpclienterrpage/jumppage#wechat_pay");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgRemittance", "remittance data lose, jump to h5 page, url = %s", "https://payapp.weixin.qq.com/transfertochange/jumpclienterrpage/jumppage#wechat_pay");
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.a9 b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgRemittance", "[createExtInfoImpl] msg == null");
            return null;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgRemittance", "[createExtInfoImpl] content == null");
            return null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b();
        c6255xde73125b.f136504g.f89954a = v17.L0;
        c6255xde73125b.e();
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ad(c6255xde73125b);
    }

    public static void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar, int i17) {
        wcVar.f287452c.setVisibility(8);
        wcVar.m80054x4906274a(wcVar.f39493x8ad70635, wcVar.f287457h);
        wcVar.f39493x8ad70635.setBackgroundResource(i17);
        wcVar.f39493x8ad70635.setPadding(0, 0, 0, 0);
        wcVar.f287453d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572394b53);
        wcVar.f287451b.setImageResource(com.p314xaae8f345.mm.R.raw.f78731xca768c4f);
    }
}
