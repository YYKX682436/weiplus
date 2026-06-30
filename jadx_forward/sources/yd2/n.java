package yd2;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f542611a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f542612b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f542613c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542614d;

    public n(java.lang.String toolCallId, java.lang.String name, java.lang.String version, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toolCallId, "toolCallId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        this.f542611a = toolCallId;
        this.f542612b = name;
        this.f542613c = version;
        this.f542614d = str;
    }

    /* renamed from: equals */
    public boolean m176847xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2.n)) {
            return false;
        }
        yd2.n nVar = (yd2.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542611a, nVar.f542611a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542612b, nVar.f542612b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542613c, nVar.f542613c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542614d, nVar.f542614d);
    }

    /* renamed from: hashCode */
    public int m176848x8cdac1b() {
        int hashCode = ((((this.f542611a.hashCode() * 31) + this.f542612b.hashCode()) * 31) + this.f542613c.hashCode()) * 31;
        java.lang.String str = this.f542614d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m176849x9616526c() {
        return "ToolCallData(toolCallId=" + this.f542611a + ", name=" + this.f542612b + ", version=" + this.f542613c + ", arguments=" + this.f542614d + ')';
    }
}
