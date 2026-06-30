package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
public final class SessionConfigurationCompat {
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;
    private final androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public static final class SessionConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final java.util.concurrent.Executor mExecutor;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;
        private final int mSessionType;
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mStateCallback;
        private androidx.camera.camera2.internal.compat.params.InputConfigurationCompat mInputConfig = null;
        private android.hardware.camera2.CaptureRequest mSessionParameters = null;

        public SessionConfigurationCompatBaseImpl(int i17, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.mSessionType = i17;
            this.mOutputConfigurations = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            this.mStateCallback = stateCallback;
            this.mExecutor = executor;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl) {
                androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl sessionConfigurationCompatBaseImpl = (androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl) obj;
                if (java.util.Objects.equals(this.mInputConfig, sessionConfigurationCompatBaseImpl.mInputConfig) && this.mSessionType == sessionConfigurationCompatBaseImpl.mSessionType && this.mOutputConfigurations.size() == sessionConfigurationCompatBaseImpl.mOutputConfigurations.size()) {
                    for (int i17 = 0; i17 < this.mOutputConfigurations.size(); i17++) {
                        if (!this.mOutputConfigurations.get(i17).equals(sessionConfigurationCompatBaseImpl.mOutputConfigurations.get(i17))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.concurrent.Executor getExecutor() {
            return this.mExecutor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
            return this.mInputConfig;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.lang.Object getSessionConfiguration() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
            return this.mSessionParameters;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
            return this.mSessionType;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
            return this.mStateCallback;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfigurations.hashCode() ^ 31;
            int i17 = (hashCode << 5) - hashCode;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat = this.mInputConfig;
            int hashCode2 = (inputConfigurationCompat == null ? 0 : inputConfigurationCompat.hashCode()) ^ i17;
            return this.mSessionType ^ ((hashCode2 << 5) - hashCode2);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat) {
            if (this.mSessionType == 1) {
                throw new java.lang.UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.mInputConfig = inputConfigurationCompat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(android.hardware.camera2.CaptureRequest captureRequest) {
            this.mSessionParameters = captureRequest;
        }
    }

    /* loaded from: classes14.dex */
    public interface SessionConfigurationCompatImpl {
        java.util.concurrent.Executor getExecutor();

        androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration();

        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations();

        java.lang.Object getSessionConfiguration();

        android.hardware.camera2.CaptureRequest getSessionParameters();

        int getSessionType();

        android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback();

        void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat);

        void setSessionParameters(android.hardware.camera2.CaptureRequest captureRequest);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(int i17, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl(i17, list, executor, stateCallback);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl(i17, list, executor, stateCallback);
        }
    }

    public static java.util.List<android.hardware.camera2.params.OutputConfiguration> transformFromCompat(java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((android.hardware.camera2.params.OutputConfiguration) it.next().unwrap());
        }
        return arrayList;
    }

    public static java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> transformToCompat(java.util.List<android.hardware.camera2.params.OutputConfiguration> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<android.hardware.camera2.params.OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.wrap(it.next()));
        }
        return arrayList;
    }

    public static androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat wrap(java.lang.Object obj) {
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat(new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl(obj));
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mImpl.getExecutor();
    }

    public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
        return this.mImpl.getInputConfiguration();
    }

    public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
        return this.mImpl.getOutputConfigurations();
    }

    public android.hardware.camera2.CaptureRequest getSessionParameters() {
        return this.mImpl.getSessionParameters();
    }

    public int getSessionType() {
        return this.mImpl.getSessionType();
    }

    public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
        return this.mImpl.getStateCallback();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat) {
        this.mImpl.setInputConfiguration(inputConfigurationCompat);
    }

    public void setSessionParameters(android.hardware.camera2.CaptureRequest captureRequest) {
        this.mImpl.setSessionParameters(captureRequest);
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getSessionConfiguration();
    }

    /* loaded from: classes14.dex */
    public static final class SessionConfigurationCompatApi28Impl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final android.hardware.camera2.params.SessionConfiguration mObject;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;

        public SessionConfigurationCompatApi28Impl(java.lang.Object obj) {
            android.hardware.camera2.params.SessionConfiguration sessionConfiguration = (android.hardware.camera2.params.SessionConfiguration) obj;
            this.mObject = sessionConfiguration;
            this.mOutputConfigurations = java.util.Collections.unmodifiableList(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformToCompat(sessionConfiguration.getOutputConfigurations()));
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl) {
                return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl) obj).mObject);
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.concurrent.Executor getExecutor() {
            return this.mObject.getExecutor();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
            return androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.wrap(this.mObject.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.lang.Object getSessionConfiguration() {
            return this.mObject;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
            return this.mObject.getSessionParameters();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
            return this.mObject.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
            return this.mObject.getStateCallback();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat) {
            this.mObject.setInputConfiguration((android.hardware.camera2.params.InputConfiguration) inputConfigurationCompat.unwrap());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(android.hardware.camera2.CaptureRequest captureRequest) {
            this.mObject.setSessionParameters(captureRequest);
        }

        public SessionConfigurationCompatApi28Impl(int i17, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this(new android.hardware.camera2.params.SessionConfiguration(i17, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformFromCompat(list), executor, stateCallback));
        }
    }

    private SessionConfigurationCompat(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl sessionConfigurationCompatImpl) {
        this.mImpl = sessionConfigurationCompatImpl;
    }
}
