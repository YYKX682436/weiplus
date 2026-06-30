package xe;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f535268a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535269b;

    public b(java.lang.String appId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f535268a = appId;
        this.f535269b = str;
    }

    /* renamed from: equals */
    public boolean m175379xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe.b)) {
            return false;
        }
        xe.b bVar = (xe.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535268a, bVar.f535268a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535269b, bVar.f535269b);
    }

    /* renamed from: hashCode */
    public int m175380x8cdac1b() {
        int hashCode = this.f535268a.hashCode() * 31;
        java.lang.String str = this.f535269b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m175381x9616526c() {
        return "PendingFinishRuntimeMessage(appId=" + this.f535268a + ", instanceId=" + this.f535269b + ')';
    }
}
