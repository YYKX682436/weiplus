package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class i5 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f266358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f266360c;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.Boolean bool, java.lang.String str) {
        this.f266360c = b5Var;
        this.f266358a = bool;
        this.f266359b = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f266360c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic share image to friend fail, imgPath is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("web_search_data_ui_image_path", str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b5Var.f265474i)) {
                b5Var.f265474i = b5Var.j();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b5Var.f265474i) || !(b5Var.f265474i.startsWith("http://mp.weixin.qq.com/s?") || b5Var.f265474i.startsWith("https://mp.weixin.qq.com/s?") || b5Var.f265474i.startsWith("http://mp.weixin.qq.com/s/") || b5Var.f265474i.startsWith("https://mp.weixin.qq.com/s/"))) {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            } else {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
            }
            bundle.putBoolean("web_search_data_ui_image_path_use_circle_to_search", this.f266358a.booleanValue());
            bundle.putString("web_search_data_ui_image_path_origin_url", b5Var.f265474i);
            bundle.putString("web_search_data_ui_image_path_image_url", this.f266359b);
            b5Var.f265480o.mo74477x143f1b92().A.ng(53, bundle, b5Var.f265480o.mo74477x143f1b92().U());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e17.getLocalizedMessage());
        }
    }
}
