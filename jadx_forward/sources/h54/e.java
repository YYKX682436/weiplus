package h54;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final h54.e f360622a = new h54.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f360623b = kz5.c1.l(new jz5.l("opEndQRScan", i54.x.class), new jz5.l("opGetLocation", i54.h.class), new jz5.l("opGetDeviceInfo", i54.f.class), new jz5.l("requestBindPhoneNumber", i54.s.class), new jz5.l("openWheelPicker", i54.m.class), new jz5.l("getCanAutoFillData", i54.e.class), new jz5.l("setCanAutoFillData", i54.z.class), new jz5.l("opOpenFinderProfile", i54.k.class), new jz5.l("opFinderFollow", i54.c.class), new jz5.l("opQueryFinderFollowState", i54.o.class), new jz5.l("opUpdateContentHeight", i54.a0.class), new jz5.l("controlFloatComponent", i54.a.class), new jz5.l("requestAppointment", i54.q.class), new jz5.l("performAction", i54.i.class));

    public final void a(h54.d context, java.lang.String method, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (method.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormJsApi", "the form js api name is empty!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiSet");
            return;
        }
        java.lang.Class cls = (java.lang.Class) ((java.util.LinkedHashMap) f360623b).get(method);
        if (cls != null) {
            try {
                ((h54.h) cls.newInstance()).a(context, data);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FormJsApi", "the exception is " + th6.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiSet");
    }
}
