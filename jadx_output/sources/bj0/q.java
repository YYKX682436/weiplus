package bj0;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f21123a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f21124b;

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.RenderSurface f21125c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21126d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21127e;

    public q(int i17, java.lang.ref.WeakReference engine, io.flutter.embedding.engine.renderer.RenderSurface renderSurface, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        z18 = (i18 & 16) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(engine, "engine");
        this.f21123a = i17;
        this.f21124b = engine;
        this.f21125c = renderSurface;
        this.f21126d = z17;
        this.f21127e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0.q)) {
            return false;
        }
        bj0.q qVar = (bj0.q) obj;
        return this.f21123a == qVar.f21123a && kotlin.jvm.internal.o.b(this.f21124b, qVar.f21124b) && kotlin.jvm.internal.o.b(this.f21125c, qVar.f21125c) && this.f21126d == qVar.f21126d && this.f21127e == qVar.f21127e;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f21123a) * 31) + this.f21124b.hashCode()) * 31;
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f21125c;
        return ((((hashCode + (renderSurface == null ? 0 : renderSurface.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f21126d)) * 31) + java.lang.Boolean.hashCode(this.f21127e);
    }

    public java.lang.String toString() {
        return "ViewStackData(hash=" + this.f21123a + ", engine=" + this.f21124b + ", renderSurface=" + this.f21125c + ", finishing=" + this.f21126d + ", isActive=" + this.f21127e + ')';
    }
}
