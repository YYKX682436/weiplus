package cn2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f125043a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f125044b;

    /* renamed from: c, reason: collision with root package name */
    public final float f125045c;

    /* renamed from: d, reason: collision with root package name */
    public float f125046d;

    public f(long j17, android.graphics.Bitmap bitmap, float f17, float f18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 2500L : j17;
        bitmap = (i17 & 2) != 0 ? null : bitmap;
        if ((i17 & 4) != 0) {
            gm2.c1 c1Var = gm2.c1.f354853a;
            f17 = ((java.lang.Number) ((jz5.n) gm2.c1.f354872t).mo141623x754a37bb()).intValue();
        }
        f18 = (i17 & 8) != 0 ? 0.0f : f18;
        this.f125043a = j17;
        this.f125044b = bitmap;
        this.f125045c = f17;
        this.f125046d = f18;
    }

    /* renamed from: equals */
    public boolean m15333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.f)) {
            return false;
        }
        cn2.f fVar = (cn2.f) obj;
        return this.f125043a == fVar.f125043a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125044b, fVar.f125044b) && java.lang.Float.compare(this.f125045c, fVar.f125045c) == 0 && java.lang.Float.compare(this.f125046d, fVar.f125046d) == 0;
    }

    /* renamed from: hashCode */
    public int m15334x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f125043a) * 31;
        android.graphics.Bitmap bitmap = this.f125044b;
        return ((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Float.hashCode(this.f125045c)) * 31) + java.lang.Float.hashCode(this.f125046d);
    }

    /* renamed from: toString */
    public java.lang.String m15335x9616526c() {
        return "FlashFlightConfig(flashLightDuration=" + this.f125043a + ", bitmap=" + this.f125044b + ", radius=" + this.f125045c + ", borderWidth=" + this.f125046d + ')';
    }
}
