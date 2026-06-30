package ls2;

/* loaded from: classes2.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final org.json.JSONObject a(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m77188xfb83cc9b;
        java.lang.String m77166xb5887639;
        java.lang.String str3;
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        int m76503x92bc3c07 = jumpInfo.m76503x92bc3c07();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("iconname", jumpInfo.m76523x98b23862());
        jSONObject2.put("iconurl", b(context, jumpInfo));
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        boolean z17 = true;
        str = "";
        if (m76503x92bc3c07 == 1) {
            jSONObject2.put("icontype", 1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e = jumpInfo.m76505xea668b3e();
            if (m76505xea668b3e == null || (str2 = m76505xea668b3e.m77174x10fbdaef()) == null) {
                str2 = "";
            }
            jSONObject3.put("appid", str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e2 = jumpInfo.m76505xea668b3e();
            if (m76505xea668b3e2 != null && (m77188xfb83cc9b = m76505xea668b3e2.m77188xfb83cc9b()) != null) {
                str = m77188xfb83cc9b;
            }
            jSONObject3.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
        } else if (m76503x92bc3c07 == 2) {
            jSONObject2.put("icontype", 3);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9 = jumpInfo.m76494x46f709d9();
            if (m76494x46f709d9 != null && (m77166xb5887639 = m76494x46f709d9.m77166xb5887639()) != null) {
                str = m77166xb5887639;
            }
            jSONObject3.put("url", str);
        } else if (m76503x92bc3c07 == 3) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = jumpInfo.m76506x42318aa0();
            java.lang.String str4 = null;
            java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = jumpInfo.m76506x42318aa0();
            if (m76506x42318aa02 == null || (str3 = m76506x42318aa02.m77225xe7ed3fec()) == null) {
                str3 = "";
            }
            try {
                jSONObject = new org.json.JSONObject(str3);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ProfileMenuConvert", e17.getMessage());
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            if (valueOf != null && valueOf.intValue() == 2) {
                jSONObject2.put("icontype", 2);
                try {
                    if (!jSONObject.has("cardId")) {
                        z17 = false;
                    }
                    if (z17) {
                        str4 = jSONObject.getString("cardId");
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e18);
                }
                jSONObject3.put("cardId", str4 != null ? str4 : "");
            } else if (valueOf != null && valueOf.intValue() == 7) {
                jSONObject2.put("icontype", 4);
                try {
                    if (!jSONObject.has("kf_url")) {
                        z17 = false;
                    }
                    if (z17) {
                        str4 = jSONObject.getString("kf_url");
                    }
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e19);
                }
                jSONObject3.put("kf_url", str4 != null ? str4 : "");
            }
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        jSONObject2.put("utf_kv", r26.i0.t(jSONObject4, ",", ";", false));
        return jSONObject2;
    }

    public final java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        java.lang.String m76497x4fe38a1f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie.class)).f205344p;
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        if (z17) {
            m76497x4fe38a1f = c19786x6a1e2862.m76498xc007be65();
            if (m76497x4fe38a1f == null) {
                return "";
            }
        } else if (C) {
            m76497x4fe38a1f = c19786x6a1e2862.m76499xdd129996();
            if (m76497x4fe38a1f == null) {
                return "";
            }
        } else {
            m76497x4fe38a1f = c19786x6a1e2862.m76497x4fe38a1f();
            if (m76497x4fe38a1f == null) {
                return "";
            }
        }
        return m76497x4fe38a1f;
    }
}
