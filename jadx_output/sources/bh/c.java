package bh;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f20758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20759b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.SurfaceTexture f20760c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.Surface f20761d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f20762e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f20763f;

    public c(int i17, int i18, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, yz5.l callback, yz5.l lVar) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f20758a = i17;
        this.f20759b = i18;
        this.f20760c = surfaceTexture;
        this.f20761d = surface;
        this.f20762e = callback;
        this.f20763f = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh.c)) {
            return false;
        }
        bh.c cVar = (bh.c) obj;
        return this.f20758a == cVar.f20758a && this.f20759b == cVar.f20759b && kotlin.jvm.internal.o.b(this.f20760c, cVar.f20760c) && kotlin.jvm.internal.o.b(this.f20761d, cVar.f20761d) && kotlin.jvm.internal.o.b(this.f20762e, cVar.f20762e) && kotlin.jvm.internal.o.b(this.f20763f, cVar.f20763f);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f20758a) * 31) + java.lang.Integer.hashCode(this.f20759b)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f20760c;
        int hashCode2 = (hashCode + (surfaceTexture == null ? 0 : surfaceTexture.hashCode())) * 31;
        android.view.Surface surface = this.f20761d;
        int hashCode3 = (((hashCode2 + (surface == null ? 0 : surface.hashCode())) * 31) + this.f20762e.hashCode()) * 31;
        yz5.l lVar = this.f20763f;
        return hashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SurfaceRegisterParams(width=" + this.f20758a + ", height=" + this.f20759b + ", surfaceTexture=" + this.f20760c + ", surface=" + this.f20761d + ", callback=" + this.f20762e + ", frameCallback=" + this.f20763f + ')';
    }
}
