package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class o8 implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o8 f289479a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o8();

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5
    public boolean a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 context, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is null");
            return false;
        }
        yb5.d dVar = context.f289183a;
        r45.g15 g15Var = context.f289184b;
        byte[] bArr = context.f289185c;
        boolean optBoolean = jSONObject.optBoolean("isOrderMsg");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("orderParam");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("orderID") : null;
        boolean optBoolean2 = jSONObject.optBoolean("isProductMsg");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("productParam");
        java.lang.String optString2 = optJSONObject2 != null ? optJSONObject2.optString("productID") : null;
        java.lang.String optString3 = optJSONObject2 != null ? optJSONObject2.optString("finderUsername") : null;
        java.lang.String optString4 = optJSONObject2 != null ? optJSONObject2.optString("ecSource") : null;
        if (optString != null && optBoolean) {
            ot0.q qVar = new ot0.q();
            qVar.f430187f = g15Var.f456338e;
            qVar.f430199i = 96;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) ((s40.b1) i95.n0.c(s40.b1.class))).Vi(context.f289183a.g(), optString, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m8(qVar, dVar));
            return true;
        }
        if (optBoolean2) {
            if (!(optString2 == null || optString2.length() == 0)) {
                r45.br2 br2Var = new r45.br2();
                br2Var.set(7, optString2);
                br2Var.set(17, optString4);
                br2Var.set(1, optString3);
                s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
                android.app.Activity g17 = context.f289183a.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n8 n8Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n8(br2Var, dVar, context);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).getClass();
                zl2.b0.i(zl2.b0.f555196a, g17, br2Var, n8Var, false, 0, 24, null);
                return true;
            }
        }
        ot0.q qVar2 = new ot0.q();
        qVar2.f430187f = g15Var.f456338e;
        qVar2.f430199i = 33;
        java.lang.String str = g15Var.f456344n;
        if (str == null) {
            str = "";
        }
        qVar2.f430206j2 = str;
        qVar2.f430202i2 = g15Var.f456339f;
        java.lang.String str2 = g15Var.f456343m;
        if (str2 == null) {
            str2 = "";
        }
        qVar2.f430210k2 = str2;
        qVar2.f430270z2 = g15Var.f456347q;
        qVar2.A2 = g15Var.f456348r;
        java.lang.String str3 = g15Var.f456349s;
        if (str3 == null) {
            str3 = "";
        }
        qVar2.f430218m2 = str3;
        qVar2.f430214l2 = 2;
        java.lang.String str4 = g15Var.f456352v;
        if (str4 == null) {
            str4 = "";
        }
        qVar2.f430207k = str4;
        java.lang.String str5 = g15Var.f456346p;
        if (str5 == null) {
            str5 = "";
        }
        qVar2.B2 = str5;
        qVar2.L1 = "wxapp_" + g15Var.f456343m + g15Var.f456351u;
        java.lang.String str6 = g15Var.f456344n;
        if (str6 == null) {
            str6 = "";
        }
        qVar2.f430255w = str6;
        java.lang.String str7 = g15Var.f456345o;
        if (str7 == null) {
            str7 = "";
        }
        qVar2.f430259x = str7;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l8 l8Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l8();
        java.lang.String str8 = g15Var.f456343m;
        l8Var.f289382e = str8 != null ? str8 : "";
        l8Var.f289381d = qVar2;
        l8Var.f289386i = g15Var.f456338e;
        l8Var.f289384g = g15Var.f456340g;
        l8Var.f289383f = g15Var.f456342i;
        l8Var.f289385h = dVar.x();
        l8Var.f289387m = g15Var.f456341h;
        l8Var.f289388n = bArr;
        ((ku5.t0) ku5.t0.f394148d).g(l8Var);
        return true;
    }
}
