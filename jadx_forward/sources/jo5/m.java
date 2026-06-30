package jo5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.SurfaceTexture f382498a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f382499b;

    /* renamed from: c, reason: collision with root package name */
    public long f382500c;

    public m(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        surfaceTexture = (i17 & 1) != 0 ? null : surfaceTexture;
        surface = (i17 & 2) != 0 ? null : surface;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f382498a = surfaceTexture;
        this.f382499b = surface;
        this.f382500c = j17;
    }

    /* renamed from: equals */
    public boolean m141189xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo5.m)) {
            return false;
        }
        jo5.m mVar = (jo5.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382498a, mVar.f382498a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382499b, mVar.f382499b) && this.f382500c == mVar.f382500c;
    }

    /* renamed from: hashCode */
    public int m141190x8cdac1b() {
        android.graphics.SurfaceTexture surfaceTexture = this.f382498a;
        int hashCode = (surfaceTexture == null ? 0 : surfaceTexture.hashCode()) * 31;
        android.view.Surface surface = this.f382499b;
        return ((hashCode + (surface != null ? surface.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f382500c);
    }

    /* renamed from: toString */
    public java.lang.String m141191x9616526c() {
        return "VoIPMPSurfaceTexture(surfaceTexture=" + this.f382498a + ", surface=" + this.f382499b + ", surfacePtr=" + this.f382500c + ')';
    }
}
