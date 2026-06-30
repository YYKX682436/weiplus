package jy3;

/* loaded from: classes9.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(r45.ho hoVar) {
        r45.k06 k06Var;
        java.lang.String str;
        java.lang.String str2;
        if (hoVar == null) {
            return "";
        }
        cl0.g gVar = new cl0.g();
        try {
            gVar.o("resp_handshake_type_flag", hoVar.f457859g);
            int i17 = hoVar.f457859g;
            if ((i17 & 1) != 0) {
                r45.j06 j06Var = hoVar.f457856d;
                if (j06Var != null && (str2 = j06Var.f459007e) != null) {
                    gVar.h("signature_plain_json", str2);
                }
            } else if ((i17 & 2) != 0 && (k06Var = hoVar.f457857e) != null && (str = k06Var.f459808f) != null) {
                gVar.h("signature_plain_json", str);
            }
            r45.j06 j06Var2 = hoVar.f457856d;
            if (j06Var2 != null) {
                if ((j06Var2 != null ? j06Var2.f459006d : null) != null) {
                    gVar.h("ecdsa_signature", android.util.Base64.encodeToString(j06Var2.f459006d.f273689a, 2));
                }
            }
            r45.k06 k06Var2 = hoVar.f457857e;
            if (k06Var2 != null) {
                if ((k06Var2 != null ? k06Var2.f459806d : null) != null) {
                    gVar.h("hmac_signature", android.util.Base64.encodeToString(k06Var2.f459806d.f273689a, 2));
                }
                r45.k06 k06Var3 = hoVar.f457857e;
                if ((k06Var3 != null ? k06Var3.f459807e : null) != null) {
                    gVar.h("local_base_key", android.util.Base64.encodeToString(k06Var3.f459807e.f273689a, 2));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "parse json fail: %s", e17);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final jy3.a b(java.lang.String json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        jy3.a aVar = new jy3.a();
        cl0.g gVar = new cl0.g(json);
        aVar.f384026a = gVar.mo15080xc3ca103c("req_handshake_type_flag", 0);
        cl0.g b17 = gVar.b("ecdh_req");
        if (b17 != null) {
            java.lang.String mo15082x48bce8a4 = b17.mo15082x48bce8a4("device4wxapp_ecdh_pub_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a4, "optString(...)");
            aVar.f384027b = mo15082x48bce8a4;
            java.lang.String mo15082x48bce8a42 = b17.mo15082x48bce8a4("wxapp4device_ecdh_pub_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
            aVar.f384028c = mo15082x48bce8a42;
            java.lang.String mo15082x48bce8a43 = b17.mo15082x48bce8a4("local_base_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a43, "optString(...)");
            aVar.f384029d = mo15082x48bce8a43;
        }
        cl0.g b18 = gVar.b("psk_req");
        if (b18 != null) {
            java.lang.String mo15082x48bce8a44 = b18.mo15082x48bce8a4("ticket_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a44, "optString(...)");
            aVar.f384030e = mo15082x48bce8a44;
        }
        cl0.g b19 = gVar.b("handshake_base_req");
        if (b19 != null) {
            java.lang.String mo15082x48bce8a45 = b19.mo15082x48bce8a4("device_random");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a45, "optString(...)");
            aVar.f384031f = mo15082x48bce8a45;
            java.lang.String mo15082x48bce8a46 = b19.mo15082x48bce8a4("wxapp_random");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a46, "optString(...)");
            aVar.f384032g = mo15082x48bce8a46;
            java.lang.String mo15082x48bce8a47 = b19.mo15082x48bce8a4("client_id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a47, "optString(...)");
            aVar.f384033h = mo15082x48bce8a47;
            aVar.f384034i = b19.mo15072xb58848b9("hw_client_version");
            java.lang.String mo15082x48bce8a48 = b19.mo15082x48bce8a4("hw_device_type");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a48, "optString(...)");
            aVar.f384035j = mo15082x48bce8a48;
        }
        return aVar;
    }
}
