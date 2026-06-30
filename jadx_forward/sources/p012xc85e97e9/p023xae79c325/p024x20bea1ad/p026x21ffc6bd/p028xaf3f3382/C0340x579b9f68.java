package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat */
/* loaded from: classes14.dex */
public class C0340x579b9f68 {
    private static final java.lang.String TAG = "StreamConfigurationMapCompat";

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl f643x622d82d;

    /* renamed from: mOutputSizesCorrector */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0420x9318adc f644x665212c9;

    /* renamed from: mCachedFormatOutputSizes */
    private final java.util.Map<java.lang.Integer, android.util.Size[]> f642xaffe436b = new java.util.HashMap();

    /* renamed from: mCachedFormatHighResolutionOutputSizes */
    private final java.util.Map<java.lang.Integer, android.util.Size[]> f641xea1551d = new java.util.HashMap();

    /* renamed from: mCachedClassOutputSizes */
    private final java.util.Map<java.lang.Class<?>, android.util.Size[]> f640x14d26188 = new java.util.HashMap();

    /* renamed from: androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl */
    /* loaded from: classes14.dex */
    public interface StreamConfigurationMapCompatImpl {
        /* renamed from: getHighResolutionOutputSizes */
        android.util.Size[] mo3787xd229248d(int i17);

        /* renamed from: getOutputFormats */
        int[] mo3788x14494f65();

        /* renamed from: getOutputSizes */
        android.util.Size[] mo3789xa804d6db(int i17);

        /* renamed from: getOutputSizes */
        <T> android.util.Size[] mo3790xa804d6db(java.lang.Class<T> cls);

        /* renamed from: unwrap */
        android.hardware.camera2.params.StreamConfigurationMap mo3791xcdecea63();
    }

    private C0340x579b9f68(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0420x9318adc c0420x9318adc) {
        this.f643x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0341x4732813(streamConfigurationMap);
        this.f644x665212c9 = c0420x9318adc;
    }

    /* renamed from: toStreamConfigurationMapCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68 m3781x8f7d7763(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0420x9318adc c0420x9318adc) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68(streamConfigurationMap, c0420x9318adc);
    }

    /* renamed from: getHighResolutionOutputSizes */
    public android.util.Size[] m3782xd229248d(int i17) {
        if (this.f641xea1551d.containsKey(java.lang.Integer.valueOf(i17))) {
            if (this.f641xea1551d.get(java.lang.Integer.valueOf(i17)) == null) {
                return null;
            }
            return (android.util.Size[]) this.f641xea1551d.get(java.lang.Integer.valueOf(i17)).clone();
        }
        android.util.Size[] mo3787xd229248d = this.f643x622d82d.mo3787xd229248d(i17);
        if (mo3787xd229248d != null && mo3787xd229248d.length > 0) {
            mo3787xd229248d = this.f644x665212c9.m4089x8d657583(mo3787xd229248d, i17);
        }
        this.f641xea1551d.put(java.lang.Integer.valueOf(i17), mo3787xd229248d);
        if (mo3787xd229248d != null) {
            return (android.util.Size[]) mo3787xd229248d.clone();
        }
        return null;
    }

    /* renamed from: getOutputFormats */
    public int[] m3783x14494f65() {
        int[] mo3788x14494f65 = this.f643x622d82d.mo3788x14494f65();
        if (mo3788x14494f65 == null) {
            return null;
        }
        return (int[]) mo3788x14494f65.clone();
    }

    /* renamed from: getOutputSizes */
    public android.util.Size[] m3784xa804d6db(int i17) {
        if (this.f642xaffe436b.containsKey(java.lang.Integer.valueOf(i17))) {
            if (this.f642xaffe436b.get(java.lang.Integer.valueOf(i17)) == null) {
                return null;
            }
            return (android.util.Size[]) this.f642xaffe436b.get(java.lang.Integer.valueOf(i17)).clone();
        }
        android.util.Size[] mo3789xa804d6db = this.f643x622d82d.mo3789xa804d6db(i17);
        if (mo3789xa804d6db != null && mo3789xa804d6db.length != 0) {
            android.util.Size[] m4089x8d657583 = this.f644x665212c9.m4089x8d657583(mo3789xa804d6db, i17);
            this.f642xaffe436b.put(java.lang.Integer.valueOf(i17), m4089x8d657583);
            return (android.util.Size[]) m4089x8d657583.clone();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Retrieved output sizes array is null or empty for format " + i17);
        return mo3789xa804d6db;
    }

    /* renamed from: toStreamConfigurationMap */
    public android.hardware.camera2.params.StreamConfigurationMap m3786xaba27c81() {
        return this.f643x622d82d.mo3791xcdecea63();
    }

    /* renamed from: getOutputSizes */
    public <T> android.util.Size[] m3785xa804d6db(java.lang.Class<T> cls) {
        if (this.f640x14d26188.containsKey(cls)) {
            if (this.f640x14d26188.get(cls) == null) {
                return null;
            }
            return (android.util.Size[]) this.f640x14d26188.get(cls).clone();
        }
        android.util.Size[] mo3790xa804d6db = this.f643x622d82d.mo3790xa804d6db(cls);
        if (mo3790xa804d6db != null && mo3790xa804d6db.length != 0) {
            android.util.Size[] m4090x8d657583 = this.f644x665212c9.m4090x8d657583(mo3790xa804d6db, cls);
            this.f640x14d26188.put(cls, m4090x8d657583);
            return (android.util.Size[]) m4090x8d657583.clone();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Retrieved output sizes array is null or empty for class " + cls);
        return mo3790xa804d6db;
    }
}
