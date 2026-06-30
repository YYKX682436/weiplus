package vu4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f521876a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521877b;

    public k(int i17, java.lang.String logBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logBuffer, "logBuffer");
        this.f521876a = i17;
        this.f521877b = logBuffer;
    }

    /* renamed from: equals */
    public boolean m172676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.k)) {
            return false;
        }
        vu4.k kVar = (vu4.k) obj;
        return this.f521876a == kVar.f521876a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521877b, kVar.f521877b);
    }

    /* renamed from: hashCode */
    public int m172677x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f521876a) * 31) + this.f521877b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172678x9616526c() {
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("logid", java.lang.Integer.valueOf(this.f521876a)), new jz5.l("log_buffer", this.f521877b))).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
