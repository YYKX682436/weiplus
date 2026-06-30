package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_DeviceProperties */
/* loaded from: classes16.dex */
final class C0647xaeeb4206 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849 {

    /* renamed from: manufacturer */
    private final java.lang.String f1430x8a9e23d1;

    /* renamed from: model */
    private final java.lang.String f1431x633fb29;

    /* renamed from: sdkVersion */
    private final int f1432x8b04a33e;

    public C0647xaeeb4206(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null manufacturer");
        }
        this.f1430x8a9e23d1 = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.f1431x633fb29 = str2;
        this.f1432x8b04a33e = i17;
    }

    /* renamed from: equals */
    public boolean m5115xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849 abstractC0704x45d55849 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849) obj;
        return this.f1430x8a9e23d1.equals(abstractC0704x45d55849.mo5117x8a9e23d1()) && this.f1431x633fb29.equals(abstractC0704x45d55849.mo5118x633fb29()) && this.f1432x8b04a33e == abstractC0704x45d55849.mo5119x8b04a33e();
    }

    /* renamed from: hashCode */
    public int m5116x8cdac1b() {
        return ((((this.f1430x8a9e23d1.hashCode() ^ 1000003) * 1000003) ^ this.f1431x633fb29.hashCode()) * 1000003) ^ this.f1432x8b04a33e;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849
    /* renamed from: manufacturer */
    public java.lang.String mo5117x8a9e23d1() {
        return this.f1430x8a9e23d1;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849
    /* renamed from: model */
    public java.lang.String mo5118x633fb29() {
        return this.f1431x633fb29;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0704x45d55849
    /* renamed from: sdkVersion */
    public int mo5119x8b04a33e() {
        return this.f1432x8b04a33e;
    }

    /* renamed from: toString */
    public java.lang.String m5120x9616526c() {
        return "DeviceProperties{manufacturer=" + this.f1430x8a9e23d1 + ", model=" + this.f1431x633fb29 + ", sdkVersion=" + this.f1432x8b04a33e + "}";
    }
}
