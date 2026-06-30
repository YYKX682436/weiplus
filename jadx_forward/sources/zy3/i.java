package zy3;

/* loaded from: classes7.dex */
public final class i implements zy3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy3.k f559188a;

    public i(zy3.k kVar) {
        this.f559188a = kVar;
    }

    public void a(java.lang.String str, java.lang.Object obj, int i17, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ok", str);
        boolean z17 = true;
        zy3.k kVar = this.f559188a;
        if (!b17 || i17 != 200 || obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "connect failed statusCode:%d,error:%s", java.lang.Integer.valueOf(i17), obj);
            ((az3.a) kVar.f559194f).a(1, i17, "");
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(obj.toString());
            int i18 = jSONObject2.getInt("errcode");
            kVar.f559193e.f559198a = java.lang.Integer.valueOf(i18);
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "JSON MISSMatch obj: errcode");
                ((az3.a) kVar.f559194f).a(1, i18, "");
                return;
            }
            org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "getJSONObject(...)");
            kVar.f559191c = jSONObject3;
            try {
                kVar.f559193e.f559200c = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121940x93ea93fe(android.util.Base64.decode(kVar.f559191c.getString("data_encrypt_key"), 0), kVar.f559190b[0], com.p3249xcbb51f6b.ndk.C28022x73d433fe.SM2CipherMode.SM2CipherMode_C1C3C2_ASN1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(kVar.f559193e.f559200c)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "SM4 Encrypt Key get failed");
                    ((az3.a) kVar.f559194f).a(5, 10006, "");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f559189a, "SM4 Encrypt Key get success " + kVar.f559193e.f559200c);
                org.json.JSONObject jSONObject4 = kVar.f559191c.getJSONObject("bankcard_res");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "getJSONObject(...)");
                kVar.f559192d = jSONObject4;
                kVar.f559193e.f559199b.f559179e = java.lang.Integer.valueOf(kVar.f559192d.getInt("key_seq"));
                java.lang.String string = kVar.f559192d.getString("aad");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                zy3.a aVar = kVar.f559193e.f559199b;
                java.nio.charset.Charset charset = r26.c.f450398a;
                byte[] bytes = string.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                aVar.f559178d = bytes;
                java.lang.String string2 = kVar.f559192d.getString("tag");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                kVar.f559193e.f559199b.f559176b = android.util.Base64.decode(string2, 0);
                java.lang.String string3 = kVar.f559192d.getString("iv");
                zy3.a aVar2 = kVar.f559193e.f559199b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                byte[] bytes2 = string3.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                aVar2.f559177c = bytes2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f559189a, "SM4 Encrypt Param aad " + kVar.f559193e.f559199b.f559178d + ",tag " + kVar.f559193e.f559199b.f559176b + ",iv " + kVar.f559193e.f559199b.f559177c);
                kVar.f559193e.f559199b.f559175a = android.util.Base64.decode(kVar.f559192d.getString("cipher_text"), 0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(kVar.f559193e.f559199b.f559175a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "Decode Base64 get failed");
                    ((az3.a) kVar.f559194f).a(5, 10006, "");
                    return;
                }
                zy3.a aVar3 = kVar.f559193e.f559199b;
                com.p3249xcbb51f6b.ndk.C28022x73d433fe m121931x9cf0d20b = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b();
                zy3.m mVar = kVar.f559193e;
                zy3.a aVar4 = mVar.f559199b;
                aVar3.f559175a = m121931x9cf0d20b.m121956xbad2fdf6(aVar4.f559175a, aVar4.f559176b, mVar.f559200c, aVar4.f559177c, aVar4.f559178d);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(kVar.f559193e.f559199b.f559175a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "SM4 GCM Decode Failed");
                    ((az3.a) kVar.f559194f).a(5, 10006, "");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f559189a, "SM4 GCM Decode OCR Data Success " + kVar.f559193e.f559199b.f559175a);
                r45.ld ldVar = new r45.ld();
                ldVar.mo11468x92b714fd(kVar.f559193e.f559199b.f559175a);
                java.lang.String str2 = ldVar.f460850e.f473988d;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "Protobuf Decode Failed");
                    ((az3.a) kVar.f559194f).a(5, 10006, "");
                } else {
                    zy3.j jVar = kVar.f559194f;
                    java.lang.String text = ldVar.f460850e.f473988d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "text");
                    ((az3.a) jVar).a(0, 0, text);
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "JSON MISSMatch obj: %s", e17.getMessage());
                ((az3.a) kVar.f559194f).a(1, 10005, "");
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f559189a, "JSON MISSMatch obj: errcode");
            ((az3.a) kVar.f559194f).a(1, 10005, "");
        }
    }
}
