package md3;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final md3.v f407395d = new md3.v();

    public v() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        java.lang.String optString = jsonObject.optString("exportId");
        java.lang.String optString2 = jsonObject.optString("nonceId");
        java.lang.String optString3 = jsonObject.optString("objectId");
        i95.m c17 = i95.n0.c(zy2.a7.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        zy2.a7.Ea((zy2.a7) c17, optString, optString2, 65, 1, 0, 16, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiPreloadFinderVideo", "tryPreloadFinderVideo exportId=" + optString + " nonceId=" + optString2 + " objectId=" + optString3);
        return jz5.f0.f384359a;
    }
}
