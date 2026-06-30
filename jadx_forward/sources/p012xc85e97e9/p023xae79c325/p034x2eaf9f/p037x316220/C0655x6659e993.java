package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper */
/* loaded from: classes14.dex */
final class C0655x6659e993 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper {

    /* renamed from: error */
    private final java.lang.Throwable f1473x5c4d208;

    public C0655x6659e993(java.lang.Throwable th6) {
        if (th6 == null) {
            throw new java.lang.NullPointerException("Null error");
        }
        this.f1473x5c4d208 = th6;
    }

    /* renamed from: equals */
    public boolean m5183xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper) {
            return this.f1473x5c4d208.equals(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper) obj).mo5184x74627852());
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper
    /* renamed from: getError */
    public java.lang.Throwable mo5184x74627852() {
        return this.f1473x5c4d208;
    }

    /* renamed from: hashCode */
    public int m5185x8cdac1b() {
        return this.f1473x5c4d208.hashCode() ^ 1000003;
    }

    /* renamed from: toString */
    public java.lang.String m5186x9616526c() {
        return "ErrorWrapper{error=" + this.f1473x5c4d208 + "}";
    }
}
