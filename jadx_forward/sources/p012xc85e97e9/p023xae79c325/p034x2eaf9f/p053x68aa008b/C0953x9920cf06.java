package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b;

/* renamed from: androidx.camera.core.resolutionselector.AspectRatioStrategy */
/* loaded from: classes6.dex */
public final class C0953x9920cf06 {

    /* renamed from: FALLBACK_RULE_AUTO */
    public static final int f2299x1ec9dbf5 = 1;

    /* renamed from: FALLBACK_RULE_NONE */
    public static final int f2300x1ecfad7e = 0;

    /* renamed from: mFallbackRule */
    private final int f2303x2d498a0b;

    /* renamed from: mPreferredAspectRatio */
    private final int f2304x5d6e6f5f;

    /* renamed from: RATIO_4_3_FALLBACK_AUTO_STRATEGY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 f2302xcd77a971 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06(0, 1);

    /* renamed from: RATIO_16_9_FALLBACK_AUTO_STRATEGY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06 f2301x3b53eeb2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06(1, 1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.resolutionselector.AspectRatioStrategy$AspectRatioFallbackRule */
    /* loaded from: classes6.dex */
    public @interface AspectRatioFallbackRule {
    }

    public C0953x9920cf06(int i17, int i18) {
        this.f2304x5d6e6f5f = i17;
        this.f2303x2d498a0b = i18;
    }

    /* renamed from: getFallbackRule */
    public int m6494xf6a70374() {
        return this.f2303x2d498a0b;
    }

    /* renamed from: getPreferredAspectRatio */
    public int m6495xa2546fc8() {
        return this.f2304x5d6e6f5f;
    }
}
