package b23;

/* loaded from: classes.dex */
public final class f extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98924b;

    /* renamed from: c, reason: collision with root package name */
    public final b23.e f98925c;

    public f(boolean z17, b23.e sourceType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceType, "sourceType");
        this.f98924b = z17;
        this.f98925c = sourceType;
    }

    /* renamed from: equals */
    public boolean m9648xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b23.f)) {
            return false;
        }
        b23.f fVar = (b23.f) obj;
        return this.f98924b == fVar.f98924b && this.f98925c == fVar.f98925c;
    }

    /* renamed from: hashCode */
    public int m9649x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f98924b) * 31) + this.f98925c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9650x9616526c() {
        return "SearchEducationVisibleAction(visible=" + this.f98924b + ", sourceType=" + this.f98925c + ')';
    }
}
