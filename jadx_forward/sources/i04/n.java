package i04;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368094a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f368095b;

    /* renamed from: c, reason: collision with root package name */
    public final int f368096c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f368097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f368098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f368100g;

    public n(java.lang.String uin, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkv, "mmkv");
        this.f368094a = uin;
        this.f368095b = mmkv;
        this.f368096c = 1800000;
        this.f368097d = new java.util.ArrayList();
        this.f368098e = 3600000;
        this.f368099f = 28800000;
        this.f368100g = 17;
    }

    public final long a() {
        long c17 = c01.id.c();
        return c17 - ((java.util.TimeZone.getDefault().getRawOffset() + c17) % 86400000);
    }

    public final java.lang.String b() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (i04.m mVar : this.f368097d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("disable", mVar.f368092a);
            jSONObject.put("time", mVar.f368093b);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}
