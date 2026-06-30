package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002;

/* renamed from: androidx.camera.core.processing.util.AutoValue_OutConfig */
/* loaded from: classes14.dex */
final class C0947x63d7ecf3 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 {

    /* renamed from: getCropRect */
    private final android.graphics.Rect f2257xfa2ffe0a;

    /* renamed from: getFormat */
    private final int f2258x19771aed;

    /* renamed from: getRotationDegrees */
    private final int f2259x2a7ffb93;

    /* renamed from: getSize */
    private final android.util.Size f2260xfb854877;

    /* renamed from: getTargets */
    private final int f2261xe21cfccc;

    /* renamed from: getUuid */
    private final java.util.UUID f2262xfb865c31;

    /* renamed from: isMirroring */
    private final boolean f2263x5a1c61b9;

    /* renamed from: shouldRespectInputCropRect */
    private final boolean f2264x33146cab;

    public C0947x63d7ecf3(java.util.UUID uuid, int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17, boolean z18) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null getUuid");
        }
        this.f2262xfb865c31 = uuid;
        this.f2261xe21cfccc = i17;
        this.f2258x19771aed = i18;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.f2257xfa2ffe0a = rect;
        if (size == null) {
            throw new java.lang.NullPointerException("Null getSize");
        }
        this.f2260xfb854877 = size;
        this.f2259x2a7ffb93 = i19;
        this.f2263x5a1c61b9 = z17;
        this.f2264x33146cab = z18;
    }

    /* renamed from: equals */
    public boolean m6436xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c10 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10) obj;
        return this.f2262xfb865c31.equals(abstractC0951xabff0c10.mo6442xfb865c31()) && this.f2261xe21cfccc == abstractC0951xabff0c10.mo6441xe21cfccc() && this.f2258x19771aed == abstractC0951xabff0c10.mo6438x19771aed() && this.f2257xfa2ffe0a.equals(abstractC0951xabff0c10.mo6437xfa2ffe0a()) && this.f2260xfb854877.equals(abstractC0951xabff0c10.mo6440xfb854877()) && this.f2259x2a7ffb93 == abstractC0951xabff0c10.mo6439x2a7ffb93() && this.f2263x5a1c61b9 == abstractC0951xabff0c10.mo6444x5a1c61b9() && this.f2264x33146cab == abstractC0951xabff0c10.mo6445x33146cab();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getCropRect */
    public android.graphics.Rect mo6437xfa2ffe0a() {
        return this.f2257xfa2ffe0a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getFormat */
    public int mo6438x19771aed() {
        return this.f2258x19771aed;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getRotationDegrees */
    public int mo6439x2a7ffb93() {
        return this.f2259x2a7ffb93;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getSize */
    public android.util.Size mo6440xfb854877() {
        return this.f2260xfb854877;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getTargets */
    public int mo6441xe21cfccc() {
        return this.f2261xe21cfccc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: getUuid */
    public java.util.UUID mo6442xfb865c31() {
        return this.f2262xfb865c31;
    }

    /* renamed from: hashCode */
    public int m6443x8cdac1b() {
        return ((((((((((((((this.f2262xfb865c31.hashCode() ^ 1000003) * 1000003) ^ this.f2261xe21cfccc) * 1000003) ^ this.f2258x19771aed) * 1000003) ^ this.f2257xfa2ffe0a.hashCode()) * 1000003) ^ this.f2260xfb854877.hashCode()) * 1000003) ^ this.f2259x2a7ffb93) * 1000003) ^ (this.f2263x5a1c61b9 ? 1231 : 1237)) * 1000003) ^ (this.f2264x33146cab ? 1231 : 1237);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: isMirroring */
    public boolean mo6444x5a1c61b9() {
        return this.f2263x5a1c61b9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10
    /* renamed from: shouldRespectInputCropRect */
    public boolean mo6445x33146cab() {
        return this.f2264x33146cab;
    }

    /* renamed from: toString */
    public java.lang.String m6446x9616526c() {
        return "OutConfig{getUuid=" + this.f2262xfb865c31 + ", getTargets=" + this.f2261xe21cfccc + ", getFormat=" + this.f2258x19771aed + ", getCropRect=" + this.f2257xfa2ffe0a + ", getSize=" + this.f2260xfb854877 + ", getRotationDegrees=" + this.f2259x2a7ffb93 + ", isMirroring=" + this.f2263x5a1c61b9 + ", shouldRespectInputCropRect=" + this.f2264x33146cab + "}";
    }
}
