package ro1;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final ro1.b f479509c = new ro1.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f479510a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f479511b;

    public c(java.lang.String deviceId, java.lang.String accessMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accessMode, "accessMode");
        this.f479510a = deviceId;
        this.f479511b = accessMode;
    }

    public static final byte[] a(ro1.c cVar) {
        cVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("deviceId", cVar.f479510a);
        jSONObject.put("accessMode", cVar.f479511b);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("wechat-microMsg".concat(jSONObject2));
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2).put("digest", a17);
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        byte[] bytes = jSONObject4.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    /* renamed from: equals */
    public boolean m162778xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro1.c)) {
            return false;
        }
        ro1.c cVar = (ro1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479510a, cVar.f479510a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479511b, cVar.f479511b);
    }

    /* renamed from: hashCode */
    public int m162779x8cdac1b() {
        return (this.f479510a.hashCode() * 31) + this.f479511b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162780x9616526c() {
        return "DeviceMeta(deviceId=" + this.f479510a + ", accessMode=" + this.f479511b + ')';
    }
}
