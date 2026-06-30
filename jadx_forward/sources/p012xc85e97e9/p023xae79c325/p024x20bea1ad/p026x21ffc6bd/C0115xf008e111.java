package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2CameraCaptureResult */
/* loaded from: classes14.dex */
public class C0115xf008e111 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be {
    private static final java.lang.String TAG = "C2CameraCaptureResult";

    /* renamed from: mCaptureResult */
    private final android.hardware.camera2.CaptureResult f138xcd737796;

    /* renamed from: mTagBundle */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f139xc5f18acf;

    public C0115xf008e111(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, android.hardware.camera2.CaptureResult captureResult) {
        this.f139xc5f18acf = c0760xc2ac609c;
        this.f138xcd737796 = captureResult;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAeMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode mo2927x10512add() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.OFF;
        }
        if (intValue == 1) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.ON;
        }
        if (intValue == 2) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.ON_AUTO_FLASH;
        }
        if (intValue == 3) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.ON_ALWAYS_FLASH;
        }
        if (intValue == 4) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.ON_AUTO_FLASH_REDEYE;
        }
        if (intValue == 5 && android.os.Build.VERSION.SDK_INT >= 28) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.ON_EXTERNAL_FLASH;
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAeState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState mo2928xfa2afa97() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.LOCKED;
            }
            if (intValue == 4) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined ae state: " + num);
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.UNKNOWN;
            }
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.SEARCHING;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAfMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode mo2929x105f425e() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined af mode: " + num);
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.UNKNOWN;
            }
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.OFF;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAfState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState mo2930xfbdfd336() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.INACTIVE;
            case 1:
            case 3:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.SCANNING;
            case 2:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.PASSIVE_FOCUSED;
            case 4:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.LOCKED_FOCUSED;
            case 5:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.PASSIVE_NOT_FOCUSED;
            default:
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined af state: " + num);
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.UNKNOWN;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAwbMode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode mo2931x19a40e79() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.OFF;
            case 1:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.AUTO;
            case 2:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.INCANDESCENT;
            case 3:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.FLUORESCENT;
            case 4:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.WARM_FLUORESCENT;
            case 5:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.DAYLIGHT;
            case 6:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.CLOUDY_DAYLIGHT;
            case 7:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.TWILIGHT;
            case 8:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.SHADE;
            default:
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.UNKNOWN;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getAwbState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState mo2932x1b348a7b() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.METERING;
        }
        if (intValue == 2) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.LOCKED;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined awb state: " + num);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getCaptureResult */
    public android.hardware.camera2.CaptureResult mo2933x2fc52b4d() {
        return this.f138xcd737796;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getFlashState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState mo2934xa6611277() {
        java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.FLASH_STATE);
        if (num == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.NONE;
        }
        if (intValue == 2) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.FIRED;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Undefined flash state: " + num);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.FlashState.UNKNOWN;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getTagBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo2935x4aa7b206() {
        return this.f139xc5f18acf;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: getTimestamp */
    public long mo2936x2b69a60() {
        java.lang.Long l17 = (java.lang.Long) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be
    /* renamed from: populateExifData */
    public void mo2937xd74657e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder builder) {
        super.mo2937xd74657e4(builder);
        try {
            java.lang.Integer num = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.m5906x2a5dc739(num.intValue());
            }
        } catch (java.nio.BufferUnderflowException unused) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to get JPEG orientation.");
        }
        java.lang.Long l17 = (java.lang.Long) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l17 != null) {
            builder.m5899xcddf3fe9(l17.longValue());
        }
        java.lang.Float f17 = (java.lang.Float) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.LENS_APERTURE);
        if (f17 != null) {
            builder.m5905x3f19aaf(f17.floatValue());
        }
        java.lang.Integer num2 = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = java.lang.Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            builder.m5904xca0270c3(num2.intValue());
        }
        java.lang.Float f18 = (java.lang.Float) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH);
        if (f18 != null) {
            builder.m5901x3a9013e9(f18.floatValue());
        }
        java.lang.Integer num3 = (java.lang.Integer) this.f138xcd737796.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.WhiteBalanceMode whiteBalanceMode = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.WhiteBalanceMode.MANUAL;
            }
            builder.m5907xadbf2338(whiteBalanceMode);
        }
    }

    public C0115xf008e111(android.hardware.camera2.CaptureResult captureResult) {
        this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5701x298eb42f(), captureResult);
    }
}
