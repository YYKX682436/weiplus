package zd3;

/* loaded from: classes7.dex */
public final class f extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "prepareResourceForExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("type");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        rk0.c.c("MB_External_surface", "prepareResourceForExternalTexture invoke data: " + data, new java.lang.Object[0]);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "video")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String u17 = u(optString);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(u17, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517639e, optInt, optString, jSONObject, null, 16, null), xd3.e.class, new zd3.d(this, u17, optInt, optString, jSONObject));
        } else {
            rk0.c.b("MB_External_surface", "prepareResourceForExternalTexture only support video type, current: " + optString, new java.lang.Object[0]);
            s().mo146xb9724478(h(6, "only support video type"));
        }
    }
}
