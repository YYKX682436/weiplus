package tl5;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f501895a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f501896b;

    /* renamed from: c, reason: collision with root package name */
    public final long f501897c;

    /* renamed from: d, reason: collision with root package name */
    public final int f501898d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f501899e;

    public j(android.graphics.RectF frame, android.graphics.drawable.Drawable drawable, long j17, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        this.f501895a = frame;
        this.f501896b = drawable;
        this.f501897c = j17;
        this.f501898d = i17;
        this.f501899e = z17;
    }

    /* renamed from: equals */
    public boolean m166765xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.j)) {
            return false;
        }
        tl5.j jVar = (tl5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501895a, jVar.f501895a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501896b, jVar.f501896b) && this.f501897c == jVar.f501897c && this.f501898d == jVar.f501898d && this.f501899e == jVar.f501899e;
    }

    /* renamed from: hashCode */
    public int m166766x8cdac1b() {
        int hashCode = this.f501895a.hashCode() * 31;
        android.graphics.drawable.Drawable drawable = this.f501896b;
        return ((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Long.hashCode(this.f501897c)) * 31) + java.lang.Integer.hashCode(this.f501898d)) * 31) + java.lang.Boolean.hashCode(this.f501899e);
    }

    /* renamed from: toString */
    public java.lang.String m166767x9616526c() {
        return "PinchZoomTransitSnapshot(frame=" + this.f501895a + ", drawable=" + this.f501896b + ", stableId=" + this.f501897c + ", adapterPosition=" + this.f501898d + ", isFullSpan=" + this.f501899e + ')';
    }
}
