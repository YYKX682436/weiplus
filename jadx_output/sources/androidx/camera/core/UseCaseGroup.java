package androidx.camera.core;

/* loaded from: classes14.dex */
public final class UseCaseGroup {
    private final java.util.List<androidx.camera.core.CameraEffect> mEffects;
    private final java.util.List<androidx.camera.core.UseCase> mUseCases;
    private final androidx.camera.core.ViewPort mViewPort;

    /* loaded from: classes14.dex */
    public static final class Builder {
        private static final java.util.List<java.lang.Integer> SUPPORTED_TARGETS = java.util.Arrays.asList(1, 2, 4, 3, 7);
        private androidx.camera.core.ViewPort mViewPort;
        private final java.util.List<androidx.camera.core.UseCase> mUseCases = new java.util.ArrayList();
        private final java.util.List<androidx.camera.core.CameraEffect> mEffects = new java.util.ArrayList();

        private void checkEffectTargets() {
            java.util.Iterator<androidx.camera.core.CameraEffect> it = this.mEffects.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int targets = it.next().getTargets();
                androidx.camera.core.processing.TargetUtils.checkSupportedTargets(SUPPORTED_TARGETS, targets);
                int i18 = i17 & targets;
                if (i18 > 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "More than one effects has targets %s.", androidx.camera.core.processing.TargetUtils.getHumanReadableName(i18)));
                }
                i17 |= targets;
            }
        }

        public androidx.camera.core.UseCaseGroup.Builder addEffect(androidx.camera.core.CameraEffect cameraEffect) {
            this.mEffects.add(cameraEffect);
            return this;
        }

        public androidx.camera.core.UseCaseGroup.Builder addUseCase(androidx.camera.core.UseCase useCase) {
            this.mUseCases.add(useCase);
            return this;
        }

        public androidx.camera.core.UseCaseGroup build() {
            m3.h.b(!this.mUseCases.isEmpty(), "UseCase must not be empty.");
            checkEffectTargets();
            return new androidx.camera.core.UseCaseGroup(this.mViewPort, this.mUseCases, this.mEffects);
        }

        public androidx.camera.core.UseCaseGroup.Builder setViewPort(androidx.camera.core.ViewPort viewPort) {
            this.mViewPort = viewPort;
            return this;
        }
    }

    public UseCaseGroup(androidx.camera.core.ViewPort viewPort, java.util.List<androidx.camera.core.UseCase> list, java.util.List<androidx.camera.core.CameraEffect> list2) {
        this.mViewPort = viewPort;
        this.mUseCases = list;
        this.mEffects = list2;
    }

    public java.util.List<androidx.camera.core.CameraEffect> getEffects() {
        return this.mEffects;
    }

    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
        return this.mUseCases;
    }

    public androidx.camera.core.ViewPort getViewPort() {
        return this.mViewPort;
    }
}
