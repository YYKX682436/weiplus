package ra3;

/* loaded from: classes9.dex */
public final class t {
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ra3.u a(org.json.JSONObject json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        java.lang.String string = json.getString("fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = json.getString("aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = json.getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String string4 = json.getString("fileExt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        java.lang.String string5 = json.getString("md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        java.lang.String string6 = json.getString("fileSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        return new ra3.u(string, string2, string3, string4, string5, java.lang.Long.parseLong(string6));
    }
}
