package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_Identifier */
/* loaded from: classes14.dex */
final class C0651x599dc446 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 {

    /* renamed from: value */
    private final java.lang.Object f1453x6ac9171;

    public C0651x599dc446(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null value");
        }
        this.f1453x6ac9171 = obj;
    }

    /* renamed from: equals */
    public boolean m5150xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9) {
            return this.f1453x6ac9171.equals(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9) obj).mo5151x754a37bb());
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9
    /* renamed from: getValue */
    public java.lang.Object mo5151x754a37bb() {
        return this.f1453x6ac9171;
    }

    /* renamed from: hashCode */
    public int m5152x8cdac1b() {
        return this.f1453x6ac9171.hashCode() ^ 1000003;
    }

    /* renamed from: toString */
    public java.lang.String m5153x9616526c() {
        return "Identifier{value=" + this.f1453x6ac9171 + "}";
    }
}
