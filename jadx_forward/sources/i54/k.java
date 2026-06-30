package i54;

/* loaded from: classes4.dex */
public final class k implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String b17 = jsApiContext.b();
        android.content.Context c17 = jsApiContext.c();
        m54.l e17 = jsApiContext.e();
        if (e17 == null) {
            e17 = new m54.l();
        }
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdForm.OpenFinderProfile", "the context is null!!");
            jsApiContext.a("context is null!!!", kz5.c1.l(new jz5.l("ret", -2), new jz5.l("err_msg", "context is null")));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.OpenFinderProfile", "the open finder profile called!!");
            b54.e.d(c17, b17, data, new i54.j(jsApiContext), e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        }
    }
}
