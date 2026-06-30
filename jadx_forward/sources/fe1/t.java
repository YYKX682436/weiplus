package fe1;

/* loaded from: classes15.dex */
public final class t extends fe1.a {

    /* renamed from: CTRL_INDEX */
    public static final int f69748x366c91de = 1579;

    /* renamed from: NAME */
    public static final java.lang.String f69749x24728b = "rechargeTransitCard";

    @Override // fe1.a
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = data.optString("issuerID", "");
        java.lang.String optString2 = data.optString("orderNo", "");
        java.lang.String optString3 = data.optString("operation", "");
        java.lang.String optString4 = data.optString("sign", "");
        java.lang.String optString5 = data.optString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (!(optString2.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                if (!(optString3.length() == 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                    if (!(optString4.length() == 0)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                        fe1.s sVar = new fe1.s(currentTimeMillis, optString, env, this, i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12258x89a7d0ec c12258x89a7d0ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12258x89a7d0ec(manager.f343035a, optString, optString2, optString4, optString5, optString3);
                        c12258x89a7d0ec.F(sVar);
                        c12258x89a7d0ec.d();
                        return;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.JsApiRecharge", "execute, missing required parameters");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f372511a;
        java.lang.String mo48798x74292566 = env.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        bVar.a(f69749x24728b, false, currentTimeMillis, currentTimeMillis2, 10011, "issuerID, orderNo, operation, sign are required", optString, mo48798x74292566);
        env.a(i17, de1.b.a(this, 10011, "fail:issuerID, orderNo, operation, sign are required", kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 10011))));
    }
}
