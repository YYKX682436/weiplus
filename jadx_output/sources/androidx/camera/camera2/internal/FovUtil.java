package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class FovUtil {
    private static final java.lang.String TAG = "FovUtil";

    private FovUtil() {
    }

    public static int focalLengthToViewAngleDegrees(float f17, float f18) {
        m3.h.b(f17 > 0.0f, "Focal length should be positive.");
        m3.h.b(f18 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) java.lang.Math.toDegrees(java.lang.Math.atan(f18 / (f17 * 2.0f)) * 2.0d);
        m3.h.c(degrees, 0, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float getDefaultFocalLength(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        float[] fArr = (float[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        m3.h.d(fArr, "The focal lengths can not be empty.");
        return fArr[0];
    }

    public static int getDeviceDefaultViewAngleDegrees(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, int i17) {
        try {
            for (java.lang.String str : cameraManagerCompat.getCameraIdList()) {
                androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                m3.h.d(num, "Lens facing can not be null");
                if (num.intValue() == androidx.camera.camera2.internal.LensFacingUtil.getLensFacingInt(i17)) {
                    return focalLengthToViewAngleDegrees(getDefaultFocalLength(cameraCharacteristicsCompat), getSensorHorizontalLength(cameraCharacteristicsCompat));
                }
            }
            throw new java.lang.IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat unused) {
            throw new java.lang.IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    public static float getSensorHorizontalLength(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        android.util.SizeF sizeF = (android.util.SizeF) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        android.graphics.Rect rect = (android.graphics.Rect) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        android.util.Size size = (android.util.Size) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        m3.h.d(sizeF, "The sensor size can't be null.");
        m3.h.d(num, "The sensor orientation can't be null.");
        m3.h.d(rect, "The active array size can't be null.");
        m3.h.d(size, "The pixel array size can't be null.");
        android.util.Size rectToSize = androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect);
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(num.intValue())) {
            sizeF = androidx.camera.core.impl.utils.TransformUtils.reverseSizeF(sizeF);
            rectToSize = androidx.camera.core.impl.utils.TransformUtils.reverseSize(rectToSize);
            size = androidx.camera.core.impl.utils.TransformUtils.reverseSize(size);
        }
        return (sizeF.getWidth() * rectToSize.getWidth()) / size.getWidth();
    }
}
