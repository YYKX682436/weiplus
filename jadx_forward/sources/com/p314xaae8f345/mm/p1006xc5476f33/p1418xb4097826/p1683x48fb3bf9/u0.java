package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class u0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218461a;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218461a = n1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218461a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic share image to friend fail, imgPath is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("web_search_data_ui_image_path", str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n1Var.f218438i)) {
                n1Var.f218438i = n1Var.f().mo63363xad58252c();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n1Var.f218438i) || !(n1Var.f218438i.startsWith("http://mp.weixin.qq.com/s?") || n1Var.f218438i.startsWith("https://mp.weixin.qq.com/s?") || n1Var.f218438i.startsWith("http://mp.weixin.qq.com/s/") || n1Var.f218438i.startsWith("https://mp.weixin.qq.com/s/"))) {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            } else {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
            }
            n1Var.f().mo63365x1e89676e().ng(53, bundle, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) n1Var.f().getWebViewController()).U());
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e17.getLocalizedMessage());
        }
    }
}
