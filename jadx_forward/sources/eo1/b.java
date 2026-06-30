package eo1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337080a;

    /* renamed from: b, reason: collision with root package name */
    public eo1.c f337081b;

    public b(java.lang.String deviceId, eo1.c errorType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorType, "errorType");
        this.f337080a = deviceId;
        this.f337081b = errorType;
    }

    /* renamed from: equals */
    public boolean m127949xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo1.b)) {
            return false;
        }
        eo1.b bVar = (eo1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337080a, bVar.f337080a) && this.f337081b == bVar.f337081b;
    }

    /* renamed from: hashCode */
    public int m127950x8cdac1b() {
        return (this.f337080a.hashCode() * 31) + this.f337081b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127951x9616526c() {
        return "ErrorInfo(deviceId=" + this.f337080a + ", errorType=" + this.f337081b + ')';
    }
}
