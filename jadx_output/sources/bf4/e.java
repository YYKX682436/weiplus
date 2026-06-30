package bf4;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19714a;

    public e(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this.f19714a = (i17 & 1) != 0 ? false : z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf4.e) && this.f19714a == ((bf4.e) obj).f19714a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f19714a);
    }

    public java.lang.String toString() {
        return "StoryNewFeatureConfig(visitorEnable=" + this.f19714a + ')';
    }
}
