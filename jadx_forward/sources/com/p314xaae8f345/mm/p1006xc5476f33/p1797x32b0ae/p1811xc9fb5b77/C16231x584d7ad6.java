package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1811xc9fb5b77;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/lite/secure/LiteAppSecureModule;", "Lbd/d;", "", "", "", "params", "Lorg/json/JSONObject;", "makeSuccessResult", "errMsg", "makeErrorResult", "", "errCode", "option", "Ljz5/f0;", "importKey", "encrypt", "decrypt", "sign", "verify", "generateKey", "getPublicKey", "<init>", "()V", "Companion", "na3/c", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.secure.LiteAppSecureModule */
/* loaded from: classes7.dex */
public final class C16231x584d7ad6 extends bd.d {

    /* renamed from: Companion */
    public static final na3.c f37403x233c02ec = new na3.c(null);
    private static final java.lang.String TAG = "LiteAppSecureModule";

    /* renamed from: makeErrorResult */
    private final org.json.JSONObject m65823xacfd2177(java.lang.String errMsg) {
        return m65822xacfd2177(-1, errMsg);
    }

    /* renamed from: makeSuccessResult */
    private final org.json.JSONObject m65824xdf9862b2(java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", 0);
            jSONObject.put("errMsg", "ok");
            if (params != null) {
                for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : params.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value instanceof byte[]) {
                        jSONObject.put(key, android.util.Base64.encodeToString((byte[]) value, 2));
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "makeSuccessResult error: ", e17);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: makeSuccessResult$default */
    public static /* synthetic */ org.json.JSONObject m65825x969b64f(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1811xc9fb5b77.C16231x584d7ad6 c16231x584d7ad6, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            map = null;
        }
        return c16231x584d7ad6.m65824xdf9862b2(map);
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: decrypt */
    public final void m65826x5bf1598d(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString("encrypted"), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("decrypted", eVar.a(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "decrypt error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("decrypt error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: encrypt */
    public final void m65827xa0333265(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            java.lang.String string2 = option.getString("algorithm");
            byte[] decode = android.util.Base64.decode(option.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), 0);
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("encrypted", eVar.b(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "encrypt error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("encrypt error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: generateKey */
    public final void m65828x34da20aa(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("algorithm");
            int optInt = option.optInt("keySize", 2048);
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("keyId", eVar.d(string, optInt)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "generateKey error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("generateKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: getPublicKey */
    public final void m65829x55ab6080(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("publicKey", eVar.f(string, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getPublicKey error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("getPublicKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: importKey */
    public final void m65830xf391d47a(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String optString = option.optString("publicKey");
            java.lang.String string = option.getString("privateKey");
            java.lang.String string2 = option.getString("certificate");
            java.lang.String string3 = option.getString("algorithm");
            byte[] decode = android.util.Base64.decode(optString, 0);
            byte[] decode2 = android.util.Base64.decode(string, 0);
            byte[] decode3 = android.util.Base64.decode(string2, 0);
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("keyId", eVar.g(decode, decode2, decode3, string3)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "importKey error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("importKey error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: sign */
    public final void m65831x35ddbd(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("signature", eVar.h(string, decode, string2)))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "sign error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("sign error: " + e17.getMessage()), false, true);
        }
    }

    @bd.c(m10165xc19dc9be = true)
    /* renamed from: verify */
    public final void m65832xcf208879(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        try {
            java.lang.String string = option.getString("keyId");
            byte[] decode = android.util.Base64.decode(option.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), 0);
            byte[] decode2 = android.util.Base64.decode(option.getString("signature"), 0);
            java.lang.String string2 = option.getString("algorithm");
            na3.e eVar = na3.e.f417519a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            m10168x71965dbb().a(m65824xdf9862b2(kz5.b1.e(new jz5.l("result", java.lang.Boolean.valueOf(eVar.i(string, decode, decode2, string2))))), false, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "verify error: ", e17);
            m10168x71965dbb().a(m65823xacfd2177("verify error: " + e17.getMessage()), false, true);
        }
    }

    /* renamed from: makeErrorResult */
    private final org.json.JSONObject m65822xacfd2177(int errCode, java.lang.String errMsg) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", errCode);
            jSONObject.put("errMsg", errMsg);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "makeErrorResult error: ", e17);
        }
        return jSONObject;
    }
}
