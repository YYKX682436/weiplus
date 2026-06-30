package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SurfaceOutput */
/* loaded from: classes14.dex */
public interface InterfaceC0567x42142bee extends java.io.Closeable {

    /* renamed from: androidx.camera.core.SurfaceOutput$CameraInputInfo */
    /* loaded from: classes14.dex */
    public static abstract class CameraInputInfo {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo of(android.util.Size size, android.graphics.Rect rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, int i17, boolean z17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0461x9ee380e5(size, rect, interfaceC0677x9e0bc522, i17, z17);
        }

        /* renamed from: getCameraInternal */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 mo4226xc85cc5f8();

        /* renamed from: getInputCropRect */
        public abstract android.graphics.Rect mo4227x5a43cec8();

        /* renamed from: getInputSize */
        public abstract android.util.Size mo4228x652b2835();

        /* renamed from: getMirroring */
        public abstract boolean mo4229x134c910d();

        /* renamed from: getRotationDegrees */
        public abstract int mo4230x2a7ffb93();
    }

    /* renamed from: androidx.camera.core.SurfaceOutput$Event */
    /* loaded from: classes14.dex */
    public static abstract class Event {

        /* renamed from: EVENT_REQUEST_CLOSE */
        public static final int f1217x94fd6703 = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.SurfaceOutput$Event$EventCode */
        /* loaded from: classes6.dex */
        public @interface EventCode {
        }

        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event of(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0462xd03e480c(i17, interfaceC0567x42142bee);
        }

        /* renamed from: getEventCode */
        public abstract int mo4234x14528f1();

        /* renamed from: getSurfaceOutput */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee mo4235xcfd4b858();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: getFormat */
    default int mo4767x19771aed() {
        return 34;
    }

    /* renamed from: getSensorToBufferTransform */
    default android.graphics.Matrix mo4768x65554241() {
        return new android.graphics.Matrix();
    }

    /* renamed from: getSize */
    android.util.Size mo4769xfb854877();

    /* renamed from: getSurface */
    android.view.Surface mo4770xcf572877(java.util.concurrent.Executor executor, m3.a aVar);

    /* renamed from: getTargets */
    int mo4771xe21cfccc();

    /* renamed from: updateTransformMatrix */
    void mo4772x7b86244(float[] fArr, float[] fArr2);

    /* renamed from: updateTransformMatrix */
    default void mo4773x7b86244(float[] fArr, float[] fArr2, boolean z17) {
    }
}
