package b23;

/* loaded from: classes.dex */
public final class f extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17391b;

    /* renamed from: c, reason: collision with root package name */
    public final b23.e f17392c;

    public f(boolean z17, b23.e sourceType) {
        kotlin.jvm.internal.o.g(sourceType, "sourceType");
        this.f17391b = z17;
        this.f17392c = sourceType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b23.f)) {
            return false;
        }
        b23.f fVar = (b23.f) obj;
        return this.f17391b == fVar.f17391b && this.f17392c == fVar.f17392c;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f17391b) * 31) + this.f17392c.hashCode();
    }

    public java.lang.String toString() {
        return "SearchEducationVisibleAction(visible=" + this.f17391b + ", sourceType=" + this.f17392c + ')';
    }
}
