package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat */
/* loaded from: classes14.dex */
public class C0322x11ef9595 {

    /* renamed from: mCameraCharacteristicsImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.CameraCharacteristicsCompatImpl f618xab319126;

    /* renamed from: mCameraId */
    private final java.lang.String f619x1c133ead;

    /* renamed from: mValuesCache */
    private final java.util.Map<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object> f621x890418d3 = new java.util.HashMap();

    /* renamed from: mStreamConfigurationMapCompat */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68 f620xee9fea55 = null;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl */
    /* loaded from: classes14.dex */
    public interface CameraCharacteristicsCompatImpl {
        <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key);

        /* renamed from: getPhysicalCameraIds */
        java.util.Set<java.lang.String> mo3729xda421586();

        /* renamed from: unwrap */
        android.hardware.camera2.CameraCharacteristics mo3730xcdecea63();
    }

    private C0322x11ef9595(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f618xab319126 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0320x374f492d(cameraCharacteristics);
        } else {
            this.f618xab319126 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0321x117f35e4(cameraCharacteristics);
        }
        this.f619x1c133ead = str;
    }

    /* renamed from: isKeyNonCacheable */
    private boolean m3731xcb3acd04(android.hardware.camera2.CameraCharacteristics.Key<?> key) {
        return key.equals(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: toCameraCharacteristicsCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3732x34c5523a(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, java.lang.String str) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595(cameraCharacteristics, str);
    }

    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        if (m3731xcb3acd04(key)) {
            return (T) this.f618xab319126.get(key);
        }
        synchronized (this) {
            T t17 = (T) this.f621x890418d3.get(key);
            if (t17 != null) {
                return t17;
            }
            T t18 = (T) this.f618xab319126.get(key);
            if (t18 != null) {
                this.f621x890418d3.put(key, t18);
            }
            return t18;
        }
    }

    /* renamed from: getPhysicalCameraIds */
    public java.util.Set<java.lang.String> m3733xda421586() {
        return this.f618xab319126.mo3729xda421586();
    }

    /* renamed from: getStreamConfigurationMapCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68 m3734xbd9771be() {
        if (this.f620xee9fea55 == null) {
            try {
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new java.lang.IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f620xee9fea55 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.m3781x8f7d7763(streamConfigurationMap, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0420x9318adc(this.f619x1c133ead));
            } catch (java.lang.AssertionError | java.lang.NullPointerException e17) {
                throw new java.lang.IllegalArgumentException(e17.getMessage());
            }
        }
        return this.f620xee9fea55;
    }

    /* renamed from: isZoomOverrideAvailable */
    public boolean m3735xb28ff1c0() {
        int[] iArr;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f618xab319126.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i17 : iArr) {
                if (i17 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: toCameraCharacteristics */
    public android.hardware.camera2.CameraCharacteristics m3736xef410498() {
        return this.f618xab319126.mo3730xcdecea63();
    }
}
