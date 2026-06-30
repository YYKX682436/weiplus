package fz4;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f348842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348844c;

    public h(android.view.SurfaceView surfaceView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceView, "surfaceView");
        this.f348842a = surfaceView;
        this.f348843b = i17;
        this.f348844c = i18;
    }

    /* renamed from: equals */
    public boolean m130577xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz4.h)) {
            return false;
        }
        fz4.h hVar = (fz4.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348842a, hVar.f348842a) && this.f348843b == hVar.f348843b && this.f348844c == hVar.f348844c;
    }

    /* renamed from: hashCode */
    public int m130578x8cdac1b() {
        return (((this.f348842a.hashCode() * 31) + java.lang.Integer.hashCode(this.f348843b)) * 31) + java.lang.Integer.hashCode(this.f348844c);
    }

    /* renamed from: toString */
    public java.lang.String m130579x9616526c() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f348842a + ", left=" + this.f348843b + ", top=" + this.f348844c + ')';
    }
}
