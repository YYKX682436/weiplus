package e1;

/* loaded from: classes14.dex */
public final class e1 extends e1.r {

    /* renamed from: b, reason: collision with root package name */
    public final long f327784b;

    public e1(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        this.f327784b = j17;
    }

    @Override // e1.r
    public void a(long j17, e1.n0 p17, float f17) {
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        e1.g gVar = (e1.g) p17;
        gVar.c(1.0f);
        if (f17 == 1.0f) {
            j18 = this.f327784b;
        } else {
            long j19 = this.f327784b;
            j18 = e1.y.b(j19, e1.y.d(j19) * f17, 0.0f, 0.0f, 0.0f, 14, null);
        }
        gVar.e(j18);
        if (gVar.f327789c != null) {
            gVar.h(null);
        }
    }

    /* renamed from: equals */
    public boolean m126636xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1.e1) {
            return e1.y.c(this.f327784b, ((e1.e1) obj).f327784b);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126637x8cdac1b() {
        int i17 = e1.y.f327854l;
        return java.lang.Long.hashCode(this.f327784b);
    }

    /* renamed from: toString */
    public java.lang.String m126638x9616526c() {
        return "SolidColor(value=" + ((java.lang.Object) e1.y.i(this.f327784b)) + ')';
    }
}
