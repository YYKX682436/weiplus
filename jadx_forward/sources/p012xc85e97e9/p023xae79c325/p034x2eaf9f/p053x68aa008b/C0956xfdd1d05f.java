package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b;

/* renamed from: androidx.camera.core.resolutionselector.ResolutionStrategy */
/* loaded from: classes14.dex */
public final class C0956xfdd1d05f {

    /* renamed from: FALLBACK_RULE_CLOSEST_HIGHER */
    public static final int f2315xc9df455b = 2;

    /* renamed from: FALLBACK_RULE_CLOSEST_HIGHER_THEN_LOWER */
    public static final int f2316x22f7cba3 = 1;

    /* renamed from: FALLBACK_RULE_CLOSEST_LOWER */
    public static final int f2317x384ac9d5 = 4;

    /* renamed from: FALLBACK_RULE_CLOSEST_LOWER_THEN_HIGHER */
    public static final int f2318x94891ac7 = 3;

    /* renamed from: FALLBACK_RULE_NONE */
    public static final int f2319x1ecfad7e = 0;

    /* renamed from: HIGHEST_AVAILABLE_STRATEGY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f f2320xcf28abe4 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f();

    /* renamed from: mBoundSize */
    private android.util.Size f2321x3622e8b2;

    /* renamed from: mFallbackRule */
    private int f2322x2d498a0b;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.resolutionselector.ResolutionStrategy$ResolutionFallbackRule */
    /* loaded from: classes6.dex */
    public @interface ResolutionFallbackRule {
    }

    private C0956xfdd1d05f() {
        this.f2321x3622e8b2 = null;
        this.f2322x2d498a0b = 0;
    }

    /* renamed from: getBoundSize */
    public android.util.Size m6507xbad90fe9() {
        return this.f2321x3622e8b2;
    }

    /* renamed from: getFallbackRule */
    public int m6508xf6a70374() {
        return this.f2322x2d498a0b;
    }

    public C0956xfdd1d05f(android.util.Size size, int i17) {
        this.f2321x3622e8b2 = size;
        this.f2322x2d498a0b = i17;
    }
}
