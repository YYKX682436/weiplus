package cn2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f43510a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f43511b;

    /* renamed from: c, reason: collision with root package name */
    public final float f43512c;

    /* renamed from: d, reason: collision with root package name */
    public float f43513d;

    public f(long j17, android.graphics.Bitmap bitmap, float f17, float f18, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 2500L : j17;
        bitmap = (i17 & 2) != 0 ? null : bitmap;
        if ((i17 & 4) != 0) {
            gm2.c1 c1Var = gm2.c1.f273320a;
            f17 = ((java.lang.Number) ((jz5.n) gm2.c1.f273339t).getValue()).intValue();
        }
        f18 = (i17 & 8) != 0 ? 0.0f : f18;
        this.f43510a = j17;
        this.f43511b = bitmap;
        this.f43512c = f17;
        this.f43513d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.f)) {
            return false;
        }
        cn2.f fVar = (cn2.f) obj;
        return this.f43510a == fVar.f43510a && kotlin.jvm.internal.o.b(this.f43511b, fVar.f43511b) && java.lang.Float.compare(this.f43512c, fVar.f43512c) == 0 && java.lang.Float.compare(this.f43513d, fVar.f43513d) == 0;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f43510a) * 31;
        android.graphics.Bitmap bitmap = this.f43511b;
        return ((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Float.hashCode(this.f43512c)) * 31) + java.lang.Float.hashCode(this.f43513d);
    }

    public java.lang.String toString() {
        return "FlashFlightConfig(flashLightDuration=" + this.f43510a + ", bitmap=" + this.f43511b + ", radius=" + this.f43512c + ", borderWidth=" + this.f43513d + ')';
    }
}
