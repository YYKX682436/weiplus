package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraState */
/* loaded from: classes14.dex */
public abstract class AbstractC0476xdd7ce84c {

    /* renamed from: ERROR_CAMERA_DISABLED */
    public static final int f866x56533dff = 5;

    /* renamed from: ERROR_CAMERA_FATAL_ERROR */
    public static final int f867xe2fd86a = 6;

    /* renamed from: ERROR_CAMERA_IN_USE */
    public static final int f868x73357f90 = 2;

    /* renamed from: ERROR_DO_NOT_DISTURB_MODE_ENABLED */
    public static final int f869xa30eb04e = 7;

    /* renamed from: ERROR_MAX_CAMERAS_IN_USE */
    public static final int f870x7fc0daf0 = 1;

    /* renamed from: ERROR_OTHER_RECOVERABLE_ERROR */
    public static final int f871xa31b0e21 = 3;

    /* renamed from: ERROR_STREAM_CONFIG */
    public static final int f872xd1d876ca = 4;

    /* renamed from: androidx.camera.core.CameraState$ErrorType */
    /* loaded from: classes6.dex */
    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    /* renamed from: androidx.camera.core.CameraState$StateError */
    /* loaded from: classes14.dex */
    public static abstract class StateError {
        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError m4296xaf65a0fc(int i17) {
            return m4297xaf65a0fc(i17, null);
        }

        /* renamed from: getCause */
        public abstract java.lang.Throwable mo4199x743e9ab3();

        /* renamed from: getCode */
        public abstract int mo4200xfb7e1663();

        /* renamed from: getType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.ErrorType m4298xfb85f7b0() {
            int mo4200xfb7e1663 = mo4200xfb7e1663();
            return (mo4200xfb7e1663 == 2 || mo4200xfb7e1663 == 1 || mo4200xfb7e1663 == 3) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.ErrorType.RECOVERABLE : p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.ErrorType.CRITICAL;
        }

        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError m4297xaf65a0fc(int i17, java.lang.Throwable th6) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0457x2b8c99e7(i17, th6);
        }
    }

    /* renamed from: androidx.camera.core.CameraState$Type */
    /* loaded from: classes14.dex */
    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c m4290xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type type) {
        return m4291xaf65a0fc(type, null);
    }

    /* renamed from: getError */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError mo4194x74627852();

    /* renamed from: getType */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type mo4195xfb85f7b0();

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c m4291xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type type, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0456x2a11c6f(type, stateError);
    }
}
