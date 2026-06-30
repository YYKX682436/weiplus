package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ConcurrentCamera */
/* loaded from: classes14.dex */
public class C0487x75f773dc {

    /* renamed from: mCameras */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45> f927xbed754c1;

    /* renamed from: androidx.camera.core.ConcurrentCamera$SingleCameraConfig */
    /* loaded from: classes14.dex */
    public static final class SingleCameraConfig {

        /* renamed from: mCameraSelector */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 f928x57e2ff1;

        /* renamed from: mLayoutSettings */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f929xffa5b3a;

        /* renamed from: mLifecycleOwner */
        private p012xc85e97e9.p093xedfae76a.y f930xade33736;

        /* renamed from: mUseCaseGroup */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88 f931xfd9ac475;

        public SingleCameraConfig(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88 c0581x6fd0ff88, p012xc85e97e9.p093xedfae76a.y yVar) {
            this(c0475xc311f244, c0581x6fd0ff88, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d.f1127x86df6221, yVar);
        }

        /* renamed from: getCameraSelector */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m4362xed62f31a() {
            return this.f928x57e2ff1;
        }

        /* renamed from: getLayoutSettings */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d m4363xf7df1e63() {
            return this.f929xffa5b3a;
        }

        /* renamed from: getLifecycleOwner */
        public p012xc85e97e9.p093xedfae76a.y m4364x95c7fa5f() {
            return this.f930xade33736;
        }

        /* renamed from: getUseCaseGroup */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88 m4365xc6f83dde() {
            return this.f931xfd9ac475;
        }

        public SingleCameraConfig(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0581x6fd0ff88 c0581x6fd0ff88, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p093xedfae76a.y yVar) {
            this.f928x57e2ff1 = c0475xc311f244;
            this.f931xfd9ac475 = c0581x6fd0ff88;
            this.f929xffa5b3a = c0543xcd8e1d8d;
            this.f930xade33736 = yVar;
        }
    }

    public C0487x75f773dc(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45> list) {
        this.f927xbed754c1 = list;
    }

    /* renamed from: getCameras */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45> m4361x5e8bddb8() {
        return this.f927xbed754c1;
    }
}
