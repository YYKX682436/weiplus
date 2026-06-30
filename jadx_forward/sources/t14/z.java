package t14;

/* loaded from: classes11.dex */
public final class z extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f496137b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f496138c;

    /* renamed from: d, reason: collision with root package name */
    public final int f496139d;

    public z(java.lang.String viewId, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        this.f496137b = viewId;
        this.f496138c = str;
        this.f496139d = i17;
    }

    /* renamed from: equals */
    public boolean m165622xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t14.z)) {
            return false;
        }
        t14.z zVar = (t14.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496137b, zVar.f496137b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496138c, zVar.f496138c) && this.f496139d == zVar.f496139d;
    }

    /* renamed from: hashCode */
    public int m165623x8cdac1b() {
        int hashCode = this.f496137b.hashCode() * 31;
        java.lang.String str = this.f496138c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f496139d);
    }

    /* renamed from: toString */
    public java.lang.String m165624x9616526c() {
        return "UpdatePreferenceSelectInfoAction(viewId=" + this.f496137b + ", selectInfo=" + this.f496138c + ", reportType=" + this.f496139d + ')';
    }
}
