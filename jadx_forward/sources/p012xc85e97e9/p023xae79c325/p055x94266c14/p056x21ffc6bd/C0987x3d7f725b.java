package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.AutoValue_Version */
/* loaded from: classes13.dex */
final class C0987x3d7f725b extends p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 {

    /* renamed from: description */
    private final java.lang.String f2410x993583fc;

    /* renamed from: major */
    private final int f2411x62db5b9;

    /* renamed from: minor */
    private final int f2412x63167b5;

    /* renamed from: patch */
    private final int f2413x6582048;

    public C0987x3d7f725b(int i17, int i18, int i19, java.lang.String str) {
        this.f2411x62db5b9 = i17;
        this.f2412x63167b5 = i18;
        this.f2413x6582048 = i19;
        if (str == null) {
            throw new java.lang.NullPointerException("Null description");
        }
        this.f2410x993583fc = str;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8
    /* renamed from: getDescription */
    public java.lang.String mo6677x730bcac6() {
        return this.f2410x993583fc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8
    /* renamed from: getMajor */
    public int mo6678x74cb5c03() {
        return this.f2411x62db5b9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8
    /* renamed from: getMinor */
    public int mo6679x74cf0dff() {
        return this.f2412x63167b5;
    }

    @Override // p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8
    /* renamed from: getPatch */
    public int mo6680x74f5c692() {
        return this.f2413x6582048;
    }
}
