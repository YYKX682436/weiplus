package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager */
/* loaded from: classes14.dex */
public final class C0199x60a1cf63 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b {
    private static final java.lang.String TAG = "Camera2DeviceSurfaceManager";

    /* renamed from: mCamcorderProfileHelper */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d f332xe4138c4a;

    /* renamed from: mCameraSupportedSurfaceCombinationMap */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110> f333x14b8289e;

    public C0199x60a1cf63(android.content.Context context, java.lang.Object obj, java.util.Set<java.lang.String> set) {
        this(context, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d() { // from class: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager.1
            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d
            public android.media.CamcorderProfile get(int i17, int i18) {
                return android.media.CamcorderProfile.get(i17, i18);
            }

            @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d
            /* renamed from: hasProfile */
            public boolean mo2925x66b24daf(int i17, int i18) {
                return android.media.CamcorderProfile.hasProfile(i17, i18);
            }
        }, obj, set);
    }

    /* renamed from: init */
    private void m3268x316510(android.content.Context context, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, java.util.Set<java.lang.String> set) {
        context.getClass();
        for (java.lang.String str : set) {
            this.f333x14b8289e.put(str, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110(context, str, c0332x1ad8324a, this.f332xe4138c4a));
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b
    /* renamed from: getSuggestedStreamSpecs */
    public android.util.Pair<java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>> mo3269xd8dae5cb(int i17, java.lang.String str, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, java.util.List<android.util.Size>> map, boolean z17, boolean z18) {
        m3.h.b(!map.isEmpty(), "No new use cases to be bound.");
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110 c0263xf6062110 = this.f333x14b8289e.get(str);
        if (c0263xf6062110 != null) {
            return c0263xf6062110.m3580x29b7b37d(i17, list, map, z17, z18);
        }
        throw new java.lang.IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b
    /* renamed from: transformSurfaceConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f mo3270x501b1a43(int i17, java.lang.String str, int i18, android.util.Size size) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0263xf6062110 c0263xf6062110 = this.f333x14b8289e.get(str);
        if (c0263xf6062110 != null) {
            return c0263xf6062110.m3584x501b1a43(i17, i18, size);
        }
        return null;
    }

    public C0199x60a1cf63(android.content.Context context, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0113x4cf54b9d interfaceC0113x4cf54b9d, java.lang.Object obj, java.util.Set<java.lang.String> set) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a m3754x3017aa;
        this.f333x14b8289e = new java.util.HashMap();
        interfaceC0113x4cf54b9d.getClass();
        this.f332xe4138c4a = interfaceC0113x4cf54b9d;
        if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a) {
            m3754x3017aa = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a) obj;
        } else {
            m3754x3017aa = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.m3754x3017aa(context);
        }
        m3268x316510(context, m3754x3017aa, set);
    }
}
