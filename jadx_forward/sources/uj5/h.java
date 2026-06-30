package uj5;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f509989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f509990b;

    /* renamed from: c, reason: collision with root package name */
    public final int f509991c;

    public h(android.view.SurfaceView surfaceView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceView, "surfaceView");
        this.f509989a = surfaceView;
        this.f509990b = i17;
        this.f509991c = i18;
    }

    /* renamed from: equals */
    public boolean m168183xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj5.h)) {
            return false;
        }
        uj5.h hVar = (uj5.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509989a, hVar.f509989a) && this.f509990b == hVar.f509990b && this.f509991c == hVar.f509991c;
    }

    /* renamed from: hashCode */
    public int m168184x8cdac1b() {
        return (((this.f509989a.hashCode() * 31) + java.lang.Integer.hashCode(this.f509990b)) * 31) + java.lang.Integer.hashCode(this.f509991c);
    }

    /* renamed from: toString */
    public java.lang.String m168185x9616526c() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f509989a + ", left=" + this.f509990b + ", top=" + this.f509991c + ')';
    }
}
