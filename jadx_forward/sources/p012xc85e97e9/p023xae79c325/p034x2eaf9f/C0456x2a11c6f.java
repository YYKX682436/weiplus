package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_CameraState */
/* loaded from: classes14.dex */
final class C0456x2a11c6f extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c {

    /* renamed from: error */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError f796x5c4d208;

    /* renamed from: type */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type f797x368f3a;

    public C0456x2a11c6f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type type, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError) {
        if (type == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.f797x368f3a = type;
        this.f796x5c4d208 = stateError;
    }

    /* renamed from: equals */
    public boolean m4193xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c abstractC0476xdd7ce84c = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c) obj;
        if (this.f797x368f3a.equals(abstractC0476xdd7ce84c.mo4195xfb85f7b0())) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError = this.f796x5c4d208;
            if (stateError == null) {
                if (abstractC0476xdd7ce84c.mo4194x74627852() == null) {
                    return true;
                }
            } else if (stateError.equals(abstractC0476xdd7ce84c.mo4194x74627852())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c
    /* renamed from: getError */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError mo4194x74627852() {
        return this.f796x5c4d208;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c
    /* renamed from: getType */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type mo4195xfb85f7b0() {
        return this.f797x368f3a;
    }

    /* renamed from: hashCode */
    public int m4196x8cdac1b() {
        int hashCode = (this.f797x368f3a.hashCode() ^ 1000003) * 1000003;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError = this.f796x5c4d208;
        return hashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m4197x9616526c() {
        return "CameraState{type=" + this.f797x368f3a + ", error=" + this.f796x5c4d208 + "}";
    }
}
