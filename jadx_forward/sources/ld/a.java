package ld;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399577a;

    public a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f399577a = appId;
    }

    /* renamed from: equals */
    public boolean m145630xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399577a, ((ld.a) obj).f399577a);
    }

    /* renamed from: hashCode */
    public int m145631x8cdac1b() {
        return this.f399577a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145632x9616526c() {
        return "LiteAppCrashReportData(appId=" + this.f399577a + ')';
    }
}
