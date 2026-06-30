package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraCaptureMetaData {

    /* loaded from: classes14.dex */
    public enum AeMode {
        UNKNOWN,
        OFF,
        ON,
        ON_AUTO_FLASH,
        ON_ALWAYS_FLASH,
        ON_AUTO_FLASH_REDEYE,
        ON_EXTERNAL_FLASH
    }

    /* loaded from: classes14.dex */
    public enum AeState {
        UNKNOWN,
        INACTIVE,
        SEARCHING,
        FLASH_REQUIRED,
        CONVERGED,
        LOCKED
    }

    /* loaded from: classes14.dex */
    public enum AfMode {
        UNKNOWN,
        OFF,
        ON_MANUAL_AUTO,
        ON_CONTINUOUS_AUTO
    }

    /* loaded from: classes14.dex */
    public enum AfState {
        UNKNOWN,
        INACTIVE,
        SCANNING,
        PASSIVE_FOCUSED,
        PASSIVE_NOT_FOCUSED,
        LOCKED_FOCUSED,
        LOCKED_NOT_FOCUSED
    }

    /* loaded from: classes14.dex */
    public enum AwbMode {
        UNKNOWN,
        OFF,
        AUTO,
        INCANDESCENT,
        FLUORESCENT,
        WARM_FLUORESCENT,
        DAYLIGHT,
        CLOUDY_DAYLIGHT,
        TWILIGHT,
        SHADE
    }

    /* loaded from: classes14.dex */
    public enum AwbState {
        UNKNOWN,
        INACTIVE,
        METERING,
        CONVERGED,
        LOCKED
    }

    /* loaded from: classes13.dex */
    public enum FlashState {
        UNKNOWN,
        NONE,
        READY,
        FIRED
    }

    private CameraCaptureMetaData() {
    }
}
