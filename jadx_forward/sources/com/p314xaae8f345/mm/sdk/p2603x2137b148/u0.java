package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f274533a = "<unknown ssid>";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f274534b = "02:00:00:00:00:00";

    /* renamed from: c, reason: collision with root package name */
    public int f274535c;

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f274535c);
        sb6.append(',');
        sb6.append(this.f274534b);
        sb6.append(',');
        byte[] bytes = this.f274533a.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(android.util.Base64.encodeToString(bytes, 2));
        return sb6.toString();
    }

    /* renamed from: toString */
    public java.lang.String m77814x9616526c() {
        return "ssid(" + this.f274533a + "), bssid(" + this.f274534b + "), level(" + this.f274535c + ')';
    }
}
