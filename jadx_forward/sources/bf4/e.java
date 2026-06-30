package bf4;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f101247a;

    public e(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f101247a = (i17 & 1) != 0 ? false : z17;
    }

    /* renamed from: equals */
    public boolean m10328xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf4.e) && this.f101247a == ((bf4.e) obj).f101247a;
    }

    /* renamed from: hashCode */
    public int m10329x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f101247a);
    }

    /* renamed from: toString */
    public java.lang.String m10330x9616526c() {
        return "StoryNewFeatureConfig(visitorEnable=" + this.f101247a + ')';
    }
}
