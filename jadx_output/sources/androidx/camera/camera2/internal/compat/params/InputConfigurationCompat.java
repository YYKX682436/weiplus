package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
public final class InputConfigurationCompat {
    private final androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public static final class InputConfigurationCompatApi31Impl extends androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl {
        public InputConfigurationCompatApi31Impl(java.lang.Object obj) {
            super(obj);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return ((android.hardware.camera2.params.InputConfiguration) getInputConfiguration()).isMultiResolution();
        }

        public InputConfigurationCompatApi31Impl(int i17, int i18, int i19) {
            super(i17, i18, i19);
        }
    }

    /* loaded from: classes14.dex */
    public static final class InputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        public InputConfigurationCompatBaseImpl(int i17, int i18, int i19) {
            this.mWidth = i17;
            this.mHeight = i18;
            this.mFormat = i19;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.getWidth() == this.mWidth && inputConfigurationCompatBaseImpl.getHeight() == this.mHeight && inputConfigurationCompatBaseImpl.getFormat() == this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public java.lang.Object getInputConfiguration() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mWidth;
        }

        public int hashCode() {
            int i17 = 31 ^ this.mWidth;
            int i18 = this.mHeight ^ ((i17 << 5) - i17);
            return this.mFormat ^ ((i18 << 5) - i18);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        public java.lang.String toString() {
            return java.lang.String.format("InputConfiguration(w:%d, h:%d, format:%d)", java.lang.Integer.valueOf(this.mWidth), java.lang.Integer.valueOf(this.mHeight), java.lang.Integer.valueOf(this.mFormat));
        }
    }

    /* loaded from: classes14.dex */
    public interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        java.lang.Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public InputConfigurationCompat(int i17, int i18, int i19) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi31Impl(i17, i18, i19);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl(i17, i18, i19);
        }
    }

    public static androidx.camera.camera2.internal.compat.params.InputConfigurationCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return android.os.Build.VERSION.SDK_INT >= 31 ? new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat(new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi31Impl(obj)) : new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat(new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl(obj));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.InputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int getFormat() {
        return this.mImpl.getFormat();
    }

    public int getHeight() {
        return this.mImpl.getHeight();
    }

    public int getWidth() {
        return this.mImpl.getWidth();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public boolean isMultiResolution() {
        return this.mImpl.isMultiResolution();
    }

    public java.lang.String toString() {
        return this.mImpl.toString();
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }

    /* loaded from: classes14.dex */
    public static class InputConfigurationCompatApi23Impl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final android.hardware.camera2.params.InputConfiguration mObject;

        public InputConfigurationCompatApi23Impl(java.lang.Object obj) {
            this.mObject = (android.hardware.camera2.params.InputConfiguration) obj;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl) {
                return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl) obj).getInputConfiguration());
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mObject.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mObject.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public java.lang.Object getInputConfiguration() {
            return this.mObject;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mObject.getWidth();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        public java.lang.String toString() {
            return this.mObject.toString();
        }

        public InputConfigurationCompatApi23Impl(int i17, int i18, int i19) {
            this(new android.hardware.camera2.params.InputConfiguration(i17, i18, i19));
        }
    }

    private InputConfigurationCompat(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.mImpl = inputConfigurationCompatImpl;
    }
}
