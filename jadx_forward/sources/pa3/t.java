package pa3;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f434540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f434542c;

    public t(android.view.SurfaceView surfaceView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceView, "surfaceView");
        this.f434540a = surfaceView;
        this.f434541b = i17;
        this.f434542c = i18;
    }

    /* renamed from: equals */
    public boolean m158023xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3.t)) {
            return false;
        }
        pa3.t tVar = (pa3.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f434540a, tVar.f434540a) && this.f434541b == tVar.f434541b && this.f434542c == tVar.f434542c;
    }

    /* renamed from: hashCode */
    public int m158024x8cdac1b() {
        return (((this.f434540a.hashCode() * 31) + java.lang.Integer.hashCode(this.f434541b)) * 31) + java.lang.Integer.hashCode(this.f434542c);
    }

    /* renamed from: toString */
    public java.lang.String m158025x9616526c() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f434540a + ", left=" + this.f434541b + ", top=" + this.f434542c + ')';
    }
}
