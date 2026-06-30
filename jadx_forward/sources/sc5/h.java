package sc5;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488113a;

    public h(java.lang.String convSessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convSessionId, "convSessionId");
        this.f488113a = convSessionId;
    }

    /* renamed from: equals */
    public boolean m164303xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc5.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488113a, ((sc5.h) obj).f488113a);
    }

    /* renamed from: hashCode */
    public int m164304x8cdac1b() {
        return this.f488113a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164305x9616526c() {
        return "FilePreviewParams(convSessionId=" + this.f488113a + ')';
    }
}
