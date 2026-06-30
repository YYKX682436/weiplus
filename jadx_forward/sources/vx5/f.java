package vx5;

/* loaded from: classes13.dex */
public class f implements com.p314xaae8f345.p3210x3857dc.w {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 f522872a;

    /* renamed from: b, reason: collision with root package name */
    public final by5.i0 f522873b = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: c, reason: collision with root package name */
    public final by5.i0 f522874c = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: d, reason: collision with root package name */
    public final by5.i0 f522875d = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: e, reason: collision with root package name */
    public final by5.i0 f522876e = new by5.i0((java.lang.Class) null, "getValue", new java.lang.Class[0]);

    /* renamed from: f, reason: collision with root package name */
    public final by5.i0 f522877f = new by5.i0((java.lang.Class) null, "getBooleanValue", new java.lang.Class[0]);

    /* renamed from: g, reason: collision with root package name */
    public final by5.i0 f522878g = new by5.i0((java.lang.Class) null, "getIntegerValue", new java.lang.Class[0]);

    /* renamed from: h, reason: collision with root package name */
    public final by5.i0 f522879h = new by5.i0((java.lang.Class) null, "getStringValue", new java.lang.Class[0]);

    public final void a() {
        if (this.f522872a != null) {
            return;
        }
        if (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b() == null) {
            by5.c4.g("PinusPreferences", "reflectionInit, pinus core wrapper is null");
            return;
        }
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        this.f522872a = m120281x9cf0d20b;
        java.lang.Class<?> m120201x74434fc2 = m120281x9cf0d20b.m120201x74434fc2("org.xwalk.core.internal.XWalkPreferencesBridge");
        this.f522873b.a(null, m120201x74434fc2, "setValue", java.lang.String.class, java.lang.Boolean.TYPE);
        this.f522874c.a(null, m120201x74434fc2, "setValue", java.lang.String.class, java.lang.Integer.TYPE);
        this.f522875d.a(null, m120201x74434fc2, "setValue", java.lang.String.class, java.lang.String.class);
        this.f522876e.a(null, m120201x74434fc2, "getValue", java.lang.String.class);
        this.f522877f.a(null, m120201x74434fc2, "getBooleanValue", java.lang.String.class);
        this.f522878g.a(null, m120201x74434fc2, "getIntegerValue", java.lang.String.class);
        this.f522879h.a(null, m120201x74434fc2, "getStringValue", java.lang.String.class);
    }
}
