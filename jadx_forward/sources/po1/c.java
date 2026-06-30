package po1;

/* loaded from: classes5.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final po1.d a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u device) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(device.f297522e, "deviceId@roam-at")) {
            return oo1.j.f428678a.a();
        }
        ro1.v vVar = ro1.v.f479547a;
        java.lang.String str = device.f297522e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDeviceId(...)");
        po1.d e17 = vVar.e(str);
        if (e17 == null) {
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.aj().y0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((v32.f) obj).f67434x5fdff3b6, device.f297522e)) {
                    break;
                }
            }
            v32.f fVar = (v32.f) obj;
            if (fVar != null) {
                java.lang.String field_deviceId = fVar.f67434x5fdff3b6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_deviceId, "field_deviceId");
                po1.g a17 = po1.g.f438839d.a(fVar.f67438x12d71904);
                java.lang.String field_nickName = fVar.f67437x21eb2633;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickName, "field_nickName");
                java.lang.String field_nickName2 = fVar.f67437x21eb2633;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickName2, "field_nickName");
                e17 = new po1.d(field_deviceId, a17, field_nickName, field_nickName2, "", "", "");
            }
        }
        if (e17 != null) {
            return e17;
        }
        java.lang.String str2 = device.f297522e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getDeviceId(...)");
        po1.g a18 = po1.g.f438839d.a(device.f297521d);
        java.lang.String str3 = device.f297524g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getDeviceNickname(...)");
        java.lang.String str4 = device.f297524g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getDeviceNickname(...)");
        java.lang.String str5 = device.f297523f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getDevicePath(...)");
        return new po1.d(str2, a18, str3, str4, str5, "", "");
    }

    public final po1.d b(java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        int optInt;
        java.lang.String optString2;
        java.lang.String optString3;
        if (str == null || (optString = (jSONObject = new org.json.JSONObject(str)).optString("deviceId", null)) == null || (optInt = jSONObject.optInt("deviceType", -1)) == -1 || (optString2 = jSONObject.optString("deviceNickname", null)) == null) {
            return null;
        }
        java.lang.String optString4 = jSONObject.optString("deviceRemark", "");
        java.lang.String optString5 = jSONObject.optString("devicePath", null);
        if (optString5 == null || (optString3 = jSONObject.optString("deviceUUID", null)) == null) {
            return null;
        }
        java.lang.String optString6 = jSONObject.optString("uriPath", "");
        po1.g a17 = po1.g.f438839d.a(optInt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
        return new po1.d(optString, a17, optString2, optString4, optString5, optString3, optString6);
    }
}
