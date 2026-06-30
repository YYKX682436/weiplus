package ro5;

/* loaded from: classes11.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f479724a;

    /* renamed from: b, reason: collision with root package name */
    public final dp5.f f479725b;

    public f0(android.graphics.SurfaceTexture surfaceTexture, dp5.f texObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texObj, "texObj");
        this.f479724a = surfaceTexture;
        this.f479725b = texObj;
    }

    /* renamed from: equals */
    public boolean m162811xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.f0)) {
            return false;
        }
        ro5.f0 f0Var = (ro5.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479724a, f0Var.f479724a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479725b, f0Var.f479725b);
    }

    /* renamed from: hashCode */
    public int m162812x8cdac1b() {
        return (this.f479724a.hashCode() * 31) + this.f479725b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162813x9616526c() {
        return "SurfaceTextureInfoHolder(surfaceTexture=" + this.f479724a + ", texObj=" + this.f479725b + ')';
    }
}
