package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_CameraState_StateError */
/* loaded from: classes14.dex */
final class C0457x2b8c99e7 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError {

    /* renamed from: cause */
    private final java.lang.Throwable f798x5a0f469;

    /* renamed from: code */
    private final int f799x2eaded;

    public C0457x2b8c99e7(int i17, java.lang.Throwable th6) {
        this.f799x2eaded = i17;
        this.f798x5a0f469 = th6;
    }

    /* renamed from: equals */
    public boolean m4198xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError) obj;
        if (this.f799x2eaded == stateError.mo4200xfb7e1663()) {
            java.lang.Throwable th6 = this.f798x5a0f469;
            if (th6 == null) {
                if (stateError.mo4199x743e9ab3() == null) {
                    return true;
                }
            } else if (th6.equals(stateError.mo4199x743e9ab3())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError
    /* renamed from: getCause */
    public java.lang.Throwable mo4199x743e9ab3() {
        return this.f798x5a0f469;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError
    /* renamed from: getCode */
    public int mo4200xfb7e1663() {
        return this.f799x2eaded;
    }

    /* renamed from: hashCode */
    public int m4201x8cdac1b() {
        int i17 = (this.f799x2eaded ^ 1000003) * 1000003;
        java.lang.Throwable th6 = this.f798x5a0f469;
        return i17 ^ (th6 == null ? 0 : th6.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m4202x9616526c() {
        return "StateError{code=" + this.f799x2eaded + ", cause=" + this.f798x5a0f469 + "}";
    }
}
