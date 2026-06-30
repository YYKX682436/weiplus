package androidx.camera.core;

/* loaded from: classes16.dex */
final class ImageReaderFormatRecommender {

    /* loaded from: classes16.dex */
    public static abstract class FormatCombo {
        public static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo create(int i17, int i18) {
            return new androidx.camera.core.AutoValue_ImageReaderFormatRecommender_FormatCombo(i17, i18);
        }

        public abstract int imageAnalysisFormat();

        public abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
    }

    public static androidx.camera.core.ImageReaderFormatRecommender.FormatCombo chooseCombo() {
        return androidx.camera.core.ImageReaderFormatRecommender.FormatCombo.create(256, 35);
    }
}
