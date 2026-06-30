package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class TemplateTypeUtil {

    /* renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType;

        static {
            int[] iArr = new int[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values().length];
            $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType = iArr;
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private TemplateTypeUtil() {
    }

    public static int getCaptureConfigTemplateType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17) {
        int i18 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[captureType.ordinal()];
        return i18 != 1 ? i18 != 2 ? 1 : 3 : i17 == 2 ? 5 : 2;
    }

    public static int getSessionConfigTemplateType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17) {
        int i18 = androidx.camera.camera2.internal.TemplateTypeUtil.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType[captureType.ordinal()];
        return i18 != 1 ? i18 != 2 ? 1 : 3 : i17 == 2 ? 5 : 1;
    }
}
