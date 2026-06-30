package h40;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f360252a;

    public a(java.lang.String dataId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        this.f360252a = dataId;
    }

    /* renamed from: equals */
    public boolean m132842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h40.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360252a, ((h40.a) obj).f360252a);
    }

    /* renamed from: hashCode */
    public int m132843x8cdac1b() {
        return this.f360252a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132844x9616526c() {
        return "ExtInfo(dataId=" + this.f360252a + ')';
    }
}
