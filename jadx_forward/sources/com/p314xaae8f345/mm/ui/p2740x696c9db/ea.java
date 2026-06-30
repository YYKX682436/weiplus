package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes.dex */
public final class ea implements tk.p {
    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onCallback success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17) {
            return;
        }
        dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.phz, 1).show();
    }
}
