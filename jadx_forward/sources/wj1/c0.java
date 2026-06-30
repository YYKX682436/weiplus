package wj1;

/* loaded from: classes14.dex */
public class c0 implements wj1.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 f528109a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5) {
        this.f528109a = activityC12702xc32382a5;
    }

    public static void a(wj1.c0 c0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
        db5.e1.K(activityC12702xc32382a5, false, str, "", activityC12702xc32382a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571618kh), "", new wj1.q(c0Var), new wj1.r(c0Var));
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "verifyPassword");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528109a;
        g0Var.d(14943, activityC12702xc32382a5.f171065e, 2, activityC12702xc32382a5.f171072o.f463494s);
        if (activityC12702xc32382a5.f171072o.f463495t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "showAuthorizeUserIDResp.verify_pay_req is null");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", activityC12702xc32382a5.f171072o.f463495t.f468398d);
            jSONObject.put("timeStamp", activityC12702xc32382a5.f171072o.f463495t.f468399e);
            jSONObject.put("nonceStr", activityC12702xc32382a5.f171072o.f463495t.f468400f);
            jSONObject.put("package", activityC12702xc32382a5.f171072o.f463495t.f468401g);
            jSONObject.put("signType", activityC12702xc32382a5.f171072o.f463495t.f468402h);
            jSONObject.put("paySign", activityC12702xc32382a5.f171072o.f463495t.f468403i);
            g0Var.d(14943, activityC12702xc32382a5.f171065e, 3, activityC12702xc32382a5.f171072o.f463494s);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.INSTANCE.m51171x6ad51e34(activityC12702xc32382a5, null, jSONObject, new wj1.n(this));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandIDCardUI", e17, "", new java.lang.Object[0]);
        }
    }
}
