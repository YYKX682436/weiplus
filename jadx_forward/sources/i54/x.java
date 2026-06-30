package i54;

/* loaded from: classes4.dex */
public final class x implements h54.h {
    public static final void b(i54.x xVar, h54.d dVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        xVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        if (z17) {
            dVar.a("ok", kz5.c1.l(new jz5.l("ret", 1)));
        } else {
            dVar.a("fail", kz5.c1.l(new jz5.l("ret", 2)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }

    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("scanUrl", "");
        int optInt = data.optInt("directJump", 0);
        data.optInt("syncQrImageDownload", 0);
        java.lang.String optString2 = data.optString("qrExtInfo", "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qrExtInfo", optString2);
        bundle.putInt("qrIsDirectJump", optInt);
        android.content.Context c17 = jsApiContext.c();
        if (!(c17 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdForm.ScanQR", "the context is not activity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
            return;
        }
        ca4.b0 b0Var = new ca4.b0(c17, jsApiContext.e(), 2, bundle);
        java.lang.String l17 = za4.t0.l("adId", optString);
        if ((l17 == null || l17.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            i54.t tVar = new i54.t(this, jsApiContext, b0Var, optString, optInt);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("download", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
            za4.t0.d("adId", optString, new i54.w(optString, tVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("download", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            c(jsApiContext, b0Var, l17, optString, optInt == 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }

    public final void c(h54.d dVar, ca4.b0 b0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        if (z17) {
            b0Var.k(str, str2, new i54.u(this, dVar));
        } else {
            b0Var.l(str, str2, new i54.v(this, dVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }
}
