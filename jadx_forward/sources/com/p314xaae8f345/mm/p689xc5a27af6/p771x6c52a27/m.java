package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

@j95.b
/* loaded from: classes13.dex */
public class m extends i95.w implements mh0.p {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f149388d;

    public void wi(android.app.Activity activity, java.lang.String str, mh0.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayMidasFeatureService", "midasDirectPay");
        if (activity == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay activity or payInfo invalid");
            if (oVar != null) {
                oVar.a(-1, "activity or payInfo invalid");
                return;
            }
            return;
        }
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b c4742x2925229b = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b();
        c4742x2925229b.f20215xd10bf576 = str;
        if (f149388d == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_midas_pay_preinit_disable, 0) == 1);
            f149388d = valueOf;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayMidasFeatureService", "disablePreInit:%b", valueOf);
        }
        if (!f149388d.booleanValue()) {
            com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41365x316510(activity, c4742x2925229b);
        }
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41352x9dc22f9e(activity, c4742x2925229b, new com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.l(this, oVar, str));
    }
}
