package i0;

/* loaded from: classes14.dex */
public final class e implements i0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f368024a;

    public e(float f17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f368024a = f17;
    }

    @Override // i0.b
    public float a(long j17, p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        return density.R(this.f368024a);
    }

    /* renamed from: equals */
    public boolean m134314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0.e) && p2.h.a(this.f368024a, ((i0.e) obj).f368024a);
    }

    /* renamed from: hashCode */
    public int m134315x8cdac1b() {
        return java.lang.Float.hashCode(this.f368024a);
    }

    /* renamed from: toString */
    public java.lang.String m134316x9616526c() {
        return "CornerSize(size = " + this.f368024a + ".dp)";
    }
}
