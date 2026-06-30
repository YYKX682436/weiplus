package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
class KeyValueMapCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private static final java.lang.String TAG = "KeyValueMapCameraCaptureResult";
    private final java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> mKeyValues;
    private androidx.camera.core.impl.TagBundle mTagBundle;
    private final long mTimestamp;

    public KeyValueMapCameraCaptureResult(long j17, androidx.camera.core.impl.TagBundle tagBundle, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> map) {
        this.mKeyValues = map;
        this.mTagBundle = tagBundle;
        this.mTimestamp = j17;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeMode getAeMode() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_EXTERNAL_FLASH : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_AUTO_FLASH_REDEYE : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_ALWAYS_FLASH : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_AUTO_FLASH : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED;
            }
            if (intValue == 4) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                androidx.camera.core.Logger.e(TAG, "Undefined ae state: " + num);
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                androidx.camera.core.Logger.e(TAG, "Undefined af mode: " + num);
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.INACTIVE;
            case 1:
            case 3:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.SCANNING;
            case 2:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED;
            case 4:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED;
            case 5:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED;
            default:
                androidx.camera.core.Logger.e(TAG, "Undefined af state: " + num);
                return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbMode getAwbMode() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.OFF;
            case 1:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.AUTO;
            case 2:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.INCANDESCENT;
            case 3:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.FLUORESCENT;
            case 4:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.WARM_FLUORESCENT;
            case 5:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.DAYLIGHT;
            case 6:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.CLOUDY_DAYLIGHT;
            case 7:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.TWILIGHT;
            case 8:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.SHADE;
            default:
                return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED;
        }
        androidx.camera.core.Logger.e(TAG, "Undefined awb state: " + num);
        return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public android.hardware.camera2.CaptureResult getCaptureResult() {
        return null;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
        java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED;
        }
        androidx.camera.core.Logger.e(TAG, "Undefined flash state: " + num);
        return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return this.mTimestamp;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        super.populateExifData(builder);
        try {
            java.lang.Integer num = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (java.nio.BufferUnderflowException unused) {
            androidx.camera.core.Logger.w(TAG, "Failed to get JPEG orientation.");
        }
        java.lang.Long l17 = (java.lang.Long) this.mKeyValues.get(android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l17 != null) {
            builder.setExposureTimeNanos(l17.longValue());
        }
        java.lang.Float f17 = (java.lang.Float) this.mKeyValues.get(android.hardware.camera2.CaptureResult.LENS_APERTURE);
        if (f17 != null) {
            builder.setLensFNumber(f17.floatValue());
        }
        java.lang.Integer num2 = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = java.lang.Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            builder.setIso(num2.intValue());
        }
        java.lang.Float f18 = (java.lang.Float) this.mKeyValues.get(android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH);
        if (f18 != null) {
            builder.setFocalLength(f18.floatValue());
        }
        java.lang.Integer num3 = (java.lang.Integer) this.mKeyValues.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }
}
