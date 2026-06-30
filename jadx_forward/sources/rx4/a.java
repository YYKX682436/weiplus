package rx4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f482622a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482623b;

    public a(int i17, java.lang.String logBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logBuffer, "logBuffer");
        this.f482622a = i17;
        this.f482623b = logBuffer;
    }

    /* renamed from: equals */
    public boolean m163390xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.a)) {
            return false;
        }
        rx4.a aVar = (rx4.a) obj;
        return this.f482622a == aVar.f482622a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482623b, aVar.f482623b);
    }

    /* renamed from: hashCode */
    public int m163391x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f482622a) * 31) + this.f482623b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163392x9616526c() {
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("logid", java.lang.Integer.valueOf(this.f482622a)), new jz5.l("log_buffer", this.f482623b))).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
