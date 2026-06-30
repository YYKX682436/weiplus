package o70;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f424764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f424765b;

    public f(int i17, int i18) {
        this.f424764a = i17;
        this.f424765b = i18;
    }

    /* renamed from: equals */
    public boolean m150701xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70.f)) {
            return false;
        }
        o70.f fVar = (o70.f) obj;
        return this.f424764a == fVar.f424764a && this.f424765b == fVar.f424765b;
    }

    /* renamed from: hashCode */
    public int m150702x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f424764a) * 31) + java.lang.Integer.hashCode(this.f424765b);
    }

    /* renamed from: toString */
    public java.lang.String m150703x9616526c() {
        return "ImgBaseInfo(width=" + this.f424764a + ", height=" + this.f424765b + ')';
    }
}
