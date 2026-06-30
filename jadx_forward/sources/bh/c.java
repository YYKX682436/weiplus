package bh;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f102291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102292b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.SurfaceTexture f102293c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.Surface f102294d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f102295e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f102296f;

    public c(int i17, int i18, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, yz5.l callback, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f102291a = i17;
        this.f102292b = i18;
        this.f102293c = surfaceTexture;
        this.f102294d = surface;
        this.f102295e = callback;
        this.f102296f = lVar;
    }

    /* renamed from: equals */
    public boolean m10456xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh.c)) {
            return false;
        }
        bh.c cVar = (bh.c) obj;
        return this.f102291a == cVar.f102291a && this.f102292b == cVar.f102292b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102293c, cVar.f102293c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102294d, cVar.f102294d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102295e, cVar.f102295e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102296f, cVar.f102296f);
    }

    /* renamed from: hashCode */
    public int m10457x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f102291a) * 31) + java.lang.Integer.hashCode(this.f102292b)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f102293c;
        int hashCode2 = (hashCode + (surfaceTexture == null ? 0 : surfaceTexture.hashCode())) * 31;
        android.view.Surface surface = this.f102294d;
        int hashCode3 = (((hashCode2 + (surface == null ? 0 : surface.hashCode())) * 31) + this.f102295e.hashCode()) * 31;
        yz5.l lVar = this.f102296f;
        return hashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m10458x9616526c() {
        return "SurfaceRegisterParams(width=" + this.f102291a + ", height=" + this.f102292b + ", surfaceTexture=" + this.f102293c + ", surface=" + this.f102294d + ", callback=" + this.f102295e + ", frameCallback=" + this.f102296f + ')';
    }
}
