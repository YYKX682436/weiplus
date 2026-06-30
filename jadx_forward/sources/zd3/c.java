package zd3;

/* loaded from: classes7.dex */
public final class c extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "operateExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt(dm.i4.f66865x76d1ec5a);
        java.lang.String optString = data.optString("type");
        java.lang.String optString2 = data.optString("action");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        rk0.c.c("MB_External_surface", "operateExternalTexture invoke data: " + data, new java.lang.Object[0]);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "finder-live") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "video")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(u(optString), new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478(ve3.u.f517642h, optInt, optString, jSONObject, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(optString2)), xd3.e.class, new zd3.b(this));
            return;
        }
        java.lang.String str = "type invalid: " + optString + ", id: " + optInt;
        rk0.c.b("MB_External_surface", "operateExternalTexture " + str, new java.lang.Object[0]);
        s().mo146xb9724478(j(lc3.x.f399470d, str));
    }
}
