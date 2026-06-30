package io.p3284xd2ae381c.p3320x373aa5;

/* renamed from: io.flutter.view.TextureRegistry */
/* loaded from: classes15.dex */
public interface InterfaceC28980x1159d658 {

    /* renamed from: io.flutter.view.TextureRegistry$GLTextureConsumer */
    /* loaded from: classes6.dex */
    public interface GLTextureConsumer {
        /* renamed from: getSurfaceTexture */
        android.graphics.SurfaceTexture mo138132x182e20a4();
    }

    /* renamed from: io.flutter.view.TextureRegistry$ImageConsumer */
    /* loaded from: classes13.dex */
    public interface ImageConsumer {
        /* renamed from: acquireLatestImage */
        android.media.Image mo138075xaf314b5e();
    }

    /* renamed from: io.flutter.view.TextureRegistry$ImageTextureEntry */
    /* loaded from: classes15.dex */
    public interface ImageTextureEntry extends io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry {
        /* renamed from: pushImage */
        void mo138109xd0f66a61(android.media.Image image);
    }

    /* renamed from: io.flutter.view.TextureRegistry$OnFrameAvailableListener */
    /* loaded from: classes15.dex */
    public interface OnFrameAvailableListener {
        /* renamed from: onFrameAvailable */
        void mo125886x5fe1f39b(boolean z17);
    }

    /* renamed from: io.flutter.view.TextureRegistry$OnFrameConsumedListener */
    /* loaded from: classes7.dex */
    public interface OnFrameConsumedListener {
        /* renamed from: onFrameConsumed */
        void mo52732x774eb8d6();
    }

    /* renamed from: io.flutter.view.TextureRegistry$OnTrimMemoryListener */
    /* loaded from: classes15.dex */
    public interface OnTrimMemoryListener {
        /* renamed from: onTrimMemory */
        void mo138091x29685b02(int i17);
    }

    /* renamed from: io.flutter.view.TextureRegistry$SurfaceLifecycle */
    /* loaded from: classes6.dex */
    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    /* renamed from: io.flutter.view.TextureRegistry$SurfaceProducer */
    /* loaded from: classes15.dex */
    public interface SurfaceProducer extends io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry {

        /* renamed from: io.flutter.view.TextureRegistry$SurfaceProducer$Callback */
        /* loaded from: classes15.dex */
        public interface Callback {
            /* renamed from: onSurfaceAvailable */
            default void mo133094xe037649b() {
                m139636xea34a53a();
            }

            /* renamed from: onSurfaceCleanup */
            default void mo133095xdff77cf6() {
                m139637x82616feb();
            }

            @java.lang.Deprecated(forRemoval = true, since = "Flutter 3.27")
            /* renamed from: onSurfaceCreated */
            default void m139636xea34a53a() {
            }

            @java.lang.Deprecated(forRemoval = true, since = "Flutter 3.28")
            /* renamed from: onSurfaceDestroyed */
            default void m139637x82616feb() {
            }
        }

        /* renamed from: getForcedNewSurface */
        android.view.Surface mo138082xadc3e21c();

        /* renamed from: getHeight */
        int mo138083x1c4fb41d();

        /* renamed from: getSurface */
        android.view.Surface mo138084xcf572877();

        /* renamed from: getWidth */
        int mo138085x755bd410();

        /* renamed from: handlesCropAndRotation */
        boolean mo138086xf2ff5afa();

        /* renamed from: scheduleFrame */
        void mo138095x62a02d16();

        /* renamed from: setCallback */
        void mo138096x6c4ebec7(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback callback);

        /* renamed from: setSize */
        void mo138098x76500f83(int i17, int i18);
    }

    /* renamed from: io.flutter.view.TextureRegistry$SurfaceTextureEntry */
    /* loaded from: classes15.dex */
    public interface SurfaceTextureEntry extends io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry {
        /* renamed from: setOnFrameConsumedListener */
        default void mo138115xa492f8e8(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener onFrameConsumedListener) {
        }

        /* renamed from: setOnTrimMemoryListener */
        default void mo138116x399c4d58(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener) {
        }

        /* renamed from: surfaceTexture */
        android.graphics.SurfaceTexture mo138117x299653ae();
    }

    /* renamed from: io.flutter.view.TextureRegistry$TextureEntry */
    /* loaded from: classes7.dex */
    public interface TextureEntry {
        long id();

        /* renamed from: release */
        void mo138094x41012807();

        /* renamed from: setOnFrameAvailableListener */
        default void mo138097xdd9eabf1(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener) {
        }
    }

    /* renamed from: createImageTexture */
    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry mo138020x45e1f25c();

    /* renamed from: createSurfaceProducer */
    default io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer m139631xfdf2a2c3() {
        return mo138021xfdf2a2c3(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle.manual);
    }

    /* renamed from: createSurfaceProducer */
    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer mo138021xfdf2a2c3(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle surfaceLifecycle);

    /* renamed from: createSurfaceTexture */
    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca();

    /* renamed from: onTrimMemory */
    default void mo138031x29685b02(int i17) {
    }

    /* renamed from: registerSurfaceTexture */
    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138035x37857531(android.graphics.SurfaceTexture surfaceTexture);
}
