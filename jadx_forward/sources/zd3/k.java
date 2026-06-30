package zd3;

/* loaded from: classes7.dex */
public final class k extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "registerExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("type");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        rk0.c.c("MB_External_surface", "registerExternalTexture invoke data: " + data, new java.lang.Object[0]);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "finder-live");
        lc3.z zVar = lc3.x.f399470d;
        if (!b17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "video")) {
            java.lang.String str = "type invalid: " + optString + ", id: " + optInt;
            rk0.c.b("MB_External_surface", "registerExternalTexture " + str, new java.lang.Object[0]);
            s().mo146xb9724478(j(zVar, str));
            return;
        }
        if (optJSONObject == null) {
            w(zVar, "extraData is null, id: " + optInt + ", type: " + optString);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "finder-live")) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517639e, optInt, optString, optJSONObject.toString(), null, 16, null), xd3.e.class, new zd3.j(this, optInt, optString, optJSONObject));
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "video")) {
                v(optInt, optString, optJSONObject);
                return;
            }
            w(lc3.x.f399469c, "type invalid: " + optString + ", id: " + optInt);
        }
    }

    public final void v(int i17, java.lang.String type, org.json.JSONObject jSONObject) {
        zd3.i iVar = new zd3.i(type, i17, this);
        bf3.p0 p0Var = bf3.p0.f101178a;
        int b17 = a06.d.b(p0Var.a() * jSONObject.optInt("width", 0));
        int b18 = a06.d.b(p0Var.a() * jSONObject.optInt("height", 0));
        if (b17 <= 0 || b18 <= 0) {
            w(lc3.x.f399470d, "Invalid size: w=" + b17 + ", h=" + b18 + ", id=" + i17);
            return;
        }
        jSONObject.put("containerWidth", b17);
        jSONObject.put("containerHeight", b18);
        lc3.h0 h0Var = (lc3.h0) this.f399423a;
        if (h0Var == null) {
            w(lc3.x.f399469c, "context is null, id: " + i17);
            return;
        }
        zd3.g gVar = new zd3.g(this, i17, b17, b18, iVar, jSONObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = ((sc3.k1) h0Var).f488021t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e c4211x20e2c38e = c4209xd2d3ddad.f130115f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4211x20e2c38e, "getExternalTexturePlugin(...)");
        bh.a.a(c4211x20e2c38e, type, i17, b17, b18, null, gVar, null, false, 64, null);
    }

    public final void w(lc3.z zVar, java.lang.String str) {
        if (str == null) {
            str = "unknown error";
        }
        rk0.c.b("MB_External_surface", "registerExternalTexture error: ".concat(str), new java.lang.Object[0]);
        s().mo146xb9724478(j(zVar, str));
    }
}
